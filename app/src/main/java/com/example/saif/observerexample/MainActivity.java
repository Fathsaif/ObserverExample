package com.example.saif.observerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements Observer ,View.OnClickListener{

    EditText usernameInput,emailEt;
    TextView textView;
    String nameInput, emailInput;
    Model model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = new Model();
        model.addObserver(this);
        usernameInput = (EditText) findViewById(R.id.username_et);
        emailEt = (EditText) findViewById(R.id.email_et);
        textView = (TextView) findViewById(R.id.textView);
        Button signin = (Button) findViewById(R.id.button2);
        signin.setOnClickListener(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        textView.setText(model.getUserName() + model.getEmail());
    }

    @Override
    public void onClick(View v) {

            nameInput = usernameInput.getText().toString();
            model.setUserName(nameInput);
            emailInput = emailEt.getText().toString();
            model.setEmail(emailInput);
            }
}
