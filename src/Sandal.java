public class Sandal extends AlasKaki{
  private String jenisSandal;

  public Sandal(String kode, String nama, String merek, float harga, int stok,
                int ukuran, String jenisSandal) {
    super(kode, nama, merek, harga, stok, ukuran);
    this.jenisSandal = jenisSandal;
  }

  public void setJenisSandal(String jenisSandal) {
    this.jenisSandal = jenisSandal;
  }
  public String getJenisSandal() {
    return jenisSandal;
  }

  public String getInfo() {
    return "Sandal " + getNama() + " (" + getMerek() + "), Ukuran = " + getUkuran() +
           ", Jenis = " + jenisSandal;
  }
}
