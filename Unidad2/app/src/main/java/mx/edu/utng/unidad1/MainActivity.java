package mx.edu.utng.unidad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtLetterA;
    private EditText edtLetterB;
    private Button btnCalculate;
    private TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtLetterA =(EditText)findViewById(R.id.edt_letter_a);
        edtLetterB =(EditText) findViewById(R.id.edt_letter_b);
        btnCalculate=(Button) findViewById(R.id.btn_calculate);
        txvResult = (TextView) findViewById(R.id.txv_result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Float.parseFloat(
                        edtLetterA.getText().toString());
                double b = Float.parseFloat(
                        edtLetterB.getText().toString());
                double result = 0;

              result=((2*Math.sqrt(a)+5*Math.sqrt(b))+(3*Math.sqrt(a)-2*Math.sqrt(b)));

     txvResult.setText(String.valueOf(result));
            }
        });
    }
}
