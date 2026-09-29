import com.penjualan.Buyer;
import com.penjualan.KaosKaki;
import com.penjualan.Penjualan;
import com.penjualan.Sandal;
import com.penjualan.Seller;
import com.penjualan.Sepatu;

public class Main {
  public static void main(String[] args) {

    Seller seller1 = new Seller("toko@mail.com", "Andi", "08123456789", "andi", "andi123",
                                "Toko Kaki Sehat", "Jakarta Barat", 4.8f);
    Buyer buyer1 = new Buyer("budi@mail.com", "Budi", "08987654321", "budi", "budi123",
                             "Jl. Letjen S. Parman No. 1", 1500000f);

    seller1.login();
    buyer1.login();

    KaosKaki produk1 = new KaosKaki("KK01", "Ankle Sock", "Uniqlo", 45000f, 10, "Polos");
    Sandal produk2 = new Sandal("SD01", "Slide", "Adidas", 350000f, 5, 42, "Sandal Jepit");
    Sepatu produk3 = new Sepatu("SP01", "Air Max", "Nike", 950000f, 3, 43, "Running");

    System.out.println("Produk 1: " + produk1.getInfo() +
                       ", Harga = " + produk1.getHarga());
    System.out.println("Produk 2: " + produk2.getInfo() +
                       ", Harga = " + produk2.getHarga());
    System.out.println("Produk 3: " + produk3.getInfo() +
                       ", Harga = " + produk3.getHarga());

    Penjualan jual1 = new Penjualan("TRX001", "29-09-2026", seller1, buyer1, "Transfer Bank");
    jual1.tambahProduk(produk1);
    jual1.tambahProduk(produk2);
    jual1.tambahProduk(produk3);

    jual1.cetakStruk();

    buyer1.logout();
    seller1.logout();
  }
}
