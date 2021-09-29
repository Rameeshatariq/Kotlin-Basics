import androidx.core.util.rangeTo

fun main(){
    val age = 16
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        System.out.println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        System.out.println("You may vote now")
//return the value for this block
        votingAge
    }else if (age>=drivingAge){
        System.out.println("You may drive now")
//return the value for this block
        drivingAge
    }else{
        System.out.println("You are too young")
//return the value for this block
        age
    }
//print the age for the passing condition
    System.out.println("current age is $currentAge")

    //when expression

    var season ="Spring"

    when(season){
        "Spring" -> System.out.println(1)
        else -> "Invalid"
    }

    var month = 3


        when(month){
            in 3..5 -> System.out.println("Spring")
            in 6..8 -> System.out.println("Summer")
            in 9..11 -> System.out.println("Fall")
            12,1,2 -> System.out.println("Winter")
            else -> "Invalid"

    }

    // challenge - translate the if statement with the age to a when expression
            when(age){
                // with the !in it's the same as saying not in ...
                !in 0..20  -> System.out.println("now you may drink in the US")
                in 18..20  -> System.out.println("now you may vote")
                16,17 -> System.out.println("you now may drive")
                else -> System.out.println("you're too young")
            }


    var x : Any = 13.37
    when(x) {
        is Int -> System.out.println("$x is an Int")
        !is Double -> System.out.println("$x is not Double")
        is String -> System.out.println("$x is a String")
        else -> System.out.println("$x is none of the above")
    }

    //when as expression
    val y : Any = 13.37
//assign when to a variable
    val result =  when(y) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
//then print x with the result
    System.out.println("$y $result")

}