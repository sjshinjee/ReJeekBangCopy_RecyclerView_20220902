package com.example.rejeekbangcopy_recyclerview_20220902.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rejeekbangcopy_recyclerview_20220902.R
import com.example.rejeekbangcopy_recyclerview_20220902.datas.RoomData

class RoomRecyclerViewAdapter(
    val mContext: Context,
    val mList: List<RoomData>
) : RecyclerView.Adapter<RoomRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bind(item : RoomData){

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }


}