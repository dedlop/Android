package unis.edu.br.aula18imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final float[] imc = new float[1];

        Button btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView editPeso = findViewById(R.id.editPeso);
                TextView editAltura = findViewById(R.id.editAltura);
                TextView txtResult = findViewById(R.id.txtResultado);
                TextView txtMsg = findViewById(R.id.txtMsg);

                int peso = Integer.parseInt(editPeso.getText().toString());

                float altura = Float.parseFloat(editAltura.getText().toString());

                imc[0] = peso / ( altura * altura );

                if(imc[0] < 18.5) {
                    txtResult.setText(imc[0] + "");
                    txtMsg.setText("Baixo Peso");
                } else if(imc[0] >= 18.5 && imc[0] < 25) {
                    txtResult.setText(imc[0] + "");
                    txtMsg.setText("Peso Adequado");
                } else if(imc[0] >= 25 && imc[0] < 30) {
                    txtResult.setText(imc[0] + "");
                    txtMsg.setText("Sobrepeso");
                } else {
                    txtResult.setText(imc[0] + "");
                    txtMsg.setText("Obesidade");
                }
            }
        });
    }
}