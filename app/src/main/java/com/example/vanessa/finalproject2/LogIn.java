package com.example.vanessa.finalproject2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.Parse;


public class LogIn extends Activity{
    EditText username;
    EditText password;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.log_in);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "vuVEXjX02ghorFfG7HLFrZRuVBC43xhHFzvoPRUX", "QmPTK0yZCCUZhPQjW8CHaOtUw75MFZa8FDy4OyBO");

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    public void login(View v){
        if(username.getText().toString().isEmpty())
            Toast.makeText(getApplicationContext(), "Enter your username.", Toast.LENGTH_SHORT).show();
        else if(password.getText().toString().isEmpty())
            Toast.makeText(getApplicationContext(), "Enter your password.", Toast.LENGTH_SHORT).show();
        else{


            Intent enter = new Intent(LogIn.this, .class);
            startActivity(enter);
        }
    }

    public void registration(View v){

    }
}
