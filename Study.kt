package com.example.helloworld

//接口

interface Study {
    fun readBooks()
    fun doHomework(){    //如果本身就存在函数体，则不强制实现而是而是默认实现也可以选择实现

        println("do homework default implementation")
    }
}

fun main(){
    val student = Student("Jack",19)
    doStudy(student)
}

//fun doStudy(study:Study){
//    study.readBooks()
//    study.doHomework()
//}

//修饰符 大致概括了一下 还未具体实例使用 后面使用后应该可以理解 见书p58表