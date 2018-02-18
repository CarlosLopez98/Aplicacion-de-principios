# Aplicacion-de-principios
Aplicación de principios
Para demostrar los principios de sustitución de Liskov, responsabilidad única y el principio de egoísmo utilizamos como ejemplo una máquina expendedora de helados, el usuario digita el nombre e id, luego selecciona si desea un helado de agua o uno de yogurt, si el usuario desea uno de agua se le pregunta el sabor y se le otorga el helado (paleta), en caso de querer uno de Yogurt se le preguntaran cuantas bolas de helado desea (de 1 a 4), y se le otorgara su helado.
Como se utilizó sustitución de Liskov
Este principio se implementa siempre y cuando una de las clases que es implementada no posee métodos de sobra cuando uno utiliza otro y no se deben crear excepciones en caso de que los tenga, nuestro programa utiliza atributos generales, por ejemplo, la clase persona puede ser eliminada sin alterar el funcionamiento normal del programa, en caso de incluir otro tipo de cliente se puede agregar otra clase y agregarle los requerimientos necesarios
Como se utilizó responsabilidad única 
Se crearon clases especializadas para cada función, ejemplo: se tomaron los sabores de paleta de agua en una sola clase, los sabores de helado de yogurt en otra, cada clase se usa para una función específica y no en otro caso
Como se utilizó principio del egoísmo
Las clases no interfieren en el comportamiento de otras, solo en su función propia y en los métodos que las invocan, por ejemplo:
La clase consola solo se comunica con las clases PaletaAgua y Yogurt, pero no se comunica con las clases SaborA y SaborY, al cliente no le interesa controlar los tipos de sabores que hay sino listarlos.

