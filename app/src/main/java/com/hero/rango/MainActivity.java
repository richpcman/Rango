package com.hero.rango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.hero.rango.feul.FeulActivity;

public class MainActivity extends AppCompatActivity {
    OnClickListener feulBtnClick= new OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, FeulActivity.class);
            startActivity(intent);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button feulBtn= findViewById(R.id.feulButton);
        feulBtn.setOnClickListener(feulBtnClick);

    }
}
