package br.edu.ifpe.sepse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Informacoes extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacoes);

        ImageButton bt_info1 = (ImageButton) findViewById(R.id.bt_info1);
        ImageButton bt_info2 = (ImageButton) findViewById(R.id.bt_info2);
        ImageButton bt_info3 = (ImageButton) findViewById(R.id.bt_info3);

        bt_info1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.worldsepsisday.org/sepsis"));
                startActivity(intent);
            }});

        bt_info2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://ilas.org.br/o-que-e-sepse.php"));
                startActivity(intent);
            }});

        bt_info3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.global-sepsis-alliance.org/"));
                startActivity(intent);
            }});

    }
}
