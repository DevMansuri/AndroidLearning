package com.example.contact

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewConfiguration
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class CustomAdapter(private val mList: List<ItemsViewModel>,val context: Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        holder.imageView.setImageResource(ItemsViewModel.image)

        holder.textView.text = ItemsViewModel.text

        holder.itemView.setOnClickListener {
            val ItemsViewModel = mList.get(position)
            var textView: String = ItemsViewModel.text
            val intent = Intent(context,Detail::class.java)
            intent.putExtra("ititle",textView)
            context.startActivity(intent)



        }


    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(  itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageview)

        val textView: TextView = itemView.findViewById(R.id.textView)

    }
}

