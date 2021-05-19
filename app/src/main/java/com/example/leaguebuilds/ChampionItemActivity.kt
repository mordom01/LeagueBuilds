package com.example.leaguebuilds

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.champion_detail_view.*
import kotlinx.android.synthetic.main.champion_items.*

class ChampionItemActivity : AppCompatActivity() {
    companion object {
        val EXTRA_CHAMPINFO = "champ"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.champion_items)

        val champInfo = intent.getParcelableExtra<Champion>(ChampionDetailActivity.EXTRA_CHAMPINFO)
        Log.d("Create2", "onCreate: $champInfo")

        championItems_button_back.setOnClickListener {
            val intentChampInfo = Intent(championItems_button_back.context, ChampionDetailActivity::class.java)
            intentChampInfo.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, champInfo)
            startActivity(intentChampInfo)
        }


    }
}