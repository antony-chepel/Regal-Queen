package com.zerofour.realqueenwhite


import android.view.View

import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso

import android.view.ViewGroup


import androidx.recyclerview.widget.RecyclerView

import android.view.LayoutInflater
import com.zerofour.databinding.QueenItemBinding


import java.lang.Exception
import java.util.*

class QueenAdapter(val hhdqwwdq :ArrayList<QueenData>) : RecyclerView.Adapter<QueenAdapter.ProfItemHolder>(),ItemTouchMoveCallBack.IteamTouchAdapter {
    class ProfItemHolder(val binding : QueenItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun setProfLaItem(odwoqdoqwd : QueenData) = with(binding){
            Picasso.get().load(odwoqdoqwd.img)
                .into(imQueen,object : Callback {
                    override fun onSuccess() {
                        progressBar.visibility = View.INVISIBLE
                    }

                    override fun onError(e: Exception?) {

                    }

                } )


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfItemHolder {
        val binding = QueenItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProfItemHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfItemHolder, position: Int) {
        holder.setProfLaItem(hhdqwwdq[position])

    }

    override fun getItemCount() = hhdqwwdq.size
    override fun onMove(firstPos: Int, targetPos: Int) {
        val targetItem = hhdqwwdq[targetPos]
        hhdqwwdq[targetPos] = hhdqwwdq[firstPos]
        hhdqwwdq[firstPos] = targetItem
        notifyItemMoved(firstPos,targetPos)

    }

    override fun onClear() {

    }


}