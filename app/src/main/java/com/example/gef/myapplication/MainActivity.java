package com.example.gef.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("demo","onCreate");

        // message de bienvenue :
        Toast.makeText(this , R.string.main_bienvenue, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("demo","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("demo","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("demo","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("demo","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("demo","onDestroy");
    }

    public void onClickBoutonRetour(View view){
        ScrollView scrollViewArticle = findViewById(R.id.scrollView_article);
        scrollViewArticle.smoothScrollTo(0,0);

        Toast.makeText(this,R.string.main_retour , Toast.LENGTH_LONG).show();
    }
}
