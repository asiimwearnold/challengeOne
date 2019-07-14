package com.example.challengeone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAboutAlc();
            }

        });
        button = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMyProfile();

            }
        });

    }
    public void openActivityAboutAlc(){
        Intent intent = new Intent(this, AboutAlc.class);
        startActivity(intent);
    }
    public void openActivityMyProfile(){
        Intent intent;
        intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
}
