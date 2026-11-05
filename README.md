# sample-sb-1-5-with-commons-dbcp

Saves and lists reminders on a pooled data source.

## Stack

- Spring Boot 1.5.22.RELEASE
- Java 8
- Gradle 3.5.1
- Commons DBCP 1.4

## Build

```
./gradlew build
```

## Run

```
./gradlew bootRun
```

```
curl -X POST 'localhost:8080/reminders?message=call%20mom'
curl localhost:8080/reminders
```
