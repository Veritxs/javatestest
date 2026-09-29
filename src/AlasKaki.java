public abstract class AlasKaki extends Produk{
  private String merk;

  public AlasKaki(String kode, String nama, String ukuran, float harga, int stok, String merk) {
    super(kode, nama, ukuran, harga, stok);
    this.merk = merk;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }
  public String getMerk() {
    return merk;
  }
}
