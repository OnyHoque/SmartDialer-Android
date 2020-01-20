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

public class Airtelinternet extends AppCompatActivity {

    Button iar1, iar2, iar3, iar4, iar5, iar6, iar7, iar8, iar9, iar10, iar11, iar12, iar13;
    TextView website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airtelinternet);

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
        BuyPack11();
        BuyPack12();
        BuyPack13();
        LunchWebsite();
    }

    public void BuyPack1() {
        final String num = "tel:*121*781%23";

        iar1 = (Button)findViewById(R.id.iar1);

        iar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack2() {
        final String num = "tel:*121*782%23";

        iar2 = (Button)findViewById(R.id.iar2);

        iar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack3() {
        final String num = "tel:*121*640%23";

        iar3 = (Button)findViewById(R.id.iar3);

        iar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack4() {
        final String num = "tel:*121*5001%23";

        iar4 = (Button)findViewById(R.id.iar4);

        iar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack5() {
        final String num = "tel:*121*771%23";

        iar5 = (Button)findViewById(R.id.iar5);

        iar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack6() {
        final String num = "tel:*121*250%23";

        iar6 = (Button)findViewById(R.id.iar6);

        iar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack7() {
        final String num = "tel:*121*981%23";

        iar7 = (Button)findViewById(R.id.iar7);

        iar7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack8() {
        final String num = "tel:*121*151%23";

        iar8 = (Button)findViewById(R.id.iar8);

        iar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack9() {
        final String num = "tel:*121*5014%23";

        iar9 = (Button)findViewById(R.id.iar9);

        iar9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack10() {
        final String num = "tel:*121*731%23";

        iar10 = (Button)findViewById(R.id.iar10);

        iar10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack11() {
        final String num = "tel:*121*5020%23";

        iar11 = (Button)findViewById(R.id.iar11);

        iar11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack12() {
        final String num = "tel:*121*711%23";

        iar12 = (Button)findViewById(R.id.iar12);

        iar12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack13() {
        final String num = "tel:*121*5040%23";

        iar13 = (Button)findViewById(R.id.iar13);

        iar13.setOnClickListener(new View.OnClickListener() {
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
        if (ActivityCompat.checkSelfPermission(Airtelinternet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            intent.setData(Uri.parse(number));
        }
        startActivity(intent);
    }

    public void LunchWebsite() {

        website = (TextView)findViewById(R.id.airtelheader);

        final String web = "http://www.bd.airtel.com/personal/3g/internet-package/selfcare-packages";

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse(web));
            }
        });
    }
}
