package com.example.helloworld

import androidx.compose.ui.text.toUpperCase
import java.lang.invoke.LambdaConversionException

//Lambda编程入门

//集合的创建与遍历

//list
val list= listOf("Apple","Banana","Pear")  //不可变集合  初始化集合

val list1= mutableListOf("Apple","Banana","Pear")  //可变集合

//set 用法与list相同 注意：set里不可放重复元素

//map
val map =HashMap<String,Int>()

fun main(){

    for (fruit in list){   //可遍历集合
        println(fruit)
    }
    list1.add("Orange")
    for (fruit in list1){
        println(fruit)
    }

    map["Apple"]=1   //类似于数组下标
    map["Banana"]=2
    map["Orange"]=3

    val map =mapOf("Apple" to 1,"Banana" to 2,"Pear" to 3)
    for((fruit,number) in map ){
        println("fruit is "+fruit+",number is "+number)
    }

    //Lambda  一小段代码
    //语法结构
    //{参数名1：参数类型，参数名2：参数类型->函数体}

    //找出水果名最长的水果
    val maxLengthFruit = list.maxBy { it.length }    //maxBy()用于根据规则找出值
    println("max length fruit is "+maxLengthFruit)

    val lambda={fruit:String->fruit.length}       //由繁入简
    val maxLengthFruit1=list.maxBy(lambda)

    val maxLengthFruit2=list.maxBy({fruit:String->fruit.length})

    val maxLengthFruit3=list.maxBy(){fruit:String->fruit.length}

    val maxLengthFruit4=list.maxBy{fruit:String->fruit.length}

    val maxLengthFruit5=list.maxBy{fruit->fruit.length}

    val maxLengthFruit6 = list.maxBy { it.length }

    //将水果大写
    val newList = list.map{it.toUpperCase()}  //map用于根据规则映射
    for(fruit in newList){
        println(fruit)
    }

    //过滤出水果名小于5且大写
    val newList1 = list.filter { it.length<=5 }.map{it.toUpperCase()}  //可以结合使用  filter用于根据规则映射
    for(fruit in newList1){
        println(fruit)
    }

    val anyResult =list.any{it.length<=5}
    val allResult =list.all{it.length<=5}
    println("anyResult is "+anyResult+" allResult is "+allResult)

}

//集合的函数式API   lambda 就是放在这些函数里当作一个规则使用 后面遇到复杂的再另作分析
//maxBy() map() filter() any() all()

//java函数式API的使用  其实就是一个简化的作用

//public interface Runnable{
//    void run();
//}
//new Thread(new Runnable(){
//    @Override
//    public void run(){
//        System.out.println("Thread is running");
//    }
//}).start();

//简化后
//Thread{
//    println("Thread is running")
//}.start()

//public interface OnClickListener{
//    void onClick(View v);
//}

//button.setOnClickListener(new View.OnClickListener(){
//    @Override
//    public void onClick(View v){}
//});

//简化后
//button.setOnClickListener{}















