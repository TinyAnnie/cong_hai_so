package com.fsome.cong_hai_so;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Anonymous extends AppCompatActivity {
    public void tong_hai_so(View v){
        Button btn_add =(Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edta =(EditText) findViewById(R.id.a);
                int a =Integer.parseInt(edta.getText()+"");
                EditText edtb =(EditText) findViewById(R.id.b);
                int b =Integer.parseInt(edtb.getText()+"");
                TextView result = (TextView) findViewById(R.id.show_result);
                result.setText((a+b+""));
            }
        });

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
