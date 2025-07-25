package com.example.helloworld

//当传入null参数时会出现空指针异常

//不可空类型系统
fun doStudy(study: Study){   //Kotlin中默认就是不可空
    study.doHomework()
    study.readBooks()
}

//可空类型系统
fun doStudy1(study: Study?){   //就是在数据类型后面加一个？即可  不过可空后就需要一个判断语句了
    if (study!=null){
        study.readBooks()
        study.doHomework()
    }
}

//判空辅助工具
//   ?.  为空则不执行  确实实用性较高
fun doStudy2(study: Study?){
    study?.readBooks()
    study?.doHomework()
}

//   ?:  左不空则返回左 否则返右
var a=null
var b=8

val c= if(a!=null){
    a
}else{
    b
}

//简化为
//val c=a?:b

//综合使用  获得一个文本长度
fun getTextLength(text:String?):Int{
    if(text!=null){
        return text.length
    }
    return 0
}

//简化后
fun getTextLength1(text:String?)=text?.length?:0

//Kotlin虽然检查空指针很智能 但有时仍然会产生一些问题 例如以下示例

//非空断言工具  !!.  非常确信这个对象不为空
var content:String?="hello"
val upperCasw=content!!.toUpperCase()

//特殊的辅助工具--let  见例知意
//obj.let{ obj2->
//   //编写集体的业务逻辑
//}

fun doStudy3(study: Study?){
    study?.readBooks()
    study?.doHomework()
}    //略显复杂

//可用let进行简化
fun doStudy4(study: Study?){
    study?.let { stu->   //let就是将对象作为参数重新传回去，其实站在这就是一个化众为一的作用
        stu.readBooks()
        stu.doHomework()
    }
}

fun doStudy5(study: Study?){
    study?.let {
        it.readBooks()
        it.doHomework()
    }
}

//let函数可以处理全局变量的判空问题 而if却不行
var study:Study?=null

fun doStudy6(){
//    if (study!=null){
//        study.readBooks()    //例如这里会报错
//        study.doHomework()
//    }
    study?.let {
        it.readBooks()      //而这里则没问题
        it.doHomework()
    }
}














