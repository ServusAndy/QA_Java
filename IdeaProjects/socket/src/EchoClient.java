import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    public static void main(String[] args) {
    try(
            Socket socket = new Socket("192.168.1.15",32678);
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            BufferedReader br = new BufferedReader(isr);
            BufferedWriter bw = new BufferedWriter(osw)
    ){
        bw.write("Hello World");
        bw.newLine();
        bw.flush();
        String serverResponse = br.readLine();
        System.out.println("Server response: " + serverResponse);
    } catch (UnknownHostException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
