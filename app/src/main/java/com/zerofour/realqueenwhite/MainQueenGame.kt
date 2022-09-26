package com.zerofour.realqueenwhite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.zerofour.databinding.ActivityMainQueenGameBinding

class MainQueenGame : AppCompatActivity() {
    private lateinit var binding: ActivityMainQueenGameBinding
    private var usudyqdyqw : QueenAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainQueenGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bReady.setOnClickListener{
            startActivity(Intent(this,ResQueenActivity::class.java))
        }
        bdjdjdsjdsd()
    }

    private fun bdjdjdsjdsd() = with(binding){
        usudyqdyqw = QueenAdapter(QueenImgUtils.listImgQueen)
        rcQueen.layoutManager = LinearLayoutManager(this@MainQueenGame,LinearLayoutManager.VERTICAL,false)
        rcQueen.adapter = usudyqdyqw
        val dragCallback = ItemTouchMoveCallBack(usudyqdyqw!!)
        val touchHelper = ItemTouchHelper(dragCallback)
        touchHelper.attachToRecyclerView(rcQueen)


    }
}