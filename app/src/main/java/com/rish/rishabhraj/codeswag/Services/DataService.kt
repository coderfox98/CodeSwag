package com.rish.rishabhraj.codeswag.Services

import com.rish.rishabhraj.codeswag.Model.Category
import com.rish.rishabhraj.codeswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtImage"),
        Category("HOODIES","hoodieImage"),
        Category("HATS","hatImage"),
        Category("DIGITAL","digitalgoodsImage")
    )
    val hats = listOf(
        Product("Devslops Graphic Beanie","18$","hat01"),
        Product("Devslops Hat Black","20$","hat02"),
        Product("Devslops Hat White","18$","hat03"),
        Product("Devslops Hat Snapback","22$","hat04")

    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","28$","hoodie01"),
        Product("Devslopes Hoodie Red","32$","hoodie02"),
        Product("Devslopes Gray Hoodie","16$","hoodie03"),
        Product("Devslopes Black Hoodie","22$","hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","18$","shirt01"),
        Product("Devslopes Badge Light Red","32$","shirt02"),
        Product("Devslopes Logo Shirt Red","16$","shirt03"),
        Product("Devslopes Hustle","22$","shirt04"),
        Product("Kickflip Studio","18$","shirt05")
    )
}