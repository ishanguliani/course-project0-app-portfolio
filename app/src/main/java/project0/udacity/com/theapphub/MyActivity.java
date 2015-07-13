package project0.udacity.com.theapphub;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

//        initialize the button objects
        Button btnSpotifyStreamer = (Button)findViewById(R.id.btn_spotify_streamer) ;
        Button btnScoresApp = (Button)findViewById(R.id.btn_scores_app) ;
        Button btnLibraryApp = (Button)findViewById(R.id.btn_library_app) ;
        Button btnBuilItBigger = (Button)findViewById(R.id.btn_build_it_bigger) ;
        Button btnBaconReader = (Button)findViewById(R.id.btn_bacon_reader) ;
        Button btnCapstone = (Button)findViewById(R.id.btn_capstone) ;


//        attach click listener to Spotify Streamer Button
        btnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This will open the Spotify Streamer App");
            }
        });

//        attach click listener to Scores App Button
        btnScoresApp.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                showToast("This will open the Scores App");
            }
        });

//        attach click listener to Library App Button
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This will open the Library App");
            }
        });

//        attach click listener to Build It Bigger Button
        btnBuilItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This will open the Build It Bigger App");
            }
        });

//        attach click listener to Bacon Reader Button
        btnBaconReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This will open the Bacon Reader App");
            }
        });

//        attach click listener to Capstone Button
       btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This will open the Capstone Project");
            }
        });
    }


    //show toast on the screen in the center vertical left position
    private void showToast(CharSequence message)  {

        Toast toast = new Toast(getApplicationContext());
        LayoutInflater layoutInflater = getLayoutInflater() ;
        View layout = layoutInflater.inflate(R.layout.toast_custom_layout,
                (ViewGroup)findViewById(R.id.toast_layout_root)) ;

        TextView textview = (TextView)layout.findViewById(R.id.text) ;
        textview.setText(message) ;

        toast.setGravity(Gravity.CENTER_VERTICAL, 0,0 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
