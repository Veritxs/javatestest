public class Seller extends Person implements Login{
  private String namaToko;
  private String alamatToko;
  private float rating;

  //Constructor
  public Seller(String email, String nama, String noHp, String username, String password, String namaToko, String alamatToko, float rating) {
    super(email, nama, noHp, username, password);
    this.namaToko = namaToko;
    this.alamatToko = alamatToko;
    this.rating = rating;
  }

  //Constructor sederhana untuk data struk
  public Seller(String nama, String namaToko, String alamatToko) {
    super("", nama, "", "", "");
    this.namaToko = namaToko;
    this.alamatToko = alamatToko;
    rating = 0;
  }

  //setter and getter
  public void setNamaToko(String namaToko) {
    this.namaToko = namaToko;
  }
  public void setAlamatToko(String alamatToko) {
    this.alamatToko = alamatToko;
  }
  public void setRating(float rating) {
    this.rating = rating;
  }
  public String getNamaToko() {
    return namaToko;
  }
  public String getAlamatToko() {
    return alamatToko;
  }
  public float getRating() {
    return rating;
  }

  //implementasi interface Login
  public boolean login() {
    System.out.println("Seller " + getNama() + " berhasil login");
    return true;
  }
  public boolean logout() {
    System.out.println("Seller " + getNama() + " logout");
    return true;
  }
}
