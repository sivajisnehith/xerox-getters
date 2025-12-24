file structure:

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
