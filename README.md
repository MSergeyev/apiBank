REST API банковского приложения на Spring boot и Spring Data JPA
Опиание:
Разработан api для получения id и balance пользователя.
Выполнение операций изменение данных с исопльзованием Spring Data JPA, сохранение данных в бд PostgreSql.
Так же приложен PostgreSQL_Backup с dump бд.

Запросы: GET http://localhost:8080/api/getBalance/1
         PUT http://localhost:8080/api/putMoney
         PUT http://localhost:8080/api/takeMoney
