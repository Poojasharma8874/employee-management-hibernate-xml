## Employee-Management-System (Hibernate XML Mapping)
This is simple java-based **Employee Management System** that uses **Hibernate ORM**
for performing CRUD operations (Create, Read, Update, Delete) on an Employee table. This project uses **Hibernate's XML-based Configuration** and Mapping instead of annotations.

## Features
- Add employee
- View all employees
- Update empployee
- Delete employee
- Uses XML-based Mapping (employee.hbm.xml)
## Technologies Used
- java (jdk 8+)
- Hibernate ORM
- Sql (database)
- Maven
- Eclipse IDE
- Hibernate configuration via xml
  
## Project Structure
src/main/java 
             |----com/example/ 
                         |-------> Employee.java 
                         |-------> EmployeeDAO.java 
                         |-------> Main.java 
src/main
            |------resources/ 
                        |------>employee.hbm.xml 
                        |------>hibernate.cfg.xml


## Dataabase Table Structure
 CREATE TABLE Employee (
id int PRIMARY KEY AUTO_INCREMENT,
name VARCHAR,
DOUBLE salary
);
