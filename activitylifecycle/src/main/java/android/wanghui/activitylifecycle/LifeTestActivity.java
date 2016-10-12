package android.wanghui.activitylifecycle;

import android.app.Dialog;
import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/*
* 打开一个Activity:  onCreate onStart onResume
*
* 关闭该Activity:    onPause onStop  onDestroy
*
* 按home键返回桌面:   onPause onStop
*
* 在最近任务里重新打开: onRestart onStart onResume
*
*
*
*
*/
public class LifeTestActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_test);
        text = (TextView) findViewById(R.id.tv_text);
        text.setText("onCreate");
        Log.e("test", "LifeTestActivity onCreate:");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("test", "LifeTestActivity onStart:");
        text.setText("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("test", "LifeTestActivity onResume:");
        text.setText("onResume");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        text.setText("onSaveInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("test", "LifeTestActivity onPause:");
        text.setText("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("test", "LifeTestActivity onStop:");
        text.setText("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("test", "LifeTestActivity onRestart:");
        text.setText("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("test", "LifeTestActivity onDestroy:");
        text.setText("onDestroy");
    }

    public void showDialog(View view) {
        Toast.makeText(LifeTestActivity.this, "弹窗", Toast.LENGTH_SHORT).show();

        new AlertDialog.Builder(LifeTestActivity.this).setTitle("提示").setMessage("当前有新版本,是否更新?").setNegativeButton("暂不更新", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(LifeTestActivity.this, "暂不更新", Toast.LENGTH_SHORT).show();
            }
        }).setPositiveButton("立即更新", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(LifeTestActivity.this, "立即更新", Toast.LENGTH_SHORT).show();

            }
        }).show();
    }
}
class  MyService extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("test", "LifeTestActivity onBind:");
        return null;
    }

    @Override
    public void onCreate() {
        Log.e("test", "LifeTestActivity onCreate:");
        super.onCreate();
    }

//    @Override
//    public void onStart(Intent intent, int startId) {
//        super.onStart(intent, startId);
//    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("test", "LifeTestActivity onStartCommand:");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("test", "LifeTestActivity onUnbind:");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.e("test", "LifeTestActivity onDestroy:");
        super.onDestroy();
    }

}