import java.util.*

fun main(){
    var arrayList = ArrayList<String>();

    arrayList.add("summer");
    arrayList.add("winter");
    arrayList.add("autumn");
    arrayList.add("spring");
    arrayList.add("nothing");


    for(i in arrayList ){
        System.out.println("$i")
    }


    var condition = true
    // Loops
    // While Loop
    // While loop executes a block of code repeatedly as long as a given condition is true
    while(condition) {
        // code to be executed
    }

    var y = 1
    while(y <= 10) {
        System.out.println("$y ")
        y++
    }

    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var z = 1
    do {
        System.out.println("$z ")
        z++
    } while(z <= 10)

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            System.out.println("it's comfy now")
        }
    }


    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
    for(num in 1..10) {
        System.out.println("$num ")
    }

    // infix notation
 /*   for(i in 1 until 10) { // Same as - for(i in 1.until(10))
        System.out.println("$i ")
    }

    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        System.out.println("$i ")
    }

    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        System.out.println("$i ")
    }*/


    for(i in 1..10000){
        if(i == 9001){
            System.out.println("Its over 90000")
        }
    }

    for (x in 0..9) {
        for (y in 0..9) {
            System.out.println("Result = ${x * y}")
        }
    }

}