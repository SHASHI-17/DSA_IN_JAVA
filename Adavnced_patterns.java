import org.w3c.dom.html.HTMLBodyElement;

public class Adavnced_patterns {
        
    
    // HOLLOW REACTANGLE
    public static void hollow_rectangle(int rows,int columns){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 ||j==columns){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    // INVERTED AND ROTATED HALF PYRAMID WITH STARS
    static public void inverted_pyramid(int n){
        for(int rows=1;rows<=n;rows++){
            for(int space=1;space<=n-rows;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=rows;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // INVERTED AND ROTATED HALF PYRAMID WITH NUMBERS

    static public void  inverted_pyra_with_numbers(int x){
        for(int rows=1;rows<=x;rows++){
            for(int columns=1;columns<=x-rows+1;columns++){
                System.out.print(columns+" ");
            }
            System.out.println();
        }
    }

    // FLOYDS TRIANGLE

    static public void floyd_triangle(int x){
        int num=1;
        for(int rows=1;rows<=5;rows++){
            for(int columns=1;columns<=rows;columns++){
                System.out.print(num+++" "); 
            }
            System.out.println();
        }
    }

    //ZERO ONE

    // static public void zero_one(int x){
    //     int num=1;
    //     for(int rows=1;rows<=5;rows++){
    //         for(int columns=1;columns<=rows;columns++){
    //              if(num==1){
    //                 System.out.print(num +" ");
    //                 num--;
    //             }
    //             else if(num==0){
    //                  System.out.print(num +" ");
    //                 num++;
    //              }
    //         }
    //         System.out.println();
    //     }
    // }

    //ZERO ONE

    static public void zero_one(int x){
        for(int rows=1;rows<=5;rows++){
            for(int columns=1;columns<=rows;columns++){
                 if((rows+columns)%2==0){
                    System.out.print("1");
                }
                else{
                     System.out.print("0");
                 }
            }
            System.out.println();
        }
    }
    
    // BUTTERFLY

    static public void butterfly(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                for(int space=1;space<=2*(x-i);space++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
        }
        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                for(int space=1;space<=2*(x-i);space++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
        }
        }

        // SOLID RHOMBUS
        
        public static void solid_rhombus(int n){
            for(int i=1;i<=n;i++){
                for(int space=1;space<=n-i;space++){
                    System.out.print("   ");
                }
                for(int star=1;star<=n;star++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        // SOLID HOLLOW RHOMBUS


        static public void hollow_rhombus(int n){
            for(int i=1;i<=n;i++){
                for(int space=1;space<=n-i-1;space++){
                        System.out.print("  ");
                }
                for(int j=1;j<=n;j++){
                    if(i==1 || i==n || j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //DIAMOND
        public static void DIAMOND(int x){
            for(int i=1;i<=x;i++){
                for(int space=1;space<=x-i;space++){
                    System.out.print("  ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=x;i>=1;i--){
                for(int space=1;space<=x-i;space++){
                    System.out.print("  ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        //NUMBER PYRAMID
        static public void number_pyramid(int x){
            for(int i=1;i<=x;i++){
                for(int space=1;space<=x-i;space++){
                     System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }


    //    PALINDROMIC PATTERN WITH NUMBERS

        public static void palindromic_number_pattern(int x){
                for(int i=1;i<=x;i++){
                    for(int space=1;space<=x-i;space++){
                        System.out.print(" ");
                    }
                    for(int j=i;j>=1;j--){
                        System.out.print(j);
                    }
                    for(int j=2;j<=i;j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }
        }
        
    public static int power(int a ,int b){
        int mult=1;
        for(int i=1;i<b;i++){
            mult=mult*a;
        }
        return mult;
    }

        public static void ayush_ye_raha(int x,int power){
            for(int i=1;i<=power;i++){
                for(int j=1;j<=1;j++){
                    System.out.print(power(x,i));
                }
                System.out.println();
            }
        }


        public static void hollow_loon(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i<=(n/2)+1){
                        if(i==1 || j==1 || j==n || i==(n/2)+1 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    else{
                        if(j==(n/2)+1){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
       // hollow_rectangle(4, 8 );
    //    inverted_pyramid(4);
        // inverted_pyra_with_numbers(5);
        //floyd_triangle(5);
        // zero_one(5);
       // butterfly(18);
      // solid_rhombus(5);
    //   hollow_rhombus(5);
    // DIAMOND(4);
    // number_pyramid(5);
        // palindromic_number_pattern(5);
        // ayush_ye_raha(11, 5);
        hollow_loon(6);
    }

}
