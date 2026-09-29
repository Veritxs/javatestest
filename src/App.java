import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Learning Inheritance and Polymorphism");

    //Input data yang disediakan oleh Seller
    System.out.println("\n=== INPUT DATA SELLER ===");
    System.out.print("Nama penjual  : ");
    String namaPenjual = input.nextLine();
    System.out.print("Nama toko     : ");
    String namaToko = input.nextLine();
    System.out.print("Alamat toko   : ");
    String alamatToko = input.nextLine();

    //Input data yang disediakan oleh Buyer
    System.out.println("\n=== INPUT DATA BUYER ===");
    System.out.print("Nama pembeli  : ");
    String namaPembeli = input.nextLine();
    System.out.print("No. handphone : ");
    String noHpPembeli = input.nextLine();
    System.out.print("Alamat kirim  : ");
    String alamatKirim = input.nextLine();
    System.out.print("Metode bayar  : ");
    String metodePembayaran = input.nextLine();

    //Object Seller dan Buyer dari hasil input
    Seller seller1 = new Seller(namaPenjual, namaToko, alamatToko);
    Buyer buyer1 = new Buyer(namaPembeli, noHpPembeli, alamatKirim);

    //Data produk dari Seller
    KaosKaki produk1 = new KaosKaki("KK01", "Ankle Sock", "Uniqlo", 45000f, 10, "Polos");
    Sandal produk2 = new Sandal("SD01", "Slide", "Adidas", 350000f, 5, 42, "Sandal Jepit");
    Sepatu produk3 = new Sepatu("SP01", "Air Max", "Nike", 950000f, 3, 43, "Running");

    System.out.println("\nProduk 1: " + produk1.getNama() +
                       ", Motif = " + produk1.getMotif());
    System.out.println("Produk 2: " + produk2.getNama() +
                       ", Ukuran = " + produk2.getUkuran() +
                       ", Jenis = " + produk2.getJenisSandal());
    System.out.println("Produk 3: " + produk3.getNama() +
                       ", Ukuran = " + produk3.getUkuran() +
                       ", Jenis = " + produk3.getJenisSepatu());

    //Polymorphic variables
    Produk produk4 = new KaosKaki("KK02", "Crew Sock", "Puma", 55000f, 8, "Garis");
    Produk produk5 = new Sandal("SD02", "Classic Clog", "Crocs", 700000f, 4, 41, "Selop");
    Produk produk6 = new Sepatu("SP02", "Chuck Taylor", "Converse", 850000f, 6, 40, "Sneakers");

    //ArrayList
    ArrayList<Produk> produkList = new ArrayList<>();
    produkList.add(produk1);
    produkList.add(produk2);
    produkList.add(produk3);
    produkList.add(produk4);
    produkList.add(produk5);
    produkList.add(produk6);

    //Display all objects
    System.out.println("\nSEMUA PRODUK:");
    for (Produk produkObj : produkList) {
      System.out.println("Produk : " + produkObj.getNama() +
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

    seller1.login();
    buyer1.login();

    //Nomor pesanan dan tanggal dibuat oleh sistem
    Penjualan jual1 = new Penjualan("TRX001", "29-09-2026", seller1, buyer1,
                                     metodePembayaran);
    jual1.tambahProduk(produk1);
    jual1.tambahProduk(produk2);
    jual1.tambahProduk(produk3);
    jual1.cetakStruk();

    buyer1.logout();
    seller1.logout();
    input.close();
  }
}
