import java.util.*;

public class PalindromeStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        Deque<Character> st = new ArrayDeque<>();
        int len = s.length(), half = len / 2;

        // Push first half onto stack
        for (int i = 0; i < half; i++) st.push(s.charAt(i));

        // Skip middle char if odd length
        int start = (len % 2 == 0) ? half : half + 1;

        System.out.println("\nCHARACTER COMPARISON");
        boolean palindrome = true;
        for (int i = start; i < len; i++) {
            char fromStack = st.pop(), fromString = s.charAt(i);
            System.out.printf("Compare '%c' (stack) vs '%c' (string) -> %s%n",
                    fromStack, fromString, (fromStack == fromString ? "Match" : "Mismatch"));
            if (fromStack != fromString) palindrome = false;
        }

        System.out.println("\nResult: \"" + s + "\" is " + (palindrome ? "" : "not ") + "a palindrome.");
        sc.close();
    }
}
