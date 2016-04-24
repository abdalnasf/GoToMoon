package com.example.ema.spaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
private TextView mypoint;
    private Button challeng;
    private Button Frind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mypoint=(TextView)findViewById(R.id.mypoint);
        challeng=(Button)findViewById(R.id.challenge);
        Frind=(Button)findViewById(R.id.friendly);

        final int point = getIntent().getIntExtra("point",100);
        mypoint.setText("My Points : "+point);
        challeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Space.class);
                intent.putExtra("point", point);
                startActivity(intent);
            }
        });
        Frind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Profile.this,Friendlycomption.class);
                startActivity(i);
            }
        });
    }
}
