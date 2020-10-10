package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String temp="";
    char ch='#';
    String temp1;
    String temp2;
    String str="";
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_dian;
    Button btn_jia;
    Button btn_jian;
    Button btn_cheng;
    Button btn_chu;
    Button btn_dengyu;
    boolean flag = false;
    TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_show = findViewById(R.id.tv_show);

        btn_0 = findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "0";
                str = str + "0";
                tv_show.setText(str);
            }
        });

        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "1";
                str = str + "1";
                tv_show.setText(str);
            }
        });

        btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "2";
                str = str + "2";
                tv_show.setText(str);
            }
        });

        btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "3";
                str = str + "3";
                tv_show.setText(str);
            }
        });

        btn_4 = findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "4";
                str = str + "4";
                tv_show.setText(str);
            }
        });

        btn_5 = findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "5";
                str = str + "5";
                tv_show.setText(str);
            }
        });

        btn_6 = findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "6";
                str = str + "6";
                tv_show.setText(str);
            }
        });

        btn_7 = findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "7";
                str = str + "7";
                tv_show.setText(str);
            }
        });

        btn_8 = findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "8";
                str = str + "8";
                tv_show.setText(str);
            }
        });

        btn_9 = findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "9";
                str = str + "9";
                tv_show.setText(str);
            }
        });

        btn_dian = findViewById(R.id.btn_dian);
        btn_dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + ".";
                str = str + ".";
                tv_show.setText(str);
            }
        });

        btn_jia = findViewById(R.id.btn_jia);
        btn_jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = temp.isEmpty();
                if(ch == '#' && flag == false){
                    ch = '+';
                    temp1=temp;
                    str=temp+ch;
                    temp="";
                    tv_show.setText(str);
                }
            }
        });

        btn_jian = findViewById(R.id.btn_jian);
        btn_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = temp.isEmpty();
                if(ch == '#' && flag == false){
                    ch = '-';
                    temp1=temp;
                    str=temp1+ch;
                    temp="";
                    tv_show.setText(str);
                }
            }
        });

        btn_cheng = findViewById(R.id.btn_cheng);
        btn_cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = temp.isEmpty();
                if(ch == '#' && flag == false){
                    ch = '*';
                    temp1=temp;
                    str=temp+ch;
                    temp="";
                    tv_show.setText(str);
                }
            }
        });

        btn_chu = findViewById(R.id.btn_chu);
        btn_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = temp.isEmpty();
                if(ch == '#' && flag == false ){
                    ch = '/';
                    temp1=temp;
                    str=temp+"÷";
                    temp="";
                    tv_show.setText(str);
                }
            }
        });

        btn_dengyu = findViewById(R.id.btn_dengyu);
        btn_dengyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp2=temp;
                flag = temp2.isEmpty();
                if(ch != '#' && flag==false){
                   if(ch == '/'){
                         double num;
                         num = Double.valueOf(temp2);
                        if( num == 0 ){
                            tv_show.setText("不能除以0");
                        }else{
                            tv_show.setText(str + "=" + show(compute(temp1, ch, temp2)));
                        }
                    }else {
                        tv_show.setText(str + "=" + show(compute(temp1, ch, temp2)));
                    }
                    cleanup();
                }
            }
        });
    }

    protected String show(double num){
        String testtemp;
        testtemp = ""+num;
        return testtemp;
    }

    protected void cleanup(){
        temp="";
        ch = '#';
        str = "";
        flag = false;
    }

    protected double compute(String temp1,char ch,String temp2){

        double num1,num2,sum=0;
        num1 = Double.valueOf(temp1);
        num2 = Double.valueOf(temp2);

        switch(ch){
            case '+':
                sum = num1 + num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '*':
                sum = num1 * num2;
                break;
            case '/':
                sum = num1 / num2;
                break;
        }

        return sum;
    }

    protected double change(String temp){
        return Double.valueOf(temp);
    }

}
