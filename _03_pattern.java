package pattern_revision;

import java.util.Scanner;

public class _03_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        1
        2 1
        3 2 1
        4 3 2 1

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i-j+1+" ");
            }

            System.out.println();
        }

        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        1
        A B
        1 2 3
        A B C D
        1 2 3 4 5


        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i%2!=0) System.out.print(j+" ");
                else
                    System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }

        * * * * * *
        * *
        * *
        * * * * * *

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+2 ; j++) {
                if (i==1 || i==n || (j<3 && i>1 && i<n))
                System.out.print(j+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        A
      B A B
    C B A B C
  D C B A B C D


        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                int a = i-j+1;
                System.out.print((char) (a+64)+" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }

         A B C D E F G
         A B C   E F G
         A B       F G
         A           G

        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print((char) (i+64)+" ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n ; i++) {
            int a=1;
            for (int j = 1; j <= n+1-i ; j++) {
                System.out.print((char)(a++ + 64) +" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("  ");
                a++;
            }
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print((char)(a++ + 64) +" ");

            }
            System.out.println();
        }
         1 2 3 4 5 6 7
    1          *
    2        *   *
    3      *       *
    4    *           *
    5      *       *
    6        *   *
    7          *


                // Upper part of the diamond
           for (int i = 1; i <= n; i++) {
               for (int j = i; j < n; j++) {
                   System.out.print("  ");
               }
               for (int j = 1; j <= (2 * i - 1); j++) {
                   if (j == 1 || j == (2 * i - 1)) {
                      System.out.print("* ");
                   } else {
                     System.out.print("  ");
               }
           }
              System.out.println();
            }
       // Lower part of the diamond
          for (int i = n - 1; i >= 1; i--) {
              for (int j = n; j > i; j--) {
                  System.out.print("  ");
              }
              for (int j = 1; j <= (2 * i - 1); j++) {
                  if (j == 1 || j == (2 * i - 1)) {
                      System.out.print("* ");
                  } else {
                          System.out.print("  ");
                  }
              }
              System.out.println();
          }

    }
}
