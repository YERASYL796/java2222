public class tap3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        double p = 1;

        for(int i=0;i<12;i++){
            A[i]=Math.random()*20-10;
            if(A[i]<0){
                p*=A[i];
            }
        }

        System.out.println("Көбейтінді: "+p);
    }
}