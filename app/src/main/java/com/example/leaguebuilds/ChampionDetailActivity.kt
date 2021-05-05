package com.example.leaguebuilds

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
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

    }
}