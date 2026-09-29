package com.penjualan;

import java.util.ArrayList;

public class Penjualan implements Cetak{
  private String idPenjualan;
  private String tglPenjualan;
  private ArrayList<Produk> listProduk;
  private Seller seller;
  private Buyer buyer;
  private String metodePembayaran;
  private float totalHarga;

  //Constructor
  public Penjualan(String id, String tgl, Seller seller, Buyer buyer, String metode) {
    idPenjualan = id;
    tglPenjualan = tgl;
    this.seller = seller;
    this.buyer = buyer;
    metodePembayaran = metode;
    listProduk = new ArrayList<Produk>();
    totalHarga = 0;
  }
  public Penjualan() {
    idPenjualan = "";
    tglPenjualan = "";
    seller = null;
    buyer = null;
    metodePembayaran = "";
    listProduk = new ArrayList<Produk>();
    totalHarga = 0;
  }

  //method penjualan
  public void tambahProduk(Produk produk) {
    if (produk.getStok() > 0) {
      listProduk.add(produk);
      produk.setStok(produk.getStok() - 1);
      hitungTotalHarga();
    } else {
      System.out.println("Stok " + produk.getNama() + " habis!");
    }
  }
  public float hitungTotalHarga() {
    totalHarga = 0;
    for (int i = 0; i < listProduk.size(); i++) {
      Produk produk = listProduk.get(i);
      totalHarga = totalHarga + produk.getHarga();
    }
    return totalHarga;
  }

  //setter and getter
  public void setIdPenjualan(String idPenjualan) {
    this.idPenjualan = idPenjualan;
  }
  public void setTglPenjualan(String tglPenjualan) {
    this.tglPenjualan = tglPenjualan;
  }
  public void setSeller(Seller seller) {
    this.seller = seller;
  }
  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }
  public void setMetodePembayaran(String metodePembayaran) {
    this.metodePembayaran = metodePembayaran;
  }
  public String getIdPenjualan() {
    return idPenjualan;
  }
  public String getTglPenjualan() {
    return tglPenjualan;
  }
  public ArrayList<Produk> getListProduk() {
    return listProduk;
  }
  public Seller getSeller() {
    return seller;
  }
  public Buyer getBuyer() {
    return buyer;
  }
  public String getMetodePembayaran() {
    return metodePembayaran;
  }
  public float getTotalHarga() {
    return totalHarga;
  }

  //implementasi interface Cetak
  public void cetakStruk() {
    System.out.println("========================================");
    System.out.println("             STRUK PENJUALAN            ");
    System.out.println("========================================");
    System.out.println("ID Penjualan : " + idPenjualan);
    System.out.println("Tanggal      : " + tglPenjualan);
    System.out.println("Toko         : " + seller.getNamaToko());
    System.out.println("Buyer        : " + buyer.getNama());
    System.out.println("Alamat Kirim : " + buyer.getAlamatKirim());
    System.out.println("----------------------------------------");
    for (int i = 0; i < listProduk.size(); i++) {
      Produk produk = listProduk.get(i);
      System.out.println(produk.getKode() + " - " + produk.getInfo());
      System.out.println("   Rp " + produk.getHarga());
    }
    System.out.println("----------------------------------------");
    System.out.println("Total        : Rp " + totalHarga);
    System.out.println("Pembayaran   : " + metodePembayaran);
    System.out.println("========================================");
  }
}
