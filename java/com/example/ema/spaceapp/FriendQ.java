package com.example.ema.spaceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FriendQ extends AppCompatActivity {
private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_q);

        t.setText(getIntent().getStringExtra("name"));
    }
}
