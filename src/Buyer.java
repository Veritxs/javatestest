public class Buyer extends Person {
  private String alamatKirim;

  //Constructor
  public Buyer(String email, String nama, String noHp, String username, String password, String alamatKirim) {
    super(email, nama, noHp, username, password);
    this.alamatKirim = alamatKirim;
  }

  //Constructor sederhana untuk data struk
  public Buyer(String nama, String noHp, String alamatKirim) {
    super("", nama, noHp, "", "");
    this.alamatKirim = alamatKirim;
  }

  //setter and getter
  public void setAlamatKirim(String alamatKirim) {
    this.alamatKirim = alamatKirim;
  }
  public String getAlamatKirim() {
    return alamatKirim;
  }
}
