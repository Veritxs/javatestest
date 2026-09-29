import java.util.ArrayList;

public class Penjualan implements Cetak{
  private String idPenjualan;
  private String tglPenjualan;
  private ArrayList<Produk> listProduk;
  private ArrayList<Integer> listKuantitas;
  private Seller seller;
  private Buyer buyer;
  private String metodePembayaran;
  private float totalHarga;

  //Constructor
  public Penjualan(String idPenjualan, String tglPenjualan, Seller seller, Buyer buyer, String metodePembayaran) {
    this.idPenjualan = idPenjualan;
    this.tglPenjualan = tglPenjualan;
    this.seller = seller;
    this.buyer = buyer;
    this.metodePembayaran = metodePembayaran;
    listProduk = new ArrayList<>();
    listKuantitas = new ArrayList<>();
    totalHarga = 0;
  }

  //method penjualan
  public void tambahProduk(Produk produk) {
    tambahProduk(produk, 1);
  }

  public void tambahProduk(Produk produk, int jumlah) {
    if (jumlah <= 0) {
      System.out.println("Jumlah produk harus lebih dari 0.");
    } else if (jumlah <= produk.getStok()) {
      int posisiProduk = listProduk.indexOf(produk);

      if (posisiProduk == -1) {
        listProduk.add(produk);
        listKuantitas.add(jumlah);
      } else {
        int jumlahLama = listKuantitas.get(posisiProduk);
        listKuantitas.set(posisiProduk, jumlahLama + jumlah);
      }

      produk.setStok(produk.getStok() - jumlah);
      hitungTotalHarga();
      System.out.println(jumlah + " " + produk.getNama() + " ditambahkan ke pesanan.");
    } else {
      System.out.println("Stok " + produk.getNama() + " tidak cukup.");
    }
  }

  public float hitungTotalHarga() {
    totalHarga = 0;
    for (int i = 0; i < listProduk.size(); i++) {
      Produk produk = listProduk.get(i);
      int kuantitas = listKuantitas.get(i);
      totalHarga = totalHarga + (produk.getHarga() * kuantitas);
    }
    return totalHarga;
  }

  //setter and getter
  public void setIdPenjualan(String idPenjualan) {
    this.idPenjualan = idPenjualan;
  }
  public void setTglPenjualan(String tglPenjualan) {
    this.tglPenjualan = tglPenjualan;
  }
  public void setSeller(Seller seller) {
    this.seller = seller;
  }
  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }
  public void setMetodePembayaran(String metodePembayaran) {
    this.metodePembayaran = metodePembayaran;
  }
  public String getIdPenjualan() {
    return idPenjualan;
  }
  public String getTglPenjualan() {
    return tglPenjualan;
  }
  public ArrayList<Produk> getListProduk() {
    return listProduk;
  }
  public ArrayList<Integer> getListKuantitas() {
    return listKuantitas;
  }
  public Seller getSeller() {
    return seller;
  }
  public Buyer getBuyer() {
    return buyer;
  }
  public String getMetodePembayaran() {
    return metodePembayaran;
  }
  public float getTotalHarga() {
    return totalHarga;
  }

  //implementasi interface Cetak
  public void cetakStruk() {
    hitungTotalHarga();
    int totalKuantitas = 0;

    for (int i = 0; i < listKuantitas.size(); i++) {
      totalKuantitas = totalKuantitas + listKuantitas.get(i);
    }

    System.out.println("\n==============================================================================");
    System.out.println("                               S H O P E E");
    System.out.println("                              NOTA PESANAN");
    System.out.println("==============================================================================");

    System.out.println("DATA PEMBELI DAN PENJUAL");
    System.out.println("Nama Pembeli        : " + buyer.getNama());
    System.out.println("No. Handphone       : " + buyer.getNoHp());
    System.out.println("Alamat Pembeli      : " + buyer.getAlamatKirim());
    System.out.println("Nama Penjual        : " + seller.getNama());
    System.out.println("Nama Toko           : " + seller.getNamaToko());
    System.out.println("Alamat Toko         : " + seller.getAlamatToko());

    System.out.println("------------------------------------------------------------------------------");
    System.out.println("INFORMASI PESANAN");
    System.out.println("No. Pesanan         : " + idPenjualan);
    System.out.println("Tanggal Transaksi   : " + tglPenjualan);
    System.out.println("Metode Pembayaran   : " + metodePembayaran);

    System.out.println("------------------------------------------------------------------------------");
    System.out.println("RINCIAN PESANAN");
    System.out.printf("%-4s %-22s %-13s %12s %5s %12s%n",
                      "No", "Produk", "Merek", "Harga", "Qty", "Subtotal");
    System.out.println("------------------------------------------------------------------------------");

    for (int i = 0; i < listProduk.size(); i++) {
      Produk produk = listProduk.get(i);
      int kuantitas = listKuantitas.get(i);
      float subtotal = produk.getHarga() * kuantitas;

      System.out.printf("%-4d %-22s %-13s Rp%9.0f %5d Rp%9.0f%n",
                        i + 1, produk.getNama(), produk.getMerek(),
                        produk.getHarga(), kuantitas, subtotal);
      System.out.println("     " + produk.getInfo());
    }

    System.out.println("------------------------------------------------------------------------------");
    System.out.printf("%-51s Rp%9.0f%n", "Subtotal Pesanan", totalHarga);
    System.out.println("Total Kuantitas     : " + totalKuantitas + " produk");
    System.out.println("------------------------------------------------------------------------------");
    System.out.printf("%-51s Rp%9.0f%n", "TOTAL PEMBAYARAN", totalHarga);
    System.out.println("==============================================================================");
    System.out.println("Terima kasih telah berbelanja di " + seller.getNamaToko());
    System.out.println("Simpan nota ini sebagai bukti pembayaran.");
    System.out.println("                              End of receipt");
    System.out.println("==============================================================================");
  }
}
