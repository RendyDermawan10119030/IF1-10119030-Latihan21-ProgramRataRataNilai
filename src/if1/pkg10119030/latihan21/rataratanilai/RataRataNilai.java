package if1.pkg10119030.latihan21.rataratanilai;
import java.util.Scanner;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :
 */
public class RataRataNilai {
    static Scanner scan = new Scanner(System.in);
    int jumlah;
    int nilai[];
    
    private void masukkanJumlah(){
        System.out.print("Masukkan Banyak Mahasiswa : ");
        jumlah = scan.nextInt();
    }
    private void masukkanNilai(){
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
                System.out.print("Nilai Mahasiswa ke-"+(i+1)+" : ");
                nilai[i] = scan.nextInt();
            }
        }
    private double hitungRataRata(){
        double hasil = 0;
        for(int x : nilai){
            hasil += x;
        }
        hasil = hasil/ nilai.length;
        return hasil;
    }
    private void tampilRataRata(double rata){
            System.out.println ("Rata-rata Nilainya adalah "+rata);
    }
    public static void main(String[] args) {
        RataRataNilai data = new RataRataNilai();
        data.masukkanJumlah();
        data.masukkanNilai();
        data.tampilRataRata(data.hitungRataRata());
        System.out.println("(Developed by : Rendy Dermawan)");
    }
}
