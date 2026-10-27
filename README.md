# Employee Management System

Desktop application for managing employee records: add, view, update and remove staff, with login and a MySQL back end.

![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Swing-blue)
![MySQL](https://img.shields.io/badge/MySQL-8-4479A1?logo=mysql&logoColor=white)


> This is a **desktop app**, so it is not hosted as a website. Download the JAR from [Releases](https://github.com/maryamfaiz01/Employee-Management/releases) or watch the demo below.

<!-- Add screenshots to docs/screenshots/ then uncomment:
![Login](docs/screenshots/login.png)
![Employees](docs/screenshots/employees.png)
-->

## Features

- Secure login screen (parameterised SQL / `PreparedStatement`, no string-built queries)
- Add employees with date-of-birth picker (JCalendar)
- View all employees, search by employee ID, print the table, update and remove records
- Connection credentials via environment variable, nothing hard-coded

## Tech stack

Java 17 · Swing · JDBC · MySQL · JCalendar · Maven (shaded runnable JAR) · GitHub Actions

## Run it

**1. Database**

```bash
mysql -u root -p < database.sql
```

**2. Configure password (if your MySQL root has one)**

```bash
export DB_PASSWORD=your_mysql_password      # Windows CMD: set DB_PASSWORD=...
```

**3. Start**

```bash
java -jar Employee-Management-1.0.0.jar     # from Releases
# or build it yourself
mvn package && java -jar target/Employee-Management-1.0.0.jar
```

Default login: `admin` / `1234`. This is a demo credential, so change it in the `login` table.

## Known limitations / roadmap

- [ ] Store hashed passwords (currently plain text in the demo `login` table)
- [ ] Move DB host/user/name to a config file
- [ ] Input validation (phone, email, NIC) and typed columns (dates, salary)
- [ ] Export employee list to CSV/PDF

## Structure

```
src/Employee/Management/System/   Splash, Login, Main_class, Add/View/Update/RemoveEmployee, Conn
src/icons/                        UI images
database.sql                      Schema + demo login
.github/workflows/build.yml       CI: builds the runnable JAR on every push
```
