package it.itisplanck.davide.it.landscape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView t1, t2;
    private String[] numeri;
    private int operazione = -1;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
    }

    public void function(View v) {
        if (v.getId() == R.id.button16) {

            if (operazione == -1) {
                Toast.makeText(this, "Operazione non scelta", Toast.LENGTH_SHORT);
            } else {
                numeri = t2.getText().toString().split("\\+|-|\\*|/");
                Log.i("numero", numeri[0]);
                Log.i("numero", numeri[1]);
                if (numeri[0] == null || numeri[1] == null) {
                    Toast.makeText(this, "Inserisci 2 numeri", Toast.LENGTH_LONG);
                    t2.setText("");

                }
                else {
                    switch (operazione){
                        case 1:
                            t1.setText(t2.getText() + "=" + (Integer.parseInt(numeri[0]) + Integer.parseInt(numeri[1])) + "\n");
                            break;
                        case 2:
                            t1.setText(t2.getText() + "=" + (Integer.parseInt(numeri[0]) - Integer.parseInt(numeri[1])) + "\n");
                            break;
                        case 3:
                            t1.setText(t2.getText() + "=" + (Integer.parseInt(numeri[0]) * Integer.parseInt(numeri[1])) + "\n");
                            break;
                        case 4:
                            double n=Double.parseDouble(numeri[0]) / Double.parseDouble(numeri[1]);
                            t1.setText(t2.getText() + "=" +""+ n + "\n");
                            break;
                    }

                    t2.setText("");
                }
                operazione = -1;

            }

        } else {
            switch (v.getId()) {
                case R.id.button12:
                    if (operazione == -1) {
                        operazione = 1;
                        t2.setText(t2.getText().toString() + "+");
                    }
                    break;
                case R.id.button13:
                    if (operazione == -1) {
                        operazione = 2;
                        t2.setText(t2.getText().toString() + "-");
                    }
                    break;
                case R.id.button14:
                    if (operazione == -1) {
                        operazione = 3;
                        t2.setText(t2.getText().toString() + "*");
                    }
                    break;
                case R.id.button15:
                    if (operazione == -1) {
                        operazione = 4;
                        t2.setText(t2.getText().toString() + "/");
                    }
                    break;
            }
        }

    }

    public void numbers(View v) {
        s += ((Button) findViewById(v.getId())).getText().toString();
        t2.setText(t2.getText().toString() + ((Button) findViewById(v.getId())).getText().toString());
    }
}
