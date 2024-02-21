package classWork2.tryy;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class writingFunction {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(30000);
        Socket clientSocket = serverSocket.accept();
        InputStream inputStream = clientSocket.getInputStream();
        OutputStream outputStream = clientSocket.getOutputStream();

        byte[] bytes = new byte[1024];
        int read;
        while ((read = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, read);
        }

        inputStream.close();
        outputStream.close();
        clientSocket.close();
        serverSocket.close();
    }
}
