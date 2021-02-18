package com.example.testfragment.holder



import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.model.Console


class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val consoleName= itemView.findViewById<TextView>(R.id.text_view_console_name)
    val consoleDescription= itemView.findViewById<TextView>(R.id.text_console_description)
    val imageConsole = itemView.findViewById<ImageView>(R.id.image_console)

    fun bind(console: Console) {
        consoleName.text = console.consoleName
        consoleDescription.text = console.consoleDescription
        imageConsole.setImageDrawable(console.imageConsole)


    }

}






