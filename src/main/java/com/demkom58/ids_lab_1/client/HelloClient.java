package com.demkom58.ids_lab_1.client;

import com.demkom58.ids_lab_1.IHello;

import java.rmi.Naming;

public class HelloClient {
    public static void main(String[] args) throws Exception {
        final String name = "rmi://localhost/HelloService";
        final IHello service = (IHello) Naming.lookup(name);
        final String hello = service.createHello("World!");
        System.out.println(hello);
    }
}
