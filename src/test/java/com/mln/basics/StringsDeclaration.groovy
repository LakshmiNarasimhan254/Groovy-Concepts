package com.mln.basics

//single quoted '....'
def name1 = 'Lakshmi'
println name1
println 'The name is ' + name1
println 'The name is ' .concat(name1)
println 'The name is ${name1}'
//double quoted "...."
println "The name is ${name1}"
println "The name is $name1"


//triple single quoted '''....'''
def multiLine = '''This is an example of 
 					multi line string 
					.'''

println multiLine
println "$multiLine"
//triple double quoted """...."""
def multiLine2 = """This is second example of
 					multi line string 
					."""
println multiLine2
println "$multiLine2"



//slashy  /..../
def s1 = /this is a blue sky/
println s1

//dollar slashy $/..../$
def s2 = $/this is a green sky/$
println s2



//The Main usage of slashy is to escape double quotes 
def s3 = "My Name is \"Lakshmi\""
println s3

//instead of above we can do something like this
def s4 = /My Name is "Lakshmi"/
println s4