package com.example.azkary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    private static final String  TAG="MainActivity4";
    DatabaseHelper RegistrationData;
    RelativeLayout layout4,layout5;
    TextView text;
    Button btn_register;
    EditText edt_1,edt_2,edt_3,edt_4;

   static boolean f=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(f==false) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main4);
            edt_1 = findViewById(R.id.edt_name);
            edt_2 = findViewById(R.id.edt_mobile);
            edt_3 = findViewById(R.id.edt_email);
            edt_4 = findViewById(R.id.edt_password);
            btn_register = findViewById(R.id.btn_register);
            RegistrationData = new DatabaseHelper(this);

            btn_register.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String name = edt_1.getText().toString();
                    String phone = edt_2.getText().toString();
                    String email = edt_3.getText().toString();
                    String password = edt_4.getText().toString();
                    // if((edt_1.equals("")&& edt_2.equals("")&&edt_3.equals("")&&edt_4.equals(""))||(edt_1.equals("")&& edt_2.equals("")&&edt_3.equals(""))||(edt_1.equals("")&& edt_2.equals("")&&edt_4.equals(""))||(edt_4.equals("")&& edt_2.equals("")&&edt_3.equals(""))
                    boolean f = false;
                    if (name.equals("")) {
                        edt_1.setError("Name can't be empty");
                        f = true;
                    }
                    if (phone.equals("")) {
                        edt_2.setError("Phone can't be empty");
                        f = true;
                    }
                    if (email.equals("")) {
                        edt_3.setError("Email cn't be empty");
                        f = true;
                    }
                    if (password.equals("")) {
                        edt_4.setError("Password can't be empty");
                        f = true;
                    }
                    if (!email.equals("") && !password.equals("")) {
                        boolean check = RegistrationData.CheckEmail(email);
                        if (check == false) {
                            boolean insertdata = RegistrationData.AddData(name, phone, email, password);
                            if (insertdata == true) {
                                Toast.makeText(getApplicationContext(), "Successful Registrteration", Toast.LENGTH_SHORT).show();
                                edt_1.setText("");
                                edt_2.setText("");
                                edt_3.setText("");
                                edt_4.setText("");
                                Intent intent = new Intent(MainActivity4.this, MainActivity6.class);
                                startActivity(intent);
                            }
                        } else if (check == true && f == false) {
                            Toast.makeText(getApplicationContext(), "User Name Already Taken", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
            text = findViewById(R.id.txt_register);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                    startActivity(intent);
                }
            });
        }
        else
        {
            Intent intent=new Intent(MainActivity4.this,MainActivity6.class);
            startActivity(intent);
        }
        f=true;
    }

    @Override
    protected void onSaveInstanceState(@Nullable Bundle savedInstanceState) {
        if(savedInstanceState!=null)
        {

            edt_1=findViewById(R.id.edt_name);
            edt_2=findViewById(R.id.edt_mobile);
            edt_3=findViewById(R.id.edt_email);
            edt_4=findViewById(R.id.edt_password);
            savedInstanceState.putString("Name",edt_1.getText().toString());
            savedInstanceState.putString("mobile",edt_2.getText().toString());
            savedInstanceState.putString("email",edt_3.getText().toString());
            savedInstanceState.putString("password",edt_4.getText().toString());
        }
        super.onSaveInstanceState(savedInstanceState);

    }

}