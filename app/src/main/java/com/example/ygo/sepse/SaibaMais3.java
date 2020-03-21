package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaibaMais3 extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saiba_mais3);


        Button btAnt = (Button) findViewById(R.id.bt_ant_saiba_mais_3);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), SaibaMais2.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(R.id.bt_menu_saiba_mais_3);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), Inicio.class);;
                startActivity(intent);
            }});

    }
}
