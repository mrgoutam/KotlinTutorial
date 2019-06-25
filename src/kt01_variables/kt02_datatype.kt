package kt01_variables

// In Kotlin, everything is an object, which means we can call member function and properties on any variable.
// data types: number, character, boolean, string, array

// Numbers:
// byte - 8 bit
// Short - 16 bit
// Int - 32 bit
// long - 64 bit
// float - 32 bit
// double - 64 bit

// Character:
// char - 4 bit

// Boolean:
// boolean - 1 bit

// Array:
// Arrays in Kotlin are represented by the Array class.
// Arrays are created using library function arrayOf() and Array() constructor.

// arrayOf constructor:
// Array has get (), set() function, size property as well as some other useful member functions.
// val arrayEx = arrayOf(1,2,3,4,5,6)

// Array() constructor:
// First argument as a size of array, and
// Second argument as the function, which is used to initialize and return the value of array element given its index.
// val asc = Array(5, { i -> i * 2 }) //asc[0,2,4,6,8]