package com.example.saif.observerexample;

import java.util.*;
import java.util.Observer;

/**
 * Created by Mosaad on 27/05/2017.
 */

public class Model extends Observable {
    String userName;



    String email;
    public Model(){

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
