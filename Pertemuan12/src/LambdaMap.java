import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put ("240601", "Adi");
        mahasiswaMap.put("240602", "Bambang") ;
        mahasiswaMap.put("240603", "Cici");
        mahasiswaMap.put("240604", "Didi");

        mahasiswaMap.forEach((nim, nama) ->
            System.out.println("NIM: " + nim + " Nama: " + nama)
        );
    }
}