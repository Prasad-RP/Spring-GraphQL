# Spring GraphQL Example

This repository contains an example Spring Boot application that demonstrates how to use GraphQL with Spring Boot. The application includes basic CRUD operations using GraphQL.

## Introduction to GraphQL

GraphQL is a query language for your API and a runtime for executing those queries by using a type system you define for your data. GraphQL isn't tied to any specific database or storage engine and is instead backed by your existing code and data.

### Benefits of GraphQL

1. **Efficient Data Fetching**: GraphQL allows clients to request only the data they need, reducing the amount of data transferred over the network.
2. **Strongly Typed Schema**: GraphQL APIs are defined by a schema that provides a clear contract for what queries are supported and what data is available.
3. **Flexibility**: Clients can specify exactly what data they need in a single query, making it easy to evolve APIs without breaking existing clients.
4. **Introspection**: GraphQL APIs are self-documenting, allowing developers to query the schema for details about the available queries and types.
5. **Better Developer Experience**: Tools like GraphiQL or Apollo's GraphQL Playground provide an interactive environment to explore and test GraphQL APIs.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher
- A basic understanding of Spring Boot and GraphQL

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/Prasad-RP/Spring-GraphQL.git
    cd Spring-GraphQL
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

### Endpoints

- **GraphQL Endpoint**: `/graphql` - The main endpoint for executing GraphQL queries and mutations.
- **GraphiQL Endpoint**: `/graphiql` - A web-based tool for exploring the GraphQL API (if enabled).

### Example Queries and Mutations

#### Query

```graphql

query GetAllProducts {
    getAllProducts {
        productId
        productName
        category
        price
        stock
    }
}

