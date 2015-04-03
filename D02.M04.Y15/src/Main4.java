
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<String,String>();
        dict.put("Object", "anything that is visible or tangible and is relatively stable in form.");
        dict.put("Oriented", "to adjust with relation to, or bring into due relation to surroundings, circumstances, facts, etc.");
        dict.put("Program","a plan or schedule of activities, procedures, etc., to be followed.");

        System.out.println("Oriented : " + dict.get("Oriented"));

    }
}
