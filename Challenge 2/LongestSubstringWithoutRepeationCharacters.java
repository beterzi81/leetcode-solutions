public class LongestSubstringWithoutRepeationCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return s.length();
        }
        int lengthCounter = 0;
        char[] charArray = s.toCharArray();
        String substring = "";
        for (int i = 0; i < charArray.length; i++) {
            substring = String.valueOf(charArray[i]);
            lengthCounter = substring.length() > lengthCounter ? substring.length() : lengthCounter;
            for (int j = i + 1; j < charArray.length; j++) {
                if (!(substring.contains(String.valueOf(charArray[j])))) {
                    substring += String.valueOf(charArray[j]);
                    lengthCounter = substring.length() > lengthCounter ? substring.length() : lengthCounter;
                } else {
                    lengthCounter = substring.length() > lengthCounter ? substring.length() : lengthCounter;
                    j = s.length();
                }
            }
        }
        return lengthCounter;
    }
}