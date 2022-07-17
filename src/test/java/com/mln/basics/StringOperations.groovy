package com.mln.basics


def strStatement= """ 
 ingu 
 nalla 
 meengkal 
 virkapadum 
 
"""

//Concatenation 
println "Vadivelu is saying " + strStatement 
println "*********************************"
println "Vadivelu is saying " .concat(strStatement)
println "*********************************"
println "Vadivelu is saying $strStatement"
println "*********************************"


//split in to list 
println strStatement.split(" ")
println "*********************************"

//Retrieve Characters
println strStatement[3]
println "*********************************"
println strStatement[5,4,2,3,4,5]
println "*********************************"
println strStatement [8..23]
println "*********************************"
println strStatement [23..8]
println "*********************************"

//Finding index of a character /String
println strStatement.indexOf('n')
println "*********************************"
println strStatement.indexOf("Nalla")
println "*********************************"


//substring 
println strStatement.substring(8, 23)
println "*********************************"

//Ignoring characters/substring 
println strStatement-("Nalla")
println "*********************************"
println strStatement-("n")
println "*********************************"

//replace 
println strStatement.replaceAll("Nalla", "Ketta")
println "*********************************"
println strStatement.replace('a','b')
println "*********************************"
println strStatement.replaceFirst('a','b')
println "*********************************"

//Lower and Upper Case and camel case
println strStatement.toLowerCase()
println "*********************************"
println strStatement.toUpperCase()
println "*********************************"
println strStatement.trim().capitalize()
println "*********************************"

//Removing leading and trailing 
println strStatement.trim()
println "*********************************"
println strStatement.stripIndent()
println "*********************************"

//Split every character
println strStatement.toList()
println "*********************************"
println strStatement.toSet()
println "*********************************"
println strStatement.toSet().join(",")
println "*********************************"
println strStatement.toCharArray()

//Repeat the same string 5 times
println strStatement * 5
println "*********************************"


//Equals operator 
println "ABC".equals("ABC")
println "*********************************"
println "ABC".equals("aBC")
println "*********************************"
println "ABC".equalsIgnoreCase("aBC")
println "*********************************"