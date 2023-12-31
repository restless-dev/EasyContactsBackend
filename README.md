https://github.com/restless-dev/EasyContactsBackend/assets/107081598/b4ab9bde-5d25-441f-8577-4b4d4e600164
# EasyContacts

EasyContacts is an API that allows you to create, visualize, edit and delete contacts and their respective information.

## How to run the backend locally

Clone the project:
```bash
git clone https://github.com/restless-dev/EasyContactsBackend.git
```

*(check the **Configuring the .env** section)* Fill the .env file with your database info:
```bash
\src\main\resources\.env.example
```

Open and run the application file:
```bash
\src\main\java\com\easycontacts\EasyContacts\EasyContactsApplication.java
```

**Please do not forget to run the frontend code as well! The frontend repository is available in: https://github.com/restless-dev/EasyContactsFrontend**



## Database

**This project was made with MySQL in mind**, but you can use other alternatives as well through minor code changes.

It is recommended to run the server in your localhost *(in case you won't, switch any "localhost" instances in the server's code with your own host address)*.

Make sure to have the following tables within the database:

**`id` `name` `number` `email`**
## Configuring the .env

To successfully connect the project's server to your database, you must fill the **.env** file with its credentials. 

`MYSQL_HOST`

`MYSQL_PORT`

`MYSQL_DATABASE_NAME`

`MYSQL_USERNAME`

`MYSQL_PASSWORD`
 ## Stack

**Frontend:** React, Bootstrap

**Backend:** Java Spring Boot, MySQL

