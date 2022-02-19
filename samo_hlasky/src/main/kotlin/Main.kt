import java.util.regex.Pattern

fun main() {
    println("Enter amount of words : ")
    var numberOfWords = Integer.parseInt(readln())
    val words = ArrayList<String>()

    repeat(numberOfWords) { index ->
        println("Enter word number ${index + 1}")
        words.add(readln())
        println("Word added successfully (${words.last()})")
    }
    println("There is ${getNumberOfVowelInMultipleWords(words)} vowels in these ${words.size} words")
}

fun getNumberOfVowelInMultipleWords(words: ArrayList<String>): Int{
   var summedAmount = 0;

    repeat(words.size) { index->
        summedAmount += getNumberOfVowelInWord(words[index])
    }
    return summedAmount
}

fun getNumberOfVowelInWord(word: String): Int {
    var amount = 0;
    repeat(word.length) { index ->
        if(Pattern.matches("['a','e','i','o','u']", word[index].toString())) {
            amount++
        }
    }
    return amount
}