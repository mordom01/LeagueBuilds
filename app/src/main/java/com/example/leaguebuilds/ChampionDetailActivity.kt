package com.example.leaguebuilds

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.champion_detail_view.*


class ChampionDetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_CHAMPINFO = "champ"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.champion_detail_view)

        // Back button to go to MainActivity
        championDetail_button_back.setOnClickListener {
            startActivity(Intent(championDetail_button_back.context, MainActivity::class.java))
        }

        // champInfo has all the champion data that we hardcoded in MainActivity
        val champInfo = intent.getParcelableExtra<Champion>(EXTRA_CHAMPINFO)
        Log.d("Create", "onCreate: " + champInfo)

        // The code below this will input all the champion info into the layout
        val champImage = findViewById<ImageView>(R.id.championDetail_imageView_champImage)
        Picasso.get().load(champInfo.champIcon).into(champImage)
        val passiveImage = findViewById<ImageView>(R.id.championDetail_imageView_passive)
        Picasso.get().load(champInfo.champPassive[1]).into(passiveImage)
        val qImage = findViewById<ImageView>(R.id.championDetail_imageView_Q)
        Picasso.get().load(champInfo.champQ[1]).into(qImage)
        val wImage = findViewById<ImageView>(R.id.championDetail_imageView_W)
        Picasso.get().load(champInfo.champW[1]).into(wImage)
        val eImage = findViewById<ImageView>(R.id.championDetail_imageView_E)
        Picasso.get().load(champInfo.champE[1]).into(eImage)
        val rImage = findViewById<ImageView>(R.id.championDetail_imageView_R)
        Picasso.get().load(champInfo.champR[1]).into(rImage)

        championDetail_textView_champName.setText(champInfo.champName)
        championDetail_textView_description.setText(champInfo.champLore)
        championDetail_textView_passiveDesc.setText(champInfo.champPassive[0])
        championDetail_textView_QDesc.setText(champInfo.champQ[0])
        championDetail_textView_WDesc.setText(champInfo.champW[0])
        championDetail_textView_EDesc.setText(champInfo.champE[0])
        championDetail_textView_RDesc.setText(champInfo.champR[0])




        //Loads video to show each ability
        val passiveVideo = findViewById<View>(R.id.passiveVid) as VideoView
        passiveVideo.setVideoPath(champInfo.champPassive[2])

        val qVideo = findViewById<View>(R.id.qVid) as VideoView
        qVideo.setVideoPath(champInfo.champQ[2])

        val wVideo = findViewById<View>(R.id.wVid) as VideoView
        wVideo.setVideoPath(champInfo.champW[2])

        val eVideo = findViewById<View>(R.id.eVid) as VideoView
        eVideo.setVideoPath(champInfo.champE[2])

        val rVideo = findViewById<View>(R.id.rVid) as VideoView
        rVideo.setVideoPath(champInfo.champR[2])

        passiveVid.setOnClickListener{
            passiveVideo.start()
        }
        qVid.setOnClickListener{
            qVideo.start()
        }
        wVid.setOnClickListener{
            wVideo.start()
        }
        eVid.setOnClickListener{
            eVideo.start()
        }
        rVid.setOnClickListener{
            rVideo.start()
        }



    }
}