# spring-boot-kafka-hello-world
This is a basic spring boot kafka producer and kafka consumer helloworld application

# Getting Started

### Guides
The following guides illustrates how to use certain features concretely:

Install Kafka

1. Download kafka from https://kafka.apache.org/downloads
  - Here we have used kafka_2.11-2.1.1
Start Zookeeper

2. Start the Zookeeper- Go to the kafka installation path and run below command in command prompt window1

C:\kafka_2.12-0.10.2.1>   .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start Kafka

3. start the Apache Kafka- Go to the kafka installation path, Open new command prompt window 
   and run below command

C:\kafka_2.12-0.10.2.1>   .\bin\windows\kafka-server-start.bat .\config\server.properties

Start kafka-consumer App

After Successful start Kafka server run kafka-consumer spring boot application

Start kafka-producer App

Run kafka-producer spring boot application. After successful start kafka-producer app
One any browser and run below url.

http://localhost:8080//kafka/producer?message=Hello Kafka!

You should get response “Message sent to the Kafka Topic Successfully” and check kafka-consumer app console. You can see message in console log. 





