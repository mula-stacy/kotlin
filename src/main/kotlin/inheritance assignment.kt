open class Employee{
    fun name(){
        println("glory")
    }
    fun age(){
        println(25)
    }
    fun  salary(){
        println(150000)
    }
}
class WebDeveloper:Employee(){
    fun Website(){
        println("Ecommerce")
    }
}
class AndroidDeveloper:Employee(){
    fun AndroidDeveloper(){
        println("My App")
    }
}
class iOSDeveloper:Employee(){
    fun iOSDeveloper(){
        println("just print")
    }
}
fun  main(){
    var w=WebDeveloper()
    w.salary()

    var a=AndroidDeveloper()
    a.salary()
    var i=iOSDeveloper()
    i.name()
}
