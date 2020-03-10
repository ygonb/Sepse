package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ComoSaber4Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.como_saber_4);

        final TextView tv_pontuacao4 = (TextView) findViewById(R.id.tv_pontuacao4);
        final RadioGroup grupo4 = (RadioGroup) findViewById(R.id.rg_4);
        final RadioButton rb_sim4 = (RadioButton) findViewById(R.id.rb_sim4);
        final RadioButton rb_nao4 = (RadioButton) findViewById(R.id.rb_nao4);
        tv_pontuacao4.setText(Integer.toString(pontuacao3));

        grupo4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo4, int checkedId){
                boolean sim = R.id.rb_sim4==checkedId;
                boolean nao = R.id.rb_nao4==checkedId;

                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao4 = pontuacao3 + 10;
                    tv_pontuacao4.setText(Integer.toString(pontuacao4));
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao4 = pontuacao3;
                    tv_pontuacao4.setText(Integer.toString(pontuacao4));
                }
            }});


        Button btAnt = (Button) findViewById(R.id.bt_ant_como_saber4);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), ComoSaber3Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(R.id.bt_prox_como_saber4);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if (rb_sim4.isChecked()||rb_nao4.isChecked()){
                    Intent intent = new Intent (getBaseContext(), ComoSaber5Activity.class);
                    startActivity(intent);}

            }});
    }
}
