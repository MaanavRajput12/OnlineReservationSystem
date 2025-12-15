# OnlineReservationSystem

This project is an imitation of an online reservation sytem built using Java, Springboot, Maven and PostgreSQL.

erDiagram
    USER ||--o{ RESERVATION : makes
    TRAIN ||--o{ RESERVATION : has

    USER {
        Long id PK
        String username
        String password
        String role
    }

    TRAIN {
        Long id PK
        String trainNumber
        String source
        String destination
        Integer totalSeats
    }

    RESERVATION {
        Long id PK
        LocalDate reservationDate
        Integer seatNumber
        String status
        Long user_id FK
        Long train_id FK
    }

This ER diagram represents the relational structure of the Online Reservation System, demonstrating user-based booking and train-reservation mapping using PostgreSQL.


