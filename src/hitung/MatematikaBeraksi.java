package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
//        membuat objeck
        Matematika rizky = new Matematika(3,4);
        
        System.out.println("Hasil penjumlahan: "+rizky.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+rizky.setPengurangan());
        System.out.println("Hasil perkalian: "+rizky.setPerkalian());
        System.out.println("Hasil pembagian: "+rizky.setPembagian());
    }
    
}
