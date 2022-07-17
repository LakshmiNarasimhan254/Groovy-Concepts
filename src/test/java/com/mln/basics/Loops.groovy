package com.mln.basics



def iNum =  0
//while loop
while(iNum <10){
	println (++iNum)
}

//for loop
for (i=0;i<10;i++){
	println ("from For loop" +i)
}

//for in
for (i in 1..5){
	println ("from Forin  loop" +i)
}


def map = ["name" : "Lakshmi","Subject" : "groovy"]
for (m in map){
	println "${m.key}- ${m.value}"
}




//Keywords
1.upto(5){ //up to keyword
	println "$it" //$it--->represents iteratio
}

5.times{ //times keyword
	print"$it"
}

1.step(10, 2){ //step keyword , it will take parameters , max value and increment value 
	print"$it"
}