public class Patterns {
    // 1.Solid rectangle==========================>
    public static void solidRect(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    // 2. Hollow Rectangle======================>
    public static void HollowRect(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {

                    System.out.print(" * ");

                } else {
                    System.err.print("   ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void HalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

    }

    // 03 Inverted Half Pyramid================>
    public static void InvertedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    // 04 half numbered pyramid ======================>
    public static void NumberedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 05 Inverted Number Pyramid=====================>
    public static void InvertedNumPyramid(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 06 FLOYD'S TRIANGLE
    public static void FloydsTri(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    // 07 0-1 Triangle
    public static void ZeroOneTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.err.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    // 08 Butterfly Pattern=================>
    public static void ButterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 09 solid Rombus
    public static void SolidRombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // 10 Number Pyramid ===========>
    public static void NumPyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    // 11 Palindrom Pattern Number Pyramid===========>
    public static void PalindromNum(int n) 
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }    
    }



    public static void main(String[] args) {
        int n = 8;
        int m = 8;

        // solidRect(n , m);
        // HollowRect(n, m);
        NumPyramid(n);

    }
}
