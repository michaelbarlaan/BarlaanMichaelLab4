package com.barlaan.michael;



import android.nfc.Tag;
import android.support.design.widget.Snackbar;
import android.support.design.widget.SnackbarContentLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "4ITH", "onCreate: ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "4ITH", "onStop: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH", "onStart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH", "Huminto yung activity ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITH", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITH", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH", "onDestroy: ");
    }
    public void displayMsgNext(View n){
        Snackbar.make(n, "hello again....", Snackbar.LENGTH_LONG) .show();
    }
    public void displayMsgBack(View b){
        Toast.makeText(this, "Hello 4ITH", Toast.LENGTH_SHORT).show();
    }
}
