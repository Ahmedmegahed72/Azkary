package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    EditText email_login,password_login;
    TextView txt_login,txt_error;
    Button cirLoginButton;
    DatabaseHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        txt_login=findViewById(R.id.txt_login);
        cirLoginButton=findViewById(R.id.cirLoginButton);
        email_login=findViewById(R.id.email_login);
        password_login=findViewById(R.id.password_login);
        txt_error=findViewById(R.id.txt_error);
        DB=new DatabaseHelper(this);
        cirLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=email_login.getText().toString();
                String password=password_login.getText().toString();
                if(email.equals("")&&password.equals("")) {
                    email_login.setError("fields can't be empty");
                    password_login.setError("fields can't be empty");
                }
                else if(email.equals(""))
                    email_login.setError("fields can't be empty");
                else if(password_login.equals(""))
                    password_login.setError("fields can't be empty");
                else{
                    Boolean check=DB.CheckUsers(email,password);
                    if(check==true){
                        email_login.setText("");
                        password_login.setText("");
                        Intent intent =new Intent(MainActivity5.this,MainActivity6.class);
                        startActivity(intent);
                    }
                    else{

                        email_login.setText("");
                        email_login.setError("");
                        txt_error.setText("This user doesn't exist");
                    }
                }}
        });
        txt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity5.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}