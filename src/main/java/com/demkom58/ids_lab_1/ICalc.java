package com.demkom58.ids_lab_1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalc extends Remote {
    double calculate(String expression) throws RemoteException;
}
