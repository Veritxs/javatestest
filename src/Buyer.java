public class Buyer extends Person {
  private String alamatPribadi;

  //Constructor
  public Buyer(String email, String nama, String noHp, String username, String password, String alamatPribadi) {
    super(email, nama, noHp, username, password);
    this.alamatPribadi = alamatPribadi;
  }

  //Constructor sederhana untuk data struk
  public Buyer(String nama, String noHp, String alamatPribadi) {
    super("", nama, noHp, "", "");
    this.alamatPribadi = alamatPribadi;
  }

  //setter and getter
  public void setAlamatPribadi(String alamatPribadi) {
    this.alamatPribadi = alamatPribadi;
  }
  public String getAlamatPribadi() {
    return alamatPribadi;
  }
}
