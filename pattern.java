
public class pattern {

    public static void main(String[] args) {
        // star pattern
        // for(int line=1;line<=4;line++){
        //     for(int star=1;star<=line;star++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //inverted star pattern
        //int n=8;
        // for(int line=1;line<=n;line++){
        //     for(int star=1;star<=(n-line+1);star++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //half pyramid pattern
        // for(int line=1;line<=n;line++){
        //     for(int star=1;star<=line;star++){
        //         System.out.print(star+" ");
        //     }
        //     System.out.println();
        // }
        //char ch=65;
        // for(int line=1;line<=n;line++){
        //     for(int star=1;star<=line;star++,ch++){
        //         System.out.print(ch+" ");
        //     }
        //     System.out.println();
        // }

        // hollow rectangle
            int n=4;

        for(int line=1;line<=n;line++){
            if(line==1){
                for(int star=1;star<=(n-line+2);star++){
                    System.out.print("*");
                }
             }
             if(line>1 && line<n){
                for(int star=1;star<=1;star++){
                    System.out.print("*");    
                }
                for(int space=1;space<=n-1;space++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(line==n){
                for(int star=1;star<=(n+1);star++){
                    System.out.print("*");
                }
            }

                System.out.println();
            }

           
        }
    }
