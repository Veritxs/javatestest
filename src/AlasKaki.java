public class AlasKaki extends Produk{
  private int ukuran;

  public AlasKaki(String kode, String nama, String merek, float harga, int stok, int ukuran) {
    super(kode, nama, merek, harga, stok);
    this.ukuran = ukuran;
  }

  public void setUkuran(int ukuran) {
    this.ukuran = ukuran;
  }
  public int getUkuran() {
    return ukuran;
  }

  public String getInfo() {
    return "Alas Kaki " + getNama() + " (" + getMerek() + "), Ukuran = " + ukuran;
  }
}
