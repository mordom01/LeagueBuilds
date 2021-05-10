package com.example.leaguebuilds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object  {
        val EXTRA_CHAMPINFO = "champ"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val logoImg = findViewById<ImageView>(R.id.logo_imageView_main)
        Picasso.get().load("https://i.ibb.co/JF09WxR/Banner.png").into(logoImg)
        val topImg = findViewById<ImageView>(R.id.topLogo_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/e/ef/Top_icon.png/revision/latest?cb=20181117143602").into(topImg)
        val jungleImg = findViewById<ImageView>(R.id.jungleLogo_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/1/1b/Jungle_icon.png/revision/latest?cb=20181117143559").into(jungleImg)
        val midImg = findViewById<ImageView>(R.id.midLogo_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/9/98/Middle_icon.png/revision/latest?cb=20181117143644").into(midImg)
        val botImg = findViewById<ImageView>(R.id.botLogo_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/9/97/Bottom_icon.png/revision/latest?cb=20181117143632").into(botImg)
        val suppImg = findViewById<ImageView>(R.id.suppLogo_imageView_main)
        Picasso.get().load("https://emoji.gg/assets/emoji/Support.png").into(suppImg)
        val aatroxImg = findViewById<ImageView>(R.id.top1_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/1/15/Aatrox_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20180612203801").into(aatroxImg)
        val gnarImg = findViewById<ImageView>(R.id.top2_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/2/2d/Gnar_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20160526212623").into(gnarImg)
        val yiImg = findViewById<ImageView>(R.id.jungle1_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/7/73/Master_Yi_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402220630").into(yiImg)
        val rengarImg = findViewById<ImageView>(R.id.jungle2_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/b/b3/Rengar_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402220904").into(rengarImg)
        val zedImg = findViewById<ImageView>(R.id.mid1_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/4/46/Zed_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20160526214523").into(zedImg)
        val zoeImg = findViewById<ImageView>(R.id.mid2_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/2/2c/Zoe_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20171107215256").into(zoeImg)
        val ezrealImg = findViewById<ImageView>(R.id.bot1_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/5/54/Ezreal_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402220010").into(ezrealImg)
        val xayahImg = findViewById<ImageView>(R.id.bot2_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/4/4e/Xayah_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20170404193839").into(xayahImg)
        val blitzcrankImg = findViewById<ImageView>(R.id.supp1_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/a/ac/Blitzcrank_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402215457").into(blitzcrankImg)
        val sorakaImg = findViewById<ImageView>(R.id.supp2_imageView_main)
        Picasso.get().load("https://static.wikia.nocookie.net/leagueoflegends/images/6/65/Soraka_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402221143").into(sorakaImg)

        top1_imageView_main.setOnClickListener {
            val clickedChamp = Intent(top1_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Aatrox",
            "A fallen god-warrior who once threatened to destroy Runeterra, Aatrox and his kin were bound to ancient weapons and imprisoned for centuries.", "https://static.wikia.nocookie.net/leagueoflegends/images/1/15/Aatrox_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20180612203801",
                mutableListOf("Deathbringer Stance", "https://blitz-cdn.blitz.gg/blitz/lol/passive/Aatrox_Passive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/P.webm"),
                mutableListOf("The Darkin Blade", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AatroxQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/Q.webm"),
                mutableListOf("Infernal Chains", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AatroxW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/W.webm"),
                mutableListOf("Umbral Dash", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AatroxE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/E.webm"),
                mutableListOf("World Ender", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AatroxR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }
    }
}