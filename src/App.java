import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    System.out.println("Learning Inheritance and Polymorphism");

    //Object dari masing-masing child class
    KaosKaki produk1 = new KaosKaki("KK01", "Ankle Sock", "Uniqlo", 45000f, 10, "Polos");
    Sandal produk2 = new Sandal("SD01", "Slide", "Adidas", 350000f, 5, 42, "Sandal Jepit");
    Sepatu produk3 = new Sepatu("SP01", "Air Max", "Nike", 950000f, 3, 43, "Running");

    System.out.println("Produk 1: " + produk1.getNama() +
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

    //Object Seller dan Buyer
    Seller seller1 = new Seller("toko@mail.com", "Andi", "08123456789", "andi", "andi123",
                                "Toko Kaki Sehat", "Jakarta Barat", 4.8f);
    Buyer buyer1 = new Buyer("budi@mail.com", "Budi", "08987654321", "budi", "budi123",
                             "Jl. Letjen S. Parman No. 1", 1500000f);

    seller1.login();
    buyer1.login();

    //Object Penjualan
    Penjualan jual1 = new Penjualan("TRX001", "29-09-2026", seller1, buyer1, "Transfer Bank");
    jual1.tambahProduk(produk1);
    jual1.tambahProduk(produk2);
    jual1.tambahProduk(produk3);
    jual1.cetakStruk();

    buyer1.logout();
    seller1.logout();
  }
}
