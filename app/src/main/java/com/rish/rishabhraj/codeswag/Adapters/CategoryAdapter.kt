package com.rish.rishabhraj.codeswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.rish.rishabhraj.codeswag.Model.Category
import com.rish.rishabhraj.codeswag.R


class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View
        val holder : ViewHolder

        if (convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder = ViewHolder()
             holder.categoryImage  = categoryView.findViewById(R.id.categoryImageView)
             holder.categoryTextView  = categoryView.findViewById(R.id.categoryTextView)

            categoryView.tag = holder
        }else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }


        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.imageString,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        println("Resource id $resourceId")

        holder.categoryTextView?.text = category.title
        return categoryView
    }


    private class ViewHolder {
        var categoryImage : ImageView? = null
        var categoryTextView : TextView? = null
    }
}