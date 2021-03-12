package com.demkom58.ids_lab_1.server;

import com.demkom58.ids_lab_1.IHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements IHello {
    protected HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String createHello(String name) throws RemoteException {
        return "Hello " + name;
    }
}
