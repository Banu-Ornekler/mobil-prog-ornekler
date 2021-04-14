package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button geridon;
    TextView adkismi;
    TextView bilgi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String verb = bundle.getString("ad");
            String verb2 = bundle.getString("mail");

            TextView adkismi=(TextView)findViewById(R.id.adkismi);
            TextView mail=(TextView)findViewById(R.id.bilgi);

            adkismi.setText(verb);
            mail.setText(verb2);


            geridon = (Button) findViewById(R.id.geridon);
            geridon.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(i);
                    //finish();

                }
            });




        }
    }
}