//import Java.util.Scanner;

class Prob_06{
    public static void main(String[]args){
    double tot1 = 0; 
    double tot2 = 0; 
    double dif = 0;
    int lim = 100;

    for (int i = 1; i<=lim; i++){
        tot1 += Math.pow(i, 2);
        tot2 += i;
    }

    tot2 = Math.pow(tot2, 2);
    dif = tot2 - tot1;
    System.out.println(dif);
    } 
}