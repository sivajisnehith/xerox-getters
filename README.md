This is only logic created for the real problem which we had faced in our university THE XEROX GETTERS 
few months back there is a situation where we have to give money to the days scholars to get the printouts and so that i have created a 3 way communication where user can trigger requests for printouts and also 
delivery man and the final xerox shop owners


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

