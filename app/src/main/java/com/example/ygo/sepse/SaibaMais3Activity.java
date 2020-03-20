package com.example.ygo.sepse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SaibaMais3Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saiba_mais_3);

        Button btAnt = (Button) findViewById(R.id.bt_ant_saiba_mais_3);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), SaibaMais2Activity.class);
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
