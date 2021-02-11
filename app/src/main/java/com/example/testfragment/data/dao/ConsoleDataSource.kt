package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console

class ConsoleDataSource {

    companion object {
        fun getConsole(context: Context) : ArrayList<Console> {
            var console = ArrayList<Console>()


            console.add(
                Console(
                    1,
                    "Candy Crush Jelly", context.getDrawable(R.drawable.xbox) !!,
                    "Candy Crush Jelly é versão da franquia de jogos Candy Crush. Se diverta fazendo combinações de doces e desafiando a rainha."
            ))
            console.add(
                Console(
                    1,
                    "Candy Crush Jelly", context.getDrawable(R.drawable.xbox) !!,
                    "Candy Crush Jelly é versão da franquia de jogos Candy Crush. Se diverta fazendo combinações de doces e desafiando a rainha."
                ))
            console.add(
                    Console(
                        1,
                        "Candy Crush Jelly", context.getDrawable(R.drawable.xbox) !!,
                        "Candy Crush Jelly é versão da franquia de jogos Candy Crush. Se diverta fazendo combinações de doces e desafiando a rainha."
                    ))


            return console
        }
    }
}



