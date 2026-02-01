
# Xerox Getters: 3-Way Hyperlocal Delivery Engine

## 📦 About the Project
**Xerox Getters** is a Q-commerce (Quick Commerce) platform designed to handle document printing and delivery. Inspired by models like **Blinkit**, this application manages a complex 3-way marketplace between **Customers**, **Xerox Centers (Vendors)**, and **Getters (Delivery Partners)**.

## 💻 Technical Architecture
The entire core logic is built using **Pure Java**, focusing on robust state management and concurrent processing.

* **Logic Engine:** A custom-built Java State Machine manages the transition from "Order Placed" → "Printing" → "Pick-up" → "Delivered."
* **Concurrency:** Utilizes Java `Multithreading` to handle real-time status updates across all three parties simultaneously.
* **Efficiency:** Designed with an optimized search algorithm to find the nearest "Getter" to a specific Xerox Hub.



## 🔄 The 3-Way Handshake
1.  **Customer:** Uploads PDF/Docs and sets printing specs.
2.  **Xerox Center:** Accepts the job, prints, and triggers the "Ready" state.
3.  **Getter:** Receives the location of the hub and the customer, completing the delivery loop.

## 🛠️ Tech Stack
* **Language:** Java (Core Logic, Collections, Multithreading)
* **Model:** 3-Party Hyperlocal Marketplace

## 📁 Project Structure

```text
xerox-getters/
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── .vscode/
│   └── settings.json
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── xeroxgetters/
│   │   │           └── portal/
│   │   │               ├── PortalApplication.java
│   │   │               ├── controller/
│   │   │               │   ├── authcontroller.java
│   │   │               │   ├── customerprofilecontroller.java
│   │   │               │   ├── CustomerQueryController.java
│   │   │               │   ├── deliveryordercontroller.java
│   │   │               │   ├── deliveryprofilecontroller.java
│   │   │               │   ├── deliveryquerycontroller.java
│   │   │               │   ├── ordercontroller.java
│   │   │               │   ├── ordertimelinecontroller.java
│   │   │               │   ├── shopordercontroller.java
│   │   │               │   └── usercontroller.java
│   │   │               ├── dto/
│   │   │               │   ├── assigndeliveryrequest.java
│   │   │               │   ├── customerdetailsresponse.java
│   │   │               │   ├── deliverydetailsresponse.java
│   │   │               │   ├── ordertimelineresponse.java
│   │   │               │   ├── placeorderrequest.java
│   │   │               │   └── updateorderstatusrequest.java
│   │   │               ├── model/
│   │   │               │   ├── customerprofile.java
│   │   │               │   ├── deliveryprofile.java
│   │   │               │   ├── order.java
│   │   │               │   ├── OrderEvent.java
│   │   │               │   └── user.java
│   │   │               ├── repository/
│   │   │               │   ├── customerprofilerepository.java
│   │   │               │   ├── deliveryprofilerepository.java
│   │   │               │   ├── ordereventrepository.java
│   │   │               │   ├── orderrepository.java
│   │   │               │   └── UserRepository.java
│   │   │               ├── security/
│   │   │               │   └── securityconfig.java
│   │   │               └── service/
│   │   │                   ├── customerprofileservice.java
│   │   │                   ├── customerqueryservice.java
│   │   │                   ├── deliveryorderservice.java
│   │   │                   ├── deliveryprofileservice.java
│   │   │                   ├── deliveryqueryservice.java
│   │   │                   ├── orderservice.java
│   │   │                   ├── ordertimelineservice.java
│   │   │                   ├── shoporderservice.java
│   │   │                   └── userservice.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/
│           └── com/
│               └── xeroxgetters/
│                   └── portal/
│                       └── PortalApplicationTests.java
└── README.md
```

