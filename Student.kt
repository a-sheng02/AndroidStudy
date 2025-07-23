package com.example.helloworld

//继承与构造函数

//class Student (val sno:String,val grade:Int):Person(){
//    init {   //可以在其中编写一些逻辑
//        println("sno is "+sno)
//        println("grade is "+grade)
//    }
//}

//class Student (val sno:String,val grade:Int,name:String,age:Int):Person(name,age){
//}


//fun main(){
//    val s=Student("Jack",10,"Jim",19)
//}

//次构造函数   constructor  目前只知道可以使得Student类可以以三种形式实例化
//class Student (val sno:String,val grade:Int,name:String,age:Int):Person(name,age){
//    constructor(name:String,age: Int):this("",0,name,age){}
//    constructor():this("",0){}
//}

//val student1=Student()
//val student2= Student("Jack",19)
//val student3=Student("a123",5,"Jack",19)

//还有一种特殊情况 无主构造函数，只有次构造函数
class Student:Person{  //此时因为无主构造函数 所以无括号
    constructor(name:String,age:Int):super(name,age){}
}