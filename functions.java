import java.util.Scanner;

public class functions {
   /*
    * public static void printHelloWorld(){
    * System.out.println("Hello World");
    * System.out.println("Hello World");
    * System.out.println("Hello World");
    * }
    * public static int calculate(int a,int b){
    * int sum=a+b;
    * return sum;
    * }
    * public static void main(String[] args) {
    * Scanner sc=new Scanner(System.in);
    * printHelloWorld();
    * System.out.println("enter two numbers");
    * int A=sc.nextInt();
    * int B=sc.nextInt();
    * int s=calculate(A,B);
    * System.out.println("sum is"+s);
    * 
    * public static void swap(int a, int b) {
    * int temp = a;
    * a = b;
    * b = temp;
    * System.out.println("a=" + a);
    * System.out.println("b=" + b);
    * }
    * 
    * public static void main(String[] args) {
    * Scanner sc = new Scanner(System.in);
    * int a = 18;
    * int b = 22;
    * public static int product(int a,int b){
    * int product=a*b;
    * return product;
    * }
    * public static void main(String[] args) {
    * Scanner sc=new Scanner(System.in);
    * int p=product(3,5);
    * System.out.println("product is"+p);
    * public static int factorial(int n){
    * int f=1;
    * for(int i=1;i<=n;i++)
    * f=f*i;
    * return f;
    * }
    * public static void main(String[] args) {
    * Scanner sc=new Scanner(System.in);
    * System.out.println(factorial(4));
    * public static int factorial(int n){
    * int f=1;
    * for(int i=1;i<=n;i++)
    * f=f*i;
    * return f;
    * }
    * public static int bincoef(int n,int r){
    * int fact_n=factorial(n);
    * int fact_r=factorial(r);
    * int fact_nr=factorial(n-r);
    * int bincoef= fact_n/(fact_r*fact_nr);
    * return bincoef;
    * }
    * public static void main(String[] args) {
    * Scanner sc=new Scanner(System.in);
    * System.out.println(bincoef(5, 2));
    * public static int sum(int a,int b){
    * int s=a+b;
    * return s;
    * }
    * public static int sum(int a,int b,int c){
    * int s=a+b+c;
    * return s;
    * }
    * public static void main(String[] args) {
    * Scanner sc=new Scanner(System.in);
    * System.out.println(sum(2, 3));
    * System.out.println(sum(2,3,4));
   public static int sum(int a, int b) {
      return a + b;
   }

   public static int sum(int a, int b, int c) {
      return a + b + c;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(sum(2, 3));
      System.out.println(sum(2, 3, 4));
      public static int sum(int a,int b){
         return a+b;
      }
         public static float sum(float a, float b){
            return a+b;
         }
         public static double sum(double a,double b){
            return a+b;
         }
       public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println(sum(2, 3));
        System.out.println(sum(2.2f,3.3f));
        System.out.println(sum(2.2,3.3));
        public static boolean isPrime(int n){
         boolean isPrime = true;
          for(int i=2; i<=n-1; i++){
            if(n%i == 0){
               isPrime=false;
               break;
            }
          }
          return isPrime;
        }
        public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println(isPrime(12));
         public static boolean isPrime(int n){
             for(int i=2; i<=n-1; i++){
               if(n%i == 0){
                  return false;
               }
             }
             return true;
           }
           public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println(isPrime(6));*/
            /*public static boolean isPrime(int n){
               if(n==2){
                  return true;
               }
                for(int i=2; i<=n-1; i++){
                  if(n%i == 0){
                     return false;
                  }
                }
                return true;
              }*/
              /*public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println(isPrime(12));
               public static void primeInrange(int n){
                  for(int i=2;i<=n;i++){
                  if(isPrime(i)){
                     System.out.print(i+" ");
                  }
               }
               System.out.println();
            }
            public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
                 primeInrange(100);*/
                 public static void binTodec(int n){
                  int num=n;
                  int pow=0;
                  int dec=0;
                  while(n>0){
                     int d=n%10;
                     dec=dec+(d*(int)Math.pow(2,pow));
                     pow++;
                     n=n/10;
                  }
                  System.out.println("decimal of"+num+ "="+ dec);
                 }
                 public static void decTobin(int m){
                  int p=m;
                  int pow=0;
                  int bin=0;
                  while(m>0){
                     int d=m%2;
                     bin=bin+(d*(int)Math.pow(10,pow));
                     pow++;
                     m=m/2;
                  }
                  System.out.println("binary of"+p+ "="+ bin);
                 }
                 public static double average(double a,double b,double c){
                  return (a+b+c)/3;
                 }
                 public static boolean isEven(int n){
                  if(n%2==0){
                     return true;
                  }
                  else{
                     return false;
                  }
                 }
                 public static boolean isPalindrome(int n){
                  int k=n;
                  int r=0;
                  while(n!=0){
                     int d=n%10;
                     r=r*10+d;
                     n=n/10;
                  }
                  if(k==r){
                     return true;
                  }
                  else{
                     return false;
                  }
                 }
                 public static int sum(int n){
                  int s=0;
                  while(n>0){
                     int d=n%10;
                     s=s+d;
                     n=n/10;
                  }
                  return s;
                 }
                 public static void main(String[] args) {
                  Scanner sc=new Scanner(System.in);
                 System.out.println("enter a number");
                 int n=sc.nextInt();
                 System.out.println("the sum = "+sum(n));
                 sc.close();
   }
}
