import java.util.Scanner;

public class formLoginbaru {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int mainChoice;
        boolean isLoggedin = false;
        while (isLoggedin == false) {
            System.out.println("===============================================");
            System.out.println("| Selamat datang di Sistem Reservasi Puskesmas |");
            System.out.println("===============================================");
            System.out.println("| 1. Admin                                     |");
            System.out.println("| 2. Keluar                                    |");
            System.out.println("===============================================");
            System.out.print("Pilih tipe pengguna: ");
            mainChoice = input.nextInt();
            if (mainChoice == 1) {
                System.out.print("Masukkan username admin: ");
                String username = input.next();
                System.out.print("Masukkan password admin: ");
                String password = input.next();
                if (username.equals("admin1") && password.equals("adminsatu")) {
                    int adminChoice;

                    System.out.println("Login berhasil.");
                    boolean isNewData = false;
                    while (isNewData == false) {
                        System.out.println("==========================================================");
                        System.out.println("|    Selamat datang " + username + " di Sistem Reservasi Puskesmas  |");
                        System.out.println("==========================================================");
                        System.out.println("| 1. Reservasi Baru                                       |");
                        System.out.println("| 2. Lihat History Reservasi                              |");
                        System.out.println("| 3. Keluar                                               |");
                        System.out.println("==========================================================");
                        isLoggedin = true;
                        System.out.print("Pilih menu: ");
                        adminChoice = input.nextInt();

                        if (adminChoice == 1) {
                            // Menu Reservasi Baru
                            System.out.println("Anda memilih menu Reservasi Baru.");
                            // membuat variable string atau karakter
                            String noKtp, noBpjs, namaPasien, KeluhanPasien, kategoriPasien, noKartu;
                            char statusbpjs, pembayaran;

                            // membuat varible int berupa angka yang memerlukan perhitungan
                            int usiaPasien, potonganBpjs, harga, hargaAkhir;

                            System.out.println("Selamat Datang Di Rumah Sakit X - Admin");
                            System.out.println("Masukkan Data Pasien");
                            System.out.println("");

                            // membuat inputan data pasien untuk admin
                            System.out.print("No KTP                      :");
                            noKtp = sc.nextLine();

                            // penambahan fitur pasien BPJS
                            System.out.println("Apakah pasien memiliki kartu BPJS (0 = ya, 1 = tidak)? ");
                            statusbpjs = sc.next().charAt(0);

                            if (statusbpjs == '0') {
                                noBpjs = sc.nextLine();
                                System.out.print("Masukkan No.BPJS pasien     : ");
                                noBpjs = sc.nextLine();
                                potonganBpjs = 100;
                            } else {
                                potonganBpjs = 0;
                                namaPasien = sc.nextLine();
                            }

                            System.out.print("Nama                        : ");
                            namaPasien = sc.nextLine();

                            // usia menggunakan ifelse menentukan biaya konsultasi atau berobat
                            System.out.print("Usia                        : ");
                            usiaPasien = sc.nextInt();
                            if (usiaPasien <= 17) {
                                kategoriPasien = "A-Anak";
                                harga = 5000;
                            } else {
                                kategoriPasien = "D-Dewasa";
                                harga = 10000;
                            }

                            KeluhanPasien = sc.nextLine();
                            System.out.print("Keluhan                     : ");
                            KeluhanPasien = sc.nextLine();
                            System.out.println("==============Daftar Dokter=============");
                            System.out.println("| 1. Dokter Umum                        |");
                            System.out.println("| 2. Dokter Gigi                        |");
                            System.out.println("| 3. Bidan                              |");
                            System.out.println("| 4. perawat                            |");
                            System.out.println("| 5. petugas lab                        |");
                            System.out.println("| 6. tenaga gizi                        |");
                            System.out.println("Pilih nomor dokter yang dibutuhkan pasien : ");
                            int pemilihan = sc.nextInt();

                            switch (pemilihan) {
                                case 1:
                                    System.out.println("Dokter Umum - Konsultansi " + KeluhanPasien);
                                    break;
                                case 2:
                                    System.out.println("Dokter Gigi - Konsultansi " + KeluhanPasien);
                                    break;
                                case 3:
                                    System.out.println("Bidan - Konsultansi " + KeluhanPasien);
                                    break;
                                case 4:
                                    System.out.println("Perawat - Konsultansi " + KeluhanPasien);
                                    break;
                                case 5:
                                    System.out.println("Petugas Lab - Konsultansi " + KeluhanPasien);
                                    break;
                                case 6:
                                    System.out.println("Tenaga Gizi - Konsultansi " + KeluhanPasien);
                                    break;

                                default:
                                    System.out.println("Inputan tidak valid!");
                                    break;
                            }
                            System.out.println("--------------------------------------------------");

                            // potongan BPJS pada puskesmas 100%
                            System.out.println("Potongan BPJS(%)            : " + potonganBpjs);
                            // harga di tentukan sesuai kategori usia pasien
                            System.out.println("Harga                       : " + harga);

                            // memproses perhitungan pembayaran
                            hargaAkhir = harga - (harga * potonganBpjs / 100);
                            System.out.println("--------------------------------------------------");
                            System.out.println("Harga Akhir                 :" + hargaAkhir);

                            // pembayaran debit atau tunai by fauzi
                            System.out.println("Metode pembayaran menggunakan(1 = debit, 2 = tunai)? ");
                            pembayaran = sc.next().charAt(0);

                            if (pembayaran == '1') {
                                noKartu = sc.nextLine();
                                System.out.print("Masukan nomor kartu debit :");
                                noKartu = sc.nextLine();

                            } else {
                                System.out.println("Pembayaran menggunakan uang tunai - Lunas");
                            }
                        } else if (adminChoice == 2) {
                            // Menu Lihat Jadwal Reservasi
                            System.out.println("Anda memilih menu Lihat History Reservasi.");
                            // Tambahkan kode untuk melihat jadwal reservasi
                        } else if (adminChoice == 3) {
                            // Keluar dari akun admin
                            System.out.println("Anda telah keluar dari akun admin.");
                            isLoggedin = false;
                            isNewData = true;
                        } else {
                            // Jika input tidak valid
                            isLoggedin = false;
                            System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                        }
                    }
                } else if (username.equals("admin2") && password.equals("admindua")) {
                    int adminChoice;

                    System.out.println("login berhasil.");
                    boolean isNewData = false;
                    while (isNewData == false) {
                        System.out.println("=========================================================");
                        System.out.println("|    Selamat datang " + username + " di Sistem Reservasi Puskesmas    |");
                        System.out.println("=========================================================");
                        System.out.println("| 1. Reservasi Baru                                      |");
                        System.out.println("| 2. Lihat History Reservasi                             |");
                        System.out.println("| 3. Keluar                                              |");
                        System.out.println("=========================================================");
                        isLoggedin = true;
                        System.out.print("Pilih menu: ");
                        adminChoice = input.nextInt();

                        if (adminChoice == 1) {
                            // Menu Reservasi Baru
                            System.out.println("Anda memilih menu Reservasi Baru.");
                            // membuat variable string atau karakter
                            String noKtp, noBpjs, namaPasien, KeluhanPasien, kategoriPasien, noKartu;
                            char statusbpjs, pembayaran;

                            // membuat varible int berupa angka yang memerlukan perhitungan
                            int usiaPasien, potonganBpjs, harga, hargaAkhir;

                            System.out.println("Selamat Datang Di Rumah Sakit X - Admin");
                            System.out.println("Masukkan Data Pasien");
                            System.out.println("");

                            // membuat inputan data pasien untuk admin
                            System.out.print("No KTP                      :");
                            noKtp = sc.nextLine();

                            // penambahan fitur pasien BPJS
                            System.out.println("Apakah pasien memiliki kartu BPJS (0 = ya, 1 = tidak)? ");
                            statusbpjs = sc.next().charAt(0);

                            if (statusbpjs == '0') {
                                noBpjs = sc.nextLine();
                                System.out.print("Masukkan No.BPJS pasien     : ");
                                noBpjs = sc.nextLine();
                                potonganBpjs = 100;
                            } else {
                                potonganBpjs = 0;
                                namaPasien = sc.nextLine();
                            }

                            System.out.print("Nama                        : ");
                            namaPasien = sc.nextLine();

                            // usia menggunakan ifelse menentukan biaya konsultasi atau berobat
                            System.out.print("Usia                        : ");
                            usiaPasien = sc.nextInt();
                            if (usiaPasien <= 17) {
                                kategoriPasien = "A-Anak";
                                harga = 5000;
                            } else {
                                kategoriPasien = "D-Dewasa";
                                harga = 10000;
                            }

                            KeluhanPasien = sc.nextLine();
                            System.out.print("Keluhan                     : ");
                            KeluhanPasien = sc.nextLine();
                            System.out.println("==============Daftar Dokter=============");
                            System.out.println("| 1. Dokter Umum                        |");
                            System.out.println("| 2. Dokter Gigi                        |");
                            System.out.println("| 3. Bidan                              |");
                            System.out.println("| 4. perawat                            |");
                            System.out.println("| 5. petugas lab                        |");
                            System.out.println("| 6. tenaga gizi                        |");
                            System.out.println("Pilih nomor dokter yang dibutuhkan pasien : ");
                            int pemilihan = sc.nextInt();

                            switch (pemilihan) {
                                case 1:
                                    System.out.println("Dokter Umum - Konsultansi " + KeluhanPasien);
                                    break;
                                case 2:
                                    System.out.println("Dokter Gigi - Konsultansi " + KeluhanPasien);
                                    break;
                                case 3:
                                    System.out.println("Bidan - Konsultansi " + KeluhanPasien);
                                    break;
                                case 4:
                                    System.out.println("Perawat - Konsultansi " + KeluhanPasien);
                                    break;
                                case 5:
                                    System.out.println("Petugas Lab - Konsultansi " + KeluhanPasien);
                                    break;
                                case 6:
                                    System.out.println("Tenaga Gizi - Konsultansi " + KeluhanPasien);
                                    break;

                                default:
                                    System.out.println("Inputan tidak valid!");
                                    break;
                            }
                            System.out.println("--------------------------------------------------");

                            // potongan BPJS pada puskesmas 100%
                            System.out.println("Potongan BPJS(%)            : " + potonganBpjs);
                            // harga di tentukan sesuai kategori usia pasien
                            System.out.println("Harga                       : " + harga);

                            // memproses perhitungan pembayaran
                            hargaAkhir = harga - (harga * potonganBpjs / 100);
                            System.out.println("--------------------------------------------------");
                            System.out.println("Harga Akhir                 :" + hargaAkhir);

                            // pembayaran debit atau tunai by fauzi
                            System.out.println("Metode pembayaran menggunakan(1 = debit, 2 = tunai)? ");
                            pembayaran = sc.next().charAt(0);

                            if (pembayaran == '1') {
                                noKartu = sc.nextLine();
                                System.out.print("Masukan nomor kartu debit :");
                                noKartu = sc.nextLine();

                            } else {
                                System.out.println("Pembayaran menggunakan uang tunai - Lunas");
                            }
                        } else if (adminChoice == 2) {
                            // Menu Lihat Jadwal Reservasi
                            System.out.println("Anda memilih menu Lihat History Reservasi.");
                            // Tambahkan kode untuk melihat jadwal reservasi
                        } else if (adminChoice == 3) {
                            // keluar dari akun admin
                            isLoggedin = false;
                            isNewData = true;
                            System.out.println("Anda telah keluar dari akun " + username + ".");
                        } else {
                            // Jika input tidak valid
                            isLoggedin = false;
                            System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                        }
                    }
                } else {
                    // Jika login gagal
                    System.out.println("Login gagal. Username atau password salah.");
                    isLoggedin = false;
                }
            } else if (mainChoice == 2) {
                // Keluar dari program
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                // Jika input tidak valid
                System.out.println("Pilihan tidak valid. Silakan pilih tipe pengguna yang benar.");
            }
        }
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int mainChoice;
        boolean isLoggedin = false;
        while (isLoggedin == false) {
            System.out.println("===============================================");
            System.out.println("| Selamat datang di Sistem Reservasi Puskesmas |");
            System.out.println("===============================================");
            System.out.println("| 1. Admin                                     |");
            System.out.println("| 2. Keluar                                    |");
            System.out.println("===============================================");
            System.out.print("Pilih tipe pengguna: ");
            mainChoice = input.nextInt();
            if (mainChoice == 1) {
                System.out.print("Masukkan username admin: ");
                String username = input.next();
                System.out.print("Masukkan password admin: ");
                String password = input.next();
                if (username.equals("admin1") && password.equals("adminsatu")) {
                    int adminChoice;

                    System.out.println("Login berhasil.");
                    boolean isNewData = false;
                    while (isNewData == false) {
                        System.out.println("==========================================================");
                        System.out.println("|    Selamat datang " + username + " di Sistem Reservasi Puskesmas  |");
                        System.out.println("==========================================================");
                        System.out.println("| 1. Reservasi Baru                                       |");
                        System.out.println("| 2. Lihat History Reservasi                              |");
                        System.out.println("| 3. Keluar                                               |");
                        System.out.println("==========================================================");
                        isLoggedin = true;
                        System.out.print("Pilih menu: ");
                        adminChoice = input.nextInt();

                        if (adminChoice == 1) {
                            // Menu Reservasi Baru
                            System.out.println("Anda memilih menu Reservasi Baru.");
                            // membuat variable string atau karakter
                            String noKtp, noBpjs, namaPasien, KeluhanPasien, kategoriPasien, noKartu;
                            char statusbpjs, pembayaran;

                            // membuat varible int berupa angka yang memerlukan perhitungan
                            int usiaPasien, potonganBpjs, harga, hargaAkhir;

                            System.out.println("Selamat Datang Di Rumah Sakit X - Admin");
                            System.out.println("Masukkan Data Pasien");
                            System.out.println("");

                            // membuat inputan data pasien untuk admin
                            System.out.print("No KTP                      :");
                            noKtp = sc.nextLine();

                            // penambahan fitur pasien BPJS
                            System.out.println("Apakah pasien memiliki kartu BPJS (0 = ya, 1 = tidak)? ");
                            statusbpjs = sc.next().charAt(0);

                            if (statusbpjs == '0') {
                                noBpjs = sc.nextLine();
                                System.out.print("Masukkan No.BPJS pasien     : ");
                                noBpjs = sc.nextLine();
                                potonganBpjs = 100;
                            } else {
                                potonganBpjs = 0;
                                namaPasien = sc.nextLine();
                            }

                            System.out.print("Nama                        : ");
                            namaPasien = sc.nextLine();

                            // usia menggunakan ifelse menentukan biaya konsultasi atau berobat
                            System.out.print("Usia                        : ");
                            usiaPasien = sc.nextInt();
                            if (usiaPasien <= 17) {
                                kategoriPasien = "A-Anak";
                                harga = 5000;
                            } else {
                                kategoriPasien = "D-Dewasa";
                                harga = 10000;
                            }

                            KeluhanPasien = sc.nextLine();
                            System.out.print("Keluhan                     : ");
                            KeluhanPasien = sc.nextLine();
                            System.out.println("==============Daftar Dokter=============");
                            System.out.println("| 1. Dokter Umum                        |");
                            System.out.println("| 2. Dokter Gigi                        |");
                            System.out.println("| 3. Bidan                              |");
                            System.out.println("| 4. perawat                            |");
                            System.out.println("| 5. petugas lab                        |");
                            System.out.println("| 6. tenaga gizi                        |");
                            System.out.println("Pilih nomor dokter yang dibutuhkan pasien : ");
                            int pemilihan = sc.nextInt();

                            switch (pemilihan) {
                                case 1:
                                    System.out.println("Dokter Umum - Konsultansi " + KeluhanPasien);
                                    break;
                                case 2:
                                    System.out.println("Dokter Gigi - Konsultansi " + KeluhanPasien);
                                    break;
                                case 3:
                                    System.out.println("Bidan - Konsultansi " + KeluhanPasien);
                                    break;
                                case 4:
                                    System.out.println("Perawat - Konsultansi " + KeluhanPasien);
                                    break;
                                case 5:
                                    System.out.println("Petugas Lab - Konsultansi " + KeluhanPasien);
                                    break;
                                case 6:
                                    System.out.println("Tenaga Gizi - Konsultansi " + KeluhanPasien);
                                    break;

                                default:
                                    System.out.println("Inputan tidak valid!");
                                    break;
                            }
                            System.out.println("--------------------------------------------------");

                            // potongan BPJS pada puskesmas 100%
                            System.out.println("Potongan BPJS(%)            : " + potonganBpjs);
                            // harga di tentukan sesuai kategori usia pasien
                            System.out.println("Harga                       : " + harga);

                            // memproses perhitungan pembayaran
                            hargaAkhir = harga - (harga * potonganBpjs / 100);
                            System.out.println("--------------------------------------------------");
                            System.out.println("Harga Akhir                 :" + hargaAkhir);

                            // pembayaran debit atau tunai by fauzi
                            System.out.println("Metode pembayaran menggunakan(1 = debit, 2 = tunai)? ");
                            pembayaran = sc.next().charAt(0);

                            if (pembayaran == '1') {
                                noKartu = sc.nextLine();
                                System.out.print("Masukan nomor kartu debit :");
                                noKartu = sc.nextLine();

                            } else {
                                System.out.println("Pembayaran menggunakan uang tunai - Lunas");
                            }
                        } else if (adminChoice == 2) {
                            // Menu Lihat Jadwal Reservasi
                            System.out.println("Anda memilih menu Lihat History Reservasi.");
                            // Tambahkan kode untuk melihat jadwal reservasi
                        } else if (adminChoice == 3) {
                            // Keluar dari akun admin
                            System.out.println("Anda telah keluar dari akun admin.");
                            isLoggedin = false;
                            isNewData = true;
                        } else {
                            // Jika input tidak valid
                            isLoggedin = false;
                            System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                        }
                    }
                } else if (username.equals("admin2") && password.equals("admindua")) {
                    int adminChoice;

                    System.out.println("login berhasil.");
                    boolean isNewData = false;
                    while (isNewData == false) {
                        System.out.println("=========================================================");
                        System.out.println("|    Selamat datang " + username + " di Sistem Reservasi Puskesmas    |");
                        System.out.println("=========================================================");
                        System.out.println("| 1. Reservasi Baru                                      |");
                        System.out.println("| 2. Lihat History Reservasi                             |");
                        System.out.println("| 3. Keluar                                              |");
                        System.out.println("=========================================================");
                        isLoggedin = true;
                        System.out.print("Pilih menu: ");
                        adminChoice = input.nextInt();

                        if (adminChoice == 1) {
                            // Menu Reservasi Baru
                            System.out.println("Anda memilih menu Reservasi Baru.");
                            // membuat variable string atau karakter
                            String noKtp, noBpjs, namaPasien, KeluhanPasien, kategoriPasien, noKartu;
                            char statusbpjs, pembayaran;

                            // membuat varible int berupa angka yang memerlukan perhitungan
                            int usiaPasien, potonganBpjs, harga, hargaAkhir;

                            System.out.println("Selamat Datang Di Rumah Sakit X - Admin");
                            System.out.println("Masukkan Data Pasien");
                            System.out.println("");

                            // membuat inputan data pasien untuk admin
                            System.out.print("No KTP                      :");
                            noKtp = sc.nextLine();

                            // penambahan fitur pasien BPJS
                            System.out.println("Apakah pasien memiliki kartu BPJS (0 = ya, 1 = tidak)? ");
                            statusbpjs = sc.next().charAt(0);

                            if (statusbpjs == '0') {
                                noBpjs = sc.nextLine();
                                System.out.print("Masukkan No.BPJS pasien     : ");
                                noBpjs = sc.nextLine();
                                potonganBpjs = 100;
                            } else {
                                potonganBpjs = 0;
                                namaPasien = sc.nextLine();
                            }

                            System.out.print("Nama                        : ");
                            namaPasien = sc.nextLine();

                            // usia menggunakan ifelse menentukan biaya konsultasi atau berobat
                            System.out.print("Usia                        : ");
                            usiaPasien = sc.nextInt();
                            if (usiaPasien <= 17) {
                                kategoriPasien = "A-Anak";
                                harga = 5000;
                            } else {
                                kategoriPasien = "D-Dewasa";
                                harga = 10000;
                            }

                            KeluhanPasien = sc.nextLine();
                            System.out.print("Keluhan                     : ");
                            KeluhanPasien = sc.nextLine();
                            System.out.println("==============Daftar Dokter=============");
                            System.out.println("| 1. Dokter Umum                        |");
                            System.out.println("| 2. Dokter Gigi                        |");
                            System.out.println("| 3. Bidan                              |");
                            System.out.println("| 4. perawat                            |");
                            System.out.println("| 5. petugas lab                        |");
                            System.out.println("| 6. tenaga gizi                        |");
                            System.out.println("Pilih nomor dokter yang dibutuhkan pasien : ");
                            int pemilihan = sc.nextInt();

                            switch (pemilihan) {
                                case 1:
                                    System.out.println("Dokter Umum - Konsultansi " + KeluhanPasien);
                                    break;
                                case 2:
                                    System.out.println("Dokter Gigi - Konsultansi " + KeluhanPasien);
                                    break;
                                case 3:
                                    System.out.println("Bidan - Konsultansi " + KeluhanPasien);
                                    break;
                                case 4:
                                    System.out.println("Perawat - Konsultansi " + KeluhanPasien);
                                    break;
                                case 5:
                                    System.out.println("Petugas Lab - Konsultansi " + KeluhanPasien);
                                    break;
                                case 6:
                                    System.out.println("Tenaga Gizi - Konsultansi " + KeluhanPasien);
                                    break;

                                default:
                                    System.out.println("Inputan tidak valid!");
                                    break;
                            }
                            System.out.println("--------------------------------------------------");

                            // potongan BPJS pada puskesmas 100%
                            System.out.println("Potongan BPJS(%)            : " + potonganBpjs);
                            // harga di tentukan sesuai kategori usia pasien
                            System.out.println("Harga                       : " + harga);

                            // memproses perhitungan pembayaran
                            hargaAkhir = harga - (harga * potonganBpjs / 100);
                            System.out.println("--------------------------------------------------");
                            System.out.println("Harga Akhir                 :" + hargaAkhir);

                            // pembayaran debit atau tunai by fauzi
                            System.out.println("Metode pembayaran menggunakan(1 = debit, 2 = tunai)? ");
                            pembayaran = sc.next().charAt(0);

                            if (pembayaran == '1') {
                                noKartu = sc.nextLine();
                                System.out.print("Masukan nomor kartu debit :");
                                noKartu = sc.nextLine();

                            } else {
                                System.out.println("Pembayaran menggunakan uang tunai - Lunas");
                            }
                        } else if (adminChoice == 2) {
                            // Menu Lihat Jadwal Reservasi
                            System.out.println("Anda memilih menu Lihat History Reservasi.");
                            // Tambahkan kode untuk melihat jadwal reservasi
                        } else if (adminChoice == 3) {
                            // keluar dari akun admin
                            isLoggedin = false;
                            isNewData = true;
                            System.out.println("Anda telah keluar dari akun " + username + ".");
                        } else {
                            // Jika input tidak valid
                            isLoggedin = false;
                            System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                        }
                    }
                } else {
                    // Jika login gagal
                    System.out.println("Login gagal. Username atau password salah.");
                    isLoggedin = false;
                }
            } else if (mainChoice == 2) {
                // Keluar dari program
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                // Jika input tidak valid
                System.out.println("Pilihan tidak valid. Silakan pilih tipe pengguna yang benar.");
            }
        }
    }
}
