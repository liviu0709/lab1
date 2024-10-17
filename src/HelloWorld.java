// This is a simple Java program.

/**
 * Basic documentation
 */
class HelloWorld {
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        System.out.println("Hello, World!");
        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";
        System.out.println(yes == no || grade > amount);
        // System.out.println(amount == 40.0 || 50.0);
        System.out.println( hiVal != loVal || loVal < 0 );
        System.out.println( true || hello.length() > 0);
        System.out.println( hello.isEmpty() && yes);
        System.out.println( grade <= 100 && !false );
        System.out.println( !yes || no );
        // System.out.println( grade > 75 > amount );
        System.out.println( amount <= hiVal && amount >= loVal );
        System.out.println( no && !no || yes && !yes);



        float a = 100.25f;
        long b = (long) a;
        System.out.println("value of a: " + a);
        System.out.println("value of b:"+b) ;
        int c = (int)b;
        System.out.println("value of c:"+c) ;
        byte d = (byte) c;
        System.out.println("value of d:"+d) ;

        int aB = 5;
        System.out.println(aB + -aB - aB++ & 10) ;
        System.out.println(aB - aB + --aB / 10) ;
        for (int i = 2; i < 5;) {
            i++;
            a += a;
        }
        System.out.println("a = " + a) ;
    }
}

