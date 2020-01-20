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

public class Teletalkinternet extends AppCompatActivity {

    Button ite1, ite2, ite3, ite4, ite5, ite6, ite7, ite8, ite9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teletalkinternet);

        BuyPack1();
        BuyPack2();
        BuyPack3();
        BuyPack4();
        BuyPack5();
        BuyPack6();
        BuyPack7();
        BuyPack8();
        BuyPack9();

    }

    public void BuyPack1() {
        final String num = "tel:*111*2*1%23";

        ite1 = (Button)findViewById(R.id.ite1);

        ite1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack2() {
        final String num = "tel:*111*2*2%23";

        ite2 = (Button)findViewById(R.id.ite2);

        ite2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack3() {
        final String num = "tel:*111*2*3%23";

        ite3 = (Button)findViewById(R.id.ite3);

        ite3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack4() {
        final String num = "tel:*111*2*4%23";

        ite4 = (Button)findViewById(R.id.ite4);

        ite4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack5() {
        final String num = "tel:*111*2*5%23";

        ite5 = (Button)findViewById(R.id.ite5);

        ite5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack6() {
        final String num = "tel:*111*2*6%23";

        ite6 = (Button)findViewById(R.id.ite6);

        ite6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack7() {
        final String num = "tel:*111*2*7%23";

        ite7 = (Button)findViewById(R.id.ite7);

        ite7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack8() {
        final String num = "tel:*111*2*8%23";

        ite8 = (Button)findViewById(R.id.ite8);

        ite8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack9() {
        final String num = "tel:*111*2*9%23";

        ite9 = (Button)findViewById(R.id.ite9);

        ite9.setOnClickListener(new View.OnClickListener() {
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
        if (ActivityCompat.checkSelfPermission(Teletalkinternet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            intent.setData(Uri.parse(number));
        }
        startActivity(intent);
    }
}
