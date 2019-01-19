package com.rish.rishabhraj.codeswag.Services

import com.rish.rishabhraj.codeswag.Model.Category
import com.rish.rishabhraj.codeswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
        Product("Devslops Graphic Beanie","18$","hat1"),
        Product("Devslops Hat Black","20$","hat2"),
        Product("Devslops Hat White","18$","hat3"),
        Product("Devslops Hat Snapback","22$","hat4"),
        Product("Devslops Graphic Beanie","18$","hat1"),
        Product("Devslops Hat Black","20$","hat2"),
        Product("Devslops Hat White","18$","hat3"),
        Product("Devslops Hat Snapback","22$","hat4")

    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","28$","hoodie1"),
        Product("Devslopes Hoodie Red","32$","hoodie2"),
        Product("Devslopes Gray Hoodie","16$","hoodie3"),
        Product("Devslopes Black Hoodie","22$","hoodie4"),
        Product("Devslopes Hoodie Gray","28$","hoodie1"),
        Product("Devslopes Hoodie Red","32$","hoodie2"),
        Product("Devslopes Gray Hoodie","16$","hoodie3"),
        Product("Devslopes Black Hoodie","22$","hoodie4")

    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","18$","shirt1"),
        Product("Devslopes Badge Light Red","32$","shirt2"),
        Product("Devslopes Logo Shirt Red","16$","shirt3"),
        Product("Devslopes Hustle","22$","shirt4"),
        Product("Kickflip Studio","18$","shirt5"),
        Product("Devslopes Shirt Black","18$","shirt1"),
        Product("Devslopes Badge Light Red","32$","shirt2"),
        Product("Devslopes Logo Shirt Red","16$","shirt3"),
        Product("Devslopes Hustle","22$","shirt4"),
        Product("Kickflip Studio","18$","shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}