import java.util.Scanner;
public class mahasiswademo09 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mahasiswa[] arraymahasiswa = new mahasiswa[3];
        arraymahasiswa[0] = new mahasiswa();
        arraymahasiswa[0].nim = input.nextLine();
        arraymahasiswa[0].nama = input.nextLine();
        arraymahasiswa[0].kelas = input.nextLine();
        arraymahasiswa[0].ipk = input.nextFloat();

        arraymahasiswa[1] = new mahasiswa();
        arraymahasiswa[1].nim = input.nextLine();
        arraymahasiswa[1].nama = input.nextLine();
        arraymahasiswa[1].kelas = input.nextLine();
        arraymahasiswa[1].ipk = input.nextFloat();

        arraymahasiswa[2] = new mahasiswa();
        arraymahasiswa[2].nim = input.nextLine();
        arraymahasiswa[2].nama = input.nextLine();
        arraymahasiswa[2].kelas = input.nextLine();
        arraymahasiswa[2].ipk = input.nextFloat();

        for (int i = 0; i < arraymahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM: " + arraymahasiswa[i].nim);
            System.out.println("Nama: " + arraymahasiswa[i].nama);
            System.out.println("Kelas: " + arraymahasiswa[i].kelas);
            System.out.println("IPK: " + arraymahasiswa[i].ipk);
            System.out.println("------------------------------------");
            System.out.println();
        }
    }
}