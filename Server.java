import java.io.*;
import java.net.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Server started");
        System.out.println("Waiting for a client ...");

        Socket s = ss.accept();
        System.out.println("Client accepted");

        DataInputStream in = new DataInputStream(s.getInputStream());

        String msg = "";
        while (!msg.equals("Over")) {
            msg = in.readUTF();
            System.out.println(msg);
        }

        System.out.println("Closing connection");

        in.close();
        s.close();
        ss.close();
    }
}