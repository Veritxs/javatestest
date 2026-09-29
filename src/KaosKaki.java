public class KaosKaki extends Produk{
  private String motif;

  public KaosKaki(String kode, String nama, String ukuran, String warna, float harga, int stok, String motif) {
    super(kode, nama, ukuran, warna, harga, stok);
    this.motif = motif;
  }

  public void setMotif(String motif) {
    this.motif = motif;
  }
  public String getMotif() {
    return motif;
  }

  public String getInfo() {
    return "Kaos Kaki " + getNama() + ", Ukuran = " + getUkuran() + ", Warna = " + getWarna() + ", Motif = " + motif;
  }
}
