import java.util.Scanner;

public class dosendemo09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah dosen: ");
        int jumlahDosen = input.nextInt();
        dosen[] arrayDosen = new dosen[jumlahDosen];
        for (int i = 0; i < arrayDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = input.next();
            System.out.print("Nama: ");
            String nama = input.next();
            System.out.print("Jenis Kelamin (true untuk laki-laki, false untuk perempuan): ");
            boolean jenisKelamin = input.nextBoolean();
            System.out.print("Umur: ");
            int umur = input.nextInt();

            arrayDosen[i] = new dosen(kode, nama, jenisKelamin, umur);

            for (int j = 0; j < arrayDosen.length; j++) {
                System.out.println("Data Dosen ke-" + (j + 1));
                System.out.println("Kode: " + arrayDosen[j].kode);
                System.out.println("Nama: " + arrayDosen[j].nama);
                System.out.println("Jenis Kelamin: " + (arrayDosen[j].jenisKelamin ? "Laki-laki" : "Perempuan"));
                System.out.println("Umur: " + arrayDosen[j].umur);
                System.out.println("------------------------------------");
                System.out.println();
            }
        }
    }
}
