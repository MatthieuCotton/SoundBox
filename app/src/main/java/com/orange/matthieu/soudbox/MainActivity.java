package com.orange.matthieu.soudbox;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String TAG = MainActivity.class.getSimpleName();

    private Button mBtnOnSenBatLesCouillesCourt;
    private Button mBtnMalou;
    private Button mBtnMakelele;
    private Button mBtnlambert;
    private Button mBtnOnSenBatLesCouillesLong;
    private Button mBtnFilmLesPieds;
    private Button mBtnPasltps;
    private Button mButton8;

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initBtn();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if (mMediaPlayer != null) {
            if (mMediaPlayer.isPlaying())
                mMediaPlayer.stop();
        }

        switch (view.getId()) {
            case R.id.onSenBatLesCouillesCourt:
                mMediaPlayer = MediaPlayer.create(this, R.raw.onsenbatcourt);
                mMediaPlayer.start();
                Log.d(TAG, "onClick: button1");
                break;
            case R.id.Malou:
                mMediaPlayer = MediaPlayer.create(this, R.raw.malou);
                mMediaPlayer.start();
                Log.d(TAG, "onClick: button2");
                break;
            case R.id.Makelele:
                mMediaPlayer = MediaPlayer.create(this, R.raw.makelele);
                mMediaPlayer.start();
                Log.d(TAG, "onClick: button3");
                break;
            case R.id.lambert:
                mMediaPlayer = MediaPlayer.create(this, R.raw.boitalambert);
                mMediaPlayer.start();
                Log.d(TAG, "onClick: button4");
                break;
            case R.id.onSenBatLesCouillesLong:
                mMediaPlayer = MediaPlayer.create(this, R.raw.on_sen_bat_les_couilles);
                mMediaPlayer.start();
                break;
            case R.id.filmLesPieds:
                mMediaPlayer = MediaPlayer.create(this, R.raw.filmpieds);
                mMediaPlayer.start();
                break;
            case R.id.pasltps:
                mMediaPlayer = MediaPlayer.create(this, R.raw.pasltpsniaser);
                mMediaPlayer.start();
                break;

        }

    }

    private void initBtn() {
        mBtnOnSenBatLesCouillesCourt = (Button) findViewById(R.id.onSenBatLesCouillesCourt);
        mBtnMalou = (Button) findViewById(R.id.Malou);
        mBtnMakelele = (Button) findViewById(R.id.Makelele);
        mBtnlambert = (Button) findViewById(R.id.lambert);
        mBtnOnSenBatLesCouillesLong = (Button) findViewById(R.id.onSenBatLesCouillesLong);
        mBtnFilmLesPieds = (Button) findViewById(R.id.filmLesPieds);
        mBtnPasltps = (Button) findViewById(R.id.pasltps);


        mBtnOnSenBatLesCouillesCourt.setOnClickListener(this);
        mBtnMalou.setOnClickListener(this);
        mBtnMakelele.setOnClickListener(this);
        mBtnlambert.setOnClickListener(this);
        mBtnOnSenBatLesCouillesLong.setOnClickListener(this);
        mBtnFilmLesPieds.setOnClickListener(this);
        mBtnPasltps.setOnClickListener(this);
    }

}
