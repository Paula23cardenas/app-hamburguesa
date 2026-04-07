# 🍔 App de Hamburguesas en Java

## 📌 Descripción
Este proyecto es una aplicación sencilla en Java que permite crear hamburguesas personalizadas.  
El usuario puede elegir diferentes opciones como:

- Tipo de pan  
- Doble carne o sencilla  
- Salsas  
- Queso  
- Tocineta  
- Verduras  
- Tamaño de la hamburguesa  

El programa muestra en consola el pedido completo.

---

## 🧱 Estructura del Proyecto

El proyecto contiene dos clases principales:

### 🔹 `App.java`
Clase principal donde se ejecuta el programa.

Funciones:
- Crear objetos de tipo `Hamburguesa`
- Mostrar los pedidos en consola

---

### 🔹 `Hamburguesa.java`
Clase que representa una hamburguesa.

#### Atributos:
- `tipoPan`
- `dobleCarne`
- `conSalsas`
- `conQueso`
- `conTocineta`
- `conVerduras`
- `tamano`

---

## ⚙️ Funcionamiento

### ✅ Crear hamburguesas

```java
Hamburguesa h1 = new Hamburguesa("integral", true, true, true, true, true, "grande");
Hamburguesa h2 = new Hamburguesa("blanco", false, false, false, false, false, "mediana");
