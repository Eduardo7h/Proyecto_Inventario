# Guía básica del proyecto

Este repositorio contiene una aplicación de escritorio sencilla hecha con JavaFX y Maven. La aplicación abre una ventana con una vista inicial y permite alternar entre dos pantallas.

## Carpetas

| Ruta | Contenido y propósito |
| --- | --- |
| `demo/` | Proyecto Maven que contiene el código de la aplicación. |
| `demo/src/main/java/` | Distribucion de carpetas siguiendo la arquitectura heaxagonal. |
| `demo/src/main/java/application/` | Es el flujo de pasos que cordinanlas reglas del dominio para cumplir el objetivo. |
| `demo/src/main/java/application/port/in` | Interfaces definidas en la capa de dominio. |
| `demo/src/main/java/application/out` | Son las implementaciones de los puertos. |
| `demo/src/main/java/application/service` |  Coordina entidades del dominio, llama a puertos de salida (como repositorios o pasarelas de pago) |
| `demo/src/main/java/domain/model` | Son las reglas que definen que esta permitido y que no, independientemente de la interfaz. |
| `demo/src/main/java/infrastructure/` | En esta capa viven las implementaciones de las interfaces que definimos a nivel de dominio. |
| `demo/src/main/java/infrastructure/pagina_inicial` | Archivos FXML que describen las diferentes pantallas. |
| `demo/src/main/resources/` | Recursos que se cargan junto con la aplicación. |



## Archivos principales

- `demo/pom.xml`: configura Maven, Java 21.0.08, JavaFX Controls y FXML, y el complemento para ejecutar la aplicación.
- `demo/src/main/java/module-info.java`: declara el módulo Java `pagina_inicial`, sus dependencias JavaFX y permite que FXML acceda al paquete.
- `demo/src/main/java/infrastructure/pagina_inicial/App.java`: punto de entrada JavaFX. Carga `primary.fxml` al iniciar y ofrece un método para cambiar la raíz de la escena.
- `demo/src/main/java/infrastructure/pagina_inicial/PrimaryController.java`: controlador de la pantalla principal; su acción cambia a la pantalla secundaria.
- `demo/src/main/resources/pagina_inicial/primary.fxml`: estructura visual de la pantalla principal y vínculo con `PrimaryController`.


## Ejecutar

Desde la carpeta `demo/`, ejecuta:

```sh
mvn clean javafx:run
```

Se requiere tener Maven y un JDK compatible con Java 11 instalados.
