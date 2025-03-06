# API Exercise Practice

This project is a simple Spring Boot application that consumes a REST API to fetch data and process it. It demonstrates how to use `WebClient` to make HTTP requests, handle asynchronous responses, and display data in a simple manner.

## Table of Contents

1. [Description](#description)
2. [Technologies Used](#technologies-used)
3. [Installation](#installation)
4. [Usage](#usage)
5. [Contributing](#contributing)
6. [License](#license)
7. [TODO](#todo)

## Description

This project interacts with the `https://api.restful-api.dev` API to fetch data from the `/objects` endpoint. The data is then processed and returned to the user in a simplified format. It demonstrates how to handle asynchronous API calls in Spring Boot using `WebClient`.

## Technologies Used

- **Java 17** (or higher)
- **Spring Boot 2.x**
- **WebClient** for making HTTP requests
- **Maven** for dependency management and building
- **Git** for version control

## Installation

### Clone the Repository

To get started with the project, first clone the repository to your local machine:

```bash
git clone https://github.com/your-username/your-repository.git
```

### Set up the Project
Make sure you have Java 17 (or the required version) installed.

If you're using Maven, run the following command to install dependencies:

```bash
mvn install
```

### Running the Application
To run the Spring Boot application locally, use the following command:
```bash
mvn spring-boot:run
```

### Usage
Once the application is running, you can access the API endpoint at http://localhost:8080/objects.

Here’s an example of how to make a GET request to the endpoint:

```bash
  curl http://localhost:8080/objects
```

### Expected Response
The response will be a list of objects, each containing an id and a name. An example response might look like this:

```bash
  [
  {
    "id": 1,
    "name": "Object 1"
  },
  {
    "id": 2,
    "name": "Object 2"
  }
]
```

### Contributing
We welcome contributions to this project! To contribute, please follow these steps:

Fork the repository.
Create a new branch (git checkout -b feature/your-feature).
Make your changes and commit them (git commit -am 'Add new feature').
Push to your branch (git push origin feature/your-feature).
Open a pull request.
Please ensure your code is well-documented and passes any existing tests.

### License
This project is licensed under the MIT License - see the LICENSE file for details.

### TODO
Here are the tasks and improvements that are planned for the project:

 Add authentication: Implement OAuth or API key-based authentication for API requests.
 Error handling: Improve the error handling in the WebClient and implement retries for failed requests.
 Unit tests: Write unit tests for service and client classes to ensure the correct functionality of the application.
 Logging: Implement logging for request and response details for easier debugging.
 Front-end integration: Develop a front-end interface to interact with the API and display the fetched data.
 API Pagination: If the API supports pagination, implement pagination logic to handle larger datasets.
 Performance optimization: Analyze and optimize the performance of asynchronous requests, especially if the API response is slow.

 Feel free to add your own tasks as needed! This list will help track progress and ensure a well-rounded and completed application.
