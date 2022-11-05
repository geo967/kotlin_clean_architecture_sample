package com.example.cleanarchitecture.presentation.airwaysDetails.components


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanarchitecture.R
import com.example.cleanarchitecture.domain.model.Airways


class MainAdapter(l:List<Airways>):
    RecyclerView.Adapter<MainAdapter.MyHolder>() {

    private var list:List<Airways> = l

   /* fun updateList(list: List<Airways>) {
        this.list = list
        notifyDataSetChanged()
    }*/

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val firstId: TextView =itemView.findViewById(R.id.Id_id)
        val userId: TextView =itemView.findViewById(R.id.user_id_id)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_design,parent,false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.firstId.text=list[position].aId.toString()
        holder.userId.text=list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
