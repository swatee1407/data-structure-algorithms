/**
 * Created by Swati Tewari on 10/20/2022
 */
public class BubbleSortAlgo {

    public static void main(String[] args) {
        int[] list = new int[]{5,8,1,6,2,9};
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list){
        int i,j,temp=0;
        for(i=0;i<list.length-1;i++){
            for(j=i+1;j<list.length-1-i;j++){ //second loop runs until the elements already sorted
                if(list[j] > list[j+1]){
                    //swap the elements
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        for(int k=0;k<list.length;k++){
            System.out.print(list[k]);
            System.out.print("\n");
        }
    }

}
