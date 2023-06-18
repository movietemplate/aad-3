package com.example.exp3_551;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    EditText mEdit;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=(Button)findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mEdit = (EditText)findViewById(R.id.editText1);
                mText=(TextView)findViewById(R.id.textView1);
                mText.setText("Hello"+mEdit.getText().toString()+"!");
            }
        });

    }
}