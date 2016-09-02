package com.orange.matthieu.soudbox;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String TAG = MainActivity.class.getSimpleName();

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
    protected void onPause() {
        super.onPause();
        if(mMediaPlayer != null){
            if(mMediaPlayer.isPlaying()){
                mMediaPlayer.stop();
            }
        }

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
                break;
            case R.id.Malou:
                mMediaPlayer = MediaPlayer.create(this, R.raw.malou);
                mMediaPlayer.start();
                break;
            case R.id.Makelele:
                mMediaPlayer = MediaPlayer.create(this, R.raw.makelele);
                mMediaPlayer.start();
                break;
            case R.id.makeleleCourt:
                mMediaPlayer = MediaPlayer.create(this, R.raw.makelele_court);
                mMediaPlayer.start();
                break;
            case R.id.lambert:
                mMediaPlayer = MediaPlayer.create(this, R.raw.boitalambert);
                mMediaPlayer.start();
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
            case R.id.charlie:
                mMediaPlayer = MediaPlayer.create(this, R.raw.ohcharlie);
                mMediaPlayer.start();
                break;
            case R.id.memeDuPlastique:
                mMediaPlayer = MediaPlayer.create(this, R.raw.memeduplastique);
                mMediaPlayer.start();
                break;
            case R.id.alerteGogole:
                mMediaPlayer = MediaPlayer.create(this, R.raw.alerteaugogole);
                mMediaPlayer.start();
                break;
            case R.id.chaussures:
                mMediaPlayer = MediaPlayer.create(this, R.raw.chaussures);
                mMediaPlayer.start();
                break;
            case R.id.feller:
                mMediaPlayer = MediaPlayer.create(this, R.raw.feller);
                mMediaPlayer.start();
                break;
            case R.id.ohPutain:
                mMediaPlayer = MediaPlayer.create(this, R.raw.ohputain);
                mMediaPlayer.start();
                break;
            case R.id.belleSono:
                mMediaPlayer = MediaPlayer.create(this, R.raw.bellesono);
                mMediaPlayer.start();
                break;
            case R.id.puDeCarette:
                mMediaPlayer = MediaPlayer.create(this, R.raw.pu_de_carette);
                mMediaPlayer.start();
                break;
            case R.id.grossesBites:
                mMediaPlayer = MediaPlayer.create(this, R.raw.vos_grosses_bites);
                mMediaPlayer.start();
                break;
        }

    }

    private void initBtn() {

        Button btnOnSenBatLesCouillesCourt;
        Button btnMalou;
        Button btnMakelele;
        Button btnMakeleleCourt;
        Button btnlambert;
        Button btnOnSenBatLesCouillesLong;
        Button btnFilmLesPieds;
        Button btnPasltps;
        Button btnCharlie;
        Button btnPlastique;
        Button btnGogole;
        Button btnChaussures;
        Button btnOhPutain;
        Button btnFeller;
        Button btnGrossesBites;
        Button btnCarette;
        Button btnSono;

        btnOnSenBatLesCouillesCourt = (Button) findViewById(R.id.onSenBatLesCouillesCourt);
        btnMalou = (Button) findViewById(R.id.Malou);
        btnMakelele = (Button) findViewById(R.id.Makelele);
        btnMakeleleCourt = (Button) findViewById(R.id.makeleleCourt);
        btnlambert = (Button) findViewById(R.id.lambert);
        btnOnSenBatLesCouillesLong = (Button) findViewById(R.id.onSenBatLesCouillesLong);
        btnFilmLesPieds = (Button) findViewById(R.id.filmLesPieds);
        btnPasltps = (Button) findViewById(R.id.pasltps);
        btnCharlie = (Button) findViewById(R.id.charlie);
        btnPlastique = (Button) findViewById(R.id.memeDuPlastique);
        btnGogole = (Button) findViewById(R.id.alerteGogole);
        btnChaussures = (Button) findViewById(R.id.chaussures);
        btnOhPutain = (Button) findViewById(R.id.ohPutain);
        btnFeller = (Button) findViewById(R.id.feller);
        btnGrossesBites = (Button) findViewById(R.id.grossesBites);
        btnCarette = (Button) findViewById(R.id.puDeCarette);
        btnSono = (Button) findViewById(R.id.belleSono);


        btnOnSenBatLesCouillesCourt.setOnClickListener(this);
        btnMalou.setOnClickListener(this);
        btnMakelele.setOnClickListener(this);
        btnMakeleleCourt.setOnClickListener(this);
        btnlambert.setOnClickListener(this);
        btnOnSenBatLesCouillesLong.setOnClickListener(this);
        btnFilmLesPieds.setOnClickListener(this);
        btnPasltps.setOnClickListener(this);
        btnCharlie.setOnClickListener(this);
        btnPlastique.setOnClickListener(this);
        btnGogole.setOnClickListener(this);
        btnChaussures.setOnClickListener(this);
        btnOhPutain.setOnClickListener(this);
        btnFeller.setOnClickListener(this);
        btnCarette.setOnClickListener(this);
        btnSono.setOnClickListener(this);
        btnGrossesBites.setOnClickListener(this);
    }

}
