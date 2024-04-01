import  java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",6666); // socket object and passing host IP address and port number.
            DataOutputStream dout = new DataOutputStream(s.getOutputStream()); // 
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
