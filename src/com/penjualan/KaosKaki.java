package com.penjualan;

public class KaosKaki extends Produk{
  private String motif;

  public KaosKaki(String kode, String nama, String merek, float harga, int stok, String m) {
    super(kode, nama, merek, harga, stok);
    motif = m;
  }
  public KaosKaki() {
    super();
    motif = "";
  }

  public void setMotif(String motif) {
    this.motif = motif;
  }
  public String getMotif() {
    return motif;
  }

  public String getInfo() {
    return ("Kaos Kaki " + getNama() + " (" + getMerek() + "), Motif = " + motif);
  }
}
