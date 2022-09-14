package pendaftaran;

import java.util.Scanner;
public class pnjmlhn {
    public static void main(String [] args) {
        String nama;
        int nilai;
        String keterangan;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan Nama:  ");
        nama = inp.next();
        System.out.print("Masukan nilai: ");
        nilai =inp.nextInt();
        if (nilai>=60) {
            keterangan= "Lulus";
        }
        else{
            keterangan= "Tidak Lulus";
        }
          System.out.println("Nama         :" + nama);
          System.out.println("Keterangan   :" + keterangan);
    }
}
