package com.example.helloworld

//单例类

object Singleton {
    fun singletonTest(){
        println("singletonTest is called.")
    }
}

fun main(){   //会自动创建一个实例
    Singleton.singletonTest()
}
