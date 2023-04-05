# Convertidor de monedas

Este proyecto es un convertidor de monedas simple y fácil de usar implementado en Java. Permite al usuario convertir montos entre diferentes monedas, incluyendo Dólar estadounidense (USD), Euro (EUR), Yen japonés (JPY), Libra esterlina (GBP), Peso argentino (ARS) y Peso mexicano (MXN).

## Estructura del proyecto

El proyecto se divide en varias clases y enumeraciones para facilitar la comprensión y mantenimiento del código:

- `Currency`: Una enumeración que representa las monedas admitidas por el convertidor.
- `ConversionRate`: Una clase que contiene las tasas de cambio entre las monedas admitidas y proporciona un método para obtener la tasa de cambio entre dos monedas.
- `CurrencyConverter`: Una clase que implementa la funcionalidad de conversión de monedas utilizando las tasas de cambio proporcionadas por la clase `ConversionRate`.
- `Main`: La clase principal del proyecto que contiene el punto de entrada del programa y la interfaz de usuario de línea de comandos.

## Decisiones de implementación

### Uso de una matriz bidimensional para almacenar las tasas de cambio

Se eligió utilizar una matriz bidimensional en la clase `ConversionRate` para almacenar las tasas de cambio entre las monedas. Esta decisión se tomó porque:

- Simplifica el código y lo hace más fácil de leer y mantener.
- Proporciona un acceso rápido y eficiente a las tasas de cambio entre dos monedas.
- Facilita la actualización de las tasas de cambio, ya que solo es necesario actualizar los valores en la matriz.

### Uso de clases y enumeraciones

Se utilizan clases y enumeraciones para organizar el código y separar las responsabilidades de diferentes componentes del proyecto. Esto facilita la comprensión del código y permite a los desarrolladores trabajar de manera más eficiente en partes específicas del proyecto.

- La enumeración `Currency` representa las monedas admitidas y proporciona un medio fácil y seguro de referirse a ellas en todo el código.
- La clase `ConversionRate` se encarga de almacenar y proporcionar acceso a las tasas de cambio entre las monedas.
- La clase `CurrencyConverter` se encarga de realizar la conversión de monedas utilizando las tasas de cambio proporcionadas por `ConversionRate`.
- La clase `Main` se encarga de la interfaz de usuario y la interacción con el usuario.

## Cómo usar el convertidor de monedas

1. Compile el proyecto utilizando un entorno de desarrollo integrado (IDE) o herramientas de línea de comandos como `javac`.
2. Ejecute la clase `Main` del proyecto para iniciar la interfaz de usuario de línea de comandos.
3. Siga las instrucciones en pantalla para seleccionar las monedas de origen y destino, así como el monto que desea convertir.
4. El programa mostrará el resultado de la conversión utilizando las tasas de cambio almacenadas en la clase `ConversionRate`.

Nota: Las tasas de cambio utilizadas en este proyecto son solo ejempemple y pueden no ser precisas en el momento en que las use. Se recomienda actualizar las tasas de cambio en la clase `ConversionRate` antes de utilizar el programa.

## Contribuciones

Las contribuciones al proyecto son bienvenidas. Si desea agregar más monedas, actualizar las tasas de cambio o mejorar la funcionalidad del programa, no dude en enviar un Pull Request o abrir un Issue en el repositorio del proyecto.

## Licencia

Este proyecto se distribuye bajo la licencia Moraño Jimena. Consulte el archivo `LICENSE` para obtener más información.

Proyecto Oracle One y Alura Latam
