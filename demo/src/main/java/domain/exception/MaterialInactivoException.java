//una excepción para cuando alguien intenta comprar o vender un material que el administrador desactivo
package domain.exception;

public class MaterialInactivoException extends RuntimeException {

    public MaterialInactivoException(String mensaje) {
        super(mensaje);
    }
}
