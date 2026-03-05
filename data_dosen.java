public class data_dosen {

   void datasemuadosen(dosen [] arrayDosen) {
        for (int i = 0; i < arrayDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode: " + arrayDosen[i].kode);
            System.out.println("Nama: " + arrayDosen[i].nama);
            System.out.println("Jenis Kelamin: " + (arrayDosen[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Umur: " + arrayDosen[i].umur);
            System.out.println("------------------------------------");
            System.out.println();
        }
    }

    void jumlahdosenperjeniskelamin(dosen[] arrayDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].jenisKelamin) {
                jumlahLakiLaki++;
            } else {
                jumlahPerempuan++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki: " + jumlahLakiLaki);
        System.out.println("Jumlah Dosen Perempuan: " + jumlahPerempuan);
    }

    void rataumur(dosen[] arrayDosen) {
        int totalUmur = 0;

        for (int i = 0; i < arrayDosen.length; i++) {
            totalUmur += arrayDosen[i].umur;
        }

        double rataRataUmur = (double) totalUmur / arrayDosen.length;
        System.out.println("Rata-rata Umur Dosen: " + rataRataUmur);
    }

    void info_dosen_tertua(dosen[] arrayDosen) {
        int maxUmur = 0;
        String namaDosenTertua = "";

        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].umur > maxUmur) {
                maxUmur = arrayDosen[i].umur;
                namaDosenTertua = arrayDosen[i].nama;
            }
        }

        System.out.println("Dosen Tertua: " + namaDosenTertua + " dengan umur " + maxUmur);
    }

    void info_dosen_termuda(dosen[] arrayDosen) {
        int minUmur = Integer.MAX_VALUE;
        String namaDosenTermuda = "";

        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].umur < minUmur) {
                minUmur = arrayDosen[i].umur;
                namaDosenTermuda = arrayDosen[i].nama;
            }
        }

        System.out.println("Dosen Termuda: " + namaDosenTermuda + " dengan umur " + minUmur);
    }
}