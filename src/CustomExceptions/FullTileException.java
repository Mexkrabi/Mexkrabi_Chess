package CustomExceptions;

/**
 * reference file:
 *
 * @link http://www.seasite.niu.edu/cs580java/testexception.htm
 */
public class FullTileException extends Exception {

    private String message;

    public FullTileException(String message) {
        super(message);
    }

    public String getError() {
        return message;
    }
}
