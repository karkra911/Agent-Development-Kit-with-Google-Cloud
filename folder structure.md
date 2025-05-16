multi-agent-insights-system/
├── agents/
│   ├── IngestionAgent/
│   │   ├── IngestionAgent.java
│   │   └── config.properties
│   ├── QueryAgent/
│   │   ├── QueryAgent.java
│   │   └── queries.sql
│   ├── InsightAgent/
│   │   ├── InsightAgent.java
│   │   └── analysis_rules.json
│   └── PresentationAgent/
│       ├── PresentationAgent.java
│       └── dashboard_config.json
│
├── shared/
│   ├── MessageSchemas.java
│   └── AgentUtils.java
│
├── gcp/
│   ├── setup_scripts/
│   │   ├── create_bigquery_tables.sh
│   │   ├── setup_pubsub.sh
│   │   └── deploy_agents.sh
│   └── README.md
│
├── config/
│   ├── env_config.json
│   ├── service_account.json
│   └── .env.example
│
├── logs/
│   └── .gitkeep
│
├── docker/
│   ├── Dockerfile.agent
│   └── docker-compose.yml
│
├── tests/
│   ├── test_ingestion_agent.java
│   ├── test_query_agent.java
│   └── mock_data.json
│
├── .gitignore
├── README.md
├── deploy.sh
└── LICENSE
