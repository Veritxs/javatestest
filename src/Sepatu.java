public class Sepatu extends AlasKaki{
  private String jenisSepatu;

  public Sepatu(String kode, String nama, String ukuran, float harga, int stok, String merk, String jenisSepatu) {
    super(kode, nama, ukuran, harga, stok, merk);
    this.jenisSepatu = jenisSepatu;
  }

  public void setJenisSepatu(String jenisSepatu) {
    this.jenisSepatu = jenisSepatu;
  }
  public String getJenisSepatu() {
    return jenisSepatu;
  }

  public String getInfo() {
    return "Sepatu " + getNama() + " (" + getMerk() + "), Ukuran = " + getUkuran() + ", Jenis = " + jenisSepatu;
  }
}
