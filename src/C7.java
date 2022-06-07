public class C7 {
      ArrayList<Integer> numere=new ArrayList<>();
        numere.add(3);
        numere.add(5);
        numere.add(7);
        numere.add(234);
        numere.add(30);
    int sum=0;
        for(int i=0; i<numere.size(); i++) {
        sum +=numere.get(i);
    }
        System.out.println("Suma elementelor este: " + sum);

}
