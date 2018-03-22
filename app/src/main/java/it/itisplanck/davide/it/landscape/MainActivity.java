package it.itisplanck.davide.it.landscape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.textView);

    }
    public void buttons(View v){
        if(v.getId()!=R.id.button16)
                t.setText(t.getText().toString()+((Button)findViewById(v.getId())).getText());

    }
}
