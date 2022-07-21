package com.mln.filehandling


//Copy File

File myWritefile = new File("WriteData.txt")
File myReadFile =  new File("Data.txt")
myWritefile.append(myReadFile.getText())
print myWritefile.getText()
myWritefile.append(myReadFile.getText())
print myWritefile.getText()

//Clearing the data in the text file
myWritefile.setText("")

//Write using set text
myWritefile.setText(/My appended third text is what. This is the secondline?
My appended second text is what.

My appended third text is whatMy appended first text is what.
My appended second text is whatMy appended first text is what.
My appended second text is whatMy appended first text is what.
My appended second text is whatMy appended third text is what.
How about adding a new line to check if a para is added or not? /
		)
		
		
//Write using write
myWritefile.write("")
myWritefile.write(/My appended third text is what. This is the secondline?
My appended second text is what.

My appended third text is whatMy appended first text is what.
My appended second text is whatMy appended first text is what.
	
My appended second text is whatMy appended first text is what.
My appended second text is whatMy appended third text is what.
How about adding a new line to check if a paragraph is added or not? 
/)



//Write using Append function , but it overriding
myWritefile.append("This is an appended line ")	
		

