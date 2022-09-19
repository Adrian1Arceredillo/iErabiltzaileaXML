package com.example.ierabiltzaileaxml;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;

import android.os.Bundle;

public class Bigarrena extends AppCompatActivity {

    private CheckBox cbEnglish;
    private Button btnBai, btnEz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigarrena);

        cbEnglish = (CheckBox) findViewById(R.id.cbEnglish);
        btnBai = (Button)findViewById(R.id.btnBai);
        btnEz = (Button)findViewById(R.id.btnEz);

        cbEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbEnglish.isChecked())
                {
                    btnBai.setText(R.string.bai_en);
                    btnEz.setText(R.string.ez_en);
                } else {
                    btnBai.setText(R.string.bai_eu);
                    btnEz.setText("Ez"); }
        }
        });

    }
}