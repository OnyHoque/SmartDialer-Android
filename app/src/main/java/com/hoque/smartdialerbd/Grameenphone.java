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

public class Grameenphone extends AppCompatActivity {

    Button gp1, gp2, gp3, gp4, gp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grameenphone);

        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
    }



    public void Method1() {

        gp1 = (Button) findViewById(R.id.gbutton1);


        final String number = "tel:*566%23";

        gp1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Grameenphone.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method2() {

        gp2 = (Button) findViewById(R.id.gbutton2);


        final String number = "tel:*121*1*4%23";

        gp2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Grameenphone.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method3() {

        gp3 = (Button) findViewById(R.id.gbutton3);


        final String number = "tel:*2%23";

        gp3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Grameenphone.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method4() {

        gp4 = (Button) findViewById(R.id.gbutton4);

        final String website = "http://www.grameenphone.com";

        gp4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_VIEW);

                        intent.setData(Uri.parse(website));
                        if (ActivityCompat.checkSelfPermission(Grameenphone.this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(website));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    private void Method5() {
        final Intent intent = new Intent("com.hoque.smartdialerbd.GPinternet");
        gp5 = (Button)findViewById(R.id.gpinternet);

        gp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }
}
