package adapter.dataoperationAdapter;

public class DataOperationAdapter implements DataOperation {
    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public DataOperationAdapter(QuickSort quickSort, BinarySearch binarySearch) {
        this.quickSort = quickSort;
        this.binarySearch = binarySearch;
    }

    @Override
    public void sort(int[] arr) {
        quickSort.quickSort(arr);
    }

    @Override
    public int search(int[] arr, int target) {
        int index = binarySearch.binarySearch(arr,target);
        return index;
    }


}
