import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı girin:");
        int satir = input.nextInt();

        for(int i =1; i<=satir; i++){
            for (int j=1 ; j<= i ; j++){
                System.out.print(" ");
            }
            for (int j=1 ; j<= (2*(satir-i))-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
