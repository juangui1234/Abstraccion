# Taller: Herencia, Polimorfismo y Formularios Dinámicos en Java Swing

## 📌 Descripción

Este proyecto implementa un formulario dinámico en Java Swing para el registro de personas del tipo **Veterinario** o **Propietario**, haciendo uso de **herencia**, **polimorfismo**, **validaciones** y un diseño de interfaz gráfica sencillo pero funcional.

El sistema permite agregar y eliminar personas, mostrando sus datos a través de una lista polimórfica.

---

## ✅ Requisitos del Taller y Cumplimiento

| Requisito                                                  | Estado  | Descripción                                                                 |
|------------------------------------------------------------|---------|-----------------------------------------------------------------------------|
| 1. Refactorizar `Veterinario` y `Propietario` para heredar de `Persona` | ✅      | Ambas clases extienden de `Persona`.                                       |
| 2. Agregar al menos un atributo propio a cada clase hija   | ✅      | `Propietario` tiene `telefono` y `Veterinario` tiene `especialidad`.       |
| 3. Crear una lista polimórfica `List<Persona>`             | ✅      | Se implementa en `PersonaController`.                                      |
| 4. Crear formulario Swing dinámico con JComboBox           | ✅      | El formulario permite seleccionar tipo de persona y cambia el campo extra. |
| 5. Implementar `toString()` correctamente                  | ✅      | Cada clase tiene su propia versión de `toString()` para mostrar información clara. |

---

## 🧱 Estructura del Proyecto

src/
├── modelo/
│ ├── Persona.java
│ ├── Propietario.java
│ └── Veterinario.java
├── controlador/
│ └── PersonaController.java
└── vista/
└── FormPersona.java

yaml
Copiar
Editar

---

## 🚀 Cómo Ejecutar

1. Abre el proyecto en IntelliJ IDEA o NetBeans.
2. Ejecuta la clase `FormPersona.java`.
3. Usa el formulario para:
    - Agregar un Veterinario o Propietario.
    - Ver la lista de registros.
    - Eliminar el último ingresado.

---

## 👨‍💻 Autor

- **Nombre:** Juan Guillermo Salazar
- **Curso:** Programación en Java
- **Taller:** Herencia, Polimorfismo y Formularios

---

## 📝 Licencia

Este proyecto es solo para fines académicos y de aprendizaje.