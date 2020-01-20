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

public class Robiinternet extends AppCompatActivity {
    
    Button irb1, irb2, irb3, irb4, irb5, irb6, irb7, irb8, irb9, irb10, irb11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robiinternet);

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
        
    }


    public void BuyPack1() {
        final String num = "tel:*8444*4%23";

        irb1 = (Button)findViewById(R.id.irb1);

        irb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack2() {
        final String num = "tel:*8444*21%23";

        irb2 = (Button)findViewById(R.id.irb2);

        irb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack3() {
        final String num = "tel:*8444*10019%23";

        irb3 = (Button)findViewById(R.id.irb3);

        irb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack4() {
        final String num = "tel:*8444*100%23";

        irb4 = (Button)findViewById(R.id.irb4);

        irb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack5() {
        final String num = "tel:*8444*2007%23";

        irb5 = (Button)findViewById(R.id.irb5);

        irb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack6() {
        final String num = "tel:*8444*0175%23";

        irb6 = (Button)findViewById(R.id.irb6);

        irb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack7() {
        final String num = "tel:*8444*250%23";

        irb7 = (Button)findViewById(R.id.irb7);

        irb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack8() {
        final String num = "tel:*8444*089%23";

        irb8 = (Button)findViewById(R.id.irb8);

        irb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack9() {
        final String num = "tel:*8444*85%23";

        irb9 = (Button)findViewById(R.id.irb9);

        irb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack10() {
        final String num = "tel:*8444*92%23";

        irb10 = (Button)findViewById(R.id.irb10);

        irb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mcall(num);
            }
        });
    }

    public void BuyPack11() {
        final String num = "tel:*8444*4000%23";

        irb11 = (Button)findViewById(R.id.irb11);

        irb11.setOnClickListener(new View.OnClickListener() {
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
        if (ActivityCompat.checkSelfPermission(Robiinternet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            intent.setData(Uri.parse(number));
        }
        startActivity(intent);
    }
    
    
}
