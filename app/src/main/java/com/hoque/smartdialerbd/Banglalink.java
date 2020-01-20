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

public class Banglalink extends AppCompatActivity {

    Button banglalink1, banglalink2, banglalink3, banglalink4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banglalink);

        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
    }


    public void Method1() {

        banglalink1 = (Button) findViewById(R.id.bbutton1);


        final String number = "tel:*124%23";

        banglalink1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Banglalink.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method2() {

        banglalink2 = (Button) findViewById(R.id.bbutton2);


        final String number = "tel:*222*3%23";

        banglalink2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Banglalink.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method3() {

        banglalink3 = (Button) findViewById(R.id.bbutton3);


        final String number = "tel:*511%23";

        banglalink3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Banglalink.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method4() {

        banglalink4 = (Button) findViewById(R.id.bbutton4);

        final String website = "http://www.banglalink.com.bd";

        banglalink4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_VIEW);

                        intent.setData(Uri.parse(website));
                        if (ActivityCompat.checkSelfPermission(Banglalink.this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(website));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method5() {
        Button blinternet= (Button)findViewById(R.id.blinternet);
        final Intent intent = new Intent("com.hoque.smartdialerbd.Banglalinkinternet");

        blinternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}

