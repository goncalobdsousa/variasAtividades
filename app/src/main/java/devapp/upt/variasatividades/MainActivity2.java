package devapp.upt.variasatividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intentRecebido = getIntent();
        TextView texto = findViewById(R.id.textViewMain2);
        boolean recebido = intentRecebido.getBooleanExtra("Teste", false);
        if(recebido){
            texto.setText(R.string.ParS);
        }else{
            texto.setText(R.string.ImparS);
        }

    }

    public void onClick(View v){
        finish();
    }


}