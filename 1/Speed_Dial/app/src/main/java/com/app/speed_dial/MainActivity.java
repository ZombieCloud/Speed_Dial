package com.app.speed_dial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton imButton_1;
    ImageButton imButton_2;
    ImageButton imButton_3;
    ImageButton imButton_4;
    ImageButton imButton_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imButton_1 = (ImageButton) findViewById(R.id.imageButton1);
        imButton_2 = (ImageButton) findViewById(R.id.imageButton2);
        imButton_3 = (ImageButton) findViewById(R.id.imageButton3);
        imButton_4 = (ImageButton) findViewById(R.id.imageButton4);
        imButton_5 = (ImageButton) findViewById(R.id.imageButton5);
    }



    //Максим
    public void imageButton1_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0978152009" ));
        startActivity(intent);
    }


    //Максим
    public void imageButton2_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0688725860" ));
        startActivity(intent);
    }


    //Катя
    public void imageButton3_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0684078920"));
        startActivity(intent);
    }


    //Андрей
    public void imageButton4_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0503401038" ));
        startActivity(intent);
    }


    //Вита
    public void imageButton5_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0962559354" ));
        startActivity(intent);
    }

}
