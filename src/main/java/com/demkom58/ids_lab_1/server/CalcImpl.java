package com.demkom58.ids_lab_1.server;

import com.demkom58.ids_lab_1.ICalc;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImpl extends UnicastRemoteObject implements ICalc {
    protected CalcImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculate(String expression) throws RemoteException {
        try {
            return ((Number) new ScriptEngineManager()
                    .getEngineByName("JavaScript")
                    .eval(expression)).doubleValue();
        } catch (ScriptException e) {
            throw new RemoteException(e.getMessage(), e);
        }
    }
}
