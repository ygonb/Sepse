package br.edu.ifpe.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ComoSaber3Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.como_saber_3);


        final TextView tv_pontuacao3 = (TextView) findViewById(R.id.tv_pontuacao3);
        final RadioGroup grupo3 = (RadioGroup) findViewById(R.id.rg_3);
        final RadioButton rb_sim3 = (RadioButton) findViewById(R.id.rb_sim3);
        final RadioButton rb_nao3 = (RadioButton) findViewById(R.id.rb_nao3);
        tv_pontuacao3.setText(Integer.toString(pontuacao2));

        grupo3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo3, int checkedId){
                boolean sim = R.id.rb_sim3==checkedId;
                boolean nao = R.id.rb_nao3==checkedId;

                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao3 = pontuacao2 + 12;
                    tv_pontuacao3.setText(Integer.toString(pontuacao3));
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao3 = pontuacao2;
                    tv_pontuacao3.setText(Integer.toString(pontuacao3));
                }
            }});



        Button btAnt = (Button) findViewById(R.id.bt_ant_como_saber3);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), ComoSaber2Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(R.id.bt_prox_como_saber3);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if (rb_sim3.isChecked()||rb_nao3.isChecked()){
                    Intent intent = new Intent (getBaseContext(), ComoSaber4Activity.class);
                    startActivity(intent);}

            }});
    }
}
