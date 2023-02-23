package lab8;

public class Main {

    public static void main(String[] args) {

        // Tính tổng các số
        double sum = XPoly.sum(1, 2, 3, 4, 5);
        System.out.println("Tổng: " + sum); // Output: Tổng: 15.0

        // Tìm số nhỏ nhất
        double min = XPoly.min(10, 5, 20, 8);
        System.out.println("Số nhỏ nhất: " + min); // Output: Số nhỏ nhất: 5.0

        // Tìm số lớn nhất
        double max = XPoly.max(10, 5, 20, 8);
        System.out.println("Số lớn nhất: " + max); // Output: Số lớn nhất: 20.0

        // Chuyển đổi ký tự đầu tiên của từ sang ký tự hoa
        String s = "nguyen van teo";
        String upper = XPoly.toUpperFirstChar(s);
        System.out.println("Kết quả: " + upper); // Output: Kết quả: Nguyen Van Teo
    }
}
