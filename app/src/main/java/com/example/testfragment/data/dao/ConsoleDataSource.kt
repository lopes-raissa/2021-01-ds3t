package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console

class ConsoleDataSource {

    companion object {
        fun getConsole(context: Context) : ArrayList<Console> {
            var console = ArrayList<Console>()


            console.add(Console(1, "X-Box One",
                "Xbox One é um console da Microsoft, lançado no dia 22 de novembro de 2013. O videogame tem duas versões alternativas: Xbox One S e Xbox One X",
                context.getDrawable(R.drawable.xbox)!!
                ))
            console.add(
                Console(
                    2,
                    "PlayStation 4",
                    "O PlayStation 4, ou PS4 é um video game da Sony lançado em 2013. O console tem três versões principais: fat, slim e Pro.",
                    context.getDrawable(R.drawable.ps4)!!
                ))
            console.add(
                    Console(
                        3,
                        "PlayStation 1",
                        "O PlayStation 1 ou ainda PSOne, foi o primeiro console de vídeo game fabricado pela Sony, lançado em 3 de dezembro de 1994 no Japão.",
                        context.getDrawable(R.drawable.ps1)!!
                    ))


            return console
        }
    }
}



