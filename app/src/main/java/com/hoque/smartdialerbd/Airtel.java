package com.hoque.smartdialerbd;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Airtel extends AppCompatActivity {

    Button airtel1, airtel2, airtel3, airtel4;
    Button airinternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airtel);

        Method1();
        Method2();
        Method3();
        Method4();
        Method5();

    }

    public void Method1() {

        airtel1 = (Button) findViewById(R.id.abutton1);


        final String number = "tel:*778%23";

        airtel1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Airtel.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method2() {

        airtel2 = (Button) findViewById(R.id.abutton2);


        final String number = "tel:*123*11%23";

        airtel2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Airtel.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method3() {

        airtel3 = (Button) findViewById(R.id.abutton3);


        final String number = "tel:*121*6*3%23";

        airtel3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Airtel.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method4() {

        airtel4 = (Button) findViewById(R.id.abutton4);

        final String website = "http://www.bd.airtel.com";

        airtel4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_VIEW);

                        intent.setData(Uri.parse(website));
                        if (ActivityCompat.checkSelfPermission(Airtel.this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(website));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method5() {
        airinternet = (Button)findViewById(R.id.airinternet);

        airinternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.Airtelinternet");

                startActivity(intent);
            }
        });
    }
}
