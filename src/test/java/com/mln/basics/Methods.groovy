package com.mln.basics



//Method definition
def PrintHello(){
	println "Hello..!"
}

def PrintSum(def a =10 , def b =20.5){
	println "The sum of $a , $b is ${a+b}" 
}

def sub (int a ,int b ){
	return "The difference of $a and $b is ${a-b}"
}

//calling the Method 
PrintHello()
PrintSum(10,10.5)
PrintSum()
println(sub(10,5))