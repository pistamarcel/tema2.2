public class C6 {

    int[] n= new int[9];
    n=new int []{0,1,2,3,4,5,6,7,8};


        System.out.println("Afisare int: ");
        for( int i = 0; i<n.length; i++){
        if(i==2){
            i++;
            System.out.println("Saritura de la 2;__ " +n[i]);
        } else if (i==7) {
            break;

        }else{
            System.out.println("Index valid. " +n[i]);
        }
    }
}
