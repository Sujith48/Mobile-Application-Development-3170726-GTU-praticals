package com.example.mad_7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class implicit_intent extends AppCompatActivity {

    Button btnDial, btnCam, btnEmail, btnShare,btnMssg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDial = findViewById(R.id.btnDial);
        btnCam = findViewById(R.id.btnCam);
        btnShare = findViewById(R.id.btnShare);
        btnEmail = findViewById(R.id.btnEmail);
        btnMssg = findViewById(R.id.btnMssg);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel: 101"));
                startActivity(i);
            }
        });
        btnCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CAMERA_BUTTON);
                startActivity(i);
            }
        });
        btnMssg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("smsto:"+Uri.encode("+9106906833")));
                i.putExtra("sms_body","Please solve this issue asap");
                startActivity(i);
            }
        });
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_MEDIA_SHARED);
                startActivity(i);
            }
        });
    }
}