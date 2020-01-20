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

public class GPinternet extends AppCompatActivity {

    Button gpb1, gpb2, gpb3, gpb4, gpb5, gpb6, gpb7, gpb8, gpb9, gpb10;
    Button gpb11, gpb12, gpb13, gpb14, gpb15, gpb16, gpb17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpinternet);


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
        AutoRenewON();
        AutoRenewOFF();
        StopInternet();
        GetSettings();

    }

    public void BuyPack1() {
        final String num = "tel:*121*3*2%23";

        gpb1 = (Button)findViewById(R.id.igp1);

        gpb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack2() {
        final String num = "tel:*121*3*3%23";

        gpb2 = (Button)findViewById(R.id.igp2);

        gpb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack3() {
        final String num = "tel:*121*3*7*8*2%23";

        gpb3 = (Button)findViewById(R.id.igp3);

        gpb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack4() {
        final String num = "tel:*121*3*5%23";

        gpb4 = (Button)findViewById(R.id.igp4);

        gpb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack5() {
        final String num = "tel:*121*3*7*8*3%23";

        gpb5 = (Button)findViewById(R.id.igp5);

        gpb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack6() {
        final String num = "tel:*121*3*7*3%23";

        gpb6 = (Button)findViewById(R.id.igp6);

        gpb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack7() {
        final String num = "tel:*121*3*3%23";

        gpb7 = (Button)findViewById(R.id.igp7);

        gpb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack8() {
        final String num = "tel:*121*3*7*4%23";

        gpb8 = (Button)findViewById(R.id.igp8);

        gpb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack9() {
        final String num = "tel:*121*3*7*8*5%23";

        gpb9 = (Button)findViewById(R.id.igp9);

        gpb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack10() {
        final String num = "tel:*121*3*7*5%23";

        gpb10 = (Button)findViewById(R.id.igp10);

        gpb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack11() {
        final String num = "tel:*121*3*7*7%23";

        gpb11 = (Button)findViewById(R.id.igp11);

        gpb11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack12() {
        final String num = "tel:*121*3*7*8*6%23";

        gpb12 = (Button)findViewById(R.id.igp12);

        gpb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack13() {
        final String num = "tel:*500*1%23";

        gpb1 = (Button)findViewById(R.id.igp13);

        gpb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void AutoRenewON() {
        final String num = "tel:*121*3*8*1%23";

        gpb14 = (Button)findViewById(R.id.igp14);

        gpb14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void AutoRenewOFF() {
        final String num = "tel:*121*3*8*2%23";

        gpb15 = (Button)findViewById(R.id.igp15);

        gpb15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void StopInternet() {
        final String num = "tel:*121*3*8*3%23";

        gpb16 = (Button)findViewById(R.id.igp16);

        gpb16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void GetSettings() {
        final String num = "tel:*121*3*8*4%23";

        gpb17 = (Button)findViewById(R.id.igp17);

        gpb17.setOnClickListener(new View.OnClickListener() {
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
        if (ActivityCompat.checkSelfPermission(GPinternet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            intent.setData(Uri.parse(number));
        }
        startActivity(intent);
    }
}
