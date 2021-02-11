package com.example.testfragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.adapter.ConsoleAdapter
import com.example.testfragment.data.dao.ConsoleDataSource
import com.example.testfragment.model.Console


class ConsoleFragment : Fragment() {

    private lateinit var recyclerConsole: RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.holder_console_layout, container, false)

    //Instanciar a RecyclerView
    recyclerConsole= view.findViewById(R.id.recycler_view_consoles)

    //Determinar a orientação da RecyclerView
    recyclerConsole.layoutManager = LinearLayoutManager(view.context)

    //Informar para a recyclerview qual é o adaptor que ela vai usar
    recyclerConsole.adapter = consoleAdapter

    //Dizer ao adapter qual a fonte de dados
    consoleList = ConsoleDataSource.getConsole(view.context)


    return view

}

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_game, menu)
    }

}