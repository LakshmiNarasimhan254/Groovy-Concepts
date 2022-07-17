package com.mln.basics

String strFirstName = "Lakshmi Narasimhan"
def strLastName = "Mohan"
strFullName = "Lakshmi Narasimhan Mohan"

println strFirstName
println strLastName
println strFullName
println strFirstName+ " " + strLastName

println 'The Name is ${strFirstName}'
println "The Name is ${strFirstName}"

def variable ="Value"
//The datatype is dynamically decided 
variable = 8

println variable

//Multiple variable assignment 
def (a,b,c) =[10,20,30]

println a
println b
println c