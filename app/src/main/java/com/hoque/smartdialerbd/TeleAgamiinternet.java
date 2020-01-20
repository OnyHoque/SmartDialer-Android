package com.hoque.smartdialerbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TeleAgamiinternet extends AppCompatActivity {

    Button ite13, ite14, ite15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele_agamiinternet);

        BuyPack1();
        BuyPack2();
        BuyPack3();

    }

    public void BuyPack1() {

        ite13 = (Button) findViewById(R.id.ite13);
        ite13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String number = "111";
                        String msg = "D43";

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

    public void BuyPack2() {

        ite14 = (Button) findViewById(R.id.ite14);
        ite14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String number = "111";
                        String msg = "D44";

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

    public void BuyPack3() {

        ite15 = (Button) findViewById(R.id.ite15);
        ite15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String number = "111";
                        String msg = "D45";

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

}
