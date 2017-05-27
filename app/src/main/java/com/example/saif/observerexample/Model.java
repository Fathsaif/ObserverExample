package com.example.saif.observerexample;

import android.content.Context;

import java.util.*;
import java.util.Observer;

/**
 * Created by Mosaad on 27/05/2017.
 */

public class Model extends Observable {
    String userName;
    String email;

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    public void setUserName(String userName) {
        this.userName = userName;
        setChanged();
        notifyObservers();
    }

    public void setEmail(String email) {
        this.email = email;
        setChanged();
        notifyObservers();
    }
    public String getUserName() {

        return userName;
    }

    public String getEmail() {
        return email;
    }
}
