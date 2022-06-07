import java.util.Scanner;
import java.util.Random;

public class C1 {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
        System.out.println("Numarul tau este: ");
    int a = scanner.nextInt();

    int b = rand.nextInt(100);
        System.out.println("Numarul random este "+b );

        if(a>b){
        System.out.println("Numarul introdus este mai mic decat " + b);
    }else{        System.out.println();    }

}
