/**
 * Class pengujian utama untuk menjalankan sistem pendataan Gym FitTrack.
 * Uji pembuatan objek, validasi, dan perulangan array.
 */
public class TesFitTrack {
    /**
     * Method utama program.
     * 
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("         SISTEM KEANGGOTAAN GYM FITTRACK          ");
        System.out.println("==================================================");

        // 1. Inisialisasi Objek Member
        Member[] daftarMember = new Member[4];

        System.out.println("\n> Skenario 1: Inisialisasi Objek & Constructor Overloading");
        daftarMember[0] = new Member("Farisha", "081234567890", "17-08-2026", "Basic");
        daftarMember[1] = new Member("Raisa", "085678901234", "18-08-2026", "Premium");
        daftarMember[2] = new Member("Rahada", "089876543210", "19-08-2026", "VIP");
        daftarMember[3] = new Member("Najla", "082112233445", "20-08-2026");
        System.out.println("  Status : Berhasil membuat 4 objek member.");

        // 2. Pengujian Constructor Invalid
        System.out.println("\n> Skenario 2: Uji Validasi Constructor (Data Invalid)");
        Member memberInvalid = new Member("   ", "12345", "21-08-2026", "SuperVIP");

        // 3. Pengujian Setter Invalid
        System.out.println("\n> Skenario 3: Uji Validasi Setter pada Objek Jadi");
        System.out.println("  No. Telepon Awal  [member[0]] : " + daftarMember[0].getNoTelepon());
        daftarMember[0].setNoTelepon("12345"); // Input tidak valid
        System.out.println("  No. Telepon Akhir [member[0]] : " + daftarMember[0].getNoTelepon());

        // 4. Looping Cetak Data Member
        System.out.println("\n> Skenario 4: Rekapitulasi Data Seluruh Member");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println("  [MEMBER 0" + (i + 1) + "]");
            System.out.println("    Nama         : " + daftarMember[i].getNama());
            System.out.println("    No. Telepon  : " + daftarMember[i].getNoTelepon());
            System.out.println("    Tgl Daftar   : " + daftarMember[i].getTanggalDaftar());
            System.out.println("    Paket        : " + daftarMember[i].getJenisPaket());
            System.out.println("--------------------------------------------------");
        }

        // Rekap Objek Invalid
        System.out.println("  [MEMBER INVALID - Fallback Nilai Default]");
        System.out.println("    Nama         : " + memberInvalid.getNama());
        System.out.println("    No. Telepon  : " + memberInvalid.getNoTelepon());
        System.out.println("    Tgl Daftar   : " + memberInvalid.getTanggalDaftar());
        System.out.println("    Paket        : " + memberInvalid.getJenisPaket());
        System.out.println("==================================================");
    }
}
