# Sistema de Gestión y Predicción de Precios
Este proyecto busca integrar la gestión de inventario con análisis predictivo, proporcionando una herramienta sencilla y útil para pequeños negocios, almacenes o emprendedores. La idea es no solo gestionar productos, sino también predecir posibles precios futuros a partir de datos históricos, ayudando a optimizar la toma de decisiones comerciales.

# Objetivos Principales
* Gestión de Inventario:
* Registro de productos: Permite al usuario agregar productos con su nombre, precio base y cantidad disponible.
* Visualización en lista: Los productos registrados se muestran en una lista que facilita el control del inventario.
* Actualización automática: Después de cada registro, los campos se limpian para añadir nuevos productos rápidamente.
* Análisis Predictivo mediante Regresión Lineal:
* Predicción de precios: A través de un modelo matemático, la aplicación predice el precio futuro de un producto basándose en datos históricos de ventas y precios.
* Cálculo del error (MSE): La aplicación mide qué tan preciso es el modelo utilizando el error cuadrático medio (MSE), ayudando al usuario a evaluar la calidad de las predicciones.
# Arquitectura del Proyecto
* JavaFX: Maneja la interfaz gráfica, permitiendo la interacción visual del usuario con el sistema.
* Vista en FXML: El archivo VentasView.fxml define los elementos visuales (campos de texto, botones, listas, etc.).
* Controlador Java: La clase VentasController vincula las acciones del usuario (como clic en botones) con la lógica de negocio.
* C++: Realiza los cálculos matemáticos necesarios para el modelo de regresión lineal.
* main.cpp: Punto de entrada del código C++ que coordina el proceso de predicción.
* regresion_lineal.cpp y regresion_lineal.h: Implementan el modelo de regresión y las funciones asociadas para entrenar, predecir y medir la precisión del modelo.
# Flujo del Proyecto
* Interacción con la Interfaz:
1. El usuario abre la aplicación y registra productos ingresando su nombre, precio y cantidad.
2. Los productos se muestran en una lista visible, permitiendo llevar un control del inventario en tiempo real.
* Predicción de Precios:
3. El usuario introduce un valor en el campo de ventas para predecir el precio futuro correspondiente.
4. La aplicación usa el modelo de regresión lineal desarrollado en C++ para realizar la predicción.
5. Se muestra el precio estimado y un mensaje con el resultado de la predicción.
# Fórmula Utilizada para la Predicción de Precios
* La aplicación predice el precio futuro de un producto mediante la siguiente fórmula de regresión lineal:
makefile
Copiar código
Precio_Predicho = α + β * Ventas_Históricas
Donde:
α es la constante del modelo.
β es el coeficiente de regresión.
Ventas_Históricas representa los datos de ventas previas del producto.
La precisión del modelo se mide utilizando el error cuadrático medio (MSE):
scss
# Impacto del Proyecto
* Este sistema ayuda a los pequeños negocios a:

1. Anticipar cambios en los precios de los productos en función de la demanda y ventas previas.
2. Optimizar la gestión del inventario con una lista clara de productos y su disponibilidad.
3. Tomar decisiones estratégicas basadas en predicciones precisas para mejorar la rentabilidad.
# Ejecución del Programa
* Para ejecutar el proyecto, asegúrate de contar con lo siguiente:

1. Un entorno que soporte JavaFX para la interfaz gráfica.
2. Un compilador que soporte C++ para ejecutar los cálculos del modelo de regresión lineal.
* Requisitos:
1. Java 8 o superior.
2. C++ compilador como g++ o similar.
3. El programa puede ejecutarse en cualquier entorno compatible con JavaFX y C++, como por ejemplo Replit, IntelliJ IDEA (para la interfaz gráfica) y g++ (para el código de C++).

Este README ofrece una descripción detallada de las funciones y la estructura de tu proyecto, además de las instrucciones básicas para ejecutarlo. ¡Espero que sea útil para tu documentación!







