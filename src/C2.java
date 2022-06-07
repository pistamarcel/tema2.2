import java.util.Scanner;

public class C2 {
    Scanner scanner = new Scanner(System.in);
         System.out.println("Primul numar: ");
    int a = scanner.nextInt();
        System.out.println("Al doilea numar: ");
    int b = scanner.nextInt();
        System.out.println("Operatia: ");
    char operatie = scanner.next().trim().charAt(0);
    int totala= total( a,  b, operatie);
        if(totala==0){
        System.out.println();
    }else{
        System.out.println("Rezultatul este " + totala);}

}


    public static int total(int a, int b, char operatie) {
        int r=0;
        switch (operatie) {
            case 'a': {
                r = a + b;

                break;
            }case 's': {
                r = a - b;

                break;
            }case 'i': {
                r = a * b;

                break;
            }case 'p': {
                r = a / b;

                break;
            }case 'm': {
                r = a % b;
                if(r==0){
                    System.out.println("Rezultatul este 0");
                }
                break;

            }default: {
                System.out.println("Eroare operatia nu se poate efectua!");
            }
        }


        return r;
    }

}
