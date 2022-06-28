import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner nowy = new Scanner(System.in);
    System.out.println("Podaj a: ");
    int a = nowy.nextInt();
    System.out.println("Podaj b: ");
    int b = nowy.nextInt();


    if( a == b)
    {
      System.out.println("Liczby są sobie równe");
    }
    else if (a > b)
    {
      System.out.println("a jest większe od b");
    }
    else
    {
      System.out.println("b jest większe od a");
    }
  }
}