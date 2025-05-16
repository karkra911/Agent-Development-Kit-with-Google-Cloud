          [External Data Sources]
                   │
                   ▼
           ┌──────────────────┐
           │  IngestionAgent  │
           │  (ingests data)  │
           └──────────────────┘
                   │
                   ▼
           [Raw Data in GCS or BQ]
                   │
                   ▼
           ┌──────────────────┐
           │   QueryAgent     │
           │ (filters/selects)│
           └──────────────────┘
                   │
                   ▼
         [Queried Data Results]
                   │
                   ▼
           ┌──────────────────┐
           │  InsightAgent    │
           │ (analyzes data)  │
           └──────────────────┘
                   │
                   ▼
           [Insights/Findings]
                   │
                   ▼
           ┌──────────────────┐
           │ PresentationAgent│
           │ (shows output)   │
           └──────────────────┘
