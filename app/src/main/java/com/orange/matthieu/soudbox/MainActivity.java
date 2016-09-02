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
        stopMusic();

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

        stopMusic();

        switch (view.getId()) {
            case R.id.stop:
                //inutile de mettre un stop, stopMusic() avant switch
                break;
            case R.id.onSenBatLesCouillesCourt:
                startMusic(R.raw.onsenbatcourt);
                break;
            case R.id.Malou:
                startMusic(R.raw.malou);
                break;
            case R.id.Makelele:
                startMusic(R.raw.makelele);
                break;
            case R.id.makeleleCourt:
                startMusic(R.raw.makelele_court);
                break;
            case R.id.lambert:
                startMusic(R.raw.boitalambert);
                break;
            case R.id.onSenBatLesCouillesLong:
                startMusic(R.raw.on_sen_bat_les_couilles);
                break;
            case R.id.filmLesPieds:
                startMusic(R.raw.filmpieds);
                break;
            case R.id.pasltps:
                startMusic(R.raw.pasltpsniaser);
                break;
            case R.id.charlie:
                startMusic(R.raw.ohcharlie);
                break;
            case R.id.memeDuPlastique:
                startMusic(R.raw.meme_du_plastique);
                break;
            case R.id.alerteGogole:
                startMusic(R.raw.alerteaugogole);
                break;
            case R.id.chaussures:
                startMusic(R.raw.chaussures);
                break;
            case R.id.feller:
                startMusic(R.raw.feller);
                break;
            case R.id.ohPutain:
                startMusic(R.raw.ohputain);
                break;
            case R.id.belleSono:
                startMusic(R.raw.bellesono);
                break;
            case R.id.puDeCarette:
                startMusic(R.raw.pu_de_carette);
                break;
            case R.id.grossesBites:
                startMusic(R.raw.vos_grosses_bites);
                break;
        }

    }

    private void startMusic(int music) {
        mMediaPlayer = MediaPlayer.create(this, music);
        mMediaPlayer.start();
    }

    private void stopMusic() {
        if (mMediaPlayer != null) {
            if (mMediaPlayer.isPlaying())
                mMediaPlayer.stop();
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
        Button btnStop;

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
        btnStop = (Button) findViewById(R.id.stop);


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
        btnStop.setOnClickListener(this);
    }

}
