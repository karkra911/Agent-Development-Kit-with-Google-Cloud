
## 🛠️ Technologies Used

- Java (ADK-based agent design)
- Google Cloud Platform:
  - BigQuery
  - Cloud Storage
  - Pub/Sub (optional)
- Shell Scripts for deployment

## 🚀 How to Run

1. Clone the repository.
2. Install required GCP SDK and authenticate.
3. Run `gcp/setup.sh` to initialize GCP resources.
4. Compile and run agents individually using `javac` and `java`.
5. Use `deploy.sh` to build and run all agents together (optional).

## 📌 Note

- Configuration is handled via `config/config.json`.
- Modify individual agents to use your actual GCP services.
