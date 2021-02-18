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
                Console(1,"Playstation 1", "O PlayStation 1 ou ainda PSOne, foi o primeiro console de vídeo game fabricado pela Sony, lançado em 3 de dezembro de 1994", context.getDrawable(R.drawable.ps1) !! )
            )))
            games.add(Game(
                1,
                "Candy Crush Jelly", context.getDrawable(R.drawable.candycrush) !!,
                "Candy Crush Jelly é versão da franquia de jogos Candy Crush. Se diverta fazendo combinações de doces e desafiando a rainha.",
                3f,
                listOf(
                    Console(1,"Playstation 1", "O PlayStation 1 ou ainda PSOne, foi o primeiro console de vídeo game fabricado pela Sony, lançado em 3 de dezembro de 1994", context.getDrawable(R.drawable.ps1) !! )
                )))
            games.add(Game(
                1,
                "Candy Crush Jelly", context.getDrawable(R.drawable.candycrush) !!,
                "Candy Crush Jelly é versão da franquia de jogos Candy Crush. Se diverta fazendo combinações de doces e desafiando a rainha.",
                3f,
                listOf(
                    Console(1,"Playstation 1", "O PlayStation 1 ou ainda PSOne, foi o primeiro console de vídeo game fabricado pela Sony, lançado em 3 de dezembro de 1994", context.getDrawable(R.drawable.ps1) !! )
                )))
            return games
        }
    }
}