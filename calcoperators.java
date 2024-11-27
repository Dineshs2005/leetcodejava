import java.util.Scanner;
class CalculateWithOperators {
  public static void main (String[] args) {
   
   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter the Billid:");
   int billid=scanner.nextInt();
   System.out.println("Enter the cusid:");
    int cusid=scanner.nextInt();
    System.out.println("Enter the discount:");
   int discount=scanner.nextInt();
   double discountamount;
  
  System.out.println("Enter the billamount:");
     double billamount=scanner.nextInt();
   discountamount=billamount - billamount * (discount/100);
    System.out.println(" discountamount=" +discountamount);
  }
}
