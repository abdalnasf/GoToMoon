package com.example.ema.spaceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FunfactText extends ACt {

    private TextView question;
    private RadioGroup answers;
    private ImageButton next;
    private ImageButton myanswer;
    private ImageButton profile;
    private RadioButton A;
    private RadioButton B;
    private RadioButton C;
    private boolean taken=false;
    private int coun;
    private boolean fin=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfact_text);

        question=(TextView)findViewById(R.id.Quest);
        answers=(RadioGroup)findViewById(R.id.choose);
        myanswer=(ImageButton)findViewById(R.id.answer);
        profile=(ImageButton)findViewById(R.id.profilee);
        next=(ImageButton)findViewById(R.id.facttestnext);
        A=(RadioButton)findViewById(R.id.choosea);
        B=(RadioButton)findViewById(R.id.chooseb);
        C=(RadioButton)findViewById(R.id.choosec);

      //   point = getIntent().getIntExtra("point", 100);

        final String questions[]={"Is the moon .... "," The moon  gets its light from .... ","Why does the moon has different phases .... "};
        final String truenswers[]={"planet","The Sun","It moves around the earth"};
        final String Achoosers[]={"planet","star","plane"};
        final String Bchoosers[]={"The Earth","Mars","The Sun"};
        final String Cchoosers[]={"It moves around the earth" , "It moves around the sun" , "It follows the sun around the earth"};


        question.setText(questions[0]);
        A.setText(Achoosers[0]);
        B.setText(Cchoosers[0]);
        C.setText(Bchoosers[0]);

        myanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          //      Toast.makeText(getApplicationContext(),point,Toast.LENGTH_SHORT).show();
                if (!taken) {
                    int index = 0;
                    String xx = question.getText().toString();
                    for (int n = 0; n < 3; n++) {
                        if (xx.equals(questions[n])) index = n;
                    }
                    int i = answers.getCheckedRadioButtonId();
                    if (i == 0 && A.getText().toString().equals(truenswers[index])) {
                        setPoint(getPoint() + 10);
                        taken = true;
                    } else if (i == 1 && B.getText().toString().equals(truenswers[index])) {
                        setPoint(getPoint() + 10);
                        taken = true;
                    } else if (i == 2 && C.getText().toString().equals(truenswers[index])) {
                        setPoint(getPoint() + 10);
                        taken = true;
                    }
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++coun;
                if(coun==3){
                    fin=true;
                    coun=0;
                }


               //**************************************************************************************
                int index = 0;
                String xx = question.getText().toString();
                for (int n = 0; n < 3; n++) {
                    if (xx.equals(questions[n])) index = n;
                }
// Get ID from 0 OR 1
                int i = answers.getCheckedRadioButtonId();
                if ((i == 0 && A.getText().toString().equals(truenswers[index]))||(i == 1 && B.getText().toString().equals(truenswers[index]))||(i == 2 && C.getText().toString().equals(truenswers[index]))) {
                    setPoint(getPoint() + 10);
                    taken=true;
                }
                //*****************************************************************************************

                question.setText(questions[coun]);
                A.setText(Achoosers[coun]);
                B.setText(Cchoosers[coun]);
                C.setText(Bchoosers[coun]);


            }
        });
        if(fin){
            Intent u=new Intent(FunfactText.this,Result.class);
            u.putExtra("point", getPoint());
        }
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FunfactText.this,Profile.class);
                startActivity(i);
            }
        });




    }
}
