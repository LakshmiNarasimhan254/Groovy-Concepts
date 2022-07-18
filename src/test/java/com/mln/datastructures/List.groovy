package com.mln.datastructures

//List of Objects 
def myObjList = [1,1.5,-1,134.00002,'a'as char , "abc", 'a']
println myObjList

//List of Strings 
def myStringList =["Apples","Oranges","Grapes","Bananas","Oranges"]
println myStringList
myObjList
println "********************************"

//Looping through list 

//Using for in loop
for (s in myStringList){
	println s 	
}
println "********************************"
//using for loop 
for (int i =0;i<myStringList.size;i++){
	println myStringList[i]
}

println "********************************"
//using iterator 
def iterations = myStringList.iterator()
while (iterations.hasNext()){
	println iterations.next()
}

println "********************************"
//Using closures 
myStringList.each{println it}

