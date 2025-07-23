package com.example.helloworld

//类与对象

//声明一个类 class
open  class Person(val name:String,val age:Int) {   //默认不可被继承 只有加了open才可以被继承
    fun eat(){
        println(name+" is eating. He is "+age+" years old.")
    }
}

//实例化.
fun main(){
    val p=Person("Jack",18)
    p.eat()
}
