package com.example.matching_oranges.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.matching_oranges.databinding.ItemUserLayoutBinding
import com.example.matching_oranges.model.UserModel

class CardAdapter(val context: Context, val list : ArrayList<UserModel>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {
    inner class CardViewHolder(val binding: ItemUserLayoutBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(ItemUserLayoutBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.binding.textView4.text = list[position].name
        holder.binding.textView3.text = list[position].email

        Glide.with(context).load(list[position].image).into(holder.binding.userImage)

    }

    override fun getItemCount(): Int {
        return list.size
    }

}