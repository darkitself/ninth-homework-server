# Брокеры сообщений

Написать два приложения которые будут общаться между собой  
Первое приложение:  
- включает http сервер. Должен обрабатывать запрос вида   
{  
    "name": "Ivan",   
    "login": "proso",   
    "password": "123456",  
    "phoneNumber": "79022658978"  
}  

- в контроллере должен вызываться сервис который отправляет сообщение в брокер вида:  
{  
    "id": 1234,  
    "name": "Ivan",  
    "phoneNumber": "79022658978"  
}  
 
- в качестве ответа на http запрос контроллер должен возвращать ответное сообщение от второго приложения вида:  
{  
    "id": 1234,    
    "state": "VALID",  
    "time": "2021-01-01T12:12:12"  
}  
