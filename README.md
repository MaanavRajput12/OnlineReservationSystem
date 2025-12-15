# OnlineReservationSystem

This project is an imitation of an online reservation sytem built using Java, Springboot, Maven and PostgreSQL.

```mermaid
erDiagram
    USER ||--o{ RESERVATION : makes
    TRAIN ||--o{ RESERVATION : has

    USER {
        BIGINT id PK
        VARCHAR username
        VARCHAR password
        VARCHAR role
    }

    TRAIN {
        BIGINT id PK
        VARCHAR train_number
        VARCHAR source
        VARCHAR destination
        INT total_seats
    }

    RESERVATION {
        BIGINT id PK
        DATE reservation_date
        INT seat_number
        VARCHAR status
        BIGINT user_id FK
        BIGINT train_id FK
    }


