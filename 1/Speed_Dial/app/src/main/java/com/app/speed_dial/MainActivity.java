package com.app.speed_dial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button button_1;
    Button button_2;
    Button button_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 = (Button) findViewById(R.id.button1);
        button_2 = (Button) findViewById(R.id.button2);
        button_3 = (Button) findViewById(R.id.button3);
    }



    public void button_1_OnClick(View v) throws InterruptedException{
        //Максим
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0978152009" ));
        startActivity(intent);
    }



    public void button_2_OnClick(View v) throws InterruptedException{
        //Катя
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0684078920"));
        startActivity(intent);
    }



    public void button_3_OnClick(View v) throws InterruptedException{
        //Андрей
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0503401038" ));
        startActivity(intent);
    }

}
