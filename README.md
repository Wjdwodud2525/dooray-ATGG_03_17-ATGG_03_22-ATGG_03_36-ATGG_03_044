# mini Dooray

## Modules

| module | port |
|---|---:|
| gateway | 8080 |
| account-api | 8081 |
| task-api | 8082 |

## Build

```bash
./mvnw clean package
```

## Run

```bash
./mvnw -pl gateway spring-boot:run
./mvnw -pl account-api spring-boot:run
./mvnw -pl task-api spring-boot:run
```

## Check

```bash
curl http://localhost:8080/api/status
curl http://localhost:8081/api/status
curl http://localhost:8082/api/status
```
