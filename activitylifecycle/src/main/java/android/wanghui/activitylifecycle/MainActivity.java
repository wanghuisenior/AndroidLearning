package android.wanghui.activitylifecycle;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("test", "MainActivity onCreate:");

    }
    public void start(View v){
        startActivity(new Intent(this,LifeTestActivity.class));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("test", "MainActivity onStart:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("test", "MainActivity onResume:");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("test", "MainActivity onPause:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("test", "MainActivity onStop:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("test", "MainActivity onRestart:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("test", "MainActivity onDestroy:");
    }

}
