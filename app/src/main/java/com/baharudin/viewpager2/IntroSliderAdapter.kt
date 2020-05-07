package com.baharudin.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IntroSliderAdapter(private var introSlides : List<IntroSlider>) : RecyclerView.Adapter<IntroSliderAdapter.IntroSliderViewHolder>(){

    inner class IntroSliderViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private var tvSlogan = view.findViewById<TextView>(R.id.slogan1)
        private var tvDescription = view.findViewById<TextView>(R.id.description)
        private var ivIcon = view.findViewById<ImageView>(R.id.icon_slider)

        fun bind(introSlider : IntroSlider){
            tvSlogan.text = introSlider.Slogan
            tvDescription.text = introSlider.Descriptopn
            ivIcon.setImageResource(introSlider.Icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewHolder {
        return IntroSliderViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_slider,parent,false))
    }

    override fun getItemCount(): Int = introSlides.size

    override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
        holder.bind(introSlides[position])
        
    }
}