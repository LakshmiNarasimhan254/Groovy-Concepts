package com.mln.basics

//Closure are similar to Java lamba functions 

def strGreet = "Hello"

//The specialty of Groovy is we can use a variable that is declared outside the closure definition , here like strgreeting
def Closure_To_Greet = {name -> println "$strGreet $name " }
Closure_To_Greet.call("Srinath")

//Pass closure as parameter to a method
def myMethod(Closure){
	Closure.call("Lakshmi")
}
myMethod(Closure_To_Greet)

//closure with return type
def Closure_to_getSum = {a,b -> return a+b}
println(Closure_to_getSum.call(3,5))

def myMap = [
				"FirstName": "Lakshmi"
				,"LastName":"Mohan"
				,"Subject":"Scripting Language"
				,"LanguageName":"Groovy"
				,"Topic":"Closures"	
				]
println myMap.each{it}