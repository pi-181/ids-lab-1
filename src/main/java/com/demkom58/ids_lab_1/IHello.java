package com.demkom58.ids_lab_1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {
    String createHello(String name) throws RemoteException;
}
