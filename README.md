# SDET Assignment - FanCode City Task Completion

## Overview

This project automates the scenario where all users belonging to the city "FanCode" should have more than 50% of their to-do tasks completed. The city "FanCode" is identified by geographical coordinates where the latitude is between `-40` to `5` and the longitude is between `5` to `100`.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Running the Application](#running-the-application)
- [Running Tests](#running-tests)
- [Configuration](#configuration)
- [Contributing](#contributing)

## Project Structure

```bash {"id":"01JA0G7RKNBBFYE59SJ24Q02GG"}
FANCODEASSIGNMENT/
├── src
│   ├── main
│   │   └── java
│   │       └── apiClient
│   │           ├── UserService.java
│   │           └── TodoService.java
│   └── test
│       └── java
│           └── tests
│               └── TodoTestCase.java
├── pom.xml                 # Maven project metadata and dependencies
```

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java (version 8 or higher)
- Eclipse IDE
- Maven
- TestNG

## Setup Instructions

### Initial Setup

1. **Clone the Repository**

   - Clone `FANCODEASSIGNMENT` on your machine (this may take some time).

2. **Install Java (if not installed)**

- Recommended: Use Java 11 or later.

- Verify installation:

```bash {"id":"01JA0G7RKNBBFYE59SJ2HHCAMJ"}
java -version
```

- For installation, refer to online resources.

### Eclipse Setup

1. **Install Eclipse IDE**

   - Download from the [Eclipse website](https://www.eclipse.org/downloads/).

2. **Import Project**

   - Go to `File > Import > Existing Maven Projects`.
   - Browse to the `FancodeAssignment` project location and finish the import.

3. **Configure Project Structure**

   - Set the Java Build Path to the installed Java version.
   - Clean the project for initial setup.

4. **Install TestNG**

   - Install TestNG from the Eclipse Marketplace.
   - Accept agreements; Eclipse will restart.

5. **Run Tests**

   - Right-click `testng.xml` in the root project directory and select **Run as TestNG**.

## Running Tests from Terminal

1. **Install Maven**

   - Download from [Apache Maven](https://maven.apache.org/download.cgi).

2. **Set Environment Variables**

   - Add the Maven path to environment variables (refer to online guides).

3. **Verify Maven Installation**

- Check Maven version:

```bash {"id":"01JA0G7RKNBBFYE59SJ48TRVV3"}
mvn -version
```

4. **Run Tests**

- Open a terminal and navigate to the project root directory.

- Execute the following:

```bash {"id":"01JA0G7RKNBBFYE59SJ7RFGCBB"}
mvn clean test
```
