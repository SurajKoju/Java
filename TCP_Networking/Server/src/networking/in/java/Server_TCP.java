/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networking.in.java;
import java.io.*;  
import java.net.*;

public class Server_TCP {
    public static void main(String[] args){  
try{  
 ServerSocket ss=new ServerSocket(3000);  
 Socket s=ss.accept();//establishes connection   
 DataInputStream dis=new DataInputStream(s.getInputStream());  
 String  str=(String)dis.readUTF();  
 System.out.println("message= "+str);  
 ss.close();  
 }
    catch(Exception e){
    System.out.println(e);
}  
 }   
}
