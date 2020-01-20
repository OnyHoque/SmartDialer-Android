package com.hoque.smartdialerbd;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactDeveloper extends AppCompatActivity {

    EditText mailtxt;
    Button sendmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_developer);

        sendmail = (Button)findViewById(R.id.sendmail);
        SendEmail();
    }

    public void SendEmail() {
        sendmail.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mailtxt = (EditText)findViewById(R.id.mailtxt);



                        try {
                            Intent intent =new Intent(Intent.ACTION_SEND);
                            intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"onyhoquework@gmail.com"});
                            intent.putExtra(Intent.EXTRA_SUBJECT, "USER_CODER");
                            intent.putExtra(Intent.EXTRA_TEXT, mailtxt.getText().toString());

                            intent.setType("message/rfc822");
                            startActivity(intent);
                        } catch (ActivityNotFoundException anfe) {
                            Toast.makeText(ContactDeveloper.this, "Message could not be delivered!", Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );
    }


}
