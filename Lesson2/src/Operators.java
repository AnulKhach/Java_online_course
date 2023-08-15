public class Operators {             // ALT +CTRL + L
    public static void main(String[] args) {
        int a = 4, b = 3;
        int c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        System.out.println(a * b);

        int x = 7, y = 5;
        System.out.println(x / y);
        System.out.println(x % y);

        double u = 7.0, t = 5.0;
        System.out.println(u / t);

        x = 5;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);

        x = 4;
        System.out.println(x++);
        System.out.println(x);

        x = 3;
        y = 4;
        c = x++ - --y;  // c = 3 - 3 = 0
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("---------------------------");

        x = 5;
        y = 9;
        c = ++x + y--; // c = 6 + 9 = 15 , x = 6 , y = 8;
        System.out.println(x++); // print 6 , x = 7
        System.out.println(c); // 15
        System.out.println(x); // 7
        System.out.println(--y); // 7
        System.out.println(y);// 7

        boolean bb = x == 12;
        System.out.println(bb);
        System.out.println(x == 7);
        System.out.println(x != 7);
        System.out.println(x >= 25);
        System.out.println(x <= 15);
        System.out.println(x < 63);

        x = 42;
        System.out.println(x % 2 == 0);

        boolean mianish = x >= 1 && x <= 9;
        System.out.println(mianish);

        boolean vv = x < 0 || x > 100;
        System.out.println(vv);

        vv = false;
        System.out.println(!vv);

        System.out.println(x % 2 == 0 && (x > 4 || x < -8));

        System.out.println(5 & 8);
        System.out.println(17 & 24);
        System.out.println(5 | 8);
        System.out.println(5 ^ 8);

        x = 7;
        x += 2;// x = x + 2
        System.out.println(x);

        x = 17;
        x &= 9;//  x = x & 9


    }
}
