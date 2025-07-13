# 🗂️ DBOOPS Java Project

A structured Java application demonstrating object-oriented principles and database interaction logic using Maven. The project follows a modular architecture with separation of concerns for database management, UI handling, and entity modeling.

---

## 🚀 Features

- Organized using OOP best practices
- Maven-based project structure
- Database interaction logic (`DBManager`)
- Layered packages for clean maintainability
- Includes basic unit testing with `AppTest.java`

---

## 📁 Project Structure
```
DBOOPS/
├── pom.xml # Maven build file
├── src/
│ ├── main/
│ │ └── java/com/tap/pankaj/
│ │ ├── DBManagement/
│ │ │ └── DBManager.java # Handles database-related logic
│ │ ├── demo/
│ │ │ └── App.java # Main class to start the app
│ │ ├── entity/
│ │ │ └── data.java # Entity/model class
│ │ └── UI/
│ │ └── UIManager.java # Handles console or UI interactions
│ └── test/
│ └── java/com/tap/pankaj/demo/
│ └── AppTest.java # Unit test for the main App
├── target/ # Compiled output (auto-generated)
└── .vscode/ # VS Code workspace settings (optional)
```

---

## 🛠 Technologies Used

- Java (JDK 8+)
- Maven (Build and dependency management)
- JUnit (For unit testing)
- JDBC or File I/O (if included in `DBManager.java`)

---

## ▶️ How to Run

Use the following Maven command to build and run the application:

```bash
mvn clean compile exec:java

```
## ✅ Make sure your pom.xml includes the exec-maven-plugin with this configuration:
```

<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <mainClass>com.tap.pankaj.demo.App</mainClass>
            </configuration>
        </plugin>
    </plugins>
</build>
```

## 🧪 Running Tests
  To run unit tests:
```
  mvn test
```
## 🙋‍♂️ Author

**Pankaj Bhor**
📧 [pankajbhor373@gmail.com](mailto:pankajbhor373@gmail.com)
🔗 [LinkedIn](https://www.linkedin.com/in/pankaj-bhor-ba469036b/)

---

## 📃 License

This project is for **educational purposes only**.
Feel free to fork, learn from it, and customize it to your needs.

---

⭐ *Thanks for checking out this project! Feel free to star it if you found it helpful 😊*

```
