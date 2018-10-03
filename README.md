# Concept

While organizing a tech fest or cultural fest for your college , have you ever felt need for a software which would help you organize all events. This is where my Event Manager comes handy. A software based on client server model primarily designed or scheduling events. This software helps coordinators to easily schedule events and also helps students in getting information about various events being organised. In this software both client and server side use Java for front end. Also the server side use My SQL Database Management System for storing data about various events being organised.

# How to install

This Application have three java files Client.java, Server.java 
and BigServer.java .

Just change the IP address and port number of server in config.properties file 
to connect to server.

To run the client side application you just need to compile and 
run Cient.java file , But in order for sucessfull compilation 
of this java file you need to add jcalendar-1.4.jar file to your project.

To run server side application you just need to compile and run
BigServer.java (Make sure you already have MySql installed in 
your system and you have added mysql-connector-java-5.1.9.jar 
to your project). When prompted for username and password give 
username and password for your Mysql database.Also make sure 
that you have imoprted event.sql database to your MySql 
database.

