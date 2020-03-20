package com.example.ygo.sepse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SaibaMais2Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saiba_mais_2);

        Button bt_ant_saiba_mais_2 =
                findViewById(R.id.bt_ant_saiba_mais_2);

        bt_ant_saiba_mais_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), SaibaMaisActivity.class);
                startActivity(intent);
            }});

        View btProx = null;
        Button bt_prox_saiba_mais;
        bt_prox_saiba_mais = (Button)
                this.<View>findViewById(R.id.bt_prox_saiba_mais_2);

        bt_prox_saiba_mais.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                Intent it = new
                        Intent(getBaseContext(), SaibaMais3Activity.class);
                startActivity(it);}});
    }
}