package com.mln.datastructures

def employee = [
	"Name":"Srinath"
	,"Age":40
]

println employee
println employee.Name
println employee["Name"]
println employee.get("Age")
println employee.getAt("Age")

//size
println employee.size()

//adding a value
employee.put("City", "Chennai")
println employee

//contains
println employee.containsKey("City")
println employee.containsValue("Chennai")

//Iteration
employee.each {
	Key,Value->
	println "$Key"
}

employee.eachWithIndex {
	Key,Value,Index->
	println "$Index | $Key : $Value"
}

def iterations1 = employee.iterator()
while (iterations1.hasNext()){
	println iterations1.next()
}

def iterations2 = employee.keySet().iterator()
while (iterations2.hasNext()){
	println iterations2.next()
}