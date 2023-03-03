fun main(){
    var namesArrays = arrayOf("Marrion", "Cynthia", "Yvonne", "Kendi")
    println(namesArrays.contentToString())
    places()
    numbers()
    var words = arrayOf("Joseph", "Akinyi", "Atieno")
    println(words.contentToString())




}
fun namesArrays(l:String, g:String, m:String, k:String):String{
    var names = arrayOf("l","g","m", "k")
    return names.contentToString()


}
fun places(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities.map { it.capitalize() })



}
fun numbers(){
    var num = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = num[1] + num[4]
    println(sum)
    println(num.indexOf(158))
    println(num.sortedArray().contentToString())

}
fun words(name1:String, name2:String, name3:String):String{
    var stmt = arrayOf("name1", "name2", "name3")
    return stmt.contentToString()
}