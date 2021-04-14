package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView editTextTextPersonName;
    TextView editTextTextPersonName2;
    TextView textView11;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editTextTextPersonName = (TextView) findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (TextView) findViewById(R.id.editTextTextPersonName2);
        textView11 = (TextView) findViewById(R.id.textView11);

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                if(bundle != null) {
                    String verb = bundle.getString("ad");
                    String verb2 = bundle.getString("mail");
                    editTextTextPersonName = (TextView) findViewById(R.id.editTextTextPersonName);
                    editTextTextPersonName2 = (TextView) findViewById(R.id.editTextTextPersonName2);

                    editTextTextPersonName.setText(verb);
                    editTextTextPersonName2.setText(verb);

                }
            }
        });



        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MainActivity2.class);
                i.putExtra("ad", editTextTextPersonName.getText().toString());
                i.putExtra("mail", editTextTextPersonName2.getText().toString());
                startActivity(i);
                //finish();
            }
        });

    }
}