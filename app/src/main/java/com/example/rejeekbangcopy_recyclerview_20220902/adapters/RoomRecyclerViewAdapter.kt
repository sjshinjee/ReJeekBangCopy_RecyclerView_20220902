package com.example.rejeekbangcopy_recyclerview_20220902.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RoomRecyclerViewAdapter(
    val mContext: Context,
    val mList: List<RoomD>
) : RecyclerView.Adapter<RoomRecyclerViewAdapter.MyViewHolder> {

    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from()
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}