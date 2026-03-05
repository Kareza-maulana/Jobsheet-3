JAWABAN PERTANYAAN 1

Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!
TIDAK HARUS ATRIBUT DAN METHODE BISA DITAMBAHKAN KETIKA ARRAY DIINSTANSIASI
2. Apa yang dilakukan oleh kode program berikut?
```        mahasiswa[] arraymahasiswa = new mahasiswa[3];```
INSTANSIASI ARRAY OBJECT 
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
KARENA CONSTRUCTOR SECARA DEFAULT SUDAH DI GENERATE OLEH SISTEM JAVA SECARA DEFAULT
4. Apa yang dilakukan oleh kode program berikut?
```
        arraymahasiswa[1] = new mahasiswa();
        arraymahasiswa[1].nim = "987654321";
        arraymahasiswa[1].nama = "Siti";
        arraymahasiswa[1].kelas = "TI-1B";
        arraymahasiswa[1].ipk = 3.8f;
```
MENGISI SETIAP ATRIBUT PADA OBJECT 

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

KARENA SUPAYA kodenya  LEBIH MUDAH UNTUk DIMANTAIN 

JAWABAN PERTANYAAN 2

1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program
pada langkah no 3.
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?

KARENA TIDAK SINKRON ANTARA ARRAY YANG DI INSTANSIASI DENGAN ARRAY YANG DIISI

JAWABAN PERTANYAAN 3

1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
array of object Matakuliah ditentukan oleh user melalui input dengan Scanner