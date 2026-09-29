public class Seller extends Person {
  private String namaToko;
  private String alamatToko;

  //Constructor
  public Seller(String email, String nama, String noHp, String username, String password, String namaToko, String alamatToko) {
    super(email, nama, noHp, username, password);
    this.namaToko = namaToko;
    this.alamatToko = alamatToko;
  }

  //Constructor sederhana untuk data struk
  public Seller(String nama, String namaToko, String alamatToko) {
    super("", nama, "", "", "");
    this.namaToko = namaToko;
    this.alamatToko = alamatToko;
  }

  //setter and getter
  public void setNamaToko(String namaToko) {
    this.namaToko = namaToko;
  }
  public void setAlamatToko(String alamatToko) {
    this.alamatToko = alamatToko;
  }
  public String getNamaToko() {
    return namaToko;
  }
  public String getAlamatToko() {
    return alamatToko;
  }
}
