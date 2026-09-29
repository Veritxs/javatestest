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

    //Seller membuat object KaosKaki menggunakan constructor
    System.out.println("\n=== INPUT PRODUK 1: KAOS KAKI ===");
    System.out.print("Kode produk  : ");
    String kode1 = input.nextLine();
    System.out.print("Nama produk  : ");
    String nama1 = input.nextLine();
    System.out.print("Merek        : ");
    String merek1 = input.nextLine();
    System.out.print("Harga        : ");
    float harga1 = Float.parseFloat(input.nextLine());
    System.out.print("Stok         : ");
    int stok1 = Integer.parseInt(input.nextLine());
    System.out.print("Motif        : ");
    String motif1 = input.nextLine();
    KaosKaki produk1 = new KaosKaki(kode1, nama1, merek1, harga1, stok1, motif1);

    //Seller membuat object Sandal menggunakan constructor
    System.out.println("\n=== INPUT PRODUK 2: SANDAL ===");
    System.out.print("Kode produk  : ");
    String kode2 = input.nextLine();
    System.out.print("Nama produk  : ");
    String nama2 = input.nextLine();
    System.out.print("Merek        : ");
    String merek2 = input.nextLine();
    System.out.print("Harga        : ");
    float harga2 = Float.parseFloat(input.nextLine());
    System.out.print("Stok         : ");
    int stok2 = Integer.parseInt(input.nextLine());
    System.out.print("Ukuran       : ");
    int ukuran2 = Integer.parseInt(input.nextLine());
    System.out.print("Jenis sandal : ");
    String jenis2 = input.nextLine();
    Sandal produk2 = new Sandal(kode2, nama2, merek2, harga2, stok2, ukuran2, jenis2);

    //Seller membuat object Sepatu menggunakan constructor
    System.out.println("\n=== INPUT PRODUK 3: SEPATU ===");
    System.out.print("Kode produk  : ");
    String kode3 = input.nextLine();
    System.out.print("Nama produk  : ");
    String nama3 = input.nextLine();
    System.out.print("Merek        : ");
    String merek3 = input.nextLine();
    System.out.print("Harga        : ");
    float harga3 = Float.parseFloat(input.nextLine());
    System.out.print("Stok         : ");
    int stok3 = Integer.parseInt(input.nextLine());
    System.out.print("Ukuran       : ");
    int ukuran3 = Integer.parseInt(input.nextLine());
    System.out.print("Jenis sepatu : ");
    String jenis3 = input.nextLine();
    Sepatu produk3 = new Sepatu(kode3, nama3, merek3, harga3, stok3, ukuran3, jenis3);

    //Polymorphism: object berbeda disimpan dalam ArrayList Produk
    ArrayList<Produk> produkList = new ArrayList<>();
    produkList.add(produk1);
    produkList.add(produk2);
    produkList.add(produk3);

    System.out.println("\n=== PRODUK DARI SELLER ===");
    for (Produk produkObj : produkList) {
      System.out.println(produkObj.getInfo() +
                         " ==> class = " + produkObj.getClass());

      if (produkObj instanceof KaosKaki) {
        System.out.println("   Motif = " + ((KaosKaki) produkObj).getMotif());
      } else if (produkObj instanceof Sandal) {
        System.out.println("   Ukuran = " + ((Sandal) produkObj).getUkuran() +
                           ", Jenis = " + ((Sandal) produkObj).getJenisSandal());
      } else if (produkObj instanceof Sepatu) {
        System.out.println("   Ukuran = " + ((Sepatu) produkObj).getUkuran() +
                           ", Jenis = " + ((Sepatu) produkObj).getJenisSepatu());
      }
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
    Penjualan jual1 = new Penjualan("TRX001", "29-09-2026", seller1, buyer1,
                                     metodePembayaran);

    //Menu Buyer untuk memilih produk dan jumlah
    int pilihan = -1;
    while (pilihan != 0) {
      System.out.println("\n=== MENU PRODUK ===");
      for (int i = 0; i < produkList.size(); i++) {
        Produk produk = produkList.get(i);
        System.out.println((i + 1) + ". " + produk.getNama() +
                           " | Rp " + produk.getHarga() +
                           " | Stok: " + produk.getStok());
      }
      System.out.println("0. Selesai dan cetak struk");
      System.out.print("Pilih produk : ");
      pilihan = Integer.parseInt(input.nextLine());

      if (pilihan > 0 && pilihan <= produkList.size()) {
        Produk produkDipilih = produkList.get(pilihan - 1);
        System.out.print("Jumlah       : ");
        int jumlah = Integer.parseInt(input.nextLine());
        jual1.tambahProduk(produkDipilih, jumlah);
      } else if (pilihan != 0) {
        System.out.println("Pilihan produk tidak tersedia.");
      }
    }

    jual1.cetakStruk();

    buyer1.logout();
    seller1.logout();
    input.close();
  }
}
