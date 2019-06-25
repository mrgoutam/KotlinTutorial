package kt01_variables

// variables can be declared using val and var keywords
// we don't need to specify data type.
// Kotlin compiler know language is string and salary is int according to the data.
// This is called type inference in programming.
/*
var language = "JAVA"
val salary = 3000
*/

//we can explicitly specify the data type if we want.
/*
var language:String = "JAVA"
val salary:int = 30000
*/


// var vs val
// var is mutable. we can change the value of the variable later
// val is immutable. we cannot change

fun main(){
    var salary = 30000
    salary = 40000 //execute
    print(salary)

    val language = "JAVA"
    //language = "Kotlin" //error
}
