# Taller Docker
### Cristian Camilo Ruiz Santa

Este proyecto implementa un servidor Spark con operaciones matemáticas expuestas como servicios web REST. Los servicios incluyen cálculos de seno, coseno, verificación de palíndromos y cálculo de la magnitud de un vector. Además, se proporciona una página web interactiva para interactuar con estos servicios.

Se tiene el servidor en la clase `SparkWebServer` y el cliente html lo retorna la clase `WebPage`

- Repositorio en Docker Hub: `cristianruizsanta/tallerdocker1` 

## Cómo Ejecutar el Proyecto

1. **Construir la Imagen de Docker:**

    ```bash
    docker build --tag spark-web-server .
    ```

2. **Ejecutar Contenedores:**

    ```bash
    docker run -d -p 34000:6000 --name firstdockercontainer spark-web-server
    docker run -d -p 34001:6000 --name firstdockercontainer2 spark-web-server
    docker run -d -p 34002:6000 --name firstdockercontainer3 spark-web-server
    ```

   Puedes ajustar los puertos host (`34000`, `34001`, `34002`) según tus preferencias.

3. **Acceder a la Página Web:**

   Abre un navegador web y accede a alguna de las siguientes URLs:

   - [http://localhost:4567/home](http://localhost:4567/home)
   - [http://localhost:34000/home](http://localhost:34000/home)
   - [http://localhost:34001/home](http://localhost:34001/home)
   - [http://localhost:34002/home](http://localhost:34002/home)

   Utiliza la página web para realizar cálculos de seno, coseno, verificar palíndromos y calcular la magnitud de un vector.

    A continuación se muestran imágenes de cómo responde el servidor una vez ejecutado:
   - Contenedores:
   
        ![contenedor 1](/src/main/resources/images/contenedor1.JPG)
        ![contenedor 2](/src/main/resources/images/contenedor2.JPG)

  - Servidor directo:

    ![servidor](/src/main/resources/images/funciones.JPG)

4. **Acceder a los Servicios REST Directamente:**

    - Seno: [http://localhost:4567/sin/{valor}](http://localhost:34000/sin/{valor})
    - Coseno: [http://localhost:4567/cos/{valor}](http://localhost:34001/cos/{valor})
    - Palíndromo: [http://localhost:4567/palindromo/{cadena}](http://localhost:34002/palindromo/{cadena})
    - Magnitud de un Vector: [http://localhost:4567/vector/{param1}/{param2}](http://localhost:34000/vector/{param1}/{param2})
