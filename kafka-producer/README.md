# Getting Started

### Guides
The following guides illustrates how to use certain features concretely:


##################################kafka#############################################

1. Download kafka from https://kafka.apache.org/downloads
  - Here we have used kafka_2.11-2.1.1

2. Start the Zookeeper- Go to the kafka installation path and run below command in command prompt window1

C:\kafka_2.12-0.10.2.1>   .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

3. start the Apache Kafka- Go to the kafka installation path, Open new command prompt window 
   and run below command

C:\kafka_2.12-0.10.2.1>   .\bin\windows\kafka-server-start.bat .\config\server.properties

4. create a topic- Go to the kafka installation path, Open new command prompt window  and run below command  

C:\kafka_2.12-0.10.2.1> .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic topic-test


## dont need to run below command if you created kafka consumer app

5. Start the consumer listening to the topic-test- Go to the kafka installation path, Open new command prompt window  and run below command   

C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topic-test --from-beginning


## Help link#######
  - https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world
  - https://www.javainuse.com/misc/apache-kafka-hello-world
