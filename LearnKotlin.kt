package com.example.helloworld

import kotlin.math.max


//fun main(){
//    println("Hello Kotlin!")
//}

//Kotlin 每行代码结尾是不用加分号的

//fun main(){
//    val a = 10   //自动推导
//    println("a = "+a)
//}

//fun main(){    //优先使用 val
//    //val a:Int = 10  不可变变量
//    var a:Int = 10    //可变变量 注意数据类型首字母大写
//    a=a*10
//    println("a = "+a)
//}

//fun methodName(param1:Int,param2:Int):Int{  函数定义
//    return 0;
//}

//善于使用自动补全代码 因为会自动导包

//fun largerNumber(num1:Int,num2:Int):Int{
//    return max(num1,num2)
//}

//fun largerNumber1(num1: Int,num2: Int)=max(num1,num2)  //语法糖 可以简化这种一行的代码

//fun main(){
//    val a=79
//    val b=20
//    val c= largerNumber(a,b)
//    println("larger number is "+c)
//}

//程序的逻辑控制
//if条件语句（与其他语言用法并无太大区别）
//区别在于它是可以有返回值的
//fun largerNumber(num1:Int,num2:Int):Int{
//    val value=if(num1>num2){
//        num1
//    }else{
//        num2
//    }
//    return value
//}
//
//可以究极简化为
//fun largerNumber(num1: Int,num2: Int)=if(num1>num2) num1 else num2

//when条件语句  匹配值->{执行逻辑}
//fun getScore(name:String)=when(name){
//    "Tom"->86
//    "Park"->99
//    "jack"->66
//    else->0
//}

//fun checkNumber(num:Number){
//    when(num){
//        is Int-> println("number is Int")
//        is Double-> println("number is Double")
//        else-> println("number not support")
//    }
//}
//fun main(){
//    val num=10
//    checkNumber(num)
//}

// when语句也可以不传参而是将判断的表达式完整的写在when的结构体里
//这样写虽然有些冗余但是有些时候必须这样写才能实现要求
//fun getScore(name:String)=when{
//    name.startsWith("Tom")->86
//    name=="Jim"->89
//    name=="Jack"->99
//    else->0
//}

//循环语句
//while循环与其他语言的while用法没有任何区别
//for循环  区别较大 for-in
fun main(){
    for(i in 0..10){  //左闭右闭
        println(i)
    }
    for(i in 0 until 10){ //左闭右开
        println(i)
    }
    for(i in 0 until 10 step 2){  //递增2
        println(i)
    }
    for(i in 10 downTo 1) {
        println(i)
    }
}               //for循环还有别的用法 后面补充