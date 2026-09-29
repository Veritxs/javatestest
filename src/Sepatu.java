public class Sepatu extends AlasKaki{
  private String jenisSepatu;

  public Sepatu(String kode, String nama, String merek, float harga, int stok, int ukuran, String jenisSepatu) {
    super(kode, nama, merek, harga, stok, ukuran);
    this.jenisSepatu = jenisSepatu;
  }

  public void setJenisSepatu(String jenisSepatu) {
    this.jenisSepatu = jenisSepatu;
  }
  public String getJenisSepatu() {
    return jenisSepatu;
  }

  public String getInfo() {
    return "Sepatu " + getNama() + " (" + getMerek() + "), Ukuran = " + getUkuran() + ", Jenis = " + jenisSepatu;
  }
}
