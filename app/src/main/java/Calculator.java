public class Calculator {
    public boolean email(String mail){
        return mail.contains("@") && mail.endsWith("com");

    }

    public static int divided(int a, int b) {

        return a / b;
    }

    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public int add(int a, int b) {

        return a + b;
    }

    public int sub(int a, int b) {

        return a - b;
    }

    public int plus(int a, int b, int c) {
        return a + b + c;
    }

    public boolean isTrue(String S) {
      return S.startsWith("07")&&
              S.length() == 10;

    }
}