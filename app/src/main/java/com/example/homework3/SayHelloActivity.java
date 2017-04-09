package com.example.homework3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SayHelloActivity extends AppCompatActivity {
    EditText input;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        input = (EditText)findViewById(R.id.et_input);
        back =(Button) findViewById(R.id.btn_back);

        back.setOnClickListener(goback);
    }

    private View.OnClickListener goback = new View.OnClickListener(){
        @Override
        public void  onClick(View v){
            Toast.makeText(SayHelloActivity.this, "Hello " + input.getText().toString(), Toast.LENGTH_SHORT).show();
            finish();
        }
    };

}
