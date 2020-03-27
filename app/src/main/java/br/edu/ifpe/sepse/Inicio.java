package br.edu.ifpe.sepse;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
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
            Intent intent = new Intent (getContext(), Informacoes.class);
            startActivity(intent);
            return(true);
        }
        return super.onOptionsItemSelected(item);
    }




}
