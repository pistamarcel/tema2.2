public class C5 {
    double[] n= new double[8];
    n=new double []{1.2, 4.3, 4.5, 10.3, 5.5, 2.5, 3.5, 1.5};


        System.out.println("Afisare double: ");
        for( int i = 0; i<n.length; i++){
        if(n[i]==4.5){
            System.out.println(n[i]);
        } else if (n[i]>5) {
            System.out.println(" Mai mare decat 5: "+ n[i]);

        }else{
            System.out.println();
        }
    }


}


