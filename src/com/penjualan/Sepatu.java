package com.penjualan;

public class Sepatu extends AlasKaki{
  private String jenisSepatu;

  public Sepatu(String kode, String nama, String merek, float harga, int stok, int ukuran, String j) {
    super(kode, nama, merek, harga, stok, ukuran);
    jenisSepatu = j;
  }
  public Sepatu() {
    super();
    jenisSepatu = "";
  }

  public void setJenisSepatu(String jenisSepatu) {
    this.jenisSepatu = jenisSepatu;
  }
  public String getJenisSepatu() {
    return jenisSepatu;
  }

  public String getInfo() {
    return ("Sepatu " + getNama() + " (" + getMerek() + "), Ukuran = " + getUkuran() +
            ", Jenis = " + jenisSepatu);
  }
}
