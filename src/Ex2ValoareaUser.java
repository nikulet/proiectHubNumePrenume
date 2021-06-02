import java.util.Scanner;

public class Ex2ValoareaUser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of week: ");
        int nr=scanner.nextInt();
        int[] save=new int[1];
        for (int i=0;i<save.length;i++){
            save[i]=nr;
        }
        switch (nr){
            case 1:
                System.out.println("luni");
                break;
            case 2:
                System.out.println("marti");
                break;
            case 3:
                System.out.println("mercuri");
                break;
            case 4:
                System.out.println("joi");
                break;
            case 5:
                System.out.println("vineri");
                break;
            case 6:
                System.out.println("simbata");
                break;
            case 7:
                System.out.println("duminica");
                break;
            default:
                System.out.println("Aceata nu este o zi a saptamini.");
        }
    }
}
