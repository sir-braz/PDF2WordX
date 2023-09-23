# PDF Conversion API Documentation

Welcome to the documentation for the **PDF Conversion** API, a file conversion API developed using Java and Spring Boot. This API allows you to convert PDF files into various formats.

## Prerequisites

Before you begin, ensure that you have the following software installed on your machine:

- Java JDK 11
- Docker and Docker Compose (optional, for containerized execution)

## Conversion Formats

The PDF Conversion API supports the following conversion formats:

- Text (TXT)
- Image (JPG, PNG)
- HTML

## Uploading PDF Files

Before you can convert a PDF file, you need to upload it to the API. Use the following endpoint to upload a PDF file:

- **POST /api/upload**: Upload a PDF file for conversion.

## Conversion Endpoints

The PDF Conversion API offers the following endpoints for converting PDF files:

- **GET /api/convert/text/{fileId}**: Convert a PDF file to text format.
- **GET /api/convert/image/{fileId}**: Convert a PDF file to image format.
- **GET /api/convert/html/{fileId}**: Convert a PDF file to HTML format.

## Compiling and Running the Project

To compile and run the PDF Conversion API, use Apache Maven. Run the following command in the project's root directory:

```bash
mvn spring-boot:run
```

The API will be accessible at http://localhost:8080.

## Conversion Response

Upon successful conversion, the API will provide a response with a download link to the converted file. For example:

```json
{
    "success": true,
    "message": "Conversion successful",
    "downloadLink": "/api/download/converted_file.txt"
}
```

## Downloading Converted Files

You can use the provided download link to retrieve the converted file after the conversion process is complete.

- **GET /api/download/{convertedFile}**: Download the converted file.

## Dockerization

To run the API in a Docker container, a Dockerfile is included in the project's root directory. Build the Docker image using:

```bash
docker build -t pdf-conversion-api .
```

Run the application in a Docker container:

```bash
docker run -p 8080:8080 pdf-conversion-api
```

## Testing

Unit tests have been implemented using JUnit and Mockito. Run the tests with:

```bash
./mvnw test
```

## To-Do List

- [x] Create base project with Spring Initializr
- [x] Configure project with necessary dependencies
- [] Implement entity layer 
- [] Implement relationship between 
- [] Implement unit tests in controller
- [] Implement unit tests in controller
- [x] Create controller, service, and repository layers
- [] Integrate authentication service with JWT (if necessary)
- [] Implement authorization filters to protect endpoints (if necessary)
- [] Implement error and exception handling
- [] Complete documentation in README.md
- [] Dockerize the application with Dockerfile and Docker Compose

