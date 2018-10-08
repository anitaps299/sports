# sports
Este repositorio contiene mis resultados de la prueba los conocimientos adquiridos durante el curso. 

## Despliegue
- Es necesario modificar el fichero application.yml, indicando tu usuario y contraseña de tu gestor de base de datos (por ejemplo, de mysql).
- Es necesario crear una base de datos llamada "sports".
- Cabe destacar, que también tenemos un modelo más "Points" que deberemos rellenar manualmente en nuestra base de datos.

## Para acceder a las distintas funcionalidades que nos solicitaba el enunciado

### Club

Para acceder al CRUD de club (solo create) la ruta es: "/club".

### Runner

Para acceder al CRUD de runner la ruta es: "/club/{idClub}/runner", dado que no concibo que un corredor sin un club.

-> En esta sección nos encontramos el paginado (findAll).

### Trail

Para acceder al CRUD de trail (solo create) la ruta es: "/trail".

### Result

Para acceder al CRUD de result (solo create y read) la ruta es: "/trail/{idTrail}/result", dado que no concivo unos resultados sin su prueba.
