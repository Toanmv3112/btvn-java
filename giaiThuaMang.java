public class giaiThuaMang {
    public static void main(String[] args) {
        int giaiThua=1;
        int arr[] = {3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j=1;j<=arr[i];j++) {
                giaiThua *=j;
            }
            System.out.println("Giai thừa của "+arr[i]+ " là: "+giaiThua);
            giaiThua=1;
        }
    }
}
//cho 1 mảng, tính giai thừa các phần tử trong mảng