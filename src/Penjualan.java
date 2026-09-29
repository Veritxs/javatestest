import java.util.ArrayList;

public class Penjualan implements Cetak{
  private String penjualanID;
  private String waktuPenjualan;
  private ArrayList<Produk> listProduk;
  private ArrayList<Integer> listKuantitas;
  private Seller seller;
  private Buyer buyer;
  private String metodePengiriman;
  private float totalHarga;

  //Constructor
  public Penjualan(String penjualanID, String waktuPenjualan, Seller seller, Buyer buyer, String metodePengiriman) {
    this.penjualanID = penjualanID;
    this.waktuPenjualan = waktuPenjualan;
    this.seller = seller;
    this.buyer = buyer;
    this.metodePengiriman = metodePengiriman;
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
  public void setPenjualanID(String penjualanID) {
    this.penjualanID = penjualanID;
  }
  public void setWaktuPenjualan(String waktuPenjualan) {
    this.waktuPenjualan = waktuPenjualan;
  }
  public void setSeller(Seller seller) {
    this.seller = seller;
  }
  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }
  public void setMetodePengiriman(String metodePengiriman) {
    this.metodePengiriman = metodePengiriman;
  }
  public String getPenjualanID() {
    return penjualanID;
  }
  public String getWaktuPenjualan() {
    return waktuPenjualan;
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
  public String getMetodePengiriman() {
    return metodePengiriman;
  }
  public float getTotalHarga() {
    return totalHarga;
  }

  //implementasi interface Cetak
  public void cetakStruk() {
    hitungTotalHarga();
    int totalKuantitas = 0;

    System.out.println("\n========================================");
    System.out.println("             STRUK SHOPEE");
    System.out.println("========================================");
    System.out.println("No. Pesanan : " + penjualanID);
    System.out.println("Waktu       : " + waktuPenjualan);
    System.out.println("Pembeli     : " + buyer.getNama());
    System.out.println("No. HP      : " + buyer.getNoHp());
    System.out.println("Alamat      : " + buyer.getAlamatPribadi());
    System.out.println("Penjual     : " + seller.getNama());
    System.out.println("Toko        : " + seller.getNamaToko());
    System.out.println("Pengiriman  : " + metodePengiriman);
    System.out.println("----------------------------------------");

    for (int i = 0; i < listProduk.size(); i++) {
      Produk produk = listProduk.get(i);
      int kuantitas = listKuantitas.get(i);
      float subtotal = produk.getHarga() * kuantitas;
      totalKuantitas = totalKuantitas + kuantitas;

      System.out.println((i + 1) + ". " + produk.getInfo());
      System.out.println("   Harga    : Rp " + produk.getHarga());
      System.out.println("   Jumlah   : " + kuantitas);
      System.out.println("   Subtotal : Rp " + subtotal);
    }

    System.out.println("----------------------------------------");
    System.out.println("Total Produk : " + totalKuantitas);
    System.out.println("Total Bayar  : Rp " + totalHarga);
    System.out.println("========================================");
    System.out.println("Terima kasih telah berbelanja!");
  }
}
