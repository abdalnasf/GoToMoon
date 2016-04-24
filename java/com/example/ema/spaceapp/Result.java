package com.example.ema.spaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private TextView Appear;
    private ImageButton rep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Appear=(TextView)findViewById(R.id.resultpoint);
        rep=(ImageButton)findViewById(R.id.repeat);

        final int x=getIntent().getIntExtra("point",100);
        Appear.setText("Your Current Points : "+x);
        rep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Result.this,FunfactText.class);
                i.putExtra("point",x);
                startActivity(i);
            }
        });

    }
}
