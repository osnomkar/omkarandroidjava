package com.conq.omkar.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = new LinearLayout(this);
        LinearLayout.LayoutParams paramrut = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(paramrut);
        ll.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams edt = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText txt = new EditText(this);
        txt.setLayoutParams(edt);
        ll.addView(txt);

        LinearLayout.LayoutParams btn = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button btnm = new Button(this);
        btnm.setLayoutParams(btn);
        btnm.setText("Omkar");
        ll.addView(btnm);

        setContentView(ll);


    }
}
