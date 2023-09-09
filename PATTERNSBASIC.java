import java.util.Scanner;

public class PATTERNSBASIC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
         (SQUARE PATTERN)
         * * * *
         * * * *
         * * * *
         * * * *
         */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        (HOLLOW SQUARE PATTERN)
         * * * *
         *     *
         *     *
         * * * *
         * */
       for (int i=1;i<=4;i++){
           for (int j=1;j<=4;j++){
               if (i==1||j==1||i==4||j==4){
                   System.out.print("*"+" ");
               }
               else{
                   System.out.print(" "+" ");
               }
           }
           System.out.println();
       }
        System.out.println();
        /*
        (RHOMBUS STAR PATTERN)
        ****
         ****
          ****
           ****
         */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=4;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        (Mirrored Rhombus Star Pattern)
           ****
          ****
         ****
        ****
        */
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=4;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=4;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        (TRIANGLE STAR PATTERN)
         *
         **
         ***
         ****
        */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
         /*
        (ROTATED TRIANGLE STAR PATTERN)
         ****
         ***
         **
         *
        */
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        (180DEG TRIANGLE STAR PATTERN)
           *
          **
         ***
        ****
        */
       for (int i=1;i<=4;i++){
           for (int j=1;j<=4-i;j++){
               System.out.print(" "+" ");
           }
           for (int j=1;j<=i;j++){
               System.out.print("*"+" ");
           }
           System.out.println();
       }
        System.out.println();
         /*
        (180DEG ROTATED TRIANGLE STAR PATTERN)
         ****
          ***
           **
            *
        */
        for (int i=4;i>=1;i--){
            for (int j=1;j<=4-i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        (PYRAMID STAR PATTERN)
          *
         ***
        *****
       *******
       */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for (int j=2;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        (REVERSED PYRAMID STAR PATTERN)
        *******
         *****
          ***
           *
        */
        for (int i=4;i>=1;i--){
            for (int j=1;j<=4-i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for (int j=2;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        (HOLLOW TRIANGLE)
               *
             * *
           *   *
         * * * *
       */
       for (int i=1;i<=4;i++){
           for (int j=1;j<=4;j++){
               if (i==4||j==4||i+j==4+1){
                   System.out.print("*"+" ");
               }
               else{
                   System.out.print(" "+" ");
               }
           }
           System.out.println();
       }
        System.out.println();
        /*
        (HOLLOW TRIANGLE)
         *
         * *
         *   *
         * * * *
       */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (i==4||j==1||i==j){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
