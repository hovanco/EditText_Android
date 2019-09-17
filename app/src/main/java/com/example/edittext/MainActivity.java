package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn_submit);
//      btn = null; //erro when you run this code line
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              EditText edt = findViewById(R.id.edt_text);
//              String text = edt.getText().toString();
//
//              TextView tvResult = findViewById(R.id.tvResult);
//              tvResult.setText(tvResult.getText().toString() + text + "\n");

                EditText edt = findViewById(R.id.edt_text);
                String textFromEditText = edt.getText().toString();

//              Create TextView and add new TextView in  LinearLayout
                TextView tv = new TextView(MainActivity.this);
                tv.setText(textFromEditText);

                LinearLayout main = findViewById(R.id.main_linear);
                main.addView(tv);

            }
        });


    }
}
