package com.neppplus.jickbangcopy_20210820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210820.datas.RoomData

class ViewRoomDetailMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail_main)

        val roomData = intent.getSerializableExtra("roomData") as RoomData

    }
}