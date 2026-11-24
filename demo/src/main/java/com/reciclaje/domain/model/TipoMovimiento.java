package com.reciclaje.domain.model;

/*Este enum sirve para que cada registro de Movimientos_Inventario diga
por qué cambió el inventario: por una compra, por una venta o por un ajuste manual del administrador. */
public enum TipoMovimiento {
    ENTRADA_COMPRA,
    SALIDA_VENTA,
    AJUSTE_ENTRADA,
    AJUSTE_SALIDA
}
