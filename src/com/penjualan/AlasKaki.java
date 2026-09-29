package com.penjualan;

public class AlasKaki extends Produk{
  private int ukuran;

  public AlasKaki(String kode, String nama, String merek, float harga, int stok, int u) {
    super(kode, nama, merek, harga, stok);
    ukuran = u;
  }
  public AlasKaki() {
    super();
    ukuran = 0;
  }

  public void setUkuran(int ukuran) {
    this.ukuran = ukuran;
  }
  public int getUkuran() {
    return ukuran;
  }

  public String getInfo() {
    return ("Alas Kaki " + getNama() + " (" + getMerek() + "), Ukuran = " + ukuran);
  }
}
