public class Buyer extends Person implements Login{
  private String alamatKirim;
  private float saldo;

  //Constructor
  public Buyer(String email, String nama, String noHp, String username, String password, String alamatKirim, float saldo) {
    super(email, nama, noHp, username, password);
    this.alamatKirim = alamatKirim;
    this.saldo = saldo;
  }

  //Constructor sederhana untuk data struk
  public Buyer(String nama, String noHp, String alamatKirim) {
    super("", nama, noHp, "", "");
    this.alamatKirim = alamatKirim;
    saldo = 0;
  }

  //setter and getter
  public void setAlamatKirim(String alamatKirim) {
    this.alamatKirim = alamatKirim;
  }
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
  public String getAlamatKirim() {
    return alamatKirim;
  }
  public float getSaldo() {
    return saldo;
  }

  //implementasi interface Login
  public boolean login() {
    System.out.println("Buyer " + getNama() + " berhasil login");
    return true;
  }
  public boolean logout() {
    System.out.println("Buyer " + getNama() + " logout");
    return true;
  }
}
