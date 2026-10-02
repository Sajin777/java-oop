# 🏃 Athlete Performance Analytics

## Purpose

A Java OOP mini-project for recording athlete training/session data and viewing useful performance trends.

## Roles

- **Admin** — manages athletes, squads and metric definitions.
- **Coach/Trainer** — records sessions and views analytics.
- **Athlete** — views personal trends and personal bests.

## Core data

A session can contain:

- Sprint time
- Distance covered
- Weight lifted
- Heart rate
- Session duration
- RPE (rating of perceived exertion)

## Workload

A simple session workload can be represented as:

```text
workload = duration in minutes × RPE
```

For example:

```text
60 minutes × RPE 7 = 420 workload units
```

## OOP mapping

| Concept | Example |
|---|---|
| Encapsulation | private athlete/session fields |
| Inheritance | Athlete roles |
| Polymorphism | role-specific behavior |
| Abstraction | analytics/report services |
| Interface | report/export contracts |
| Collections | athlete/session lists |
| Exceptions | validation errors |
| LocalDate | session dates |

## Suggested package structure

```text
src/
└── com/athlete/
    ├── model/
    ├── dao/
    ├── service/
    ├── ui/
    ├── DBConnection.java
    └── Main.java
```

## Future extensions

- Database integration using JDBC
- 7-day workload versus preceding 28-day average
- Squad comparison
- Percentile reports
- Charts and dashboards
