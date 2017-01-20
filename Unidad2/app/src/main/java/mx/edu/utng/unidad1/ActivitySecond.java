package mx.edu.utng.unidad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    private EditText edtLetterX;
    private EditText edtLetterY;
    private Button btnCalculate;
    private TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edtLetterX =(EditText)findViewById(R.id.edt_letter_x);
        edtLetterY =(EditText) findViewById(R.id.edt_letter_y);
        btnCalculate=(Button) findViewById(R.id.btn_calculate);
        txvResult = (TextView) findViewById(R.id.txv_result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Float.parseFloat(
                        edtLetterX.getText().toString());
                double y = Float.parseFloat(
                        edtLetterY.getText().toString());
                double result = 0;

                result=((4*x*y+5*Math.pow(x,2)*y-6*Math.pow(x,3))+(3*Math.pow(y,3)-6*x*Math.pow(y,2)
                        +7*x*y+Math.pow(x,3)-2*Math.pow(x,2)*y));
                txvResult.setText(String.valueOf(result));
            }
        });

    }
}
