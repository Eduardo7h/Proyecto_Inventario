# Aplicación JavaFX de inventario

Aplicación de escritorio construida con Java 21, JavaFX y Maven. La interfaz incluye pantallas para la vista principal, inventario, historial y modificación de precios. Por ahora, los controladores implementan principalmente la navegación entre esas pantallas; la lógica de negocio y el almacenamiento todavía están pendientes.

## Estructura

El proyecto Maven está dentro de `demo/`.

```text
demo/src/main/java/
├── application/
│   ├── port/in/       # Puertos de entrada (casos de uso)
│   ├── port/out/      # Puertos hacia servicios externos (repo)
│   └── service/       # Implementaciones de los casos de uso
├── domain/model/      # Tipos y modelos propios del dominio
├── infrastructure/
│   ├── pagina_inicial/ # Aplicación JavaFX y controladores
│   └── persistence/    # Adaptadores de almacenamiento
└── module-info.java

demo/src/main/resources/pagina_inicial/
├── CSS/               # Hojas de estilo
└── FXML/              # Vistas de JavaFX
```

La estructura reserva un lugar para las capas de una arquitectura hexagonal. Actualmente, `domain/model/` contiene enums de dominio y `infrastructure/pagina_inicial/` contiene la interfaz. Las carpetas de `application/` y `infrastructure/persistence/` aún no tienen implementaciones Java, así que los casos de uso, puertos y persistencia están pendientes.

## Archivos principales

- `demo/pom.xml`: configura Java 21, JavaFX 21.0.8 y el complemento Maven para ejecutar la aplicación.
- `demo/src/main/java/module-info.java`: declara el módulo Java y abre los controladores a FXML.
- `demo/src/main/java/infrastructure/pagina_inicial/App.java`: punto de entrada; carga la vista inicial y permite cambiar de pantalla.
- `demo/src/main/java/infrastructure/pagina_inicial/`: controladores JavaFX.
- `demo/src/main/resources/pagina_inicial/FXML/`: archivos FXML de las vistas.
- `demo/src/main/resources/pagina_inicial/CSS/`: estilos de las vistas.

## Requisitos

- JDK 21
- Maven

## Ejecutar

Desde la raíz del repositorio:

```sh
cd demo
mvn clean javafx:run
```

`mvn clean` elimina clases y recursos compilados antiguos antes de iniciar la aplicación.