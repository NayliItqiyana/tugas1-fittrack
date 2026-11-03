# Sistem Keanggotaan Gym FitTrack

# Identitas
* Nama: Nayli Itqiyana
* NPM: 250810701100025
* Praktikum Pemrograman Berorientasi Objek

---

# Deskripsi Singkat

FitTrack adalah aplikasi konsol berbasis bahasa pemrograman Java yang dirancang untuk membantu pengelolaan dan pendataan keanggotaan gym secara otomatis. Proyek ini dikembangkan untuk memastikan setiap data member tersimpan dengan aman melalui validasi logika yang ketat.

---

# Fitur Utama

* Penyimpanan Data Member: Menggunakan struktur array untuk menampung objek member secara terstruktur.
* Validasi Input Otomatis: Sistem secara otomatis menolak data yang tidak valid pada constructor maupun setter.
* Nilai Fallback / Default: Menyediakan nilai aman (default) apabila data yang dimasukkan pengguna mengalami penolakan validasi.
* Rekapitulasi Data Terstruktur: Menampilkan informasi member secara rapi berdasarkan atribut spesifik.

---

# Konsep OOP yang Diterapkan

* Enkapsulasi (Encapsulation): Melindungi atribut class Member menggunakan modifier private dan mengontrol aksesnya via getter dan setter ber-validasi.
* Polimorfisme (Method Overriding): Meng-override method toString() dari class Object untuk menghasilkan format cetak data yang kustom.
* Constructor Overloading: Menyediakan beberapa variasi constructor untuk fleksibilitas pembuatan objek member.
* Abstraksi Data (Abstraction): Menyembunyikan detail logika validasi di dalam class Member dari class penguji (TesFitTrack).
* Objek & Class (Objects & Classes): Menerapkan rancangan class Member sebagai blueprint untuk menciptakan multiple instance objek dalam array.

---

# Struktur Proyek

```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```
---

# Cara Menjalankan Program

1. Pastikan komputer sudah terpasang Java Development Kit (JDK).
2. Buka terminal atau command prompt pada direktori proyek.
3. Lakukan kompilasi file Java dengan perintah: `javac src/Member.java src/TesFitTrack.java`
4. Jalankan program pengujian dengan perintah: `java -cp src TesFitTrack`

---

# Output Program

```text
============================================================
SISTEM KEANGGOTAAN GYM FITTRACK
============================================================

> Skenario 1: Inisialisasi Objek & Constructor Overloading
Status : Berhasil membuat 4 objek member.

> Skenario 2: Uji Validasi Constructor (Data Invalid)
[Penolakan Validasi] Nama tidak boleh kosong atau hanya berisi spasi.
[Penolakan Validasi] Nomor telepon harus diawali angka 0 dan minimal 10 digit. Nilai '12345' ditolak.
[Penolakan Validasi] Jenis paket harus 'Basic', 'Premium', atau 'VIP'. Nilai 'SuperVIP' ditolak, otomatis diatur ke 'Basic'.

> Skenario 3: Uji Validasi Setter pada Objek Jadi
No. Telepon Awal  [member[0]] : 081234567890
[Penolakan Validasi] Nomor telepon harus diawali angka 0 dan minimal 10 digit. Nilai '12345' ditolak.
No. Telepon Akhir [member[0]] : 081234567890

> Skenario 4: Rekapitulasi Data Seluruh Member
------------------------------------------------------------
[MEMBER 01]
Nama        : Farisha
No. Telepon : 081234567890
Tgl Daftar  : 17-08-2026
Paket       : Basic
------------------------------------------------------------
[MEMBER 02]
Nama        : Raisa
No. Telepon : 085678901234
Tgl Daftar  : 18-08-2026
Paket       : Premium
------------------------------------------------------------
[MEMBER 03]
Nama        : Rahada
No. Telepon : 089876543210
Tgl Daftar  : 19-08-2026
Paket       : VIP
------------------------------------------------------------
[MEMBER 04]
Nama        : Najla
No. Telepon : 082112233445
Tgl Daftar  : 20-08-2026
Paket       : Basic
------------------------------------------------------------
[MEMBER INVALID - Fallback Nilai Default]
Nama        : Tanpa Nama
No. Telepon : 0800000000
Tgl Daftar  : 21-08-2026
Paket       : Basic
============================================================
```
