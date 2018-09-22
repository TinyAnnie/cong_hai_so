package com.fsome.cong_hai_so;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Acitvity extends AppCompatActivity
        implements View.OnClickListener
    {
        Button btn_add;
        EditText edt_a,edt_b;
        TextView show_result;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add=(Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        edt_a=(EditText) findViewById(R.id.a);
        edt_b=(EditText) findViewById(R.id.b);
        show_result=(TextView) findViewById(R.id.show_result);}
        @Override
        public void onClick(View arg0){
        int a = Integer.parseInt(edt_a.getText()+"");
        int b = Integer.parseInt(edt_b.getText()+"");
        show_result .setText((a+b+""));
    }
    }
}

