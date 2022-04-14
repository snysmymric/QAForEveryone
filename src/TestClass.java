public class TestClass {

    public static void printlnStr (String str) {
        System.out.println(str);
    }
    public static void printStr (String str) {
        System.out.print(str + " ");
    }

    public static void main(String[] args) {
        printStr("Hi");
        printlnStr("Anna!");
    }
}
