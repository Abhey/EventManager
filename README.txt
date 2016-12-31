README

This Application have three java files Client.java, Server.java 
and BigServer.java .

----------------------------------------------------------------

To run the client side application you just need to compile and 
run Cient.java file , But in order for sucessfull compilation 
of this java file you need to add jcalendar-1.4.jar file to your project.

----------------------------------------------------------------

To run server side application you just need to compile and run
BigServer.java (Make sure you already have MySql installed in 
your system and you have added mysql-connector-java-5.1.9.jar 
to your project). When prompted for username and password give 
username and password for your Mysql database.Also make sure 
that you have imoprted event.sql database to your MySql 
database.

----------------------------------------------------------------

Although this software uses Client-Server mechanism but still
you need to run both client and server side application on same 
machine because I have hardcoded the address of server in 
client class due to which both client and server can't be ran 
on different machines. The feature by which we can run client 
and server on different machine is still under development till 
please be with me. 

----------------------------------------------------------------