package com.example.helloworld

//数据类

data class Cellphone (val brand:String,val price:Double)

fun main(){
    val c1=Cellphone("Samsung",1299.99)
    val c2=Cellphone("Samsung",1299.99)
    println(c1)
    println("c1 equals c2 "+(c1==c2))
}