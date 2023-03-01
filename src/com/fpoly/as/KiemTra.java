package com.fpoly.as;

public class KiemTra {

    public boolean ktMA(String sn){
        String KiemTra = "[a-zA-Z]{2}\\d{5}"; 
        return sn.matches(KiemTra);
    }
   

    public boolean ktTen(String sn) {
        String KiemTra = "[a-zA-Z\\s]{1,30}";
        return sn.matches(KiemTra);
    }
    
}
