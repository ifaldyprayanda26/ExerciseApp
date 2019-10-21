package com.apps.ifaldyprayanda.exerciseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView teksName, teksEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        teksName = findViewById(R.id.tv_name);
        teksEmail = findViewById(R.id.tv_email);

        teksName.setText("IFALDY PRAYANDA JUARSA");
        teksEmail.setText("ifaldyprayanda@gmail.com");
    }
}
