### UNIVERSIDAD TECNOLÓGICA NACIONAL FACULTAD REGIONAL GENERAL PACHECO

#### Tecnicatura Universitaria en Programación

#### Laboratorio de computación IV

# TP 6 - Ejercicios de aplicaciones de escritorio y conexión a base de datos

## OBSERVACIONES:
1.   Debe haber una clase Principal que contenga el main. <b>SOLO DEBE HABER UN MAIN EN TODO EL PROYECTO.</b>
2.   Crear el correcto diagrama de clases.
3.   Se debe utilizar el gestor MySQL. Ejecutar el siguiente script sobre el mismo:
```bash
CREATE DATABASE `bdPersonas`;
USE bdPersonas;
CREATE TABLE `Personas`
(
`Dni` varchar(20) NOT NULL,
`Nombre` varchar(45) NOT NULL,
`Apellido` varchar(45) NOT NULL,
PRIMARY KEY (`Dni`));
```

## Ejercicio 
Se pide realizar un programa que lleve un registro de las personas que se encuentran trabajando en una empresa. En primer lugar, se deberá generar un menú que contengan las siguientes opciones:
✓  Agregar

✓  Modificar

✓  Eliminar

✓  Listar

Cada una de estas opciones abre el panel correspondiente.
Las cuatro opciones interactúan con la base de datos: en el panel Agregar, cuando se da clic en el botón Aceptar, se agrega a la base de datos; en el panel Modificar, cuando se da clic en el botón Aceptar se guardan los cambios en la base de datos; en el panel Eliminar, cuando se da clic en el botón Eliminar se elimina el registro en la base de datos y cuando se abre el panel Listar, se listan todas las personas registradas en la base de datos.

![Captura](https://github.com/user-attachments/assets/6c72706b-beb1-48a1-8634-34d552e0d927)

## Opción Agregar
Si el usuario elije la opción agregar, se abrirá un panel donde se mostrarán cajas de texto para ingresar nombre, apellido y DNI.

![Captura2](https://github.com/user-attachments/assets/d423cd61-5b77-46b8-b770-e73f09c9bfc5)

El botón Aceptar permite guardar los datos de una persona dentro de la base de datos. Estos se guardarán solo si completaron los tres datos. Luego se limpiarán los JTextField. Si no se completaron los tres datos se mostrará un mensaje aclaratorio.

![Captura3](https://github.com/user-attachments/assets/54c54e59-b54a-4b53-99f8-fb1f544c6145)

## Opción modificar
Si el usuario elije la opción modificar, se abrirá un panel donde se mostrará un JList cargado con los registros que se encuentren en la base de datos. Al hacer clic sobre un elemento  del  JList,  este  se  copiará  abajo  en  tres JTextField  distintos: uno  para  el nombre, otro para el apellido y el último para el DNI.
Se podrán modificar el nombre y el apellido. Al hacer clic sobre el botón Modificar se guardarán los cambios realizados en la base de datos y se limpiarán los JTextField. No se podrá modificar el DNI de la persona

Solo se podrán ingresar letras sobre el JTextField destinado al nombre y apellido de la persona. Solo se podrán ingresar números sobre el JTextField destinado al DNI de la persona. 
Para esto utilizar el evento keyListener, sobre las cajas de texto.
No  se  podrán  agregar  personas  con  DNI  ya  existentes. Realizar  la  validación correspondiente e informar al usuario en caso de que ingrese un DNI que ya exista en la base de datos

![Captura4](https://github.com/user-attachments/assets/18217890-52ae-4b6c-96e8-58839ea6f56b)

## Opción eliminar
Si el usuario elije la opción Eliminar, se abrirá un panel donde se mostrará un JList cargado con los registros que se encuentren en la base de datos. Al hacer clic sobre el botón Eliminar, se eliminará el elemento que este seleccionado, tanto de la base de datos  como del JList.  Informar  al  usuario  que  el  elemento  se  ha  eliminado correctamente.


![Captura5](https://github.com/user-attachments/assets/ecce72a7-e23d-4bd6-b0e4-dddc57077973)

## Opción Listar
Si el usuario elije la opción Listar, se abrirá un panel donde se mostrará un JTable cargado con los registros que se encuentren en la base de datos.


![Captura6](https://github.com/user-attachments/assets/358a9d75-80de-479c-baab-5916fb88e8a6)
