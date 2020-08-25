package com.kevin.pourcombien

import android.media.AudioAttributes
import android.media.AudioManager
import android.media.SoundPool
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.ResultsTextView)
        val resultsTextView1 = findViewById<TextView>(R.id.ResultsTextView1)
        val resultsTextView2 = findViewById<TextView>(R.id.ResultsTextView2)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val soundPool: SoundPool

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build()
            soundPool = SoundPool.Builder()
                .setMaxStreams(1)
                .setAudioAttributes(audioAttributes)
                .build()
        } else {
            soundPool = SoundPool(1, AudioManager.STREAM_MUSIC, 0)
        }

        val sound1  = soundPool.load(this, R.raw.talesboules, 1);
        val sound2  = soundPool.load(this, R.raw.bravooo, 1);
        val sound3  = soundPool.load(this, R.raw.tutefous, 1);
        val sound4  = soundPool.load(this, R.raw.ok, 1);
        val sound5  = soundPool.load(this, R.raw.cetaitsur, 1);
        val sound6  = soundPool.load(this, R.raw.cheh, 1);
        val sound7  = soundPool.load(this, R.raw.puteuh, 1);
        val sound8  = soundPool.load(this, R.raw.hellnaw, 1);
        val sound9  = soundPool.load(this, R.raw.ohmygawd, 1);
        val sound10  = soundPool.load(this, R.raw.sadtrombone, 1);
        val sound11  = soundPool.load(this, R.raw.sadviolin, 1);
        val sound12  = soundPool.load(this, R.raw.oof, 1);
        val sound13  = soundPool.load(this, R.raw.oooff, 1);
        val sound14  = soundPool.load(this, R.raw.wow, 1);
        val sound15  = soundPool.load(this, R.raw.surprise, 1);
        val sound16  = soundPool.load(this, R.raw.titanic, 1);



        rollButton.setOnClickListener{
            val rand = Random().nextInt(seekBar.progress) + 1
            resultsTextView1.text = ""
            resultsTextView2.text = ""

            resultsTextView.text = rand.toString()
        }

        rollButton2.setOnClickListener{
            val rand1 = Random().nextInt(seekBar.progress) + 1
            val rand2 = Random().nextInt(seekBar.progress) + 1

            resultsTextView.text = ""

            resultsTextView1.text = rand1.toString()
            resultsTextView2.text = rand2.toString()

            if(rand1 == rand2){
                val randMusic = Random().nextInt(16) + 1

                when(randMusic){
                    1 -> soundPool.play(sound1, 1F, 1F,0,0, 1F)
                    2 -> soundPool.play(sound2, 1F,1F,0,0,1F)
                    3 -> soundPool.play(sound3, 1F,1F,0,0,1F)
                    4 -> soundPool.play(sound4, 1F,1F,0,0,1F)
                    5 -> soundPool.play(sound5, 1F,1F,0,0,1F)
                    6 -> soundPool.play(sound6, 1F,1F,0,0,1F)
                    7 -> soundPool.play(sound7, 1F,1F,0,0,1F)
                    8 -> soundPool.play(sound8, 1F,1F,0,0,1F)
                    9 -> soundPool.play(sound9, 1F,1F,0,0,1F)
                    10 -> soundPool.play(sound10, 1F,1F,0,0,1F)
                    11 -> soundPool.play(sound11, 1F,1F,0,0,1F)
                    12 -> soundPool.play(sound12, 1F,1F,0,0,1F)
                    13 -> soundPool.play(sound13, 1F,1F,0,0,1F)
                    14 -> soundPool.play(sound14, 1F,1F,0,0,1F)
                    15 -> soundPool.play(sound15, 1F,1F,0,0,1f)
                    16 -> soundPool.play(sound16, 1F,1F,0,0,1f)

                }

            }


        }

    }
}