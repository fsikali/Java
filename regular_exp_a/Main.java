/*
--- Java Regular Expressions
- A regular expression is a sequence of characters that forms a search pattern
- When you search for data in a text, you can use this search pattern to describe what you are searching for
- A regular expression can be single character, or more complicated pattern
- Regular expressions can be used to perform all types of text search and text replace operations
- Java does not have a buit-in Regular Expression  class, but we can import the java.util.regex package to
  work with regular expressions.
- The package includes:
  Pattern Class - Defines a pattern (to be used in a search)
  Matcher Class - Used to searrch for the pattern
  PtternSyntaxException Class - Indicates syntax error in a regular expressions pattern

*/

// Example: Find out if there are any occurences of the word "w3shool" in a sentence:

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main { 
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("John", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit John");
        boolean matchFound = matcher.find(); 
        if (matchFound) { 
            System.out.println("Match found");
        } else { 
            System.out.println("Match not found");
        }
    }
}

/*
--- In this example, The word "John" is being seaeched for in a sentence
- First, the pattern is created using the Pattern.compile() method.
- The first parameter indicates which pattern is being searched for and the second parameter has a flag to 
  indicate that the search should be case-insensitive.
- The second parameter is optional
- The matcher() method is used to search for the pattern in a string.
- It returns a Matcher object which contains information about the search that was performed
- The find() method returns true if the pattern was found in the string and false if it was not found

--- Flags 
- Flags in the compile() method change how the search is performed
- Pattern.CASE_INSENSITVE - The case of letters will be ignored when performing a search
- Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be 
  treated as ordinary characters when performaing a search. 
- Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters
  outside of the English alphabet.

--- Regular Expression Patterns
- The first parameter of the Pattern.compile() method is the pattern
- Brackets are used to find a range of characters

--- Metacharacters
- Metacharacters are characters with special meaning

--- Quantifiers
- Quantifiers define quantities:
*/
