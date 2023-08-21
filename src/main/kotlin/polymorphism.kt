//parent
 open class Shape{
      open fun draw(){
         println("it is a shape")
     }
 }
//child
class Rectangle:Shape(){
    override fun draw(){
        println("Rectangle")
    }

}
class Square:Shape(){
    override fun draw(){
        println("Square")
    }
}
fun main (){
    var R=Rectangle()
    R.draw()

    var S=Square()
    S.draw()

    var shape= Shape()
    shape.draw()
}