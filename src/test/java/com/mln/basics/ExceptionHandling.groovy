package com.mln.basics

//try catch finally 
try{
	int iNum = 1/0
}catch(ArithmeticException e1){
	println("ArithmeticException")
}catch(Exception e2){
	println("Exception")
}finally{
	println("finally")
}

println "Next lines"

//try finally  
try{
	int iNum = 1/1
}finally{
	println("finally")
}

