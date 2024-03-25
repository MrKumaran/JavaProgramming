import java.io.*;
import java.net.*;

public class inetInjava {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.javatpoint.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("IP LocalHost: " + ip.getLocalHost());
            System.out.println("Getby name: " + ip.getByName("velammal.edu.in"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  