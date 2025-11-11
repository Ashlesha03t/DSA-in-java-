import java.util.*;
public class FunctionLogger {
    static Stack<String> s = new Stack<>();

    static void call(String f) {
        s.push(f);
        System.out.println("PUSH: " + f + " (Stack: " + s + ")");
    }

    static void ret(String f) {
        s.pop();
        System.out.println("POP:  " + f + " (Stack: " + s + ")");
    }

    static void A() { call("A"); B(); C(); ret("A"); }
    static void B() { call("B"); D(); ret("B"); }
    static void C() { call("C"); ret("C"); }
    static void D() { call("D"); ret("D"); }

    public static void main(String[] args) {
        System.out.println("Function is Calling");
        A();
    }
}
