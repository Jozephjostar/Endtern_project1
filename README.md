# Endtern_project1

Проект на Spring Boot — REST API для музыкальной библиотеки.  

С помощью этого проекта можно:

- Управлять пользователями платформы  
- Создавать и просматривать артистов, альбомы и треки  
- Создавать плейлисты и добавлять в них треки  
- Работать с подписками пользователей  

Проект помог лучше понять работу с Spring Boot, JPA, Hibernate, PostgreSQL и принципы SOLID.

---

## Технологии

- Java 17 / OpenJDK 25  
- Spring Boot 4.0  
- Spring Data JPA  
- Hibernate ORM  
- PostgreSQL  
- Maven  
- Postman для тестирования API  

---

## Структура проекта

src/
└─ main/
├─ java/com/example/endtern_project1/
│   ├─ controller/   # REST контроллеры
│   ├─ service/      # Слой логики приложения
│   ├─ repository/   # Репозитории JPA
│   ├─ model/        # Сущности базы данных
│   ├─ dto/          # DTO объекты для передачи данных
│   ├─ exception/    # Обработка ошибок
│   ├─ patterns/     # Паттерны проектирования
│   └─ Application.java
└─ resources/
└─ application.properties  # Настройки Spring и БД

---

## Схема базы данных

- **Users** — пользователи  
- **Artists** — артисты  
- **Albums** — альбомы (связь с артистами)  
- **Tracks** — треки (связь с альбомами и жанрами)  
- **Playlists** — плейлисты пользователей  
- **Subscriptions** — подписки пользователей  

### Связи

- Один артист → много альбомов  
- Один альбом → много треков  
- Плейлист ↔ треки (Many-to-Many)  

---

## Запуск проекта

1. Клонировать репозиторий:  
```bash
git clone https://github.com/<your-username>/Endtern_project1.git

	2.	Открыть проект в IntelliJ IDEA
	3.	Настроить PostgreSQL и прописать данные в application.properties
	4.	Запустить Application.java
	5.	Тестировать API через Postman или другой HTTP-клиент

⸻

Что изучено
	•	Создание REST API на Spring Boot
	•	JPA/Hibernate и связи между таблицами
	•	Слои приложения: Controller → Service → Repository
	•	Обработка исключений и кастомные ошибки
	•	Применение паттернов проектирования: Singleton, Factory, Builder
	•	SOLID принципы на практике
