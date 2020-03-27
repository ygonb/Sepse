package br.edu.ifpe.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ComoSaber7Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.como_saber_7);

        final TextView tv_pontuacao7 = findViewById(R.id.tv_pontuacao7);
        tv_pontuacao7.setText(Integer.toString(pontuacao6));

        final TextView tv_resultado = (TextView) findViewById(R.id.tv_resultado);

        final RadioGroup grupo7 = (RadioGroup) findViewById(R.id.rg_7);
        final RadioButton rb_sim7 = (RadioButton) findViewById(R.id.rb_sim7);
        final RadioButton rb_nao7 = (RadioButton) findViewById(R.id.rb_nao7);
        grupo7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo7, int checkedId){
                boolean sim = R.id.rb_sim7 ==checkedId;
                boolean nao = R.id.rb_nao7 ==checkedId;
                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao7 = 2;
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao7 = 0;
                }
                somatorio = pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10 + pontuacao11;
                tv_pontuacao7.setText(Integer.toString(somatorio));
                if (somatorio<45){
                    tv_resultado.setText("Cuide-se!");
                }else if (somatorio>55){
                    tv_resultado.setText("Ir ao hospital");
                }else{
                    tv_resultado.setText("Atenção");
                }
            }});

        final RadioGroup grupo8 = (RadioGroup) findViewById(R.id.rg_8);
        final RadioButton rb_sim8 = (RadioButton) findViewById(R.id.rb_sim8);
        final RadioButton rb_nao8 = (RadioButton) findViewById(R.id.rb_nao8);
        grupo8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo8, int checkedId){
                boolean sim = R.id.rb_sim8==checkedId;
                boolean nao = R.id.rb_nao8==checkedId;
                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao8 = 2;
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao8 = 0;
                }
                somatorio = pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10 + pontuacao11;
                tv_pontuacao7.setText(Integer.toString(somatorio));
                if (somatorio<45){
                    tv_resultado.setText("Cuide-se!");
                }else if (somatorio>55){
                    tv_resultado.setText("Ir ao hospital");
                }else{
                    tv_resultado.setText("Atenção");
                }
            }});

        final RadioGroup grupo9 = (RadioGroup) findViewById(R.id.rg_9);
        final RadioButton rb_sim9 = (RadioButton) findViewById(R.id.rb_sim9);
        final RadioButton rb_nao9 = (RadioButton) findViewById(R.id.rb_nao9);
        grupo9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo9, int checkedId){
                boolean sim = R.id.rb_sim9==checkedId;
                boolean nao = R.id.rb_nao9==checkedId;
                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao9 = 2;
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao9 = 0;
                }
                somatorio = pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10 + pontuacao11;
                tv_pontuacao7.setText(Integer.toString(somatorio));
                if (somatorio<45){
                    tv_resultado.setText("Cuide-se!");
                }else if (somatorio>55){
                    tv_resultado.setText("Ir ao hospital");
                }else{
                    tv_resultado.setText("Atenção");
                }
            }});

        final RadioGroup grupo10 = (RadioGroup) findViewById(R.id.rg_10);
        final RadioButton rb_sim10 = (RadioButton) findViewById(R.id.rb_sim10);
        final RadioButton rb_nao10 = (RadioButton) findViewById(R.id.rb_nao10);
        grupo10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo10, int checkedId){
                boolean sim = R.id.rb_sim10==checkedId;
                boolean nao = R.id.rb_nao10==checkedId;
                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao10 = 2;
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao10 = 0;
                }
                somatorio = pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10 + pontuacao11;
                tv_pontuacao7.setText(Integer.toString(somatorio));
                if (somatorio<45){
                    tv_resultado.setText("Cuide-se!");
                }else if (somatorio>55){
                    tv_resultado.setText("Ir ao hospital");
                }else{
                    tv_resultado.setText("Atenção");
                }
            }});

        final RadioGroup grupo11 = (RadioGroup) findViewById(R.id.rg_11);
        final RadioButton rb_sim11 = (RadioButton) findViewById(R.id.rb_sim11);
        final RadioButton rb_nao11 = (RadioButton) findViewById(R.id.rb_nao11);
        grupo11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo11, int checkedId){
                boolean sim = R.id.rb_sim11==checkedId;
                boolean nao = R.id.rb_nao11==checkedId;
                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao11 = 2;
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao11 = 0;
                }
                somatorio = pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10 + pontuacao11;
                tv_pontuacao7.setText(Integer.toString(somatorio));
                if (somatorio<45){
                    tv_resultado.setText("Cuide-se!");
                }else if (somatorio>55){
                    tv_resultado.setText("Ir ao hospital");
                }else{
                    tv_resultado.setText("Atenção");
                }
            }});


        Button btAnt = (Button) findViewById(R.id.bt_ant_como_saber7);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), ComoSaber6Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(R.id.bt_prox_como_saber7);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent;
                if (somatorio<45){
                    intent = new Intent (getBaseContext(), ComoSaber_res1Activity.class);
                }else if (somatorio>55){
                    intent = new Intent (getBaseContext(), ComoSaber_res3Activity.class);
                }else{
                    intent = new Intent (getBaseContext(), ComoSaber_res2Activity.class);
                }
                startActivity(intent);
            }});
    }
}
