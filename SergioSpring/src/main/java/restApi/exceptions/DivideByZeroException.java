package restApi.exceptions;

public class DivideByZeroException extends Exception {

    private static final long serialVersionUID = -1344640670884805385L;

    public static final String DESCRIPTION = "Prueba de excepción";

    public static final int CODE = 666;

    public DivideByZeroException() {
        this("");
    }

    public DivideByZeroException(String detail) {
        super(DESCRIPTION + ". " + detail + ". CODE: " + CODE);
    }

}
