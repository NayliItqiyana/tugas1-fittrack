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
/**
     * Constructor tanpa paket (menggunakan constructor overloading).
     * Jenis paket otomatis diisi dengan nilai default "Basic".
     * 
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon aktif member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, DEFAULT_PAKET);
    }

/**
     * Mendapatkan nama lengkap member.
     * 
     * @return nama member
     */
    public String getNama() {
        return nama;
    }
    
/**
     * Mengubah nama member setelah melalui validasi.
     * Nama tidak boleh kosong atau hanya berisi spasi.
     * 
     * @param nama nama baru member
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("[Penolakan Validasi] Nama tidak boleh kosong atau hanya berisi spasi.");
            if (this.nama == null) {
                this.nama = "Tanpa Nama";
            }
            return;
        }
        this.nama = nama;
    }
    
/**
     * Mendapatkan nomor telepon member.
     * 
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

 /**
     * Mengubah nomor telepon member setelah melalui validasi format.
     * Wajib diawali angka 0 dan memiliki panjang minimal 10 digit.
     * 
     * @param noTelepon nomor telepon baru
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null || !noTelepon.startsWith("0") || noTelepon.length() < MIN_LENGTH_TELEPON) {
            System.out.println("[Penolakan Validasi] Nomor telepon harus diawali angka 0 dan minimal 10 digit. Nilai '" + noTelepon + "' ditolak.");
            if (this.noTelepon == null) {
                this.noTelepon = "0800000000";
            }
            return;
        }
        this.noTelepon = noTelepon;
    }
