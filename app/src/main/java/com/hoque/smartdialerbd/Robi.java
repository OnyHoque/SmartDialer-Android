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

public class Robi extends AppCompatActivity {

    Button robi1, robi2, robi3, robi4, robi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robi);

        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
    }

    public void Method1() {

        robi1 = (Button) findViewById(R.id.rbutton1);


        final String number = "tel:*222%23";

        robi1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Robi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method2() {

        robi2 = (Button) findViewById(R.id.rbutton2);


        final String number = "tel:*8444*88%23";

        robi2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Robi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method3() {

        robi3 = (Button) findViewById(R.id.rbutton3);


        final String number = "tel:*140*2*4%23";

        robi3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Robi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method4() {

        robi4 = (Button) findViewById(R.id.rbutton4);

        final String website = "http://www.robi.com.bd";

        robi4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_VIEW);

                        intent.setData(Uri.parse(website));
                        if (ActivityCompat.checkSelfPermission(Robi.this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(website));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method5() {

        robi5 = (Button)findViewById(R.id.rbutton5);

        robi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.Robiinternet");

                startActivity(intent);
            }
        });
    }
}
