# Publicity Management System

A **Publicity Management System** built with Java Spring Boot, Maven, and PostgreSQL. This project is a submodule of a larger cultural fest management system, designed to manage advertisements and campaigns effectively. It provides APIs to create, update, retrieve, and delete data for advertisements and campaigns.

---

## Table of Contents

- [📋 Features](#features)
- [💻 Technologies Used](#technologies-used)
- [🗂️ Database Schema](#database-schema)
- [⚙️ Setup and Installation](#setup-and-installation)
- [🔌 Endpoints](#endpoints)
- [🚀 Usage](#usage)
- [🤝 Contributing](#contributing)
- [✨ Acknowledgments](#acknowledgments)

---

## 📋 Features

- Manage **Advertisements** with details such as name, platform, and budget.
- Handle **Campaigns** including title, description, start date, and end date.
- RESTful APIs for CRUD operations.
- PostgreSQL integration for data persistence.

---

## 💻 Technologies Used

- **Java**: Programming language.
- **Spring Boot**: Framework for building RESTful APIs.
- **Maven**: Dependency and build management.
- **PostgreSQL**: Relational database.
- **Postman**: API testing.

---

## 🗂️ Database Schema

### Tables

#### `advertisements`
| Column    | Type    | Description              |
|-----------|---------|--------------------------|
| `id`      | Long    | Auto-generated ID.       |
| `name`    | String  | Name of the advertisement. |
| `platform`| String  | Platform for the ad.     |
| `budget`  | Double  | Advertisement budget.    |

#### `campaigns`
| Column       | Type    | Description              |
|--------------|---------|--------------------------|
| `id`         | Long    | Auto-generated ID.       |
| `title`      | String  | Campaign title.          |
| `description`| String  | Campaign details.        |
| `startDate`  | Date    | Campaign start date.     |
| `endDate`    | Date    | Campaign end date.       |

---

## ⚙️ Setup and Installation

### Prerequisites

1. Install **Java 17** or higher.
2. Install **PostgreSQL** and set up a database.
3. Install **Maven**.

### Steps

1. Clone the repository and navigate into the project:
   ```bash
   git clone https://github.com/your-username/publicity-management.git
   cd publicity-management
2. Configure the database:
   Update src/main/resources/application.properties
   ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update

3. Build and run the project:
    ```bash
    mvn clean install
    mvn spring-boot:run
4. Access the application:
   Base URL: http://localhost:8080
## 🔌 Endpoints

### `Advertisements`
|  Method     | Endpoint                   | Description         |
|-------------|----------------------------|---------------------|
| `GET`       | `/api/advertisements`      | Retrieve all ads.   |
| `POST`      | `/api/advertisements`      | Create a new ad.    |
| `GET`       | `/api/advertisements/{id}` | Retrieve ad by ID.  |
| `PUT`       | `/api/advertisements/{id}` | Update an ad.       |
| `DELETE`    | `/api/advertisements/{id}` | Delete an ad.       |

### `Compaigns`
|  Method     | Endpoint               | Description               |
|-------------|------------------------|---------------------------|
| `GET`       | `/api/campaigns`       | Retrieve all campaigns.   |
| `POST`      | `/api/campaigns`       | Create a new campaign.    |
| `GET`       | `/api/campaigns/{id}`  | Retrieve campaign by ID.  |
| `PUT`       | `/api/campaigns/{id}`  | Update a campaign.        |
| `DELETE`    | `/api/campaigns/{id}`  | Delete a campaign.        |

## 🚀 Usage
### Testing with Postman
1. Add Advertisements:
   1. Method: POST
   2. URL: http://localhost:8080/api/advertisements
   3. Body:
   ```bash
   {
    "name": "Social Media Ad",
    "platform": "Instagram",
    "budget": 1000.00
   }

2. Retrieve Campaigns:
   1. Method: GET
   2. URL: http://localhost:8080/api/campaigns
3. Follow similar steps for other endpoints.

## 🤝 Contributing
### Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch: git checkout -b feature/your-feature.
3. Make your changes and commit them: git commit -m 'Add some feature'.
4. Push to the branch: git push origin feature/your-feature.
5. Submit a pull request.
## ✨ Acknowledgments

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)

