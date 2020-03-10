package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ComoSaber2Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.como_saber_2);

        final TextView tv_pontuacao2 = (TextView) findViewById(R.id.tv_pontuacao2);
        final RadioGroup grupo2 = (RadioGroup) findViewById(R.id.rg_2);
        final RadioButton rb_sim2 = (RadioButton) findViewById(R.id.rb_sim2);
        final RadioButton rb_nao2 = (RadioButton) findViewById(R.id.rb_nao2);
        tv_pontuacao2.setText(Integer.toString(pontuacao1));

        grupo2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo2, int checkedId){
                boolean sim = R.id.rb_sim2==checkedId;
                boolean nao = R.id.rb_nao2==checkedId;

                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao2 = pontuacao1 + 10;
                    tv_pontuacao2.setText(Integer.toString(pontuacao2));
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao2 = pontuacao1;
                    tv_pontuacao2.setText(Integer.toString(pontuacao2));
                }
            }});


        Button btAnt = (Button) findViewById(R.id.bt_ant_como_saber2);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), ComoSaber1Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(R.id.bt_prox_como_saber2);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if (rb_sim2.isChecked()||rb_nao2.isChecked()){
                Intent intent = new Intent (getBaseContext(), ComoSaber3Activity.class);
                startActivity(intent);}
            }});
    }
}
