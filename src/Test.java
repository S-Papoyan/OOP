import method.Main;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.f(4);

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

}


