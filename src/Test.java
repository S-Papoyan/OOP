import method.Main;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.factorial(5);

    }

    public void f(int x) {
        System.out.println("Barev");
        if (x > 0) {
            f(x - 1);
        }
    }

    public int fib(int x) {
        if (x == 1 || x == 2)
            return 1;
        return fib(x - 1) + fib(x - 2);
    }

    public int fact(int x) {
        if (x == 0 || x == 1)
            return 1;
        return x * fact(x - 1);
    }

    public void factorial(int x){
        int a = 1;
        for (int i = 1; i <= x ; i++) {
            a = a * i;
        }
        System.out.println(a);
    }



}


