package com.mln.datastructures

def range = 1..<11
println range
println range.size()
println range.getClass()
println range.getFrom()
println range.getTo()

println range.get(9)
println range[3]
println range.contains(6)
//range=  range.reverse()
println range.getClass()


//Iteration 
range.each{i->println "Value: $i"}
range.eachWithIndex{x,y-> println "$x |:$y"}
//for loop 
for (i in range){
	println "Values-> $i"
}
for (i=0;i<range.size();i++){
	println "Values: ${range[i]}"
}
iteration = range.iterator()
while (iteration.hasNext()){
	println "This is ${iteration.next()}"
}
