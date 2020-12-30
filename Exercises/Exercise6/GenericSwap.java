public class GenericSwap {
    public static void main(String[] args) {
        Integer[] iList = { 1, 2, 3, 4 };
        swap(iList, 1, 2);
        for (Integer i : iList) {
            System.out.println(i);
        }

        Character[] cList = { 'A', 'B', 'C', 'D' };
        swap(cList, 1, 2);
        for (Character i : cList) {
            System.out.println(i);
        }
    }

    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
