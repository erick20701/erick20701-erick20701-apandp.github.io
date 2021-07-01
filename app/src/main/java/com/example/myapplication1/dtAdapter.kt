package com.example.myapplication1


import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso





class dtAdapter(): RecyclerView.Adapter<dtAdapter.DataViewHolder>(){
    private lateinit var listd : List<Daata>
    private lateinit var context: Context
    private lateinit var clickListner: OnItemClickListner
    constructor(context: Context, listd : List<Daata>,clickListner: OnItemClickListner) : this() {
        this.context = context
        this.clickListner = clickListner
        this.listd = listd
    }

    override fun getItemCount(): Int {
        return listd.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val itemView: View
        val context: Context = parent.getContext()
        val inflater = LayoutInflater.from(context)

        itemView = inflater.inflate(R.layout.itemfr, parent, false);
        return DataViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.dtName.text = listd[position].name
        holder.dtClass.text = listd[position].class_Sc
        holder.dtLike.text = listd[position].like
        holder.dtNote.text = listd[position].note_like
        Picasso.get().load(listd[position].drawableResource).into(holder.imgView)
        holder.initialize(listd.get(position), clickListner)
    }
    inner class DataViewHolder(itemView: View) : ViewHolder(itemView) {
        var imgView = itemView.findViewById<ImageView>(R.id.item_face)
        var dtName = itemView.findViewById<TextView>(R.id.text_name)
        var dtClass = itemView.findViewById<TextView>(R.id.text_class)
        var dtLike = itemView.findViewById<TextView>(R.id.text_like)
        var dtNote = itemView.findViewById<TextView>(R.id.text_note)
//        var dtinfom = itemView.findViewById<TextView>(R.id.text_note)
        fun initialize(item: Daata, action: OnItemClickListner) {
            dtName.setText(item.name)
            dtClass.setText(item.class_Sc)
            dtLike.setText(item.like)
            dtNote.setText(item.note_like)
            imgView.setImageResource(item.drawableResource)
            itemView.setOnClickListener {
            action.onItemClick(item, adapterPosition)
        }
    }
    init {
        itemView
    }
}
}
interface OnItemClickListner{
    fun onItemClick(item: Daata, position: Int)
}