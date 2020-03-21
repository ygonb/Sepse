package com.example.ygo.sepse;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Inicio extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageButton btComoSaber = (ImageButton) findViewById(R.id.bt_como_saber);
        ImageButton btSaibaMais = (ImageButton) findViewById(R.id.bt_saiba_mais);
        ImageButton btComoPrevenir = (ImageButton) findViewById(R.id.bt_como_prevenir);


        btComoSaber.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick (View view){
                Intent intent = new Intent (getContext(), ComoSaber1Activity.class);
                startActivity(intent);
        }});

        btSaibaMais.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getContext(), SaibaMais.class);
                startActivity(intent);
            }});

        btComoPrevenir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getContext(), ComoPrevenir.class);
                startActivity(intent);
            }});


        /*
        Button btOK = (Button) findViewById(R.id.botaoOK);

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText senha = (EditText) findViewById(R.id.senha);
                String senhaDig = senha.getText().toString();

                if ("1234".equals(senhaDig)){
                    alerta("Senha correta");

                    Intent intent = new Intent (getContext(), Tela2Activity.class);
                    Bundle param = new Bundle();
                    param.putString("nome",senhaDig);
                    intent.putExtras(param);
                    startActivity(intent);

                } else {
                    alerta("Senha incorreta");
                }

            }
        });*/
        }


    private Context getContext(){
        return this;
    }

    private void alerta(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.action_info){
            Intent intent = new Intent (getContext(), SaibaMais.class);
            startActivity(intent);
            return(true);
        }
        return super.onOptionsItemSelected(item);
    }




}
