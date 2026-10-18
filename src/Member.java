/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */

public class Member {
    // Konstanta untuk validasi (menghindari magic number & magic string)
    private static final int MIN_LENGTH_TELEPON = 10;
    private static final String DEFAULT_PAKET = "Basic";

    // Atribut class
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

/**
     * Constructor lengkap untuk menginisialisasi seluruh atribut member.
     * Menggunakan setter untuk memastikan validasi diterapkan.
     * 
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon aktif member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket    jenis paket keanggotaan
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }
