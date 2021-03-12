package com.demkom58.ids_lab_1.server;

import com.demkom58.ids_lab_1.Main;
import com.demkom58.ids_lab_1.util.StringUtil;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    private static final String SERVICE_NAME = "rmi://localhost/HelloService";

    public static void main(String[] args) throws Exception {
        System.setProperty("java.security.policy", StringUtil.toPathString(Main.class.getResource("/rmi.policy")));

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        Naming.rebind(SERVICE_NAME, new HelloImpl());
        System.out.println("HelloServer bound");
    }
}
