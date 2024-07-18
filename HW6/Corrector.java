
public class Corrector {
    public static String[] dictionary; //static field
	public static void main(String[] args) {
		
	//
	// Split the input string into an array of word strings.
	// [You need to supply the splitInput() method in this file.]
	//
		String[] wordList = splitInput(DictDoc.doc);
	//
	// Point to the dictionary which is a list of 'correctly' spelled
	// words against which we check the words from the stentence.
	//
		dictionary = DictDoc.dict;
	//
	// Write a loop here to check each word in the wordList for
	// the different types of misspellings given in the assignment.
	// Group those lists of possible correct words into a single array
	// and display it on the console.
	//
	/*********mid check code********
		for(int i=0; i<wordList.length; i++){
			System.out.println(checkInDict(dictionary, wordList[i]));
		System.out.println(Arrays.toString(checkSwap("bale")));
		System.out.println(Arrays.toString(checkMissing("miht")));
		System.out.println(Arrays.toString(checkExtra("apoply")));

		}*/


		for(int i=0; i<wordList.length; i++){
			String examineWord = wordList[i].toLowerCase();
			if (checkInDict(dictionary, examineWord)==true){
				continue;
			}

			else{
				String misspelledWord = wordList[i];
				System.out.println(misspelledWord + " is misspelled. Possible:");

				printlnstr(checkSwap(misspelledWord));
				printlnstr(checkMissing(misspelledWord));
				printlnstr(checkExtra(misspelledWord));

				if(checkSwap(misspelledWord).length + checkMissing(misspelledWord).length + checkExtra(misspelledWord).length == 0 ){
					System.out.print("No suggestions");
					System.out.println();
				}

				System.out.println();
			}
		}
		
	}

	public static void printlnstr(String[] strArr){
		for (int i=0; i<strArr.length; i++){
			System.out.println(strArr[i]);
		}
	}

	public static String[] splitInput(String inputString){
		String[] splitted = inputString.split("[, ?.@!]+");
		return splitted;
	}

	public static Boolean checkInDict(String[] dict, String word){
		String lowercaseWord = word.toLowerCase();
		for(int i=0; i<dict.length; i++){
			if(lowercaseWord.equals(dict[i])){
				return true;
			}
		}
		return false;
    }

	// public static String swapCharInString(String rawWord, int i, int j){
	// 	char [] charArr = rawWord.toCharArray();
	// 	char temp = charArr[i];
	// 	charArr[i] = charArr[j];
	// 	charArr[j] = temp;

    //     String swappedString = new String(charArr);
	// 	return swappedString;
	// }

	// public static String[] checkSwap(String rawWord){ 
	// 	String[] work = new String[10];
	// 	int k=0;
	// 	int countPossibleWord=0;

	// 	for(int i=0; i<rawWord.length()-1; i++){
	// 		for(int j=i+1; j<rawWord.length(); j++){
	// 			String swappedString = swapCharInString(rawWord, i, j);

	// 			if(checkInDict(DictDoc.dict, swappedString)==true && countPossibleWord<=10){
	// 				work[k++] = swappedString; 
	// 				countPossibleWord +=1;
	// 			}
	// 		}
	// 	}
	// 	String[] possibleWords = new String[countPossibleWord];
	// 	for (int m=0; m<countPossibleWord; m++){
	// 		possibleWords[m] = work[m];
	// 	}
	// 	return possibleWords;
	// 	}



	public static String[] checkMissing(String rawWord){
		String[] work = new String[10];
		int k=0;
		int countPossibleWord=0;
		char [] alphabets = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

		for (int i=0; i<alphabets.length; i++){
			for(int j=0; j<rawWord.length()+1; j++){
				String charAdded = rawWord.substring(0, j) + alphabets[i] +rawWord.substring(j);
				if(checkInDict(DictDoc.dict, charAdded)==true && countPossibleWord<=10){
					work[k++] = charAdded; 
					countPossibleWord +=1;
				}
			}
		}

		String[] possibleWords = new String[countPossibleWord];
		for (int m=0; m<countPossibleWord; m++){
			possibleWords[m] = work[m];
		}
		return possibleWords;
	}


	public static String[] checkExtra(String rawWord){
		String[] work = new String[10];
		int k=0;
		int countPossibleWord=0;

		for(int i=0; i<rawWord.length(); i++){
			String charDeleted = rawWord.substring(0, i) + rawWord.substring(i+1);
			if(checkInDict(DictDoc.dict, charDeleted)==true && countPossibleWord<=10){
					work[k++] = charDeleted; 
					countPossibleWord +=1;
				}
			}

		String[] possibleWords = new String[countPossibleWord];
		for (int m=0; m<countPossibleWord; m++){
			possibleWords[m] = work[m];
		}

		return possibleWords;
	
	}

}






	



		



    



