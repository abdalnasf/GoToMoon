package com.example.ema.spaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Friendlycomption extends AppCompatActivity {

    private ImageButton friend1;
    private ImageButton friend2;
    private ImageButton friend3;
    private ImageButton friend4;

    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendlycomption);

        friend1=(ImageButton)findViewById(R.id.boy1);
        friend2=(ImageButton)findViewById(R.id.boy2);
        friend3=(ImageButton)findViewById(R.id.boy3);
        friend4=(ImageButton)findViewById(R.id.boy4);

        t1=(TextView)findViewById(R.id.TT1);
        t2=(TextView)findViewById(R.id.TT2);
        t3=(TextView)findViewById(R.id.TT3);
        t4=(TextView)findViewById(R.id.TT4);

        friend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Friendlycomption.this,FriendQ.class);
//                i.putExtra("name",t1.getText().toString());
                startActivity(i);

            }
        });

        friend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Friendlycomption.this,FriendQ.class);
//                i.putExtra("name",t2.getText().toString());
                startActivity(i);

            }
        });
        friend3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Friendlycomption.this,FriendQ.class);
//                i.putExtra("name",t3.getText().toString());
                startActivity(i);

            }
        });
        friend4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Friendlycomption.this,FriendQ.class);
//                i.putExtra("name",t4.getText().toString());
                startActivity(i);

            }
        });



    }


}
