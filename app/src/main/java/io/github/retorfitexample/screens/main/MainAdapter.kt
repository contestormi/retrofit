package io.github.retorfitexample.screens.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.retorfitexample.R
import io.github.retorfitexample.model.TodosModelItem
import kotlinx.android.synthetic.main.item_post_layout.view.*

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view)

    var listOfPosts = emptyList<TodosModelItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post_layout, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.itemView.todo_title.text = listOfPosts[position].title
        holder.itemView.todo_status.text = listOfPosts[position].completed.toString()
    }

    override fun getItemCount(): Int {
        return listOfPosts.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<TodosModelItem>) {
        listOfPosts = list
        notifyDataSetChanged()
    }
}