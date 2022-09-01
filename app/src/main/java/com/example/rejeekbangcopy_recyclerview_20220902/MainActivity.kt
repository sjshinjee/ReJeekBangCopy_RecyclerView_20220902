package com.example.rejeekbangcopy_recyclerview_20220902

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rejeekbangcopy_recyclerview_20220902.adapters.RoomRecyclerViewAdapter
import com.example.rejeekbangcopy_recyclerview_20220902.databinding.ActivityMainBinding
import com.example.rejeekbangcopy_recyclerview_20220902.datas.RoomData

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter : RoomRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mRoomList.add( RoomData(8000, "마포구 서교동", 1, "망원/홍대역 풀옵션 넓은 원룸") )
        mRoomList.add( RoomData(28000, "마포구 서교동", 5, "홍대입구역 풀옵션 투룸") )
        mRoomList.add( RoomData(12000, "마포구 서교동", 2, "망원/홍대역 인근 신축 원룸 전세") )
        mRoomList.add( RoomData(12000, "마포구 망원동", 3, "홍대역 풀옵션 넓은 원룸") )
        mRoomList.add( RoomData(15000, "마포구 망원동", 5, "테라스가 넓은 풀옵션 넓은 원룸") )
        mRoomList.add( RoomData(13000, "마포구 망원동", 3, "넓고 반듯한 신축 원룸") )
        mRoomList.add( RoomData(9000, "마포구 연남동", 2, "홍대역 풀옵션 넓은 원룸") )
        mRoomList.add( RoomData(7500, "마포구 연남동", -2, "연남동 연습 가능 연습실") )
        mRoomList.add( RoomData(26000, "마포구 연남동", 3, "강추!! 홍대역 테라스 넓은 원룸") )
        mRoomList.add( RoomData(5500, "마포구 연남동", 0, "홍대역 풀옵션 원룸") )

        mRoomAdapter = RoomRecyclerViewAdapter(this, mRoomList)
        binding.roomRecyclerView.adapter = mRoomAdapter
        binding.roomRecyclerView.layoutManager = LinearLayoutManager(this)

    }
}