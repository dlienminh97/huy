package com.example.lienminh.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox k,k1,k2,k3,k4;
    Button b,b1;
    TextView a;
    RadioButton r,r1,r2,r3;
    RadioGroup rdg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addcontro();
        addEvent();

    }

    private void addEvent(){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli1();
            }
        });
    }
    public void xuli1(){
        String w="";
        if(r.isChecked()){
            w = r.getText().toString();
        }
        else {
            if(r1.isChecked()){
                w =r1.getText().toString();
            }
            else {
                if(r2.isChecked()){
                    w = r2.getText().toString();
                }
                else {
                    if(r3.isChecked()){
                        w =r3.getText().toString();
                    }
                }
            }
        }
        Toast.makeText(this , w , Toast.LENGTH_SHORT).show();

    }
    public void xuli(){
        String w="";
        if(k1.isChecked())
        {
            w += k1.getText().toString();
        }
        if(k2.isChecked()){
            w += k2.getText().toString();
        }
        if(k3.isChecked()){
            w += k3.getText().toString();
        }
        if(k4.isChecked()){
            w += k4.getText().toString();
        }
        a.setText(w);
         Toast.makeText(this, w ,Toast.LENGTH_SHORT).show();
    }
    private void addcontro(){
        k1=(CheckBox) findViewById(R.id.checkboxk1);
        k2=(CheckBox) findViewById(R.id.checkboxk2);
        k3=(CheckBox) findViewById(R.id.checkboxk3);
        k4=(CheckBox) findViewById(R.id.checkboxk4);
        b =(Button) findViewById(R.id.button);
        a = (TextView) findViewById(R.id.text1);
        b1 =(Button) findViewById(R.id.button1);
        r = (RadioButton) findViewById(R.id.radio1);
        r1 = (RadioButton) findViewById(R.id.radio2);
        r2 = (RadioButton) findViewById(R.id.radio3);
        r3 =  (RadioButton) findViewById(R.id.radio);
    }

}
