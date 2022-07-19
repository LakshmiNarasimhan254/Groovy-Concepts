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



//Accessing in list 
def StudentInfo = ["Srinath","Mohan",34,12.5,["Java","VB","Groovy"],"Automation Engineer",60]
println StudentInfo

println "The 3rd Element in the List is ${StudentInfo[2]}"
println "The 5th Element:  ${StudentInfo[4]} are the languages known by ${StudentInfo[0]} ${StudentInfo[1]} "
println "${StudentInfo[0]} ${StudentInfo[1]} is well versed in ${StudentInfo[4][0]} "
println "Gives all the details about ${StudentInfo[0]} ${StudentInfo[1]} : ${StudentInfo[2..StudentInfo.size()-1]} "

println StudentInfo.contains('Automation Engineer')
println StudentInfo[4].contains('Java')

