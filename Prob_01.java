class Prob_01{
    public static void main(String[]args){

        int tot = 0;
        for (int i=0; i<1000; i++){
            if (i%3==0 || i%5==0){
                tot += i;
            }
        }
        System.out.println(tot);
    }
}