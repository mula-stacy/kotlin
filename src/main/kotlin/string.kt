fun main(){
    var name ="Hello world"
    var school="eMobilis"
    var day="It's a Saturday"

    println(name[0])//Accessing an element
    println(name[10])

    println(name.indexOf('H'))
    println(name.indexOf("world"))

    println(name.toUpperCase())
    println(name.toLowerCase())

    println(day)
    println(name+ " "+school)//string concatenation
    println(name.plus(school))
    println(name+" I study at "+school)
    println("I study at $school")//string interpolation


}