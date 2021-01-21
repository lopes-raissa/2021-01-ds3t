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
                "Mortal Kombat", context.getDrawable(R.drawable.mortal) !!,
            "Mortal Kombat é um jogo bem legal!",
                4.5,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                Console(2, "SNes", "Nintendo","1990-12-05")))
            )
            games.add(Game(
                2,
                "Mortal Kombat", context.getDrawable(R.drawable.mortal) !!,
                "Mortal Kombat é um jogo bem legal!",
                4.5,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                    Console(2, "SNes", "Nintendo","1990-12-05")))
            )
            games.add(Game(
                3,
                "Mortal Kombat", context.getDrawable(R.drawable.mortal) !!,
                "Mortal Kombat é um jogo bem legal!",
                4.5,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                    Console(2, "SNes", "Nintendo","1990-12-05")))
            )
            return games
        }
    }
}