//parent
 open class shape{
     fun area(){
         println(30)
     }
     fun circumference(){
         println(20)
     }
 }
 //child
class rectangle:shape(){
     var length =15
     var breath =5
     fun length(){
         println(length)
     }
     fun breath(){
         println(breath)
     }


 }
class circle:shape(){
    var radius =12
    fun radius(){
        println(radius)
    }
}
fun main(){
    var s=shape()
    s.area()
    var r=rectangle()
    r.length()
    var c=circle()
    c.radius()
}