package com.example.ema.spaceapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Stories extends AppCompatActivity {

    ImageButton story1;
    ImageButton story2;
    ImageButton story3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        final String x="As the moon rotates around the earth , its own axis at the same rate. Thia is way we always see the same side of the moon.";
        final String y="The moon causes many of the tides in the Earth's oceans. This is because of gravity force betweenthe Earth and Moon.";

        story1=(ImageButton)findViewById(R.id.story1);
//        story2=(ImageButton)findViewById(R.id.story2);
//        story3=(ImageButton)findViewById(R.id.story3);

        story1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Stories.this,thestory.class);
                startActivity(i);
            }
        });
//        story2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(Stories.this,thestory.class);
//                i.putExtra("Con",x);
//                startActivity(i);
//            }
//        });
//        story3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(Stories.this,thestory.class);
//                i.putExtra("Con",y);
//                startActivity(i);
//            }
//        });


    }
}
