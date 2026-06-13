# Bank Menu API

IN PROGRESS


### 🏦 Bank Menu API System Architecture

```text
       +------------------------------------+
       |       CLIENT / BROWSER (UI)        |
       |  (Create Account, Withdraw, Dep)   |
       +------------------------------------+
                         |
                         |  HTTP REST Requests (JSON Payloads)
                         v
       +------------------------------------+
       |        SPRING BOOT CONTROLLER      |
       |       (BankController.java)        |
       +------------------------------------+
          |              |              |
          | POST         | POST         | POST
          | /accounts    | /deposit     | /withdraw
          v              v              v
       +------------------------------------+
       |          SERVICE LAYER             |
       |        (BankService.java)          |
       |                                    |
       |  [IF Branching & Business Logic]   |
       |  - Balance checks                  |
       |  - Account validations             |
       +------------------------------------+
                         |
                         |  Uses JPA / Hibernate
                         v
       +------------------------------------+
       |         DATA REPOSITORY            |
       |      (AccountRepository.java)      |
       +------------------------------------+
                         |
                         |  SQL Transactions (BEGIN ... COMMIT)
                         v
       +------------------------------------+
       |         POSTGRESQL DATABASE        |
       |                                    |
       |   Table: accounts                  |
       |   +----------------------------+   |
       |   | id (BIGINT / SEQUENCE) [PK]|   | 
       |   | name (VARCHAR)             |   |
       |   | balance (NUMERIC)          |   |
       |   +----------------------------+   |
       +------------------------------------+

```




![Testing Framework](https://img.shields.io/badge/Testing-REST%20Assured%20%2B%20TestNG-orange?style=flat-square)