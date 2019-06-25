package kt01_variables

// output is simply printing

//input:
fun main(){
    print("Enter the name: ")
    var name = readLine()

    print("Enter the age: ")
    var age: Int = Integer.valueOf(readLine())

    println("Your name is $name and your age is $age. ")
}