# App Hamburguesa

## Descripción

Este proyecto consiste en una aplicación que simula la creación y gestión de hamburguesas. Permite representar diferentes ingredientes y combinaciones, aplicando conceptos de Programación Orientada a Objetos (POO).

El sistema está diseñado para modelar cómo se construye una hamburguesa paso a paso, desde sus ingredientes hasta su visualización final.

---

## Objetivo

Desarrollar una aplicación que permita representar hamburguesas mediante clases y objetos, aplicando conceptos fundamentales de la Programación Orientada a Objetos.

---

## Funcionalidades

* Crear hamburguesas con diferentes ingredientes
* Mostrar la información de la hamburguesa
* Gestionar los datos de cada ingrediente
* Simular combinaciones de productos

---

## Estructura del proyecto

```bash
app-hamburguesa/
├── src/
│   ├── Hamburguesa.java
│   ├── Ingrediente.java
│   └── Main.java
└── README.md
```

---

## Explicación del código

### Clase Ingrediente

Representa los ingredientes de la hamburguesa.

```java
public class Ingrediente {
    private String nombre;

    public Ingrediente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
```

✔ Se aplica **encapsulación**
✔ El atributo es privado
✔ Se accede mediante un getter

---

### Clase Hamburguesa

Gestiona los ingredientes que componen la hamburguesa.

```java
import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {
    private List<Ingrediente> ingredientes;

    public Hamburguesa() {
        ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void mostrarHamburguesa() {
        System.out.println("Ingredientes de la hamburguesa:");
        for (Ingrediente i : ingredientes) {
            System.out.println("- " + i.getNombre());
        }
    }
}
```

✔ Uso de listas (`ArrayList`)
✔ Relación entre clases (**asociación/agregación**)
✔ Manejo de múltiples objetos

---

### Clase Main

Clase principal donde se ejecuta el programa.

```java
public class Main {
    public static void main(String[] args) {

        Hamburguesa hamburguesa = new Hamburguesa();

        Ingrediente i1 = new Ingrediente("Carne");
        Ingrediente i2 = new Ingrediente("Queso");
        Ingrediente i3 = new Ingrediente("Lechuga");

        hamburguesa.agregarIngrediente(i1);
        hamburguesa.agregarIngrediente(i2);
        hamburguesa.agregarIngrediente(i3);

        hamburguesa.mostrarHamburguesa();
    }
}
```

✔ Se crean los objetos
✔ Se agregan al sistema
✔ Se muestra el resultado

---

## Cómo ejecutar el proyecto

1. Abrir la terminal en la carpeta `src`
2. Compilar:

```bash
javac *.java
```

3. Ejecutar:

```bash
java Main
```

---

## Salida esperada

```bash
Ingredientes de la hamburguesa:
- Carne
- Queso
- Lechuga
```

---

## Conceptos aplicados

* Encapsulación
* Asociación / Agregación
* Uso de listas (ArrayList)
* Programación Orientada a Objetos

---

## Conclusión

Este proyecto permite comprender cómo se pueden modelar objetos del mundo real, como una hamburguesa, utilizando clases en Java. Además, ayuda a entender cómo interactúan diferentes objetos dentro de un sistema.

---

## Autor

Paula Cardenas
