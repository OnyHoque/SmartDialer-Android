package com.hoque.smartdialerbd;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Context context;

    Button b1, b2, b3, b4, b5, developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        context = getApplicationContext();


        int result = ContextCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE);

        if (result == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(Home.this,
                    new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.SEND_SMS, Manifest.permission.RECEIVE_SMS, Manifest.permission.INTERNET},
                    1);
        }


        OpenGrameenphone();
        OpenAirtel();
        OpenTeletalk();
        OpenBanglalink();
        OpenRobi();
        OpenDeveloperConsole();

    }

    public void OpenGrameenphone() {
        b1= (Button)findViewById(R.id.gpbutton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.Grameenphone");
                startActivity(intent);
            }
        });
    }

    public void OpenTeletalk() {
        b2= (Button)findViewById(R.id.teletalkbutton);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.Teletalk");
                startActivity(intent);
            }
        });
    }

    public void OpenAirtel() {
        b3= (Button)findViewById(R.id.airtelbutton);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.Airtel");
                startActivity(intent);
            }
        });
    }

    public void OpenBanglalink() {
        b4= (Button)findViewById(R.id.banglalinkbutton);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.Banglalink");
                startActivity(intent);
            }
        });
    }

    public void OpenRobi() {
        b5= (Button)findViewById(R.id.robibutton);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.Robi");
                startActivity(intent);
            }
        });
    }

    public void OpenDeveloperConsole() {
        developer = (Button)findViewById(R.id.developer);

        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.ContactDeveloper");

                startActivity(intent);
            }
        });
    }

}
