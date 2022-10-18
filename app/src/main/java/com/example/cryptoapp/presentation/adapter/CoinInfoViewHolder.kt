package com.example.cryptoapp.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_coin_info.view.*

class CoinInfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val ivLogoCoin = itemView.ivLogoCoin
    val tvSymbols = itemView.tvSymbols
    val tvPrice = itemView.tvPrice
    val tvLastUpdate = itemView.tvLastUpdate
}