public class CodeGenerator {

    public static String buildReceiptCode(String name, int visitId) {


        String cleaned = (name == null) ? "GUEST" : name.trim();   // trim
        String upper = cleaned.toUpperCase();                      // toUpperCase

        String key;

        if (upper.length() >= 3) {                                 // length

            key = upper.substring(0, 3);                           // substring
        } else {

            key = (upper + "XXX").substring(0, 3);
        }

        char marker = !upper.isEmpty() ? upper.charAt(0) : 'G';  // charAt

        return key + "-" + marker + "-" + visitId;



    }
}

