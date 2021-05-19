package com.example.leaguebuilds

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.champion_items.*

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class ChampionItemActivity : AppCompatActivity() {
    companion object {
        val EXTRA_CHAMPINFO3 = "champ"
    }

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.champion_items)

        val champInfo = intent.getParcelableExtra<Champion>(EXTRA_CHAMPINFO3)
        Log.d("Create3", "onCreate: $champInfo")

        // Back button to go back to ChampionDetailActivity
        championItems_button_back.setOnClickListener {
            val intentChampInfo = Intent(championItems_button_back.context, ChampionDetailActivity::class.java)
            intentChampInfo.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO2, champInfo)
            startActivity(intentChampInfo)
        }

        // Adds the images into imageViews
        val runes = findViewById<ImageView>(R.id.championItems_imageView_runes)
        Picasso.get().load(champInfo.champRune).into(runes)
        val skillPrio = findViewById<ImageView>(R.id.championItems_imageView_skills)
        Picasso.get().load(champInfo.champSkillPrio).into(skillPrio)
        val items = findViewById<ImageView>(R.id.championItems_imageView_items)
        Picasso.get().load(champInfo.champItems).into(items)
    }
}