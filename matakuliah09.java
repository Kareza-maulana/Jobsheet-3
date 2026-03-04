public class matakuliah09 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlah_jam;

    public matakuliah09(String kode, String nama, int sks, int jumlah_jam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlah_jam = jumlah_jam;
    }

    public void tambahdata(String kode, String nama, int sks, int jumlah_jam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlah_jam = jumlah_jam;
    }

    public void tampilkan() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlah_jam);
    }
}