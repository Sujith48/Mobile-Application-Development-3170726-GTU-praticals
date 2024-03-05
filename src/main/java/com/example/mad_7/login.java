package com.example.mad_7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity{
        Button login;
        TextView uid,psswd;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login_activity);

            uid =findViewById(R.id.username);
            psswd =findViewById(R.id.password);
            login = findViewById(R.id.loginBtn);

            //..GOAT = M10 and CR7..

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(uid.getText().toString().equals("GOAT") && (psswd.getText().toString( ).equals("MESSI") || psswd.getText().toString( ).equals("RONALDO")))
                        Toast.makeText(login.this,"LOGIN SUCCESSFUL", Toast. LENGTH_SHORT).show();
                    else
                        Toast.makeText(login.this,"LOGIN FAILED !!!",Toast. LENGTH_LONG).show();
                }
            });
        }
}
