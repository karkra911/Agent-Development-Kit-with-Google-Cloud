package agents;

import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.QueryJobConfiguration;
import com.google.cloud.bigquery.TableResult;
import shared.AgentConfig;

public class QueryAgent {

    private final AgentConfig config;
    private final BigQuery bigquery;

    public QueryAgent(AgentConfig config) {
        this.config = config;
        this.bigquery = BigQueryOptions.getDefaultInstance().getService();
    }

    public TableResult runQuery() throws InterruptedException {
        String query = config.getQueryTemplate();

        QueryJobConfiguration queryConfig = QueryJobConfiguration.newBuilder(query).build();

        System.out.println("QueryAgent: Executing query...");
        TableResult result = bigquery.query(queryConfig);
        System.out.println("QueryAgent: Query executed successfully.");

        return result;
    }
}
