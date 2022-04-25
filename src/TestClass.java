public class TestClass {

    public static void printlnStr (String string) {
        System.out.println(string);
    }
    public static void printStr (String string) {
        System.out.print(string + " ");
    }

    public static int Sum (int operand1, int operand2) {
        return operand1 + operand2;
    }

    public static int Dif ( int operand1, int operand2) {
        return operand1 - operand2;
    }

    public static void main (String[] args) {
        printStr("Hi");
        printlnStr("Anna!");

        System.out.println(Sum(23,2));
        System.out.println(Dif(25,3));


    }
}
