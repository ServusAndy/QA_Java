import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(32678)){
            System.out.println("ServerSocket created! Waiting client");
            while(true) {
                try (Socket socket = serverSocket.accept();
                     OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
                     BufferedWriter bw = new BufferedWriter(osw);
                     InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                     BufferedReader br = new BufferedReader(isr)
                ) {
                    System.out.println("New client connected");
                    String inputData = br.readLine();
                    System.out.println("Client data: " + inputData);
                    bw.write(inputData);
                    bw.newLine();
                    bw.flush();
                    /*try(Socket sock = new Socket("192.168.1.24",32678);
                        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()))
                    ){
                        bw1.write(inputData);
                        bw1.newLine();
                        bw1.flush();
                    }*/

                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
