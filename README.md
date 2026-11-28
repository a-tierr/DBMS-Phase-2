# Car Wash Management System - DBMS Phase 2 (Team 83)

## Technologies
- Java, Maven, Hibernate (ORM)
- PostgreSQL
- Git & GitHub

## Team Members
| # | Name | Role |
|---|------|------|
| 1 | Abdelrahman Adel| Team Leader / Integration |
| 2 | Samaa Aussam | Class Mapping (Entities) |
| 3 | Gamal Mohammed | Hibernate Integration |
| 4 | Shams Hatem | Data Seeding & CRUD |
| 5 | Tasneem Hesham | Views & Indexing |
| 6 | Sondos Ehab | Functions & Procedures |

## Project Structure
- `Java-Application/` : Maven + Hibernate project (open in NetBeans)
- `SQL-Scripts/`      : View, Materialized View, Index, Function, Procedure
- `Documentation/`    : cover page and project documents

## How to Run
1. Create an empty database named `carwash` in pgAdmin.
2. Edit URL / username / password in
   `Java-Application/src/main/resources/hibernate.cfg.xml`.
3. Run `Main.java` (Hibernate creates the tables and seeds the data).
4. In pgAdmin run the SQL scripts in this order:
   views -> materialized_views -> indexes -> functions -> procedures.

Note: table and column names are quoted, e.g. `SELECT "Fname" FROM "Customer";`