
public class mahasiswademo09 {
    
    public static void main(String[] args) {
        mahasiswa[] arraymahasiswa = new mahasiswa[3];
        arraymahasiswa[0] = new mahasiswa();
        arraymahasiswa[0].nim = "123456789";
        arraymahasiswa[0].nama = "Budi";
        arraymahasiswa[0].kelas = "TI-1A";
        arraymahasiswa[0].ipk = 3.5f;

        arraymahasiswa[1] = new mahasiswa();
        arraymahasiswa[1].nim = "987654321";
        arraymahasiswa[1].nama = "Siti";
        arraymahasiswa[1].kelas = "TI-1B";
        arraymahasiswa[1].ipk = 3.8f;

        arraymahasiswa[2] = new mahasiswa();
        arraymahasiswa[2].nim = "456789123";
        arraymahasiswa[2].nama = "Andi";
        arraymahasiswa[2].kelas = "TI-1C";

        for (int i = 0; i < arraymahasiswa.length; i++) {
            System.out.println("NIM: " + arraymahasiswa[i].nim);
            System.out.println("Nama: " + arraymahasiswa[i].nama);
            System.out.println("Kelas: " + arraymahasiswa[i].kelas);
            System.out.println("IPK: " + arraymahasiswa[i].ipk);
            System.out.println();
        }
    }
}