# Microservice and API-First demonstration project

This project is meant as a learning environment for API-First coding in a Microservice Environment in a two step tutorial.
The first part demonstrates the API-first principles by utilizing the OpenAPI- and Cloud Contracts definitions and deliver a Microservice with a REST-API and a corresponding mock server.
The second part will integrate this microservice in a Microservice Environment with a Service-Registry - which is also a Config-Server - and an API-Gateway.

An online-presentation is available under #todo github page for the first part and for the second part (Running a Microservice Environment)

This project will also work on Gitpod as an online development

## Registry, Gateway, API-service

The base project is generated with the JHipster Code Generator [https://www.jhipster.tech/](https://www.jhipster.tech/).

The registry and gateway are available with or without frontends (angular) in different directories (*-nofrontend).
The projects with the frontends need a local node installation (>8.12). The nofrontend projects consume less memory and has a faster startup time. Take the one which suits you best.

To start the rgistry
```bash
cd jhipster-registry-nofrontend && _JAVA_OPTIONS="-Xmx1G" ./mvnw
```
The registry will be available on port 8761.

Start api-gateway
```bash
cd jhipster-gateway-nofrontend && _JAVA_OPTIONS="-Xmx1G" ./mvnw
```
The gateway will be available on port 8080.

Start api-microservice
```bash
cd jhipster-api-service && _JAVA_OPTIONS="-Xmx750M" ./mvnw
```
The api-service will be available on port 8081.

To enable debugging of the application run the mvn project with the XDebug options:
```bash
_JAVA_OPTIONS="-Xmx750M" mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
```