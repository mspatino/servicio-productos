# Escalar microservicio con puerto dinamico

### Spring asigne de manera automatica a servicio-productos
De esta manera queda mas escalable y no tenemos que configurar el despliegue con run configuration... Arguments --> -Dserver.port=9001, para eso dejamos el puerto con un valor de cero y dejamos una instancia-id con un valor aleatorio

## en el application.properties de servicio-productos modificamos 
* server.port=${PORT:0} [el puerto queda con un valor random lo asigna la aplicacion]

## y agregamos la linea p configurar la instancia
* eureka.instance.instance-id=${spring.application.name}:${spring.application.instance_id:${random.value}} 


