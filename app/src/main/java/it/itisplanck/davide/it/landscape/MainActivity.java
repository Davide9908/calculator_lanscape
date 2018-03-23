package it.itisplanck.davide.it.landscape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView t;
    private int[] numeri;
    private int operazione;
    private String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.textView);
        numeri=new int[2];
    }
    public void function(View v){
        if(v.getId()==R.id.button16){

        }
        else{
            switch (v.getId()){
                case R.id.button12:
                    operazione=1;
                    t.setText(t.getText().toString()+"+");
                    s="";
            }
        }

    }
    public void numbers(View v){
        s+=((Button)findViewById(v.getId())).getText().toString();
        t.setText(t.getText().toString()+((Button)findViewById(v.getId())).getText().toString());
    }
}
