# Sistem Keanggotaan Gym FitTrack

# Identitas
* Nama: Nayli Itqiyana
* NPM: 250810701100025
* Praktikum Pemrograman Berorientasi Objek A

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

| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan |
| :--- | :--- | :--- |
| **Enkapsulasi (Encapsulation)** | Atribut (`private`) serta method *getter* dan *setter* di class `Member` | Melindungi atribut agar tidak diakses atau diubah secara sembarangan, serta memastikan setiap perubahan data wajib melalui validasi ketat. |
| **Polimorfisme (Method Overriding)** | Method `toString()` di class `Member` | Meng-*override* method bawaan dari class `Object` untuk menghasilkan format cetak informasi objek yang kustom, rapi, dan berlabel. |
| **Constructor Overloading** | Constructor berparameter lengkap dan constructor tanpa paket di class `Member` | Memberikan fleksibilitas dalam instansiasi objek, di mana constructor tanpa paket otomatis mengeset nilai *default* `Basic` via pemanggilan `this(...)`. |
| **Abstraksi Data (Abstraction)** | Logika validasi di dalam class `Member` | Menyembunyikan detail kompleksitas validasi data dari class penguji (`TesFitTrack`), sehingga class utama cukup menggunakan method yang tersedia tanpa tahu proses rumit di dalamnya. |
| **Objek & Class (Objects & Classes)** | Class `Member` dan array objek pada class `TesFitTrack` | Menerapkan rancangan class `Member` sebagai *blueprint* untuk menciptakan beberapa *instance* objek yang disimpan dan dikelola secara terstruktur di dalam array. |

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

# Prasyarat

- **Java Development Kit (JDK)**: Versi 21.
- **IDE / Editor**: Visual Studio Code atau IntelliJ IDEA dengan ekstensi Java Support.

----

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
---

# Nilai Default

Jika data yang dimasukkan saat pembuatan objek atau perubahan atribut melanggar aturan validasi, sistem tidak akan menghentikan program melainkan menggunakan nilai default yang aman berikut:
- **Nama**: Otomatis diatur menjadi `"Tanpa Nama"` jika kosong atau hanya berisi spasi.
- **Nomor Telepon**: Otomatis diatur menjadi `"0800000000"` jika format salah (tidak diawali angka 0 atau kurang dari 10 digit).
- **Tanggal Daftar**: Otomatis diatur menjadi `"01-01-2026"` jika kosong.
- **Jenis Paket**: Otomatis diatur menjadi `"Basic"` jika di luar pilihan Basic, Premium, atau VIP.

---

# Batasan dan Pengembangan Lanjutan

- **Batasan**: Sistem saat ini masih berjalan secara *offline* di konsol terminal dan penyimpanan data bersifat sementara (*in-memory* array) selama program berjalan, belum terhubung ke *database* eksternal.
- **Pengembangan Lanjutan**: Dapat dikembangkan menggunakan penyimpanan berbasis *database* (seperti MySQL menggunakan JDBC), penambahan antarmuka grafis (GUI), serta fitur pencarian dan pembaruan data member secara interaktif.
---
