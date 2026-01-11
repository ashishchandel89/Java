//arraycopy.
public class a34{
    public static void main(String args[]){
        String arr1[]={"a","b","c","d"};
        String arr2[]={"e","f","g","h"};
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        int i;
        for(i=0;i<4;i++){
            System.out.println("array1 position: "+i+"value: "+arr1[i]);
            System.out.println("array2 position: "+i+"value: "+arr2[i]);
        }
    }
}