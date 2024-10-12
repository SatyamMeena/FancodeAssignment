# SDET Assignment - FanCode City Task Completion

## Overview

This project is designed to automate the scenario where all users belonging to the city "FanCode" should have more than 50% of their to-do tasks completed. The city "FanCode" can be identified by geographical coordinates where the latitude is between `-40` to `5` and the longitude is between `5` to `100`.

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

```bash {"id":"01J5XP0RZ5SPZ2DDC0MGD1319G"}
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
├── pom.xml                 # Node.js project metadata and dependencies

```

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java (version 8 or higher)
- Eclipse
- Maven
- TestNG

```bash {"id":"01JA0FXMM4M1MMX0NJRYEPCQSW"}
# Setup for TODOAutomationFC

## Initial Setup
1. **Clone the Repository**
   - Clone TODOAutomationFC on your machine (it may take some time).

2. **Install Java (if not installed)**
   - Recommended: Use Java 11 or later.

3. **Verify Java Installation**
   - Check version: 
     ```bash
     java -version
     ```
   - For installation, refer online resources.

## Eclipse Setup
1. **Install Eclipse IDE**
   - Download from the [Eclipse website](https://www.eclipse.org/downloads/).

2. **Import Project**
   - File > Import > Existing Maven Projects.
   - Browse to the FancodeAssignment project location and finish the import.

3. **Configure Project Structure**
   - Set Java Build Path to the installed Java version.
   - Clean the project.

4. **Install TestNG**
   - Install TestNG from the Eclipse Marketplace.
   - Accept agreements; Eclipse will restart.

5. **Run Tests**
   - Right-click `testng.xml` in the root project and select **Run as TestNG**.

## Run Tests from Terminal
1. **Install Maven**
   - Download from [Apache Maven](https://maven.apache.org/download.cgi).

2. **Set Environment Variables**
   - Add Maven path to environment variables (refer online).

3. **Verify Maven Installation**
   - Check version: 
     ```bash
     mvn -version
     ```

4. **Run Tests**
   - Open terminal and navigate to the project root directory.
   - Execute:
     ```bash
     mvn clean test
     ```

```
