package com.example.testfragment.holder


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import java.io.Console

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val textConsoleName= itemView.findViewById<TextView>(R.id.text_view_console_name)
    val textConsoleDescription= itemView.findViewById<TextView>(R.id.text_console_description)
    val imageConsole = itemView.findViewById<ImageView>(R.id.image_console)

    fun bind(console: Console) {
        textConsoleName.text = console.consoleName
        textConsoleDescription.text = console.consoleDescription
        imageConsole.setImageDrawable(console.imageConsole)

    }

}


