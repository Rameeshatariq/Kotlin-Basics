
fun main(){

    val mixedList :List<Any> = listOf("Rameesha","Tariq",96,"Areeb",78.0)


    for(i in mixedList){
        when (i){
            is Int -> System.out.println("Int")
            is String -> System.out.println("String")
            else -> System.out.println("Invalid")
        }
    }
}