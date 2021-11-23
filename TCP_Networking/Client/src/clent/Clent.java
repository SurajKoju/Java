/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clent;
import java.io.*;
import java.net.*;
/**
 *
 * @author suraj-koju
 */
public class Clent {


/**
 *
 * @author suraj-koju
 */
    public static void main(String[] args) {
    try{      
    Socket s=new Socket("localhost",3000);  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    dout.writeUTF("Hello DELL");  
    dout.flush();  
    dout.close();  
    s.close();  
    }catch(Exception e){System.out.println(e);} 
    }  
    }  
