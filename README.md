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

#Docker command
docker --version
docker container ls

docker container run -d -p 5000:5000 in28min/hello-world-python:0.0.1.RELEASE
docker container run -d -p 5000:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
docker container run -d -p 5000:5000 in28min/hello-world-java:0.0.1.RELEASE

docker container ls 
docker container stop cc
docker image ls


docker container run -d -p 5001:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
docker container run -d -p 5002:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
docker container run -p 5003:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
docker container run -p 5003:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
 
docker build -t in28min/hello-world-docker:v1 .
docker image list
docker run -d -p 5000:5000 in28min/hello-world-docker:v1
docker build -t in28min/hello-world-docker:v2 .
docker container run -d -p 5000:5000 in28min/hello-world-docker:v2
docker build -t in28min/hello-world-docker:v3 .
docker container run -d -p 5000:5000 in28min/hello-world-docker:v3
docker build -t in28min/hello-world-docker:v4 .


# Dockerfile Examples

## Docker commands
- docker build -t in28min/hello-world-docker:v1 .


## Dockerfile - 1 - Creating Docker Images

```
FROM openjdk:25-jdk-slim
COPY target/*.jar app.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","/app.jar"]
```

## Dockerfile - 2 - Build Jar File - Multi Stage
```
FROM maven:3.9.11-amazoncorretto-25-alpine AS build
WORKDIR /home/app
COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:25-jdk-slim
EXPOSE 5000
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]

```

## Dockerfile - 3 - Caching

```
FROM maven:3.9.11-amazoncorretto-25-alpine AS build
WORKDIR /home/app

COPY ./pom.xml /home/app/pom.xml
COPY ./src/main/java/com/in28minutes/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java	/home/app/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java

RUN mvn -f /home/app/pom.xml clean package

COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:25-jdk-slim
EXPOSE 5000
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
```

#for ZIPKIN updates
https://github.com/in28minutes/spring-microservices-v3/blob/main/v3-upgrade.md


https://github.com/in28minutes/spring-microservices-v3/tree/main/04.docker

https://github.com/in28minutes/spring-microservices-v3/blob/main/04.docker/backup/docker-compose-05-zipkin.yaml


https://github.com/in28minutes/spring-microservices-v3/tree/main/05.kubernetes


https://github.com/in28minutes/spring-microservices-v3/tree/main/05.kubernetes/01-step-by-step-changes#step-00


###kubernetes clusters
gcloud config set project my-kubernetes-project-304910

gcloud container clusters get-credentials my-cluster --zone us-central1-c --project my-kubernetes-project-304910
 
kubectl create deployment hello-world-rest-api --image=in28min/hello-world-rest-api:0.0.1.RELEASE
kubectl get deployment
 
kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080
kubectl get services
kubectl get services --watch
 
curl 35.184.204.214:8080/hello-world
 
kubectl scale deployment hello-world-rest-api --replicas=3
 
gcloud container clusters resize my-cluster --node-pool default-pool --num-nodes=2 --zone=us-central1-c
 
kubectl autoscale deployment hello-world-rest-api --max=4 --cpu-percent=70
kubectl get hpa
 
kubectl create configmap hello-world-config --from-literal=RDS_DB_NAME=todos
kubectl get configmap
kubectl describe configmap hello-world-config
 
kubectl create secret generic hello-world-secrets-1 --from-literal=RDS_PASSWORD=dummytodos
kubectl get secret
kubectl describe secret hello-world-secrets-1
 
kubectl apply -f deployment.yaml
 
gcloud container node-pools list --zone=us-central1-c --cluster=my-cluster
kubectl get pods -o wide
 
kubectl set image deployment hello-world-rest-api hello-world-rest-api=in28min/hello-world-rest-api:0.0.2.RELEASE
 
kubectl get services
kubectl get replicasets
kubectl get pods
 
kubectl delete pod hello-world-rest-api-58dc9d7fcc-8pv7r
 
kubectl scale deployment hello-world-rest-api --replicas=1
 
kubectl get replicasets
 
gcloud projects list
kubectl delete service hello-world-rest-api
kubectl delete deployment hello-world-rest-api
 
gcloud container clusters delete my-cluster --zone us-central1-c