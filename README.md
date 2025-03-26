<h1 align = "center"> <em> Recolector de datos </em> </h1>
<h2>Índice</h2>

+ [Descripción del proyecto](https://github.com/bianny1107/Colectordatos/blob/master/README.md#-descripci%C3%B3n-del-proyecto) <br>
+ [Tecnologías utiizadas](https://github.com/bianny1107/Colectordatos/blob/master/README.md#%EF%B8%8F-tecnolog%C3%ADas-utilizadas) <br>
+ [Interfaz](https://github.com/bianny1107/Colectordatos/blob/master/README.md#-interfaz) <br>
+ [Funcionamiento](https://github.com/bianny1107/Colectordatos/blob/master/README.md#%EF%B8%8F-funcionamiento) <br>
+ [Autoría](https://github.com/bianny1107/Colectordatos/blob/master/README.md#autor%C3%ADa) <br><br>

## 💭 Descripción del proyecto</h2>
<p>
El recolector de datos es una aplicación hecha en Android Studio que permite recolectar datos personales de un individuo (tales como nombre, edad, teléfono o ciudad) y guardarlos en una base de datos, permitiendo la edición, búsqueda y eliminación de los diversos campos.

El objetivo de este ejercicio es poner en práctica los conocimientos adquiridos sobre el uso de base de datos dentro de una aplicación móvil.
</p><br>

## 🛠️ Tecnologías utilizadas
![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)
![XML](https://img.shields.io/badge/XML-FF6600?style=for-the-badge&logo=xml&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)

<br>

## 📱 Interfaz
<p>A continuación, se presenta la interfaz de usuario de la aplicación de recolección de datos.</p>

![Interfaz](https://github.com/bianny1107/Colectordatos/blob/master/app/images/interfaz.png)

<br>

## ⚙️ Funcionamiento
### Función insertar
<p>La función insertar, representada en el botón con el símbolo de más, permite insertar y almacenar la data del individuo en la base de datos. <br>
Los pasos para insertar data son: <br>
  1. Insertar toda la información del individuo en los lugares correspondientes.<br>
  2. Hacer click en el botón de insertar.
</p>

![Insertar](https://github.com/bianny1107/Colectordatos/blob/master/app/images/insertar.png)

<br>
<p>Al hacer click en el botón, aparecerá el siguiente mensaje:</p>

![Mensaje insertar](https://github.com/bianny1107/Colectordatos/blob/master/app/images/mensajeinsertar.png)

<br>
<p>En esta imagen, se muestra cómo luce la base de datos después de haber ingresado la información de varios individuos.</p>

![Base de datos](https://github.com/bianny1107/Colectordatos/blob/master/app/images/basedatos.png)

<br>
<p>Es de suma importancia colocar toda la información dentro de cada campo, de lo contrario, el sistema lanzará el siguiente mensaje:</p>

![Mensaje insertar 2](https://github.com/bianny1107/Colectordatos/blob/master/app/images/mensajeinsertar2.png)

<br>
<hr>

### Función buscar
<p>La función buscar, representada por el botón con una lupa, permitirá buscar toda la información referente a un individuo a través del número de ID referente al mismo. <br>
Los pasos para buscar la data de un individuo son:<br>
  1. Insertar el número de ID del individuo a buscar.<br>
  2. Hacer click en el botón de buscar
</p>

![Buscar](https://github.com/bianny1107/Colectordatos/blob/master/app/images/buscar1.png)

<br>
<p>Al insertar el ID y hacer click en el botón de buscar, toda la información relacionada con ese ID aparecerá en su campo correspondiente, como se puede ver a continuación para búsqueda del ID 01.</p>

![Buscar 2](https://github.com/bianny1107/Colectordatos/blob/master/app/images/buscar2.png)

<br>
<p>En caso de que el ID no se encuentre, se mostrará el siguiente mensaje en pantalla:</p>

![Mensaje registro no encontrado](https://github.com/bianny1107/Colectordatos/blob/master/app/images/mensajebuscar.png)

<br>

<p>Como se puede observar, se trató de buscar el ID 09, el cual no se encuentra dentro de la base de datos, apareciendo un mensaje en la parte inferior de la pantalla que informa que ese registro no fue encontrado.</p>
<br>

<hr>

### Función eliminar
<p>La función eliminar, representada por el botón con una x de color roja, permite eliminar la información del ID relacionado con un individuo. <br>
Los pasos para eliminar la data de individuo son: <br>
  1. Insertar el ID del individuo. <br>
  2. Hacer click en el botón de eliminar. <br><br>
En caso de que se desee rectificar que es el data del individuo al que deseamos eliminar, se puede ingresar el ID del individuo, hacer click en buscar y luego hacer click en eliminar. <br><br>

En estos casos, aparecerá el siguiente mensaje:
</p>

![Eliminar](https://github.com/bianny1107/Colectordatos/blob/master/app/images/eliminar.png)

<p>Así luce la base de datos después del proceso de eliminación de todos los números de identificación, menos el 01:</p>

![Base de datos eliminar](https://github.com/bianny1107/Colectordatos/blob/master/app/images/basedatoseliminar.png)

<br>
<hr>

### Función modificar
<p>La función modificar, representada por el botón con la imagen de un lápiz, permmite modificar cualquier información relacionada con ID previamente almacenado en la base de datos. <br>
Los pasos para modificar la información relacionada con un ID son: <br>
  1. Insertar el número de ID que desea modificarse, para que aparezca la información en los campos correspondientes. <br>
  2. Modificar la información deseada. <br>
  3. Hacer click en el botón modificar. <br><br>

En esta imagen, podemos apreciar que, al modificar un elemento de la base de datos, se mostrará un mensaje en la parte inferior de la pantalla que informa que el registro ha sido modificado exitosamente. 
</p>

![Modificar](https://github.com/bianny1107/Colectordatos/blob/master/app/images/modificar.png)

<br>

<p>Para comprobar que los cambios se hayan hechos, podemos comparar cómo lucen ambas bases de datos antes y después de la modificación</p>

<p align = "center">
  <img src = "https://github.com/bianny1107/Colectordatos/blob/master/app/images/basedatoseliminar.png" alt= "Base antes" width = 45%/>
  <img src = "https://github.com/bianny1107/Colectordatos/blob/master/app/images/basedatosmodificar.png" alt= "Base después" width = 45%/>
</p>
<br>

## 👤Autoría
<p>Bianny Michelle Peña Rosario, 2022-0443</p>
