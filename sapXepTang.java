public class sapXepTang {
    public static void main(String[] args) {
        int arr[] = {3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6};
        int trungGian;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    trungGian = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = trungGian;
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
//sắp xếp theo thứ tự tăng dần các phần tử trong mảng