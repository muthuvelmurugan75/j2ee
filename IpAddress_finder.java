package LL;
import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class IpAddress_finder {
 
    public static void main(String a[]){
     
        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}