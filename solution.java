class Solution {
    public String mergeAlternately(String word1, String word2) {
        int shorterLength = Math.min(word1.length(), word2.length());
        boolean longer;
        if (word1.length() > word2.length()) {
            longer = true;
        }
        else {
            longer = false;
        }

        StringBuilder str = new StringBuilder();
        while (shorterLength > 0) {
            str.append(word1.charAt(0));
            word1 = word1.substring(1);
            str.append(word2.charAt(0));
            word2 = word2.substring(1);
            shorterLength--;
        }

        if (longer) {
            str.append(word1);
        }
        else {
            str.append(word2);
        }

        return str.toString();
    }
}
