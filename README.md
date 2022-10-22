# ElectricityCalculator

Calculates the amount of electricity use in minutes required per day by a heater, for example.
The times of using the electricity are calculated using ElectricityTimer (https://github.com/iivorait/ElectricityTimer).

See settings from the application.properties file.


# Quarkus boilerplate instructions

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application with Dockerfile

Build with Docker:
```shell script
docker build -t electricitytimer .
```

Run with Docker:
```shell script
docker run --name electricitytimer electricitytimer
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.
