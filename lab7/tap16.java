public class tap16 {

    public static int maxX(int[] a){
        int max=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>max) max=a[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a=new int[10];

        for(int i=0;i<10;i++){
            a[i]=(int)(Math.random()*50);
        }

        System.out.println("Max: "+maxX(a));
    }
}