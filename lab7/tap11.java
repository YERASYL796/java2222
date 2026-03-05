public class tap11 {
    public static void main(String[] args) {
        int[] A=new int[25];
        int max=0,min=0;

        for(int i=0;i<25;i++){
            A[i]=(int)(Math.random()*100);
        }

        for(int i=1;i<25;i++){
            if(A[i]>A[max]) max=i;
            if(A[i]<A[min]) min=i;
        }

        int t=A[max];
        A[max]=A[min];
        A[min]=t;
    }
}