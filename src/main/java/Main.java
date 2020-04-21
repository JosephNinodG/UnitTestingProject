public class Main {

    public static void main(String[] args) {

        Main mainClass = new Main();

        int a = 0;

        for (int b = 0; b < 10; b++) {
            System.out.println(mainClass.multiply(a, b));
            System.out.println(mainClass.addition(a, b));
            System.out.println(mainClass.subtract(a, b));
            System.out.println(mainClass.division(a, b));
        }

    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int addition(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int division(int a, int b){
        return a/b;
    }
}
