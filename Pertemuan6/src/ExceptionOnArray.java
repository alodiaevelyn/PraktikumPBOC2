/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : program penggunaan ekspresi menggunakan class library Java
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 26 Maret 2026
 */

public class ExceptionOnArray {
    public static void main (String[] args) {
    Integer[] arrayInteger = new Integer [4];
    try {
        arrayInteger [2] = 11;
        arrayInteger [4] = 10;
    } catch (ArrayIndexOutOfBoundsException exception) {
        exception.printStackTrace () ;
    } finally {
        System.out.println ("clean up code ... ");
        }
    }
}