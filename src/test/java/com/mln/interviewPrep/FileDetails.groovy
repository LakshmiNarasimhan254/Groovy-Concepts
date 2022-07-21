package com.mln.interviewPrep

String myFilePath = "WriteData.txt"
File myFile = new File(myFilePath)

println ($/The Absolute path of $myFilePath : is " ${myFile.absolutePath} "/$)

def SentenceCount = 0
def LineCount = myFile.readLines().size()
def WordCount = myFile.getText().split(" ").size()
int ParaCount = 0
myFile.eachLine
{Lines->
	if (Lines.trim().equals("")){
		ParaCount =ParaCount+1
	}
}


myFile.eachLine
{Lines->
	SentenceCount= SentenceCount +Lines.split("[!?.:]+").size()
}


def SpaceCount = WordCount-1


println "************************************"
println "No of Line: $SentenceCount"
println "No of Words: $WordCount"
println "No of para: $ParaCount"
println "No of spaces: $SpaceCount"
println "************************************"