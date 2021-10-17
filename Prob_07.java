class Prob_07{
    public static void main(String[]args){
        int count = 0;
        int num = 10001;
        boolean z = true;
        long i = 2;

        while (z){
            z = true;
            int flag = 1;
            for (int x = 2; x<(i-1); x++){
                if (i%x == 0){
                    flag = 0;
                }                
            }
            if (flag == 1){
                count += 1;
            }

            if(count == num){
                System.out.println(i);
                z = false;
            }
            i++;
        }
    }
}