package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game

class GameDataSource {

    companion object {
        fun getGames(context: Context) : ArrayList<Game> {
            var games = ArrayList<Game>()


            games.add(Game(
                1,
                "Candy Crush Jelly", context.getDrawable(R.drawable.candycrush) !!,
            "Candy Crush Jelly é versão da franquia de jogos Candy Crush. Se diverta fazendo combinações de doces e desafiando a rainha.",
                3f,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                Console(2, "SNes", "Nintendo","1990-12-05")))
            )
            games.add(Game(
                2,
                "Mortal Kombat", context.getDrawable(R.drawable.mortalkombat) !!,
                "Mortal Kombat é uma série de jogos criados pelo estúdio de Chicago da Midway Games.",
                1f,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                    Console(2, "SNes", "Nintendo","1990-12-05")))
            )
            games.add(Game(
                3,
                "Overcooked", context.getDrawable(R.drawable.overcooked) !!,
                "Overcooked é um jogo eletrônico de simulação sobre cozinhar que foi desenvolvido pela Ghost Town Games e publicado pela Team17",
                4.5f,
                listOf(
                    Console(1,"PS4", "Sony", "1996-12-01"),
                    Console(2,"Xbox One", "Microsoft", "1996-12-01"),
                    Console(3, "Switch", "Nintendo","1990-12-05")))
            )
            games.add(Game(
                4,
                "Call Of Duty", context.getDrawable(R.drawable.cod) !!,
                "Call of Duty é uma série de jogos eletrônicos de guerra, ação e tiro em primeira pessoa publicado pela Activision e desenvolvida pela Infinity Ward.",
                5f,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                    Console(2, "SNes", "Nintendo","1990-12-05")))
            )
            return games
        }
    }
}