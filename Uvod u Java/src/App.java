import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      //1
      System.out.println("1. zadatak \n");
      System.out.println("       J     a   v     v   a      \n"
                       + "       J    a a   v   v   a a     \n"
                       + "    J  J   aaaaa   v v   aaaaaa   \n"
                       + "     JJ   a     a   v   a      a   \n");


      //2
      System.out.println("2. zadatak \n");
      System.out.println("Hello! \nSrdjan Lazic!");


      //3
      System.out.println("3. zadatak \n");
      int v1 = 74;
      int v2 = 36;

      System.out.println(v1+v2);

      //4
      System.out.println("4. zadatak \n");
      v1 = 50;
      v2 = 3;

      System.out.println(v1/v2);

      //5
      System.out.println("5. zadatak \n");
      Scanner input = new Scanner(System.in);

      System.out.println("Unesite prvi broj: \n");
      v1 = input.nextInt();
      System.out.println("Unesite drugi broj: \n");
      v2 = input.nextInt();
      System.out.println("Rezultat je: " + v1*v2);

      //6
      System.out.println("6. zadatak \n");
      System.out.println("Unesite prvi broj: \n");
      v1 = input.nextInt();
      System.out.println("Unesite drugi broj: \n");
      v2 = input.nextInt();

      int suma=v1+v2;
      int razlika=v1-v2;
      int umnozak = v1*v2;
      int dijeljenje = v1/v2;
      int modul = v1%v2;
      System.out.println("Rezultat sume je: " + suma+"\n");
      System.out.println("Rezultat razlike je: " + razlika +"\n");
      System.out.println("Rezultat mnozenja je: " + umnozak +"\n");
      System.out.println("Rezultat dijeljenja je: " + dijeljenje +"\n");
      System.out.println("Ostatak pri djeljenju je: " + modul +"\n");

   }
}
    

