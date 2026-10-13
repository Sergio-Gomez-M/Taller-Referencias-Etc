1. Predicción del Reto 1
Salidas impresas:
true (El objeto b nace disponible por defecto).
false (El objeto original apuntado por c fue prestado previamente mediante c.prestar()).
false (a fue reasignado para apuntar a b, mientras que c sigue apuntando al objeto inicial).

2. Respuestas a las Preguntas de Comprensión
1. ¿Qué guarda una variable int y qué guarda una variable Libro?
   Un int guarda directamente el valor numérico en la variable (tipo primitivo). Una variable Libro guarda una referencia (una dirección de memoria o "flecha") que apunta a dónde se encuentra ubicado el objeto en la memoria heap.
2. ¿Por qué prestar con l2 cambió l1 pero no l3?
   Porque L2 se declaró como Libro l2 = l1;, lo que significa que L2 y L1 comparten la misma referencia exacta (son alias del mismo objeto). En cambio, L3 se creó mediante un nuevo new, por lo que representa un objeto totalmente independiente en memoria.
3. ¿Por qué el compilador no detectó la NullPointerException?
  Porque la NullPointerException es un error de tiempo de ejecución (runtime), no de sintaxis. El código está bien escrito para el compilador, pero al ejecutar el programa, Java intenta usar el operador punto sobre una variable que apunta a null y el sistema se detiene.
4. ¿Qué diferencia hay entre modificar el objeto que recibe un método y asignarle uno nuevo a su parámetro?
   Modificar el estado interno del objeto recibido (por ejemplo, llamando a un método sobre él) sí se refleja afuera porque el método y el invocador comparten la misma referencia al mismo objeto. Asignar un objeto totalmente nuevo al parámetro con new solo cambia la copia local de la referencia dentro del ámbito del método, sin alterar la variable original de quien llamó.
5. ¿Qué invariantes protege Libro y cómo las protege?
  Protege la invariante de que el título nunca sea nulo ni vacío. Las protege declarando el atributo como private y obligando a que cualquier modificación pase estrictamente a través de setTitulo() (método que también es reutilizado por el constructor), el cual evalúa el dato y le asigna por defecto "Sin título" si detecta valores inválidos.
