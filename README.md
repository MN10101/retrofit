# Retrofit Example

This is a simple example project demonstrating the use of Retrofit library in Java to make HTTP requests to an API.

## Table of Contents

- [Introduction](#introduction)
- [Setup](#setup)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Retrofit is a type-safe REST client for Java, developed by Square, that simplifies the process of making HTTP requests to web services. This project showcases how to use Retrofit to perform CRUD (Create, Read, Update, Delete) operations on a sample user API.

## Setup

To run this project locally, follow these steps:

1. Clone this repository to your local machine.
2. Open the project in your preferred IDE.
3. Ensure you have Java and Maven installed on your machine.
4. Build the project using Maven: `mvn clean install`
5. Run the desired main class to execute different examples.

## Usage

This project includes several main classes demonstrating different use cases:

- `MainSync`: Synchronous execution of HTTP requests.
- `MainAsync`: Asynchronous execution of HTTP requests.
- `MainPost`: Creating a new user.
- `MainDelete`: Deleting an existing user.

Each main class demonstrates a specific HTTP request operation and how to handle its response.

## Endpoints

The project interacts with the following endpoints of the sample user API:

- `GET /users/{userId}`: Retrieve a user by ID.
- `GET /users`: Retrieve all users.
- `POST /users`: Create a new user.
- `PUT /users/{userId}`: Update an existing user.
- `DELETE /users/{userId}`: Delete a user.

## Contributing

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

---

Author: Mahmoud Najmeh


![1](https://github.com/MN10101/retrofit/assets/78208459/fdc32f8a-7124-42b7-b6e6-8511f4c7b9b5)

![2](https://github.com/MN10101/retrofit/assets/78208459/425e199a-0cca-4d17-9fc4-ff8773b06478)

![3](https://github.com/MN10101/retrofit/assets/78208459/40da595b-dea1-42fd-b960-4ea68c6ff76a)

![4](https://github.com/MN10101/retrofit/assets/78208459/811470c3-b4de-4f95-993d-65cdfa96dc84)
