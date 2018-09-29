package marivic.conservado.com.conservadomariviclab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Activity 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "OnStart() has been executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE", "OnResume() has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE", "OnPause() has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE", "OnStop() has been executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "OnRestart() has been executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE", "OnDestroy() has been executed");
    }

    public void processact2(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.gotoact1){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.mapact2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.579045, 120.973173"));
            chooser = Intent.createChooser(i, "Choose Application For Maps");
            startActivity(chooser);
        }
    }
}
