package com.example.ema.spaceapp;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class funfact extends AppCompatActivity {

    private ImageButton fav;
    private ImageButton share;
    private ImageButton next;
    private TextView Head;
    private TextView info;
    private ImageButton image;
    private int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfact);

        fav=(ImageButton) findViewById(R.id.factfav);
        share=(ImageButton) findViewById(R.id.factshare);
        next=(ImageButton) findViewById(R.id.factnext);

        Head=(TextView) findViewById(R.id.facthead);
        info=(TextView) findViewById(R.id.factinfo);
        final String []facts={" moon is aplanet","The moon  gets its light from the sun" ,"Why does the moon has different phases It moves around the earth"};
        final String heads[]={"Fact #1","Fact #2","Fact #3"};
        final int point =getIntent().getIntExtra("point",101);

        Head.setText("Moon");
        info.setText("moon is aplanet");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Head.setText(heads[count]);
                info.setText(facts[count]);
//                if (count > 2) {
//                    Intent inn = new Intent(funfact.this, FunfactText.class);
//                    startActivity(inn);
//                }
                ++count;
                if(count>2)count=0;
            }
        });
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inn = new Intent(funfact.this, FunfactText.class);
                startActivity(inn);

            }
        });



    }
}
