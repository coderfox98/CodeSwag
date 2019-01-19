package com.rish.rishabhraj.codeswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.rish.rishabhraj.codeswag.Model.Product
import com.rish.rishabhraj.codeswag.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter(val context: Context,val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item,p0,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
        }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
            holder.bindProduct(products[position],context)
        }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView.findViewById<ImageView>(R.id.productImageView)
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product,context: Context) {
            val resourceId = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price
        }

    }

}