package com.rish.rishabhraj.codeswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.rish.rishabhraj.codeswag.Model.Category
import com.rish.rishabhraj.codeswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>, val itemClick:(Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.category_list_item,p0,false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    inner class Holder(itemView: View, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImageView)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryTextView)

        fun bindCategory(category: Category,context: Context){
            val resourceId = context.resources.getIdentifier(category.imageString,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}