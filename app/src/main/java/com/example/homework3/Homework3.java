package com.example.homework3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Homework3 extends AppCompatActivity {
    Button hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        hello = (Button) findViewById(R.id.btn_hello);
        hello.setOnClickListener(sayhello);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homework3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_web){
            Uri uri = Uri.parse("http://www.google.com.tw");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        }
        return true;
    }
    private View.OnClickListener sayhello = new View.OnClickListener(){
        @Override
        public void  onClick(View v){
            Intent intent = new Intent();
            intent.setClass(Homework3.this , SayHelloActivity.class);
            startActivity(intent);
        }
    };
}
