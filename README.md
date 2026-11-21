# Guía básica del proyecto

Este repositorio contiene una aplicación de escritorio sencilla hecha con JavaFX y Maven. La aplicación abre una ventana con una vista inicial y permite alternar entre dos pantallas.

## Carpetas

| Ruta | Contenido y propósito |
| --- | --- |
| `.agents/` | Carpeta de configuración para agentes de desarrollo. Actualmente está vacía. |
| `.aws/` | Carpeta reservada para configuración relacionada con AWS. Actualmente está vacía; no contiene archivos visibles. |
| `.codex/` | Carpeta de configuración local de Codex. Actualmente está vacía. |
| `demo/` | Proyecto Maven que contiene el código de la aplicación JavaFX. |
| `demo/src/main/java/` | Código fuente Java de la aplicación. |
| `demo/src/main/java/pagina_inicial/` | Paquete principal: clase de arranque y controladores de las vistas. |
| `demo/src/main/resources/` | Recursos que se cargan junto con la aplicación. |
| `demo/src/main/resources/pagina_inicial/` | Archivos FXML que describen las dos pantallas. |
| `demo/target/` | Archivos compilados y copias de recursos generados por Maven. Es una salida de compilación, no el código fuente que normalmente se edita. |

## Archivos principales

- `demo/pom.xml`: configura Maven, Java 11, JavaFX Controls y FXML, y el complemento para ejecutar la aplicación.
- `demo/src/main/java/module-info.java`: declara el módulo Java `pagina_inicial`, sus dependencias JavaFX y permite que FXML acceda al paquete.
- `demo/src/main/java/pagina_inicial/App.java`: punto de entrada JavaFX. Carga `primary.fxml` al iniciar y ofrece un método para cambiar la raíz de la escena.
- `demo/src/main/java/pagina_inicial/PrimaryController.java`: controlador de la pantalla principal; su acción cambia a la pantalla secundaria.
- `demo/src/main/java/pagina_inicial/SecondaryController.java`: controlador de la pantalla secundaria; su acción regresa a la principal.
- `demo/src/main/resources/pagina_inicial/primary.fxml`: estructura visual de la pantalla principal y vínculo con `PrimaryController`.
- `demo/src/main/resources/pagina_inicial/secondary.fxml`: estructura visual de la pantalla secundaria y vínculo con `SecondaryController`.

## Flujo de la aplicación

1. Maven inicia `pagina_inicial.App`.
2. `App` carga `primary.fxml` y la muestra en una ventana.
3. Los botones llaman a métodos de sus controladores, que piden a `App` cargar la otra vista.

## Ejecutar

Desde la carpeta `demo/`, ejecuta:

```sh
mvn clean javafx:run
```

Se requiere tener Maven y un JDK compatible con Java 11 instalados.
