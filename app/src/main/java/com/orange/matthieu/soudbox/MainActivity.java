package com.orange.matthieu.soudbox;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String TAG = MainActivity.class.getSimpleName();

    private Handler mHandler = new Handler();

    private MediaPlayer mMediaPlayer;
    private Button btnStop;
    private ProgressBar progressBar;

    private LinearLayout linearLayout;

    private Button btnOnSenBatLesCouillesCourt;
    private Button btnMalou;
    private Button btnMakelele;
    private Button btnMakeleleCourt;
    private Button btnlambert;
    private Button btnOnSenBatLesCouillesLong;
    private Button btnFilmLesPieds;
    private Button btnPasltps;
    private Button btnCharlie;
    private Button btnPlastique;
    private Button btnGogole;
    private Button btnChaussures;
    private Button btnOhPutain;
    private Button btnFeller;
    private Button btnGrossesBites;
    private Button btnCarette;
    private Button btnSono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initBtn();
        initProgressBar();
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
                startMusic(R.raw.onsenbatcourt, btnOnSenBatLesCouillesCourt);
                break;
            case R.id.Malou:
                startMusic(R.raw.malou, btnMalou);
                break;
            case R.id.Makelele:
                startMusic(R.raw.makelele, btnMakelele);
                break;
            case R.id.makeleleCourt:
                startMusic(R.raw.makelele_court, btnMakeleleCourt);
                break;
            case R.id.lambert:
                startMusic(R.raw.boitalambert, btnlambert);
                break;
            case R.id.onSenBatLesCouillesLong:
                startMusic(R.raw.on_sen_bat_les_couilles, btnOnSenBatLesCouillesLong);
                break;
            case R.id.filmLesPieds:
                startMusic(R.raw.filmpieds, btnFilmLesPieds);
                break;
            case R.id.pasltps:
                startMusic(R.raw.pasltpsniaser, btnPasltps);
                break;
            case R.id.charlie:
                startMusic(R.raw.ohcharlie, btnCharlie);
                break;
            case R.id.memeDuPlastique:
                startMusic(R.raw.meme_du_plastique, btnPlastique);
                break;
            case R.id.alerteGogole:
                startMusic(R.raw.alerteaugogole, btnGogole);
                break;
            case R.id.chaussures:
                startMusic(R.raw.chaussures, btnChaussures);
                break;
            case R.id.feller:
                startMusic(R.raw.feller, btnFeller);
                break;
            case R.id.ohPutain:
                startMusic(R.raw.ohputain, btnOhPutain);
                break;
            case R.id.belleSono:
                startMusic(R.raw.bellesono, btnSono);
                break;
            case R.id.puDeCarette:
                startMusic(R.raw.pu_de_carette, btnCarette);
                break;
            case R.id.grossesBites:
                startMusic(R.raw.vos_grosses_bites, btnGrossesBites);
                break;
        }
    }

    private void initProgressBar() {
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
    }

    private void startMusic(int music, Button btn) {
        mMediaPlayer = MediaPlayer.create(this, music);

        final FrameLayout frameLayout = (FrameLayout) btn.getParent();
        progressBar.setMax(mMediaPlayer.getDuration() / 100);
        progressBar.setScaleY(btn.getHeight() / 2);
        progressBar.setAlpha(0.3F);
        frameLayout.addView(progressBar);

        mMediaPlayer.start();

        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mMediaPlayer != null) {
                    int progress = mMediaPlayer.getCurrentPosition() / 100;
                    progressBar.setProgress(progress);
                }
                mHandler.postDelayed(this, 100); // actualisation 10 fois par seconde
            }
        });

        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopMusic();
                progressBar.setProgress(0);
            }
        });

        mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                return false;
            }
        });
    }

    private void stopMusic() {
        if (mMediaPlayer != null) {
            if (mMediaPlayer.isPlaying()) {
                mMediaPlayer.stop();
            }

            FrameLayout frameLayout = (FrameLayout) progressBar.getParent();
            if (frameLayout != null) {
                frameLayout.removeView(progressBar);
            }
        }
    }

    private void initBtn() {

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
