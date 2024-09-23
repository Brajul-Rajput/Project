import java.util.*;
class Guessing_number{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      int value=0;
      int number=(int)(Math.random()*100);
      do { 
          System.out.println("Enter the value : ");
          value=sc.nextInt();
         

          if(value==number){
            System.out.println("VICTORY !!!! WIN THE GAME !!!!");
            break;
          }
else if (value>number) {
    System.out.println("Your value is greater than the number ");
}
else{
    System.out.println("Your value is less than the number ");
}
      } while (value>=0);
      System.out.println("the number is :"+number);
    }
    }