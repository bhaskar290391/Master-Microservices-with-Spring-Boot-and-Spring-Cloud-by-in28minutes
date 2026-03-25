# Master-Microservices-with-Spring-Boot-and-Spring-Cloud-by-in28minutes
Master Microservices with Spring Boot and Spring Cloud by in28minutes

https://github.com/in28minutes/spring-microservices-v3

# standarized Ports
1. Limits Microservice
Ports: 8080, 8081, etc.

2. Spring Cloud Config Server
Port: 8888

3. Currency Exchange Microservice
Ports: 8000, 8001, 8002, etc.

4. Currency Conversion Microservice
Ports: 8100, 8101, 8102, etc.

5. Netflix Eureka Naming Server
Port: 8761

6. API Gateway
Port: 8765

7. Zipkin Distributed Tracing Server
Port: 9411


#URL
http://localhost:8000/currency-exchange/from/USD/to/INR

http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10


nitial

- http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR

- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/10

- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/USD/to/INR/quantity/10



Lower Case

- http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR

- http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10

- http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10



Custom Routes

- http://localhost:8765/currency-exchange/from/USD/to/INR

- http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10

- http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10

- http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10
