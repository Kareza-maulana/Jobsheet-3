import java.util.Scanner;

public class matakuliahmain09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukann jumlah mata kuliah: ");
        int jumlah_matkul = input.nextInt();
        matakuliah09[] arraymatakuliah = new matakuliah09[jumlah_matkul];
        String kode, nama;
        int sks, jumlah_jam;


        for(int i = 0; i < arraymatakuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = input.nextLine();
            System.out.print("Nama: ");
            nama = input.nextLine();
            System.out.print("SKS: ");
            sks = input.nextInt();
            System.out.print("Jumlah Jam: ");
            jumlah_jam = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            arraymatakuliah[i] = new matakuliah09(kode, nama, sks, jumlah_jam);
        }

        for (int i = 0; i < arraymatakuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode: " + arraymatakuliah[i].kode);
            System.out.println("Nama: " + arraymatakuliah[i].nama);
            System.out.println("SKS: " + arraymatakuliah[i].sks);
            System.out.println("Jumlah Jam: " + arraymatakuliah[i].jumlah_jam);
            System.out.println("------------------------------------");
            System.out.println();
        }
    }
}
