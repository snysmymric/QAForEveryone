public class TestClass {

    public static void printlnStr (String string) {
        System.out.println(string);
    }
    public static void printStr (String string) {
        System.out.print(string + " ");
    }

    public static void main(String[] args) {
        printStr("Hi");
        printlnStr("Anna!");
    }
}
