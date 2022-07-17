package com.mln.basics

//Arithmetic Operators
a = 10
b = 3
println a+b
println a-b
println a/b
println a%b
println a**b
println a.intdiv(b)
println a.plus(b)
println a.minus(b)

//assert to check
//assert b+a == a.intdiv(b) //Failed
assert b == a.intdiv(b)

//Unary Operators (None of them will fail)
assert +3 ==3
assert -4 ==0-4
assert -(-4)==4

//increment/decrement operators
println(a++)
println(a)
println(++a)

println a--
println a
println (--a)

//comparison operators
assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

//logical operators

assert !false
assert true && true
assert true || false


//Ternary Operator
String s = "ABCD"
if ((s!=null) &&(s.length()>0)){
	result = "found"
}else{
	result = "not found"

}
//the above is same as 
result = ((s!=null) &&(s.length()>0))?  "Found" : "Not found"
println result
