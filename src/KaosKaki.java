public class KaosKaki extends Produk{
  private String motif;

  public KaosKaki(String kode, String nama, int ukuran, float harga, int stok, String motif) {
    super(kode, nama, ukuran, harga, stok);
    this.motif = motif;
  }

  public void setMotif(String motif) {
    this.motif = motif;
  }
  public String getMotif() {
    return motif;
  }

  public String getInfo() {
    return "Kaos Kaki " + getNama() + ", Ukuran = " + getUkuran() + ", Motif = " + motif;
  }
}
