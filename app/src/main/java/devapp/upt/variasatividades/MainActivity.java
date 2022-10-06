package devapp.upt.variasatividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        TextView recebeValorT = findViewById(R.id.recebeValor);
       // FUNCIONA POIS CHEGA PELA VIEW Button chamaFuncInt = findViewById(view.getId());
        int valorContido = Integer.valueOf(recebeValorT.getText().toString());
        isPar(valorContido);

    }
    public void isPar(int valorContidoFunc){
        boolean par = false;
        if(valorContidoFunc % 2 == 0){
            par = true;
        } else {
            par = false;
        }
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Teste", par);
        startActivity(intent);
    }
}