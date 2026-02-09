Endtern_project1 

Endtern_project1 is a Spring Boot REST API project for a Music Platform (Music Library / Streaming Platform).
This system provides CRUD operations for users, artists, albums, tracks, playlists, and subscriptions.

The project is connected to a PostgreSQL database and uses Spring Data JPA (Hibernate) for database operations.

Project Features

With this API you can:
	•	Manage platform users (users)
	•	Create and view artists (artists)
	•	Manage genres (genres)
	•	Create albums for artists (albums)
	•	Add and manage tracks (tracks)
	•	Create playlists for users (playlist)
	•	Add tracks to playlists (playlist_tracks)
	•	Manage subscription plans (subscription_plans)
	•	Manage user subscriptions (subscriptions)

Technologies
	•	Java 17 / OpenJDK 25
	•	Spring Boot 4.0
	•	Spring Web
	•	Spring Data JPA
	•	Hibernate ORM
	•	PostgreSQL
	•	Maven
	•	Postman (API testing)

Project Structure

src/main/java/com/example/endtern_project1/
│
├── controller/     # REST Controllers (API endpoints)
├── service/        # Business logic layer
├── repository/     # Spring Data JPA repositories
├── model/          # Database entities (JPA)
├── dto/            # DTO objects for data transfer
├── exception/      # Custom exceptions + global handler
├── patterns/       # Singleton / Factory / Builder
├── utils/          # Helper classes
└── Application.java # Main Spring Boot Application


Database Schema

The project uses PostgreSQL and includes the following tables:
	•	users
	•	artists
	•	genres
	•	albums
	•	tracks
	•	playlist
	•	playlist_tracks
	•	subscription_plans
	•	subscriptions


Database Relationships
	•	One user → many playlists
	•	One artist → many albums
	•	One album → many tracks
	•	Playlist ↔ tracks (Many-to-Many via playlist_tracks)
	•	One user → subscriptions
	•	Subscription → subscription plan


How to Run the Project

1. Clone repository

git clone https://github.com/<your-username>/Endtern_project1.git
cd Endtern_project1



2. Create PostgreSQL database

CREATE DATABASE music_platform;



3. Configure application.properties

File path:

src/main/resources/application.properties

Example configuration:

spring.datasource.url=jdbc:postgresql://localhost:5432/music_platform
spring.datasource.username=postgres
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080



4. Run the application

Run Application.java in IntelliJ IDEA
or use Maven:

mvn spring-boot:run



API Testing

Base URL:

http://localhost:8080

You can test the API using:
	•	Postman Desktop App
	•	curl
	•	Browser (GET requests)


REST API Endpoints

Users

Method	Endpoint	Description
GET	/users	Get all users
GET	/users/{id}	Get user by ID
POST	/users	Create new user
PUT	/users/{id}	Update user
DELETE	/users/{id}	Delete user



Artists

Method	Endpoint	Description
GET	/artists	Get all artists
GET	/artists/{id}	Get artist by ID
POST	/artists	Create new artist
PUT	/artists/{id}	Update artist
DELETE	/artists/{id}	Delete artist



Albums

Method	Endpoint	Description
GET	/albums	Get all albums
GET	/albums/{id}	Get album by ID
POST	/albums	Create new album
PUT	/albums/{id}	Update album
DELETE	/albums/{id}	Delete album



Tracks

Method	Endpoint	Description
GET	/tracks	Get all tracks
GET	/tracks/{id}	Get track by ID
POST	/tracks	Create new track
PUT	/tracks/{id}	Update track
DELETE	/tracks/{id}	Delete track



Playlists

Method	Endpoint	Description
GET	/playlists	Get all playlists
GET	/playlists/{id}	Get playlist by ID
POST	/playlists	Create playlist
PUT	/playlists/{id}	Update playlist
DELETE	/playlists/{id}	Delete playlist



Playlist Tracks

Method	Endpoint	Description
POST	/playlists/{playlistId}/tracks/{trackId}	Add track to playlist
DELETE	/playlists/{playlistId}/tracks/{trackId}	Remove track from playlist



Subscription Plans

Method	Endpoint	Description
GET	/plans	Get all subscription plans
POST	/plans	Create subscription plan



Subscriptions

Method	Endpoint	Description
GET	/subscriptions	Get all subscriptions
POST	/subscriptions	Create subscription



JSON Request Examples

Create Artist

POST /artists

{
  "artistName": "Ado",
  "country": "Japan"
}



Create Album

POST /albums

{
  "albumName": "Kyougen",
  "releaseDate": "2022-01-26",
  "artistId": 1
}



Create Track

POST /tracks

{
  "trackName": "New Genesis",
  "duration": 210,
  "albumId": 1,
  "genreId": 2,
  "artistId": 1
}



Design Patterns Implementation

Singleton Pattern

Used for:
	•	Application configuration
	•	Database configuration manager
	•	Logging service

Singleton ensures that only one instance of a class exists in the application.


Factory Pattern

Used to create objects from an abstract base type.
Factory makes the project easier to extend and reduces dependencies on concrete classes.


Builder Pattern

Used to create complex objects with many optional parameters.
Builder supports fluent method chaining and improves readability.

Example usage: building Track, Album, Subscription objects.


Component Principles

This project follows component-level design principles:

REP (Reuse/Release Equivalence Principle)

Reusable modules are separated into packages:
	•	repository
	•	service
	•	patterns
	•	utils


CCP (Common Closure Principle)

Classes that change together are grouped together.


CRP (Common Reuse Principle)

Packages are structured so that modules do not depend on unused classes.


SOLID Principles

SOLID principles are applied in the architecture:
	•	S: each class has a single responsibility
	•	O: system can be extended without modifying existing code
	•	L: inheritance does not break the program behavior
	•	I: interfaces are separated by responsibility
	•	D: Spring Dependency Injection is used to reduce coupling


Error Handling

The project includes:
	•	custom exceptions (NotFoundException)
	•	global REST exception handler (GlobalExceptionHandler)

Example error response:

{
  "timestamp": "2026-02-09",
  "status": 404,
  "error": "Not Found",
  "message": "Artist not found",
  "path": "/artists/100"
}



Documentation & UML

The docs/ folder contains:
	•	UML diagrams
	•	Postman screenshots
	•	Architecture diagram


What I Learned
	•	Building REST API with Spring Boot
	•	PostgreSQL integration using JPA/Hibernate
	•	Working with OneToMany / ManyToOne / ManyToMany relationships
	•	Layered architecture (Controller → Service → Repository)
	•	Exception handling in REST API
	•	Implementing Singleton, Factory, Builder patterns
	•	Applying SOLID principles
	•	Organizing project structure professionally


Author

Nursultan Maratov
Endterm Project — Spring Boot REST API
