/* Nama File : MCoercion.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pembuat   : 24060124130087
 * Tanggal   : 23 April 2026
*/

public class MCoercion {
    public static void main(String[] args) {
        // Ilustrasi konsep coercion (konversi tipe data)
        System.out.println("Ilustrasi konsep coercion (konversi tipe data)");
        int intValue = 65;
        System.out.println("Integer: " + intValue);
        System.out.println("Karakter: " + (char) intValue);
        System.out.println("Real: " + (double) intValue);
        System.out.println("\n");

        // Konversi integer menjadi real dan dikembalikan ke integer lagi
        System.out.println("Konversi integer menjadi real dan dikembalikan ke integer lagi");
        double realValue = (double) intValue;
        int newIntValue = (int) realValue;
        System.out.println("Nilai integer awal: " + intValue);
        System.out.println("Konversi ke real: " + realValue);
        System.out.println("Konversi ke int: " + newIntValue);
        System.out.println("\n");

        // Konkatenasi dan penjumlahan string X dan Y
        System.out.println("Konkatenasi dan penjumlahan string X dan Y");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Konkatenasi X dan Y: " + S);
        System.out.println("Penjumlahan X dan Y: " + Z);
        System.out.println("\n");

        // Konkatenasi dan penjumlahan string P dan Q
        System.out.println("Konkatenasi dan penjumlahan string P dan Q");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi P dan Q: " + R);
        System.out.println("Penjumlahan P dan Q: " + D);
        System.out.println("\n");

        // Konversi string S ke integer
        System.out.println("Konversi string S ke integer");
        Integer A = Integer.parseInt(S);
        System.out.println("Konversi string S ke integer: " + A);
        System.out.println("\n");

        // Konversi integer A ke string
        System.out.println("Konversi string A ke integer");
        String T = A.toString();
        System.out.println("Konversi integer A ke string: " + T);
    }
}