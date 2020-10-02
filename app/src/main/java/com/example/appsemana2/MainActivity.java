package com.example.appsemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.DatePickerDialog;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePickerDialog picker;
    EditText eText;
    Button nextBtn;
    EditText data_name;
    EditText data_date;
    EditText data_phone;
    EditText data_email;
    EditText data_description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        eText=(EditText) findViewById(R.id.edtFecha);
        eText.setInputType(InputType. TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);

                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                eText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        nextBtn=(Button) findViewById(R.id.bntSig);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data_name = findViewById(R.id.edtNombre);
                data_date = findViewById(R.id.edtFecha);
                data_phone = findViewById(R.id.edtTelefono);
                data_email = findViewById(R.id.edtCorreo);
                data_description = findViewById(R.id.edtDescrip);

                String name = data_name.getText().toString();
                String birthDate = data_date.getText().toString();
                String phone = data_phone.getText().toString();
                String email = data_email.getText().toString();
                String description = data_description.getText().toString();

                DatosContacto data = new DatosContacto(name,birthDate,phone,email,description);

                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                intent.putExtra("name", data.getName());
                intent.putExtra("date", data.getBirthDate());
                intent.putExtra("phone", data.getPhone());
                intent.putExtra("email", data.getEmail());
                intent.putExtra("description", data.getDescription());
                startActivity(intent);

            }
        });

    }
}