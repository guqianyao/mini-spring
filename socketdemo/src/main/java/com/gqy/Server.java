package com.gqy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PROT = 8675;

    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(PROT);
            System.out.println("server start ..");
            Socket socket = server.accept();
            new Thread(new ServerHandler(socket)).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
