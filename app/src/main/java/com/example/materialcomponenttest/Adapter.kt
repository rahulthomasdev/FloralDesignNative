package com.example.materialcomponenttest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.imageview.ShapeableImageView


class Adapter(private val card_List: List<DataModel>): RecyclerView.Adapter<Adapter.CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.CardViewHolder, position: Int) {
        val cardItem = card_List[position]
        holder.bind(cardItem)
    }

    override fun getItemCount(): Int {
        return card_List.size
    }
 inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
     private val cardImage: ShapeableImageView = itemView.findViewById(R.id.card_image)
     private val cardTitle: TextView = itemView.findViewById(R.id.card_text)
     private val cardTag: TextView = itemView.findViewById(R.id.card_text2)
     fun bind(cardItem:DataModel) {
         Glide.with(itemView)
             .load(cardItem.image)
             .diskCacheStrategy(DiskCacheStrategy.ALL)
             .apply(RequestOptions().centerCrop())
             .into(cardImage)
     }
 }

}