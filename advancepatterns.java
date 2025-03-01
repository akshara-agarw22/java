public class advancepatterns {
    public static void hollow_rectangle(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1||i==r||j==1||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_pyramid(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyramid(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floyd_triangle(int r){
        int c=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                }
                System.out.println();
            }
        }
        public static void butterfly(int n){
            //1st half
            for(int i=1;i<=n;i++){
                //stars
                for(int j=1;j<=i;j++){
                 System.out.print("*");
                }  
                //spaces
                 for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                 }      
                 //stars
                 for(int j=1;j<=i;j++){
                    System.out.print("*");
                   }  
                   System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
               }  
               //spaces
                for(int j=1;j<=2*(n-i);j++){
                   System.out.print(" ");
                }      
                //stars
                for(int j=1;j<=i;j++){
                   System.out.print("*");
                  }  
                  System.out.println();
        }
    }
    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print( " ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print( " ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<= (2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void number_pyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void palindrome_pattern(int n){
      for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //descending
         for(int j=i;j>=2;j--){
            System.out.print(j);
         }
         //ascending
         for(int j=1;j<=i;j++){
            System.out.print(j);
         }
         System.out.println();
      }
    }
    public static void main(String[] args) {
      palindrome_pattern(5);
    }
}
