package domain.exception;

public class PesoInvalidoException extends RuntimeException {

    public PesoInvalidoException(String mensaje) {
        super(mensaje);
    }
}