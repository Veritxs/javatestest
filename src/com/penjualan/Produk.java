package com.penjualan;

public abstract class Produk {
  private String kode;
  private String nama;
  private String merek;
  private float harga;
  private int stok;

  //Constructor
  public Produk(String kode, String nama, String merek, float harga, int stok) {
    this.kode = kode;
    this.nama = nama;
    this.merek = merek;
    this.harga = harga;
    this.stok = stok;
  }
  public Produk() {
    kode = "";
    nama = "";
    merek = "";
    harga = 0;
    stok = 0;
  }

  //setter and getter
  public void setKode(String kode) {
    this.kode = kode;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setMerek(String merek) {
    this.merek = merek;
  }
  public void setHarga(float harga) {
    this.harga = harga;
  }
  public void setStok(int stok) {
    this.stok = stok;
  }
  public String getKode() {
    return kode;
  }
  public String getNama() {
    return nama;
  }
  public String getMerek() {
    return merek;
  }
  public float getHarga() {
    return harga;
  }
  public int getStok() {
    return stok;
  }

  //Abstract Method
  public abstract String getInfo();
}
