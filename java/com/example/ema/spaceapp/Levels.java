package com.example.ema.spaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Levels extends AppCompatActivity {

    private ImageButton level1;
    private ImageButton level2;
    private ImageButton level3;
    private ImageButton level4;

    public int point=200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        level1=(ImageButton)findViewById(R.id.lvl1);
        level2=(ImageButton)findViewById(R.id.lvl2);
        level3=(ImageButton)findViewById(R.id.lvl3);
        level4=(ImageButton)findViewById(R.id.lvl4);

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Levels.this,Space.class);
                intent.putExtra("level", "Level #1");
                intent.putExtra("point",point);
                startActivity(intent);
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Levels.this,Space.class);
                intent.putExtra("level", "Level #2");
                intent.putExtra("point",point);
                startActivity(intent);
            }
        });
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Levels.this,Space.class);
                intent.putExtra("level", "Level #3");
                intent.putExtra("point",point);
                startActivity(intent);
            }
        });
        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Levels.this,Space.class);
                intent.putExtra("level", "Level #4");
                intent.putExtra("point",point);
                startActivity(intent);
            }
        });

    }
}
