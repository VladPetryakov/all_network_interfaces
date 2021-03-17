import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String args[]) throws SocketException, UnknownHostException {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Current IP address : " + ip.getHostAddress());

            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            System.out.print("Current MAC address : ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            System.out.println(sb.toString());
            System.out.println("Interface name: " + ip.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        out.printf("\n");
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) {
            out.printf("Interface name: %s\n", netint.getDisplayName());
            Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
            for (InetAddress inetAddress : Collections.list(inetAddresses)) {
                out.printf("InetAddress: %s\n", inetAddress);
            }
            out.printf("\n");
        }
    }
}
