# **Challenge ForoHub**

## **Descripción**
**ForoHub** es una API RESTful diseñada para gestionar un foro interactivo donde los usuarios pueden crear y responder preguntas sobre una variedad de temas. Inspirada en la colaboración entre comunidades de aprendizaje, esta API facilita el intercambio de conocimientos entre participantes.

La API soporta la gestión de temas, usuarios y respuestas, implementando operaciones CRUD (Crear, Leer, Actualizar, Eliminar) y aplicando buenas prácticas de desarrollo con **Spring Boot**.

---

## **Funciones Clave**

- **CRUD completo** para la administración de temas y respuestas.
- **Validaciones personalizadas** basadas en lógica de negocio.
- **Autenticación segura** mediante tokens JWT.
- **Persistencia de datos** utilizando MySQL.
- **Documentación interactiva** accesible a través de Swagger.

---

## **Requisitos Previos**

Antes de comenzar, asegúrate de contar con:

- **JDK 17** o superior.
- **Maven** como herramienta de gestión de dependencias.
- **MySQL** como sistema de base de datos.

---

## **Instalación y Configuración**

### **1. Clonar el Repositorio**

```bash
git clone https://github.com/TheRealVarpus/ChallengeForoHub.git
cd ChallengeForoHub
```

### **2. Configurar la Base de Datos**

Asegúrate de que MySQL esté activo. Configura los detalles de conexión en el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ChallengeForoHub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

Crea la base de datos requerida:

```sql
CREATE DATABASE ChallengeForoHub;
```

El esquema y las tablas se generarán automáticamente al iniciar la aplicación gracias a Flyway.

### **3. Instalar Dependencias**

Ejecuta el siguiente comando para compilar el proyecto y descargar las dependencias:

```bash
mvn clean install
```

### **4. Iniciar la Aplicación**

Ejecuta la aplicación con:

```bash
mvn spring-boot:run
```

Accede a la API desde `http://localhost:8080`.

---

## **Principales Endpoints**

- **Autenticación**:
  - `POST /auth/login`: Genera un token JWT tras iniciar sesión.
- **Temas**:
  - `GET /topics`: Devuelve la lista de temas.
  - `GET /topics/{id}`: Consulta los detalles de un tema.
  - `POST /topics`: Crea un nuevo tema.
  - `PUT /topics/{id}`: Actualiza un tema existente.
  - `DELETE /topics/{id}`: Elimina un tema.

---

## **Documentación Interactiva**

Utiliza Swagger para explorar y probar los endpoints disponibles:

- **Documentación API**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)
- **Interfaz Swagger**: [http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/)

---

## **Tecnologías Utilizadas**

- **Spring Boot** para un desarrollo eficiente.
- **JWT** para gestión de autenticación.
- **Flyway** para migraciones automáticas de base de datos.
- **MySQL** como base de datos relacional.
- **Swagger** para documentación.
- **Lombok** para reducir el código boilerplate.

---

## **Contribuciones**

Las contribuciones son bienvenidas. Sigue estos pasos para colaborar:

1. Realiza un fork del repositorio.
2. Crea una rama para tus cambios: `git checkout -b nueva-funcionalidad`.
3. Realiza tus modificaciones y haz un commit: `git commit -m "Descripción de los cambios"`.
4. Envía tus cambios: `git push origin nueva-funcionalidad`.
5. Crea un Pull Request.

---

**Gracias por contribuir al desarrollo del ForoHub!**
