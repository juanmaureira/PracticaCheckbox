package cl.maureira.practicacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox check1, check2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txtValor1);
        et2 = (EditText)findViewById(R.id.txtValor2);
        check1 = (CheckBox)findViewById(R.id.chbSumar);
        check2 = (CheckBox)findViewById(R.id.chbResta);
        tv1 = (TextView)findViewById(R.id.txtResultado);
    }
    
    public void button(View view){
        String strEt1 = et1.getText().toString();
        String strEt2 = et2.getText().toString();
        
        int intEt1 = Integer.parseInt(strEt1);
        int intEt2 = Integer.parseInt(strEt2);
        
        if(check1.isChecked()){
            tv1.setText("  " + String.valueOf(intEt1 + intEt2));
        }
        if(check2.isChecked()){
            tv1.setText("  " + String.valueOf(intEt1 - intEt2));
        }
        if(!check1.isChecked() && !check2.isChecked()){
            Toast.makeText(this, "Seleccione operacion", Toast.LENGTH_SHORT).show();
        }
        
    }
}