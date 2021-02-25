package com.example.interview_android.ui

import android.content.Context
import android.content.Intent
import android.graphics.Paint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.interview_android.R


class StoreAdapter(var context: Context, var data: List<StoreModel>) :
    RecyclerView.Adapter<StoreAdapter.ViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StoreAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_store, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: StoreAdapter.ViewHolder, position: Int) {


        try {


        } catch (e: Exception) {
            Log.d("myException", e.toString())
        }


    }


    override fun getItemCount(): Int {
        return data!!.size
    }


//    private fun CalculateSpecialPrice(
//        spPrice: Double,
//        normalPrice: Double,
//        holder: ViewHolder
//    ) {
//
//        if (spPrice > 0 && spPrice < normalPrice) {
//            holder.itemView.price.setText(TAKA_SYMBLE + spPrice.toInt().toString())
//            holder.itemView.oldPrice.setText(TAKA_SYMBLE + normalPrice.toString())
//            holder.itemView.oldPrice.setPaintFlags(holder.itemView.oldPrice.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
////            var percentage = 100 - (spPrice / normalPrice * 100)
//            var percentage = 100 - ( (spPrice / normalPrice) * 100)
//            holder.itemView.percentage.setText(percentage.toInt().toString() + "%")
//
//        } else {
//            holder.itemView.spacialPriceLayout.hide()
//            holder.itemView.price.setText(TAKA_SYMBLE + normalPrice.toString())
//        }
//
//
//    }


    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


}

