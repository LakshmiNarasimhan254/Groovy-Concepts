package com.mln.interviewPrep

def words = new ArrayList()
words.add("Rat")
words.add("Car")
words.add("Below")
words.add("Tast")
words.add("Cried")
words.add("Study")
words.add("Thing")
words.add("Chin")
words.add("Grab")
words.add("Act")
words.add("Robed")
words.add("Vase")
words.add("Glean")
words.add("Desserts")
words.add("Tar")
words.add("Arc")
words.add("Elbow")
words.add("State")
words.add("Cider")
words.add("Dusty")
words.add("Night")
words.add("Inch")
words.add("Brag")
words.add("Cat")
words.add("Bored")
words.add("Save")
words.add("Angel")
words.add("Streseed")

String FirstWord
String SecondWord

List anagramPairs = new ArrayList()

for (int i=0; i<words.size()-1;i++){
	FirstWord = words[i]
	for (int j = 0; j<words.size();j++){
		SecondWord = words[j]
		if ((FirstWord.length()==SecondWord.length())
		&&(!(FirstWord.equalsIgnoreCase(SecondWord)))){
			chFirstWord= FirstWord.toLowerCase().toCharArray()
			chSecondWord= SecondWord.toLowerCase().toCharArray()
			Arrays.sort(chFirstWord)
			Arrays.sort(chSecondWord)
			if(chFirstWord.toString().equals(chSecondWord.toString())){
				List anagramPair = new ArrayList()
				anagramPair.add(FirstWord)
				anagramPair.add(SecondWord)
				anagramPairs.add(anagramPair)
				
			}
		}
		
	}
	
}

println anagramPairs




