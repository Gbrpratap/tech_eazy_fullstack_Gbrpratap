# Tech Eazy Fullstack Parcel Service

This is a fullstack parcel service application built as part of an assignment using:

- **Backend**: Java, Spring Boot, H2 (in-memory) Database
- **Frontend**: React (running on port 80)
- **Persistence**: H2 Database (in-memory with persistence enabled)
- **Deployment**: Runs locally (future-ready for AWS Free Tier)

---

## 📦 Features

- Create a new parcel
- Get parcel by tracking ID
- List all parcels
- REST APIs built using Spring Boot
- React frontend for parcel operations

---

## 📁 Folder Structure

│
├── backend/ # Spring Boot project (Eclipse)
│ └── src/...
│ └── resources/
│ └── application.properties
│ └── ParcelService.postman_collection.json
│
├── frontend/ # React app (VS Code)
│ └── src/
│ └── public/
│ └── package.json
│
└── README.md


---

## 🚀 Running the Application Locally

### 1️⃣ Backend (Spring Boot - Any port like 8080)

**Steps**:
- Open the project in **Eclipse**
- Run the main class: `ParcelServiceApplication.java`
- H2 Console: `http://localhost:8080/h2-console`  
  JDBC URL: `jdbc:h2:file:./data/parceldb`

### 2️⃣ Frontend (React - Port 80)

**Steps**:
- Open `frontend/` in **VS Code**
- Run:
  ```bash
  npm install
  npm start
