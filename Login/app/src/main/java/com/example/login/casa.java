package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class casa extends AppCompatActivity {
    CheckBox chkAssolan,chkVeja,chkToalha,chkPano;
    Button btTotal,btCalcular;
    EditText edtTotal,edtQuantidade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa);
        chkAssolan = (CheckBox) findViewById(R.id.chkAssolan);
        chkPano = (CheckBox) findViewById(R.id.chkPano);
        chkToalha = (CheckBox) findViewById(R.id.chkToalha);
        chkVeja = (CheckBox) findViewById(R.id.chkVeja);
        edtTotal = (EditText) findViewById(R.id.edtTotalcasa);
        btTotal = (Button) findViewById(R.id.btTotalcasa);
        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = 0;
                if (chkAssolan.isChecked())
                    total += 2.0;
                if (chkVeja.isChecked())
                    total += 6.99;
                if (chkPano.isChecked())
                    total += 5.0;
                if (chkToalha.isChecked())
                    total += 69.90;
                Double E = total;
                edtTotal.setText(E.toString());

                Intent casa = new Intent(getApplicationContext(), finalizando_compras.class);
                casa.putExtra("house", edtTotal.getText().toString());
                startActivity(casa);
                }
           });

    }
}
