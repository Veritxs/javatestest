import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Learning Inheritance and Polymorphism");

    //Input data Seller
    System.out.println("\n=== INPUT DATA SELLER ===");
    System.out.print("Nama penjual : ");
    String namaPenjual = input.nextLine();
    System.out.print("Nama toko    : ");
    String namaToko = input.nextLine();
    System.out.print("Alamat toko  : ");
    String alamatToko = input.nextLine();
    Seller seller1 = new Seller(namaPenjual, namaToko, alamatToko);

    //Menu Seller untuk memilih jenis produk yang ingin dimasukkan
    ArrayList<Produk> produkList = new ArrayList<>();
    int pilihanSeller = -1;
    while (pilihanSeller != 0) {
      System.out.println("\n=== MENU INPUT PRODUK SELLER ===");
      System.out.println("1. Input Kaos Kaki");
      System.out.println("2. Input Sandal");
      System.out.println("3. Input Sepatu");
      System.out.println("0. Selesai input produk");
      System.out.print("Pilih jenis produk : ");
      pilihanSeller = Integer.parseInt(input.nextLine());

      if (pilihanSeller == 1) {
        System.out.println("\n--- INPUT KAOS KAKI ---");
        System.out.print("Kode produk  : ");
        String kode = input.nextLine();
        System.out.print("Nama produk  : ");
        String nama = input.nextLine();
        System.out.print("Ukuran       : ");
        int ukuran = Integer.parseInt(input.nextLine());
        System.out.print("Harga        : ");
        float harga = Float.parseFloat(input.nextLine());
        System.out.print("Stok         : ");
        int stok = Integer.parseInt(input.nextLine());
        System.out.print("Motif        : ");
        String motif = input.nextLine();
        KaosKaki produk = new KaosKaki(kode, nama, ukuran, harga, stok, motif);
        produkList.add(produk);
        System.out.println(nama + " berhasil dimasukkan.");
      } else if (pilihanSeller == 2) {
        System.out.println("\n--- INPUT SANDAL ---");
        System.out.print("Kode produk  : ");
        String kode = input.nextLine();
        System.out.print("Nama produk  : ");
        String nama = input.nextLine();
        System.out.print("Merk         : ");
        String merk = input.nextLine();
        System.out.print("Harga        : ");
        float harga = Float.parseFloat(input.nextLine());
        System.out.print("Stok         : ");
        int stok = Integer.parseInt(input.nextLine());
        System.out.print("Ukuran       : ");
        int ukuran = Integer.parseInt(input.nextLine());
        System.out.print("Jenis sandal : ");
        String jenisSandal = input.nextLine();
        Sandal produk = new Sandal(kode, nama, ukuran, harga, stok, merk, jenisSandal);
        produkList.add(produk);
        System.out.println(nama + " berhasil dimasukkan.");
      } else if (pilihanSeller == 3) {
        System.out.println("\n--- INPUT SEPATU ---");
        System.out.print("Kode produk  : ");
        String kode = input.nextLine();
        System.out.print("Nama produk  : ");
        String nama = input.nextLine();
        System.out.print("Merk         : ");
        String merk = input.nextLine();
        System.out.print("Harga        : ");
        float harga = Float.parseFloat(input.nextLine());
        System.out.print("Stok         : ");
        int stok = Integer.parseInt(input.nextLine());
        System.out.print("Ukuran       : ");
        int ukuran = Integer.parseInt(input.nextLine());
        System.out.print("Jenis sepatu : ");
        String jenisSepatu = input.nextLine();
        Sepatu produk = new Sepatu(kode, nama, ukuran, harga, stok, merk, jenisSepatu);
        produkList.add(produk);
        System.out.println(nama + " berhasil dimasukkan.");
      } else if (pilihanSeller != 0) {
        System.out.println("Pilihan tidak tersedia.");
      }
    }

    //Polymorphism: semua child class disimpan sebagai Produk
    System.out.println("\n=== PRODUK DARI SELLER ===");
    for (Produk produkObj : produkList) {
      System.out.println(produkObj.getInfo());
    }

    //Input data Buyer
    System.out.println("\n=== INPUT DATA BUYER ===");
    System.out.print("Nama pembeli  : ");
    String namaPembeli = input.nextLine();
    System.out.print("No. handphone : ");
    String noHpPembeli = input.nextLine();
    System.out.print("Alamat kirim  : ");
    String alamatKirim = input.nextLine();
    System.out.print("Metode bayar  : ");
    String metodePembayaran = input.nextLine();
    Buyer buyer1 = new Buyer(namaPembeli, noHpPembeli, alamatKirim);

    seller1.login();
    buyer1.login();

    //Nomor pesanan dan tanggal dibuat oleh sistem
    Penjualan jual1 = new Penjualan("TRX001", "29-09-2026", seller1, buyer1, metodePembayaran);

    //Menu Buyer untuk memilih produk dan jumlah
    int pilihanBuyer = -1;
    while (pilihanBuyer != 0) {
      System.out.println("\n=== MENU PRODUK BUYER ===");
      for (int i = 0; i < produkList.size(); i++) {
        Produk produk = produkList.get(i);
        System.out.println((i + 1) + ". " + produk.getNama() + " | Rp " + produk.getHarga() + " | Stok: " + produk.getStok());
      }
      System.out.println("0. Selesai dan cetak struk");
      System.out.print("Pilih produk : ");
      pilihanBuyer = Integer.parseInt(input.nextLine());

      if (pilihanBuyer > 0 && pilihanBuyer <= produkList.size()) {
        Produk produkDipilih = produkList.get(pilihanBuyer - 1);
        System.out.print("Jumlah       : ");
        int jumlah = Integer.parseInt(input.nextLine());
        jual1.tambahProduk(produkDipilih, jumlah);
      } else if (pilihanBuyer != 0) {
        System.out.println("Pilihan produk tidak tersedia.");
      }
    }

    jual1.cetakStruk();
    buyer1.logout();
    seller1.logout();
    input.close();
  }
}
