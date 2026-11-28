# Car Wash Management System - DBMS Phase 2 (Team 83)

## Technologies
- Java, Maven, Hibernate (ORM)
- PostgreSQL
- Git & GitHub

## Team Members
| # | Name | Role |
|---|------|------|
| 1 | ... | Team Leader / Integration |
| 2 | ... | Class Mapping (Entities) |
| 3 | ... | Hibernate Integration |
| 4 | ... | Data Seeding & CRUD |
| 5 | ... | Views & Indexing |
| 6 | ... | Functions & Procedures |

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