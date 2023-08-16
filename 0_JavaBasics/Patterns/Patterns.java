public class Patterns {
    public static void hollow_rectangle(int totRows, int totCols) {      //PRINT HOLLOW RECTANGLE PATTERN
        //outer loop
        for(int i=1; i<=totRows; i++) {
            // inner loop
            for(int j=1; j<=totCols; j++) {
                //cell -(i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void rotated_half_pyramid(int n) {  //INVERTED & ROTATED HALF-PYRAMID
        // outer loop
        for(int i=1; i<=n; i++) {
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");

            }
            // Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();     
        }
    }
    // SOLID RHOMBUS PATTERN
    public static void solid_Rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //hollow rectangle - stars
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
                System.out.println();
        }
    }
    public static void diamond_Pattern(int n) {
        //first half
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        //2nd half
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
       // rotated_half_pyramid(4);
     //   solid_Rhombus(5);
    //  hollow_rhombus(7);
    diamond_Pattern(4);

    }
}