import java.util.Scanner;

public class CountPair {

    public static boolean Pair(int[] array, int k){
        int size = array.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size; j++){
                if(array[i]+array[j]== k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        if(Pair(array, k)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
