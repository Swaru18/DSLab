import java.io.*;
import java.net.*;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 5000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        System.out.println("Connected");
        System.out.println("Done with 1st program of DS");

        String msg = "";
        while (!msg.equals("Over")) {
            msg = br.readLine();
            out.writeUTF(msg);
        }

        out.close();
        s.close();
    }
}