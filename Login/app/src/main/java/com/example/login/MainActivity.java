package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if (login.equals("MIGUEL")&&senha.equals("1234")) {
                    alert("LOGIN REALIZADO COM SUCESSO!!!");
                    Intent it = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(it);
                }
                if (login.equals("Miguel")&&senha.equals("1234")){
                    alert("LOGIN REALIZADO COM SUCESSO!!!");
                    Intent nova = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(nova);
                }
                /*if (login.equals("")&&senha.equals("")){
                    alert("LOGIN REALIZADO COM SUCESSO!!!");
                    Intent it = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(it);
                }*/
                else{
                    alert ("USUÁRIO OU SENHA INCORRETOS");
                    }
                }

        });

    }
    private void alert (String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();}





}


