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

public class TeleEcointernet extends AppCompatActivity {

    Button ite10, ite11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele_ecointernet);

        BuyPack1();
        BuyPack2();

    }

    public void BuyPack1() {
        final String num = "tel:*111*3*2%23";

        ite10 = (Button)findViewById(R.id.ite10);

        ite10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack2() {
        final String num = "tel:*111*3*2%23";

        ite11 = (Button) findViewById(R.id.ite11);

        ite11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void Mcall(String num) {

        final String number = num;

        Intent intent = new Intent(Intent.ACTION_CALL);

        intent.setData(Uri.parse(number));
        if (ActivityCompat.checkSelfPermission(TeleEcointernet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            intent.setData(Uri.parse(number));
        }
        startActivity(intent);
    }

}
