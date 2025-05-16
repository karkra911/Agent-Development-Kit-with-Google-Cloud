package agents;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import shared.AgentConfig;
import shared.StorageHelper;

public class IngestionAgent {

    private final AgentConfig config;

    public IngestionAgent(AgentConfig config) {
        this.config = config;
    }

    public void start() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new IngestTask(), 0, config.getIngestionIntervalMs());
    }

    class IngestTask extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("IngestionAgent: Fetching data from source...");
                URL url = new URL(config.getSourceUrl());
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

                StringBuilder rawData = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    rawData.append(line).append("\n");
                }
                reader.close();

                StorageHelper.saveRawData(config.getStorageOutputPath(), rawData.toString());
                System.out.println("IngestionAgent: Data ingested and saved.");
            } catch (Exception e) {
                System.err.println("IngestionAgent: Failed to ingest data: " + e.getMessage());
            }
        }
    }
}
