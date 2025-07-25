package com.example.helloworld

//字符串内嵌表达式
//"hello,${obj.name}.nice to meet you"
//"hello,$name.nice to meet you"      //只有一个变量可以省去大括号

//val brand = "Tim"
//val price = 10
//fun main(){
//    println("Cellphone(brand="+brand+",price="+price+")")
//    println("Cellphone(brand=$brand,price=$price)")
//}

//函数的参数默认值
fun printParams(num:Int,str:String="hello"){   //直接赋个值就是设置默认值
    println("num is $num,str is $str")
}
fun main(){
    printParams(123)
    printParams(123,"world")  //如果传参了则会代替默认值
    //printParams("world")  //正常来讲是要按顺序传参的所有这里类型不匹配会报错
    //所以有了键值对的传参方法
    printParams(str="world",num=123)
}

//可以替代次构造函数的作用
//class Student (val sno:String,val grade:Int,name:String,age:Int):Person(name,age){
//    constructor(name:String,age: Int):this("",0,name,age){}
//    constructor():this("",0){}
//}

//可简化成以下代码
//class Student (val sno:String="",val grade:Int=0,name:String="",age:Int=0):Person(name,age){}

