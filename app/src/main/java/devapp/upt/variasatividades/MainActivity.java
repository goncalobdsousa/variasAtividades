package devapp.upt.variasatividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        TextView recebeValorT = findViewById(R.id.recebeValor);
       // FUNCIONA POIS CHEGA PELA VIEW Button chamaFuncInt = findViewById(view.getId());
        int valorContido = Integer.parseInt(recebeValorT.getText().toString());
        isPar(valorContido);

    }
    public void isPar(int valorContidoFunc){
        boolean par;
        par = (valorContidoFunc % 2) == 0;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Teste", par);
        startActivity(intent);
    }
}