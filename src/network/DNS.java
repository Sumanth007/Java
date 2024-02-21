package network;

import java.net.*;
import java.io.*;

public class DNS {
    public static void main(String[] args) {
        int n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("\n Menu: \n 1. DNS 2. Reverse DNS 3. Exit \n");
            System.out.println("\n Enter your choice");
            try {
                n = Integer.parseInt(in.readLine());
                if (n == 1) {
                    System.out.println("\n Enter Host Name ");
                    String hname = in.readLine();
                    InetAddress address;
                    address = InetAddress.getByName(hname);
                    System.out.println("Host Name: " + address.getHostName());
                    System.out.println("IP: " + address.getHostAddress());
                } else if (n == 2) {
                    System.out.println("\n Enter IP address");
                    String ipstr = in.readLine();
                    InetAddress ia = InetAddress.getByName(ipstr);
                    System.out.println("IP: " + ipstr);
                    System.out.println("Host Name: " + ia.getHostName());
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
                n = 3; // Set n to 3 to exit on exception
            }
        } while (!(n == 3));
    }
}
