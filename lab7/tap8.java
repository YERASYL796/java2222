public class tap8 {
    public static void main(String[] args) {
        double[][] A=new double[12][6];
        double[] p=new double[6];

        for(int j=0;j<6;j++) p[j]=1;

        for(int i=0;i<12;i++){
            for(int j=0;j<6;j++){
                A[i][j]=Math.random()*20-10;
                if(A[i][j]<0){
                    p[j]*=A[i][j];
                }
            }
        }

        for(int j=0;j<6;j++){
            System.out.println(p[j]);
        }
    }
}