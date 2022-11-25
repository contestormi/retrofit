package io.github.retorfitexample.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import io.github.retorfitexample.R
import kotlinx.android.synthetic.main.fragment_main.view.*


class MainFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val v = inflater.inflate(R.layout.fragment_main, container, false)
        recyclerView = v.rv_main
        adapter = MainAdapter()
        recyclerView.adapter = adapter
        viewModel.getPosts()
        viewModel.postsList.observe(viewLifecycleOwner) { list ->
            list.body()
                ?.let { adapter.setList(it) }
        }
        return v
    }
}