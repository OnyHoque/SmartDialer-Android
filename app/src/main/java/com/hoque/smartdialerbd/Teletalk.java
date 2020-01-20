package com.hoque.smartdialerbd;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Teletalk extends AppCompatActivity {

    Button tele1, tele2, tele3, tele4, teleinternet, teleEcointernet, teleAgamiinternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teletalk);

        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
        Method6();
        Method7();

    }


    public void Method1() {

        tele1 = (Button) findViewById(R.id.tbutton1);


        final String number = "tel:*152%23";

        tele1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_CALL);

                        intent.setData(Uri.parse(number));
                        if (ActivityCompat.checkSelfPermission(Teletalk.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(number));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method2() {

        tele2 = (Button) findViewById(R.id.tbutton2);
        tele2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String number = "111";
                        String msg = "u";

                        try {
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(number, null, msg, null, null);
                            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();

                        } catch (Exception e) {
                            Toast.makeText(getApplicationContext(), "SMS Failed.", Toast.LENGTH_LONG).show();
                            e.printStackTrace();

                        }


                    }
                }
        );
    }

    public void Method3() {

        tele3 = (Button) findViewById(R.id.tbutton3);
        tele3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String number = "222";
                        String msg = "tar";

                        try {
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(number, null, msg, null, null);
                            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();

                        } catch (Exception e) {
                            Toast.makeText(getApplicationContext(), "SMS Failed.", Toast.LENGTH_LONG).show();
                            e.printStackTrace();

                        }
                    }
                }
        );
    }

    public void Method4() {

        tele4 = (Button) findViewById(R.id.tbutton4);

        final String website = "http://www.teletalk.com.bd";

        tele4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_VIEW);

                        intent.setData(Uri.parse(website));
                        if (ActivityCompat.checkSelfPermission(Teletalk.this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
                            intent.setData(Uri.parse(website));
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    public void Method5() {
        teleinternet = (Button)findViewById(R.id.tel5);

        teleinternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.Teletalkinternet");

                startActivity(intent);
            }
        });
    }

    public void Method6() {
        teleEcointernet = (Button)findViewById(R.id.tel6);

        teleEcointernet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.TeleEcointernet");

                startActivity(intent);
            }
        });
    }

    public void Method7() {
        teleAgamiinternet = (Button)findViewById(R.id.tel7);

        teleAgamiinternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.hoque.smartdialerbd.TeleAgamiinternet");

                startActivity(intent);
            }
        });
    }
}

