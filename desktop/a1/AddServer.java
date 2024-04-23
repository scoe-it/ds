import java.net.*;
import java.rmi.*;
public class AddServer {
public static void main(String args[]) {
try {
AddServerImpl addServerImpl = new AddServerImpl();
Naming.rebind("AddServer", addServerImpl);
}
catch(Exception e) {
System.out.println("Exception: " + e); } } }














/*
terminal 1: 
javac *.java
rmic AddServerImpl

terminal 2: 
rmiregistry

terminal 3: 
java AddServer

terminal 4: 
java AddClient 127.0.0.1 5 8 
or
java AddClient localhost 5 8
*/
