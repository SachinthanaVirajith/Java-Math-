class Prob_05{
    public static void main(String[]args){
    int x = 11;
    int y = 1;
    int flag = 1;
    boolean z = true;
    while (z){
        z = true;    

        while(y<=10){
            if (x%y==0){
                flag +=1;
            }
            y += 1;
        }

        if (flag == 10){
            System.out.println(x);
            z = false;
        }
        x += 1;
    }
    }
}