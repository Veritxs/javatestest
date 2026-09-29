public abstract class Produk {
  private String kode;
  private String nama;
  private int ukuran;
  private float harga;
  private int stok;

  //Constructor
  public Produk(String kode, String nama, int ukuran, float harga, int stok) {
    this.kode = kode;
    this.nama = nama;
    this.ukuran = ukuran;
    this.harga = harga;
    this.stok = stok;
  }

  //setter and getter
  public void setKode(String kode) {
    this.kode = kode;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setUkuran(int ukuran) {
    this.ukuran = ukuran;
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
  public int getUkuran() {
    return ukuran;
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
