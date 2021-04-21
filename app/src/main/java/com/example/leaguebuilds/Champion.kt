package com.example.leaguebuilds

data class Champion(
    var champName : String,
    var champLore : String,
    var champIcon : String,
    var champPassive: List<String>,
    var champQ : List<String>,
    var champW : List<String>,
    var champE : List<String>,
    var champR : List<String>,
    var champRune: String,
    var champSkillPrio: String,
    var champItems: String

) {
}