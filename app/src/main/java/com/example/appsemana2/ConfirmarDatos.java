package com.example.appsemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class ConfirmarDatos extends AppCompatActivity {

    TextView name;
    TextView date;
    TextView phone;
    TextView email;
    TextView description;
    Button backBtn;
    String data_name;
    String data_date;
    String data_phone;
    String data_email;
    String data_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmar_datos);
  
        Bundle data = getIntent().getExtras();

 
        name = (TextView) findViewById(R.id.data_name);
        date = (TextView) findViewById(R.id.data_date);
        phone = (TextView) findViewById(R.id.data_phone);
        email = (TextView) findViewById(R.id.data_email);
        description = (TextView) findViewById(R.id.data_description);

        data_name = data.getString("name");
        data_date = data.getString("date");
        data_phone = data.getString("phone");
        data_email = data.getString("email");
        data_description = data.getString("description");

        name.setText(data_name);
        date.setText(data_date);
        phone.setText(data_phone);
        email.setText(data_email);
        description.setText(data_description);

        backBtn=(Button) findViewById(R.id.dataconfirm_backbtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });

    }
}