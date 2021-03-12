package com.demkom58.ids_lab_1;

import com.demkom58.ids_lab_1.client.HelloClient;
import com.demkom58.ids_lab_1.server.HelloServer;

public class Main {
    public static void main(String[] args) throws Exception {
        final boolean server = args.length > 0 && "server".equals(args[0]);
        if (server) {
            HelloServer.main(args);
        } else {
            HelloClient.main(args);
        }
    }
}
