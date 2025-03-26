# BookStore Application

## Overview
The **BookStor Application** is a simple CRUD (Create, Read, Update, Delete) web application built using **Spring Boot, JPA (Java Persistence API), and a RESTful API** for the backend, and **HTML, Tailwind CSS, and JavaScript** for the frontend. This project enables users to add, edit, delete, and view books.

## Features
- Add new books with **Title, Author, Price, and Image URL**.
- View a list of all books.
- Edit existing book details.
- Delete books.
- REST API integration between frontend and backend.

## Technologies Used
### Backend:
- **Spring Boot** (Java-based framework for building REST APIs)
- **Spring Data JPA** (for database interaction)
- **MySQL** (database)
- **Spring Boot DevTools** (for live reloading)

### Frontend:
- **HTML5**
- **Tailwind CSS**
- **JavaScript (Fetch API for API calls)**

## API Endpoints
| Method  | Endpoint        | Description                     |
|---------|----------------|---------------------------------|
| GET     | /books         | Retrieve all books              |
| POST    | /books         | Add a new book                  |
| PUT     | /books/{id}    | Update an existing book         |
| DELETE  | /books/{id}    | Delete a book                   |

## How to Use
1. **Add a Book**: Enter book details in the form and click `Save Book`.
2. **Update a Book**: Click `Edit` next to a book, modify the fields, and click `Update Book`.
3. **Delete a Book**: Click `Delete` next to a book.

