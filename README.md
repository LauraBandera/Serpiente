# Serpiente
Por todos es sabido que las serpientes de cascabel son animales de "sangre fría", lo que significa que no son capaces de regular 
su temperatura corporal y que por tanto dependen de la temperatura ambiental para sobrevivir.

Para incrementar su temperatura interna suelen tomar el sol en rocas u otro tipo de suelos que transmiten bien el calor. De esta forma 
consiguen subir su temperatura en un corto espacio de tiempo y pueden volver a lugares seguros donde son menos visibles.

Aunque son capaces de sobrevivir con temperaturas bajas, en ciertos momentos les resulta imprescindible mantener una temperatura 
corporal elevada. Uno de esos momentos es durante la caza: la temperatura elevada proporciona la energía necesaria para la actividad. 

Otro momento importante es inmediatamente después, durante la digestión. En caso de que sus cuerpos sufrieran un enfriamiento, 
la presa engullida podría pudrirse y terminar matándolas "desde dentro".

Debido a esto, las cascabel deben planificar muy bien cuándo salir de caza. Necesitan buscar el momento del día en el que la temperatura 
ambiente se mantiene por encima de un umbral por más tiempo; eso les garantiza que tendrán tiempo suficiente para calentarse, buscar la presa, 
cazarla y digerirla.

Como miembros del equipo de apoyo de los biólogos americanos que estudian la fauna local, debemos comprobar si las serpientes escogen el momento 
de caza de forma óptima o no. Nuestra primera tarea es analizar la secuencia de temperatura ambiente de un día y encontrar la duración del periodo 
más largo en la que esa temperatura se mantiene lo suficientemente elevada. Eso sí, las serpientes tienen cierta tolerancia y admiten pequeños 
intervalos de tiempo con temperaturas por debajo del umbral deseado.

La entrada de datos del algoritmo estará compuesta por los siguientes valores:
  Primero, hay que indicar el número de mediciones de temperatura realizadas (1 ≤ n ≤ 100), 
  Segundo, el número, k,  es el número de mediciones consecutivas por debajo del umbral que una serpiente es capaz de soportar entre dos mediciones con temperaturas altas.
  Tercero, un conjunto de n números que serán siempre ceros o unos. Un cero indica una temperatura de riesgo demasiado baja para la serpiente (debajo del umbral), mientras que un uno indica una temperatura aceptable (por encima del umbral).

Por cada caso de prueba se escribirá la longitud del periodo más largo (medido en número de muestras) que tiene la serpiente para cazar la presa y digerirla, así como el momento en el que la serpiente debe salir a por su presa. Un periodo es válido si comienza y termina por una temperatura aceptable y entre esas dos temperaturas por encima del umbral no hay más de k medidas consecutivas con temperaturas por debajo.
 
