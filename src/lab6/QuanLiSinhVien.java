package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiSinhVien {
    public static void main(String[] args) {
        ArrayList<String> sv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("nhập họ tên sinh viên");
            String name = sc.next();
            sv.add(name);
            System.out.println("bạn có muốn nhập thêm không Y/N");
            String choose = sc.next();
            if(choose.equalsIgnoreCase("N")){
                break;
            }
        }

        for (String e : sv) {

        }
    }
}

