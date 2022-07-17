package com.mln.basics

//byte
byte b =10
println "The value of ${b}"
println "The Min value of Byte is " + Byte.MIN_VALUE
println "The Max value of Byte is " + Byte.MAX_VALUE

//short 
short s = 10
println "The value of ${s}"
println "The Min value of short  is " + Short.MIN_VALUE
println "The Max value of short is " + Short.MAX_VALUE

//int
int i = 10
println "The value of ${i}"
println "The Min value of integer is " + Integer.MIN_VALUE
println "The Max value of integer is " + Integer.MAX_VALUE

//long
long l =10 
println "The value of ${l}"
println "The Min value of long is " + Long.MIN_VALUE
println "The Max value of long is " + Long.MAX_VALUE

float f =10
println "The value of ${f}"
println "The Min value of float is " + Float.MIN_VALUE
println "The Max value of float is " + Float.MAX_VALUE

double d = 134.00002
println "The value of ${d}"
println "The Min value of double is " + Double.MIN_VALUE
println "The Max value of double is " + Double.MAX_VALUE

//This wont given an error , will convert and print whatever can be held in byte
b=d
println "The value of ${b}"

char c ='a' //ab will give GroovyCastExceptiob Cannot cast object 'ab' with class 'java.lang.String' to class 'char'
println c
boolean flag = true
println "The value of ${flag}"
println flag.getClass()

String str ="Groovy"
println "The value of ${str}"
