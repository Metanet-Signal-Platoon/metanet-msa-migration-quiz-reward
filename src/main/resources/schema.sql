CREATE TABLE IF NOT EXISTS users (
    user_index INT AUTO_INCREMENT PRIMARY KEY,
    id VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    birthday DATE,
    name VARCHAR(50),
    age INT,
    age_floor VARCHAR(10),
    gender VARCHAR(10),
    disability VARCHAR(20),
    disability_detail VARCHAR(255),
    disability_rank VARCHAR(20),
    exercise_experience VARCHAR(50),
    exercise_purpose VARCHAR(255)

    );