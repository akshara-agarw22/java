import java.util.*;
public class java {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
     /*    int s=sc.nextInt();
        int area=s*s;
        System.out.println(area);
      int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int average=(a+b+c)/3;
        System.out.println(average);
       int a=4;
      int b=5;
      int c=6;
      int sum=a+b+c;
      double avg=sum/3;
      System.out.println(avg); 
      int s=4;
      double area=s*s;
      System.out.println(area);
      float pencil=sc.nextFloat();
      float pen=sc.nextFloat();
      float eraser=sc.nextFloat();
      float total=pencil+pen+eraser;
      System.out.println("bill is:"+total);
      float t=total+(0.18f*total);
      System.out.println("the new bill is:"+t);
      int age=sc.nextInt();
      if(age>=18)
      {
        System.out.println("adult");
      }
      if(age>13 && age<18)
      {
        System.out.println("Teenager");
      }
      else
      {
        System.out.println("toddler");
      }
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b)
      {
        System.out.println("a is greater than b");
      }
      else{
        System.out.println("b is greater than a");
      }
      int n=sc.nextInt();
      if(n%2==0)
      {
        System.out.println("n is an even number");
      }
      else 
      {
        System.out.println("n is an odd number");
      }
      int income=sc.nextInt();
      int tax;
      if(income<500000)
      {
      tax=0;
      }
      else if(income>=500000 && income<1000000)
      {
      tax=(int)(income*0.2);
      }
      else
      {
     tax=(int)(income*0.3);
      }
      System.out.println("tax is:"+ tax);
      int a= sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if((a>b) && (a>c))
      {
        System.out.println("a is the greatest");
      }
      else if((b>a) && (b>c))
      {
        System.out.println("b is the greatest");
      }
      else
      {
        System.out.println("c is the greatest");
      }
      int n=sc.nextInt();
      String type=((n%2)==0)?"even":"odd";
      System.out.println(type);
      int marks=sc.nextInt();
      String report=(marks>=33)?"pass":"fail";
      System.out.println(report);
      System.out.println("enter a");
      int a=sc.nextInt();
      System.out.println("enter b");
      int b=sc.nextInt();
      System.out.println("enter operator");
      char operator=sc.next().charAt(0);
      switch(operator){
        case '+':System.out.println(a+b);
                break;
        case '-':System.out.println(a-b);
                break;
        case '*':System.out.println(a*b);
                break;
        case '/':System.out.println(a/b);
                break;
        case '%':System.out.println(a%b);
                break;
        default:System.out.println("invalid operator");     
      }
      int x=sc.nextInt();
      if(x>0)
      {
        System.out.println("positive");
      }
      else
      {
        System.out.println("negative");
      }
      double t=sc.nextDouble();
      if(t>100)
      {
        System.out.println("fever");
      }
      else
      {
        System.out.println("no fever");
      }
      System.out.println("enter week(1-7):");
      int week=sc.nextInt();
      switch(week){
        case 1:
        System.out.println("monday");
        break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        case 7:
        System.out.println("sunday");
        break;
        default:
        System.out.println("invalid input");
      }*/
      System.out.println("enter the year");
      int year=sc.nextInt();
      boolean x=(year%4==0);
      boolean y=(year%100!=0);
      boolean z=((year%100==0) && (year%400==0));
      if(x && (y||z))
      {
        System.out.println("leap year");
      }
      else{
        System.out.println("normal year");
      }
      sc.close();
    }
}
