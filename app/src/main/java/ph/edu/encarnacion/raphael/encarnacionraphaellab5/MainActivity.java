package ph.edu.encarnacion.raphael.encarnacionraphaellab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("4ITI", "onStart() has executed on Activity 1 ");
        Button Act2Bn = (Button)findViewById(R.id.Act2Bn);

        Button Map1Bn = (Button)findViewById(R.id.Map1Bn);


        Act2Bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MainNext.class));

            }


        });
        Map1Bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String geoURI= "geo:14.598806,120.983776";
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
        Log.d("4ITI", "onStart() has executed  on Activity 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITI", "onResume() has executed on Activity 1");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("4ITI", "onPause() has executed on Activity 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITI","onStop() has executed on Activity 1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITI", "onRestart() has executed on Activity 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("4ITI", "onDestroy() has executed on Activity 1");
    }


}
