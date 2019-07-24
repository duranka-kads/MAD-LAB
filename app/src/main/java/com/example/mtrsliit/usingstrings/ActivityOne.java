package com.example.mtrsliit.usingstrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class ActivityOne extends AppCompatActivity {
    //Define text view object
    TextView txtView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        //Set the textView within the layout for class object
        txtView3=findViewById(R.id.textView3);
        //This set the value of Msg2 as the text String
        txtView3.setText(R.string.Msg2);

        Log.i("LifeCycle","OnCreate() Invoked!!");
    }
    public void onStart(){
        super.onStart();
        Log.i("LifeCycle","OnStart() Invoked!!");
    }
    public void onRestart(){
        super.onRestart();
        Log.i("LifeCycle","OnRestart() Invoked!!");
    }
    public void onResume(){
        super.onResume();
        Log.i("LifeCycle","OnResume() Invoked!!");
    }
    public void onPause(){
        super.onPause();
        Log.i("LifeCycle","onPause() Invoked!!");
    }
    public void onStop(){
        super.onStop();
        Log.i("LifeCycle","onStop() Invoked!!");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.i("LifeCycle","onDestroy() Invoked!!");
    }

}
