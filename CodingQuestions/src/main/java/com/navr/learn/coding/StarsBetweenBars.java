package com.navr.learn.coding;

/**
 * <pre>
 * Given a string s consisting of stars “*” and bars  “|” ,an array of starting indices  starIndex,and an array
 * of ending indices endIndex,determine the number of stars between any two bars within the substrings between the
 * two indices inclusive . NOTE that in this problem indexing starts at 1.
 *
 * A Star is represented as an asterisk [*=ascii decimal 42]
 * A Bar is represented as a Pipe [“|”=ascii decimal 124]
 * Example
 *     s=’|**|*|’
 *     startIndex=[1,1]
 *     endIndex=[5,6]
 *
 * For the first pair of indices (1,5) the substrings is “|**|*”  . There are 2 stars between a pair of bars
 * For the second pair of indices (1,6) the substring is  “|**|*|” and there are 2+1=3 stars in between the bars.
 * Both of the answers are returned to the array [2,3].
 * </pre>
 */
public class StarsBetweenBars {
    public static final char STAR = '*';
    public static final char BAR = '|';

    public static final String STR1 = "|**|*|";
    public static final String STR2 = "|**|*";

    public static final String STR3 = "*|**|*";
    public static final String STR4 = "****|**|*******|*|**";


    public static void main(String[] args) {
//        findStarsBetweenBars(STR1, 1, 5);
//        findStarsBetweenBars(STR2, 1, 5);
//        findStarsBetweenBars(STR3, 1, 5);
        countStarsBetweenBars(STR4, 3, 18);
    }

    static void countStarsBetweenBars(String str, int startIndex, int endIndex) {

        int barStart = findBarStartIndex(str, startIndex);
        int barEnd = findBarEndIndex(str, endIndex);
        String subStr = str.substring(barStart - 1, barEnd-1);
        int starsCount = countChars(subStr);
        System.out.printf("%nstr=%s, startIndex=%d, endIndex=%d, barStartIdx=%d, barEndIdx=%d, subStr=%s, starsCount = %s%n%n",
                str, startIndex, endIndex, barStart, barEnd, subStr, starsCount);
    }

    static int findBarStartIndex(String str, int startIndex) {
        int barStartIndex = 0;
        if (str != null && startIndex > 0) {
            barStartIndex = str.indexOf(BAR, startIndex - 1) + 1;
        }
        return barStartIndex;
    }

    static int findBarEndIndex(String str, int endIndex) {
        int barEndIndex = 0;
        if (str != null && endIndex > 0) {
            String subStr = str.substring(0, endIndex);
            barEndIndex = subStr.lastIndexOf(BAR);
        }

        return barEndIndex;
    }

    static int countChars(String str) {
/*
        AtomicInteger counter = new AtomicInteger(0);
        int[] cnt = new int[1];
        str.chars().forEach(i -> {
            if (i == 42) cnt[0]++;
        });
        int starsCount = cnt[0];
*/

        int starsCount = (int) str.chars().filter(i -> i == STAR).count();
//        System.out.printf("countChars: starsCount=%d%n", starsCount);

        return starsCount;
    }
}
