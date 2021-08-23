package com.neppplus.jickbangcopy_20210820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210820.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail_main.*
import kotlinx.android.synthetic.main.room_list_item.*
import kotlinx.android.synthetic.main.room_list_item.priceTxt

class ViewRoomDetailMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail_main)

        val roomData = intent.getSerializableExtra("roomData") as RoomData

        priceTxt.text = roomData.getFormattedPrice()
        infoTxt.text = roomData.description
        addressTxt.text = roomData.address
        floorTxt.text = roomData.getFormattedFloor()
    }
}