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
import android.widget.TextView;

public class Banglalinkinternet extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7;
    Button button8, button9, button10;

    TextView goonline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banglalinkinternet);

        BuyPack1();
        BuyPack2();
        BuyPack3();
        BuyPack4();
        BuyPack5();
        BuyPack6();
        BuyPack7();
        BuyPack8();
        BuyPack9();
        BuyPack10();
        Blcheck();
    }

    public void BuyPack1() {
        final String num = "tel:*5000*518%23";

        button1 = (Button)findViewById(R.id.ibl1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack2() {
        final String num = "tel:*5000*520%23";

        button2 = (Button)findViewById(R.id.ibl2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack3() {
        final String num = "tel:*5000*529%23";

        button3 = (Button)findViewById(R.id.ibl3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack4() {
        final String num = "tel:*5000*502%23";

        button4 = (Button)findViewById(R.id.ibl4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack5() {
        final String num = "tel:*5000*522%23";

        button5 = (Button)findViewById(R.id.ibl5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack6() {
        final String num = "tel:*5000*501%23";

        button6 = (Button)findViewById(R.id.ibl6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack7() {
        final String num = "tel:*5000*517%23";

        button7 = (Button)findViewById(R.id.ibl7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack8() {
        final String num = "tel:*5000*582%23";

        button8 = (Button)findViewById(R.id.ibl8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack9() {
        final String num = "tel:*5000*581%23";

        button9 = (Button)findViewById(R.id.ibl9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack10() {
        final String num = "tel:*5000*510%23";

        button10 = (Button)findViewById(R.id.ibl10);

        button10.setOnClickListener(new View.OnClickListener() {
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
        if (ActivityCompat.checkSelfPermission(Banglalinkinternet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            intent.setData(Uri.parse(number));
        }
        startActivity(intent);
    }

    public void Blcheck() {
        goonline = (TextView)findViewById(R.id.blheader);

        final String website = "http://www.banglalink.com.bd/en/services/banglalink-internet/packages/";

        goonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse(website));
                if (ActivityCompat.checkSelfPermission(Banglalinkinternet.this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
                    intent.setData(Uri.parse(website));
                }
                startActivity(intent);
            }
        });
    }
}
