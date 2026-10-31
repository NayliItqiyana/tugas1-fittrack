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
        System.out.println("=== SISTEM KEANGGOTAAN GYM FITTRACK ===");
        System.out.println("---------------------------------------");

    // 1. Ciptakan minimal 4 objek Member dan simpan dalam satu array bertipe Member
        Member[] daftarMember = new Member[4];

        System.out.println("\n--- Skenario 1: Inisialisasi Objek & Constructor Overloading ---");
        daftarMember[0] = new Member("Budi Santoso", "081234567890", "17-08-2026", "Basic");
        daftarMember[1] = new Member("Siti Aminah", "085678901234", "18-08-2026", "Premium");
        daftarMember[2] = new Member("Ahmad Fauzi", "089876543210", "19-08-2026", "VIP");
        daftarMember[3] = new Member("Dewi Lestari", "082112233445", "20-08-2026");

        System.out.println("\n--- Skenario 2: Sengaja Memasukkan Data Tidak Valid pada Constructor ---");
        Member memberInvalid = new Member("   ", "12345", "21-08-2026", "SuperVIP");
