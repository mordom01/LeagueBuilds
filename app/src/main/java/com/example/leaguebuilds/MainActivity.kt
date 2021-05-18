package com.example.leaguebuilds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
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
                "Once honored defenders of Shurima against the Void, Aatrox and his brethren would eventually become an even greater threat to Runeterra, and were defeated only by cunning mortal sorcery. But after centuries of imprisonment, Aatrox was the first to find freedom once more, corrupting and transforming those foolish enough to try and wield the magical weapon that contained his essence. Now, with stolen flesh, he walks Runeterra in a brutal approximation of his previous form, seeking an apocalyptic and long overdue vengeance.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/1/15/Aatrox_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20180612203801",
                mutableListOf("Deathbringer Stance", "https://blitz-cdn.blitz.gg/blitz/lol/passive/Aatrox_Passive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/P.webm"),
                        mutableListOf("The Darkin Blade", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AatroxQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/Q.webm"),
                        mutableListOf("Infernal Chains", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AatroxW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/W.webm"),
                        mutableListOf("Umbral Dash", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AatroxE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/E.webm"),
                        mutableListOf("World Ender", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AatroxR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Aatrox/R.webm"),
                    "Rune", "SkillPrio", "Items"))
                    top1_imageView_main.context.startActivity(clickedChamp)
        }

        top2_imageView_main.setOnClickListener {
            val clickedChamp = Intent(top2_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Gnar",
                "Gnar is a primeval yordle whose playful antics can erupt into a toddler's outrage in an instant, transforming him into a massive beast bent on destruction. Frozen in True Ice for millennia, the curious creature broke free and now hops about a changed world he sees as exotic and wondrous. Delighted by danger, Gnar flings whatever he can at his enemies, be it his bonetooth boomerang, or a nearby building.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/2/2d/Gnar_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20160526212623",
                mutableListOf("Rage Gene", "https://blitz-cdn.blitz.gg/blitz/lol/passive/Gnar_Passive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Gnar/P.webm"),
                mutableListOf("Boomerang Throw / Boulder Toss", "https://blitz-cdn.blitz.gg/blitz/lol/spell/GnarQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Gnar/Q.webm"),
                mutableListOf("Hyper / Wallop", "https://blitz-cdn.blitz.gg/blitz/lol/spell/GnarW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Gnar/W.webm"),
                mutableListOf("Hop / Crunch", "https://blitz-cdn.blitz.gg/blitz/lol/spell/GnarE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Gnar/E.webm"),
                mutableListOf("GNAR!", "https://blitz-cdn.blitz.gg/blitz/lol/spell/GnarR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Gnar/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }

        jungle1_imageView_main.setOnClickListener {
            val clickedChamp = Intent(jungle1_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Master Yi",
                "Master Yi has tempered his body and sharpened his mind, so that thought and action have become almost as one. Though he chooses to enter into violence only as a last resort, the grace and speed of his blade ensures resolution is always swift. As one of the last living practitioners of the Ionian art of Wuju, Yi has devoted his life to continuing the legacy of his people—scrutinizing potential new disciples with the Seven Lenses of Insight to identify the most worthy among them.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/7/73/Master_Yi_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402220630",
                mutableListOf("Double Strike", "https://blitz-cdn.blitz.gg/blitz/lol/passive/MasterYi_Passive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/MasterYi/P.webm"),
                mutableListOf("Alpha Strike", "https://blitz-cdn.blitz.gg/blitz/lol/spell/AlphaStrike.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/MasterYi/Q.webm"),
                mutableListOf("Meditate", "https://blitz-cdn.blitz.gg/blitz/lol/spell/Meditate.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/MasterYi/W.webm"),
                mutableListOf("Wuju Style", "https://blitz-cdn.blitz.gg/blitz/lol/spell/WujuStyle.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/MasterYi/E.webm"),
                mutableListOf("Highlander", "https://blitz-cdn.blitz.gg/blitz/lol/spell/Highlander.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/MasterYi/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }

        jungle2_imageView_main.setOnClickListener {
            val clickedChamp = Intent(jungle2_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Rengar",
                "Rengar is a ferocious vastayan trophy hunter who lives for the thrill of tracking down and killing dangerous creatures. He scours the world for the most fearsome beasts he can find, especially seeking any trace of Kha'Zix, the void creature who scratched out his eye. Rengar stalks his prey neither for food nor glory, but for the sheer beauty of the pursuit.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/b/b3/Rengar_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402220904",
                mutableListOf("Unseen Predator", "https://blitz-cdn.blitz.gg/blitz/lol/passive/Rengar_Passive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Rengar/P.webm"),
                mutableListOf("Savagery", "https://blitz-cdn.blitz.gg/blitz/lol/spell/RengarQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Rengar/Q.webm"),
                mutableListOf("Battle Roar", "https://blitz-cdn.blitz.gg/blitz/lol/spell/RengarW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Rengar/W.webm"),
                mutableListOf("Bola Strike", "https://blitz-cdn.blitz.gg/blitz/lol/spell/RengarE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Rengar/E.webm"),
                mutableListOf("Thrill of the Hunt", "https://blitz-cdn.blitz.gg/blitz/lol/spell/RengarR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Rengar/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }

        mid1_imageView_main.setOnClickListener {
            val clickedChamp = Intent(mid1_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Zed",
                "Utterly ruthless and without mercy, Zed is the leader of the Order of Shadow, an organization he created with the intent of militarizing Ionia's magical and martial traditions to drive out Noxian invaders. During the war, desperation led him to unlock the secret shadow form—a malevolent spirit magic as dangerous and corrupting as it is powerful. Zed has mastered all of these forbidden techniques to destroy anything he sees as a threat to his nation, or his new order.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/4/46/Zed_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20160526214523",
                mutableListOf("Contempt for the Weak", "https://blitz-cdn.blitz.gg/blitz/lol/passive/shadowninja_Passive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zed/P.webm"),
                mutableListOf("Razor Shuriken", "https://blitz-cdn.blitz.gg/blitz/lol/spell/ZedQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zed/Q.webm"),
                mutableListOf("Living Shadow", "https://blitz-cdn.blitz.gg/blitz/lol/spell/ZedW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zed/W.webm"),
                mutableListOf("Shadow Slash", "https://blitz-cdn.blitz.gg/blitz/lol/spell/ZedE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zed/E.webm"),
                mutableListOf("Death Mark", "https://blitz-cdn.blitz.gg/blitz/lol/spell/ZedR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zed/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }

        mid2_imageView_main.setOnClickListener {
            val clickedChamp = Intent(mid2_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Zoe",
                "As the embodiment of mischief, imagination, and change, Zoe acts as the cosmic messenger of Targon, heralding major events that reshape worlds. Her mere presence warps the arcane mathematics governing realities, sometimes causing cataclysms without conscious effort or malice. This perhaps explains the breezy nonchalance with which Zoe approaches her duties, giving her plenty of time to focus on playing games, tricking mortals, or otherwise amusing herself. An encounter with Zoe can be joyous and life affirming, but it is always more than it appears and often extremely dangerous.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/2/2c/Zoe_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20171107215256",
                mutableListOf("More Sparkles!", "https://blitz-cdn.blitz.gg/blitz/lol/passive/Zoe_Passive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zoe/P.webm"),
                mutableListOf("Paddle Star!", "https://blitz-cdn.blitz.gg/blitz/lol/spell/ZoeQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zoe/Q.webm"),
                mutableListOf("Spell Thief", "https://blitz-cdn.blitz.gg/blitz/lol/spell/ZoeW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zoe/W.webm"),
                mutableListOf("Sleepy Trouble Bubble", "https://blitz-cdn.blitz.gg/blitz/lol/spell/ZoeE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zoe/E.webm"),
                mutableListOf("Poral Jump", "https://blitz-cdn.blitz.gg/blitz/lol/spell/ZoeR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Zoe/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }

        bot1_imageView_main.setOnClickListener {
            val clickedChamp = Intent(bot1_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Ezreal",
                "A dashing adventurer, unknowingly gifted in the magical arts, Ezreal raids long-lost catacombs, tangles with ancient curses, and overcomes seemingly impossible odds with ease. His courage and bravado knowing no bounds, he prefers to improvise his way out of any situation, relying partially on his wits, but mostly on his mystical Shuriman gauntlet, which he uses to unleash devastating arcane blasts. One thing is for sure—whenever Ezreal is around, trouble isn't too far behind. Or ahead. Probably everywhere.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/5/54/Ezreal_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402220010",
                mutableListOf("Rising Spell Force", "https://blitz-cdn.blitz.gg/blitz/lol/passive/Ezreal_RisingSpellForce.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Ezreal/P.webm"),
                mutableListOf("Mystic Shot", "https://blitz-cdn.blitz.gg/blitz/lol/spell/EzrealQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Ezreal/Q.webm"),
                mutableListOf("Essence Flux", "https://blitz-cdn.blitz.gg/blitz/lol/spell/EzrealW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Ezreal/W.webm"),
                mutableListOf("Arcane Shift", "https://blitz-cdn.blitz.gg/blitz/lol/spell/EzrealE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Ezreal/E.webm"),
                mutableListOf("Trueshot Barrage", "https://blitz-cdn.blitz.gg/blitz/lol/spell/EzrealR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Ezreal/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }

        bot2_imageView_main.setOnClickListener {
            val clickedChamp = Intent(bot2_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Xayah",
                "Deadly and precise, Xayah is a vastayan revolutionary waging a personal war to save her people. She uses her speed, guile, and razor-sharp feather blades to cut down anyone who stands in her way. Xayah fights alongside her partner and lover, Rakan, to protect their dwindling tribe, and restore their race to her vision of its former glory.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/4/4e/Xayah_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20170404193839",
                mutableListOf("Clean Cuts", "https://blitz-cdn.blitz.gg/blitz/lol/passive/XayahPassive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Xayah/P.webm"),
                mutableListOf("Double Daggers", "https://blitz-cdn.blitz.gg/blitz/lol/spell/XayahQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Xayah/Q.webm"),
                mutableListOf("Deadly Plumage", "https://blitz-cdn.blitz.gg/blitz/lol/spell/XayahW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Xayah/W.webm"),
                mutableListOf("Bladecaller", "https://blitz-cdn.blitz.gg/blitz/lol/spell/XayahE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Xayah/E.webm"),
                mutableListOf("Featherstorm", "https://blitz-cdn.blitz.gg/blitz/lol/spell/XayahR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Xayah/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }

        supp1_imageView_main.setOnClickListener {
            val clickedChamp = Intent(supp1_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Blitzcrank",
                "Blitzcrank is an enormous, near-indestructible automaton from Zaun, originally built to dispose of hazardous waste. However, he found this primary purpose too restricting, and modified his own form to better serve the fragile people of the Sump. Blitzcrank selflessly uses his strength and durability to protect others, extending a helpful metal fist or burst of energy to subdue any troublemakers.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/a/ac/Blitzcrank_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402215457",
                mutableListOf("Mana Barrier", "https://blitz-cdn.blitz.gg/blitz/lol/passive/Blitzcrank_ManaBarrier.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Blitzcrank/P.webm"),
                mutableListOf("Rocket Grab", "https://blitz-cdn.blitz.gg/blitz/lol/spell/RocketGrab.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Blitzcrank/Q.webm"),
                mutableListOf("Overdrive", "https://blitz-cdn.blitz.gg/blitz/lol/spell/Overdrive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Blitzcrank/W.webm"),
                mutableListOf("Power Fist", "https://blitz-cdn.blitz.gg/blitz/lol/spell/PowerFist.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Blitzcrank/E.webm"),
                mutableListOf("Static Field", "https://blitz-cdn.blitz.gg/blitz/lol/spell/StaticField.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Blitzcrank/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }

        supp2_imageView_main.setOnClickListener {
            val clickedChamp = Intent(supp2_imageView_main.context, ChampionDetailActivity::class.java)
            clickedChamp.putExtra(ChampionDetailActivity.EXTRA_CHAMPINFO, Champion("Soraka",
                "A wanderer from the celestial dimensions beyond Mount Targon, Soraka gave up her immortality to protect the mortal races from their own more violent instincts. She endeavors to spread the virtues of compassion and mercy to everyone she meets—even healing those who would wish harm upon her. And, for all Soraka has seen of this world's struggles, she still believes the people of Runeterra have yet to reach their full potential.",
                "https://static.wikia.nocookie.net/leagueoflegends/images/6/65/Soraka_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402221143",
                mutableListOf("Salvation", "https://blitz-cdn.blitz.gg/blitz/lol/passive/SorakaPassive.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Soraka/P.webm"),
                mutableListOf("Starcall", "https://blitz-cdn.blitz.gg/blitz/lol/spell/SorakaQ.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Soraka/Q.webm"),
                mutableListOf("Astral Infusion", "https://blitz-cdn.blitz.gg/blitz/lol/spell/SorakaW.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Soraka/W.webm"),
                mutableListOf("Equinox", "https://blitz-cdn.blitz.gg/blitz/lol/spell/SorakaE.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Soraka/E.webm"),
                mutableListOf("Wish", "https://blitz-cdn.blitz.gg/blitz/lol/spell/SorakaR.webp", "https://blitz-cdn-videos.blitz.gg/tooltip_videos/Soraka/R.webm"),
                "Rune", "SkillPrio", "Items"))
            top1_imageView_main.context.startActivity(clickedChamp)
        }
    }
}