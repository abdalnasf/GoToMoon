package com.example.ema.spaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Gallery extends AppCompatActivity {
    ImageButton img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
       /* img1=(ImageButton)findViewById(R.id.imm);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Gallery.this,GalaryImage.class);
                startActivity(i);
            }
        });*/
    }
}
