import java.util.*;

public class StringReversalStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        Deque<Character> st = new ArrayDeque<>();

        System.out.println("\nPUSH PHASE");
        for (char c : str.toCharArray()) {
            st.push(c);
            System.out.println("Pushed '" + c + "' : Stack : " + st);
        }

        System.out.println("\nPOP PHASE");
        StringBuilder rev = new StringBuilder();
        while (!st.isEmpty()) {
            char c = st.pop();
            rev.append(c);
            System.out.println("Popped '" + c + "' : Stack : " + st);
        }
        System.out.println("\nReversed string: " + rev);
        sc.close();
    }
}
