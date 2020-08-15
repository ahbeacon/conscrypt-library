import java.io.File;

public class Main {
  static {
    String libraryPath =
        new File(System.getProperty("user.dir"), "libconscrypt_openjdk_jni-linux-x86_64.so")
            .toString();
    System.load(libraryPath);
  }

  public static void main(String[] args) {
    System.out.println("Conscrypt is loaded");
  }
}
