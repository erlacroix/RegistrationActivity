package com.example.elizabeth.registrationactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends Activity implements View.OnClickListener {

    //declare objects

    private Button buttonConfirm;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextConfirmPassword;
    private Spinner ConfirmAspiration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Link to UI
        buttonConfirm = (Button) findViewById(R.id.buttonConfirm);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextConfirmPassword = (EditText) findViewById(R.id.editTextConfirmPassword);
        ConfirmAspiration = (Spinner) findViewById(R.id.ConfirmAspiration);

        //Start a Listener
        buttonConfirm.setOnClickListener(this);
        editTextEmail.setOnClickListener(this);
        editTextPassword.setOnClickListener(this);
        editTextConfirmPassword.setOnClickListener(this);

        //Need to figure out what the heck the code is to implement a spinner? Will check Textbook
        //This does not include the "become a member" text that is in the mockup

        setContentView(R.layout.activity_main);
    }
    @Override

    public void onClick (View v) {
        //Event handler
        Intent registerIntent = new Intent(this, RegistationActivity);
        this.startActivity(registerIntent);

        if (editTextEmail.getText().toString().isEmpty())
            &(editTextPassword.getText().toString().isEmpty())
                & (editTextConfirmPassword.getText().toString().equals(editTextPassword)) {
            //do if true
            //What the hell is it doing if true?
        }
    }else
    //what the hell is it doing if false?

    {
        //What happens if the login doesn't work
    }
    }
}
