//cuando alguien intenta pasar a PAGADO una operación que ya lo estaba
package domain.exception;

public class OperacionYaPagadaException extends RuntimeException {

    public OperacionYaPagadaException(String mensaje) {
        super(mensaje);
    }
}