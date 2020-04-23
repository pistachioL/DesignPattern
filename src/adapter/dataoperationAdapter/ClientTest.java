package adapter.dataoperationAdapter;

public class ClientTest {
    public static void main(String[] args){
        DataOperation dataOperation = new DataOperationAdapter(new QuickSort(),new BinarySearch());
        int[] arr = {15,3,8,2,7,4,10,9};
        System.out.println("实现二分查找");
        int index = dataOperation.search(arr,4);
        System.out.println("目标寻找的数字2的数组下标为"+index);

        System.out.println("排序前的数组：");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("快排后的数组：");
        dataOperation.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
}
