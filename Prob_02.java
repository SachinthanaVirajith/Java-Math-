class Prob_02{
    public static void main(String[]args){
        int x = 1;
        int y = 2;
        int temp, tot = 0;
        while (y<4000000){
            temp = y;
            y = y+x;
            x = temp;
            
            if (y%2==0){
                tot += y;
            }
            
        }

        System.out.println(tot);
    }
}