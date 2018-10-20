package ph.edu.encarnacion.raphael.encarnacionraphaellab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainNext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_next);

        Log.d("4ITI", "onStart() has executed on Activity 2");

        Button Act1Bn = (Button)findViewById(R.id.Act1Bn);

        Button Map2Bn = (Button)findViewById(R.id.Map2Bn);

        Act1Bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainNext.this, MainActivity.class));

            }
        });
        Map2Bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String geoURI= "geo:14.597234,120.995356";
                Uri geo = Uri.parse(geoURI);
                String title = getResources().getText(R.string.chooser_title).toString();
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geo);
                Intent chooserIntent = Intent.createChooser(mapIntent, title);

                startActivity(chooserIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITI", "onStart() has executed on Activity 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITI", "onResume() has executed on Activity 2");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("4ITI", "onPause() has executed on Activity 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITI","onStop() has executed on Activity 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITI", "onRestart() has execute on Activity 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("4ITI", "onDestroy() has executed on Activity 2");
    }
}
