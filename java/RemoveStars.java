public class RemoveStars {

    static String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(ch);
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e")); // lecoe
        System.out.println(removeStars("erase*****"));  // (empty string)
    }
}
