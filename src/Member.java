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
