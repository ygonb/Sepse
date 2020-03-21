package com.example.ygo.sepse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.ygo.sepse.R.id.bt_ant_saiba_mais_3;
import static com.example.ygo.sepse.R.id.bt_menu_saiba_mais_3;
import static com.example.ygo.sepse.R.layout.saiba_mais_3;

public class SaibaMais3Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(saiba_mais_3);

        Button btAnt = (Button) findViewById(bt_ant_saiba_mais_3);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), SaibaMais2Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(bt_menu_saiba_mais_3);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), Inicio.class);;
                startActivity(intent);
            }});
    }
}
