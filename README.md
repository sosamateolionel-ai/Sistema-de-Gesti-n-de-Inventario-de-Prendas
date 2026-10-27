# Sistema de Gestión de Inventario de Prendas

## Descripción

Este proyecto implementa una clase `Prenda` en Java que permite administrar el inventario de una prenda de vestir según sus talles disponibles. El sistema permite cargar stock, registrar ventas, consultar cantidades y mostrar el inventario, aplicando validaciones para evitar cantidades negativas y operaciones sobre talles inexistentes.

## Funcionamiento

El programa crea una prenda llamada "Remera básica", con un precio de $12.000 y cuatro talles disponibles: S, M, L y XL. Inicialmente, todos los talles tienen stock cero.

Luego realiza distintas operaciones para comprobar el funcionamiento del sistema.

* **Carga de stock:** permite agregar unidades a un talle existente cuando la cantidad es mayor que cero.
* **Registro de ventas:** descuenta unidades del stock si hay suficiente cantidad disponible.
* **Validación de talles:** rechaza operaciones sobre talles que no existen, como XXL.
* **Control de cantidades:** impide ingresos y ventas con cantidades iguales o inferiores a cero.
* **Consulta de stock:** devuelve las unidades disponibles de un talle o `-1` si el talle no existe.
* **Visualización del inventario:** muestra el modelo, el precio y el stock de cada talle en el orden S, M, L y XL.

## Clases principales

### `Prenda`

Representa una prenda de vestir y administra su información y las cantidades disponibles para cada talle.

**Atributos:**

* `modelo`: nombre o modelo de la prenda.
* `precio`: precio de la prenda.
* `stockPorTalle`: mapa privado que relaciona cada talle con su cantidad disponible.

**Métodos principales:**

* `getModelo()`: devuelve el modelo de la prenda.
* `getPrecio()`: devuelve el precio.
* `consultarStock(String talle)`: consulta el stock de un talle específico.
* `agregarStock(String talle, int cantidad)`: incrementa el stock si el talle y la cantidad son válidos.
* `vender(String talle, int cantidad)`: registra una venta cuando hay unidades suficientes.
* `mostrarInventario()`: muestra el stock de todos los talles establecidos.

### `Main`

Contiene el método `main`, crea una prenda y ejecuta pruebas de carga de inventario, ventas, consultas y visualización del stock final.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** representación de una prenda mediante una clase.
* **Encapsulamiento:** protección de los atributos mediante el modificador `private`.
* **Colecciones:** utilización de `HashMap` y `Map` para asociar talles con cantidades.
* **Validación de datos:** comprobación de talles existentes y cantidades válidas.
* **Estructuras condicionales:** uso de `if` para controlar las operaciones permitidas.
* **Métodos con retorno booleano:** indican si una carga de stock o venta fue exitosa.
* **Ciclos:** utilización de `for-each` para recorrer los talles y mostrar el inventario.
* **Control de integridad:** evita que una venta deje el stock en valores negativos.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git y GitHub

## Ejecución

<img width="627" height="723" alt="image" src="https://github.com/user-attachments/assets/0f149e5c-6763-45dd-a412-ad02b88f05e6" />

## Resultado esperado

El programa carga correctamente 10 unidades del talle S, 15 del talle M y 8 del talle L. Rechaza la carga de un talle inexistente y una cantidad negativa.

Después de las ventas, el inventario final queda de la siguiente manera:

* **Talle S:** 10 unidades.
* **Talle M:** 10 unidades.
* **Talle L:** 0 unidades.
* **Talle XL:** 0 unidades.

Las ventas que superan el stock disponible son rechazadas sin modificar las cantidades. La consulta del talle M devuelve `10`, mientras que la consulta del talle XXL devuelve `-1`.

## Objetivo del ejercicio

Aplicar encapsulamiento, colecciones y validaciones en Java mediante una clase que permita gestionar el inventario de prendas por talle, controlar las ventas y mantener la consistencia de las cantidades disponibles.
