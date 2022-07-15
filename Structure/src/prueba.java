
import java.util.regex.Pattern;


public class prueba {
    
    private static final Pattern pattern = Pattern.compile("(.+\\/)(.+)(\\..+)");
    public static void main(String[] args) {
        System.out.println(isProcessing("input-destokenize/b2nnnnnn.pmaa"));
    }
    
    private static boolean isProcessing(String fileName) {
    boolean processing = false;
    String nameWithExtension = pattern.matcher(fileName).replaceAll("$2") + pattern.matcher(fileName).replaceAll("$3");
    if (nameWithExtension.matches("^a2.*.cra$") || nameWithExtension.matches("^a3.*.cra$") || nameWithExtension.matches("^b2.*.pma$")) {
      processing = true;
    } else {
        System.out.println("NO VA A HACER NADA: " + nameWithExtension);
    }
    return processing;
  }
}
