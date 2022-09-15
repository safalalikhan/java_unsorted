public class Qn02 {
    /*
    String and StringBuilder >

    Strings are immutable because in java we use a string pool to store different strings,
    and  we normally use reference variables that point to the location. There might be many variables
    pointing to the same string in the pool, if strings are made mutable It will be difficult to encounter
    a situation where many items try to make changes together or change made by one variable  will reflect
    in all others.

    StringBuilder is a mutable sequence of characters. It is not threadsafe.
    We can use append and insert to make changes to the StringBuilder.

    Differences :
    StringBuilder is faster as compared to String.
    String is immutable and StringBuilder is mutable.
    StringBuilder is memory efficient than String.
    StringBuilder is dynamic but String is read only.

Methods of String Class :
1. int length(): Returns the number of characters in the String
2. Char charAt(int i): Returns the character at ith index.
3. String substring (int i):  Return the substring from the ith index character to end
4. String substring (int i, int j): Returns the substring from i to j-1 index
5. String concat( String str): Concatenates specified string to the end of this string.
     */
}
