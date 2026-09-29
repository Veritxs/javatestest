public class Sandal extends AlasKaki{
  private String jenisSandal;

  public Sandal(String kode, String nama, String ukuran, float harga, int stok, String merk, String jenisSandal) {
    super(kode, nama, ukuran, harga, stok, merk);
    this.jenisSandal = jenisSandal;
  }

  public void setJenisSandal(String jenisSandal) {
    this.jenisSandal = jenisSandal;
  }
  public String getJenisSandal() {
    return jenisSandal;
  }

  public String getInfo() {
    return "Sandal " + getNama() + " (" + getMerk() + "), Ukuran = " + getUkuran() + ", Jenis = " + jenisSandal;
  }
}
