package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class categoria extends AppCompatActivity {
    Button  btJogos,btInformatica,btEletronicos,btAlimentos,btCasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        btJogos = (Button) findViewById(R.id.btJogos);
        btEletronicos = (Button) findViewById(R.id.btEletronica);
        btAlimentos = (Button) findViewById(R.id.btAlimentos);
        btInformatica = (Button) findViewById(R.id.btInformatica);
        btCasa = (Button) findViewById(R.id.btCasa);
        btJogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),CarrinhoJogosActivity.class);
                startActivity(it);
            }
        });
        btEletronicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nova = new Intent(getApplicationContext(),eletronicos_carrinho.class);
                startActivity(nova);
            }
        });
        btAlimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lib = new Intent(getApplicationContext(),alimentos.class);
                startActivity(lib);
            }
        });
        btInformatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(getApplicationContext(),Informatica.class);
                startActivity(info);
            }
        });
        btCasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent house = new Intent(getApplicationContext(), casa.class);
                startActivity(house);
            }
        });
    }
}