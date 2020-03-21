package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaibaMais2 extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saiba_mais2);


        Button bt_ant_saiba_mais_2 =
                findViewById(R.id.bt_ant_saiba_mais_2);

        bt_ant_saiba_mais_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), SaibaMais.class);
                startActivity(intent);
            }});


        Button bt_prox_saiba_mais_2 =
                findViewById(R.id.bt_prox_saiba_mais_2);

        bt_prox_saiba_mais_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), SaibaMais3.class);
                startActivity(intent);
            }});

    }
}
