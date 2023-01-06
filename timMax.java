public class timMax {
    public static void main(String[] args) {
        int arr[] = {3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6};
        int max= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất là: "+max);
    }
}
//tìm giá trị lớn nhất trong mảng