package StudentManagement;

/**
 * StudentManagement
 * Created by lmduc
 * Date 23/10/2021 - 17:44
 * Description: ...
 */
public class CheckUserInput {

    /**
     * Check if user input is a valid interger number or not
     * @param input String input from user
     * @return True if input is a valid interger number
     */
    public static boolean isInteger(final String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {}
        return false;
    }

    /**
     * Check if user input is a valid float number or not
     * @param input String input from user
     * @return True if input is a valid float number
     */
    public static boolean isFloat(final String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (Exception e) {}
        return false;
    }

}
