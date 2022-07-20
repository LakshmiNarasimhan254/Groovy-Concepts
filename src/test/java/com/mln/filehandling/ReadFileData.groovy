package com.mln.filehandling

//Reading Files

String myFilePath = "Data.txt"
File myFile = new File(myFilePath)

//Reading the entire content as text
String myDataText = myFile.getText()
println "Reading the entire content as text".toUpperCase()
println myDataText
println "*************************************"

//Reading the entire Line by Line
println "Reading the entire Line by Line".toUpperCase()
int iLineNo =0
myFile.eachLine{myLine->
	iLineNo=iLineNo+1
	println "Line $iLineNo : $myLine"}
println "*************************************"

//Collect the entire text in to list
println "Collect the entire text in to list".toUpperCase()
println (myFile.collect{it})
println "*************************************"




//Storing as an Array
println "Store the entire text in to Array".toUpperCase()
println (myFile as String[])
println "*************************************"



//Reading the lines as list of lines
println "Reading the entire Line by Line as List".toUpperCase()
List myLines = myFile.readLines()
iLineNo=0
myLines.each{myLine->
	iLineNo=iLineNo+1
	println "Line $iLineNo : $myLine"}
println "*************************************"


//Reading the line by line using eachline function
println "Reading the line by line using each line function".toUpperCase()
iLineNo=0
myFile.eachLine{myLine->
	iLineNo=iLineNo+1
	println "Line $iLineNo : $myLine"}
println "*************************************"


//Reading the line by line using eachline and Line Number function
println "Reading the line by line using eachline and Line Number function".toUpperCase()

myFile.eachLine{myLine,myLineNo->

	println "Line $myLineNo : $myLine"}

println "*************************************"

//Reading with Reader
println "Reading with Reader".toUpperCase()
myFile.withReader{myReader->
	while((myLine = myReader.readLine())!=null){
		println myLine
	}
}
println "*************************************"

//Reading with NewReader
println "Reading with NewReader".toUpperCase()
def myNewReader = myFile.newReader()
while((myLine = myNewReader.readLine())!=null){
	println myLine
}
myNewReader.close()
println "*************************************"


//Read the contents of the file in binary data as Byte array
println "Read the contents of the file in binary data as Byte array".toUpperCase()
Byte[] myFileByteContent = myFile.readBytes()
println myFileByteContent
println "************************************"



//Reading the lines as list of lines  as List using InputStream
println "Reading the entire Line by Line as List using InputStream".toUpperCase()
FileInputStream fis =  new FileInputStream(myFile)
List DataLines = fis.readLines()
iLineNo=0
DataLines.each{myLine->
	iLineNo=iLineNo+1
	println "Line $iLineNo : $myLine"}

println "*************************************"

//Get the File Size.
println ("The Size of my file $myFilePath : ${myFile.length()} ")
println "*************************************"
//Check if the path is file or directory
println ("Is the file $myFilePath is a file ? :  ${myFile.isFile()}")
println "*************************************"
//Get the absolute path of the directory and create file object and get the list of files in the director 
myDir = new File (myFile.getAbsolutePath().minus("\\Data.txt"))
println ("The List of files in ${myFile.getAbsolutePath().minus("\\Data.txt")} are ${myDir.list()} ")
println "*************************************"
