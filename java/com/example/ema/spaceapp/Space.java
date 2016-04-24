package com.example.ema.spaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Space extends AppCompatActivity {

    private ImageButton Stories;
    private ImageButton Funfact;
    private ImageButton Gallery;
    private ImageButton Test;
    private TextView Headname;
    private int point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);
        Stories=(ImageButton)findViewById(R.id.stories);
        Funfact=(ImageButton)findViewById(R.id.funfactt);
        Gallery=(ImageButton)findViewById(R.id.gallery);
        Test=(ImageButton)findViewById(R.id.test);
        Headname=(TextView)findViewById(R.id.levelname);


        final String headname=getIntent().getStringExtra("level");
        point=getIntent().getIntExtra("point",100)+20;
        Headname.setText(headname);

        Stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Space.this,Stories.class);
                intent.putExtra("passlevel", headname);
                intent.putExtra("point",point);
                startActivity(intent);
            }
        });
        Funfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Space.this,funfact.class);
                intent.putExtra("passlevel", headname);
                intent.putExtra("point",point);
                startActivity(intent);

            }
        });
        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Space.this, Gallery.class);
                intent.putExtra("passlevel", headname);
                intent.putExtra("point", point);
                startActivity(intent);
            }
        });
        Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Space.this, FunfactText.class);
                intent.putExtra("passlevel", headname);
                intent.putExtra("point", point);
                intent.putExtra("Test","All");
                startActivity(intent);
            }
        });

    }
}
