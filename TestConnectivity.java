import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;


public class TestConnectivity {
	public static void main(String[] args) {
		String host = args[0];
		int port = Integer.valueOf(args[1]);
		//Command to Run this program: >java.exe -cp . Test
		System.out.println(pingHost(host, port, 1000));
	}
	public static boolean pingHost(String host, int port, int timeout) {
	    try (Socket socket = new Socket()) {
	        socket.connect(new InetSocketAddress(host, port), timeout);
	        return true;
	    } catch (IOException e) {
	    	e.printStackTrace();
	        return false; // Either time out or unreachable or failed DNS lookup.
	    }
	}
}
