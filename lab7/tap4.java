public class tap4 {
    public static void main(String[] args) {
        double[] C=new double[25];
        double p=1;

        for(int i=0;i<25;i++){
            C[i]=Math.random()*20-10;
            if(C[i]>0){
                p*=C[i];
            }
        }

        System.out.println("Көбейтінді: "+p);
    }
}