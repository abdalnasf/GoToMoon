package com.example.ema.spaceapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class storyend extends Activity {

    private ImageButton repeat;
    private ImageButton Test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storyend);
       /* repeat=(ImageButton)findViewById(R.id.repeat);
        Test=(ImageButton)findViewById(R.id.endtest);

        final int point =getIntent().getIntExtra("point",100);
        repeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(storyend.this,funfact.class);
                intent.putExtra("point",point);
                startActivity(intent);
           }
        });
        Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(storyend.this,FunfactText.class);
                intent.putExtra("point",point);
                startActivity(intent);
            }
        });*/

    }
}
