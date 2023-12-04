// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Se trata de crear una pequeña base de datos de personas de una universidad.
        De momento definiremos y probaremos las siguientes clases:
        •	Dirección:
        o	atributos: calle, ciudad, código postal, país
        o	Constructores predeterminado y parametrizado.
        •	Persona: Clase ya creada (con nombre, apellidos y NIF,
        ver ejercicio anterior) a la que añadiremos el atributo dirección
        y sus métodos accedentes y mutadores. Esta clase implementa la interface
        Humano, con un método indentificate(), que muestra el tipo de la clase
        que lo implementa (el tipo de persona, en este caso).
        •	Estudiante: Subclase de Persona.
        o	Atributos: ID de estudiante
        o	Constructores : predeterminado y constructor parametrizado que admita el ID.
        o	Métodos accedentes y mutadores y toString().
        •	Profesor: Subclase de Persona.
        o	Atributos : despacho
        o	Constructores: predeterminado y constructor parametrizado que admita el despacho.
        o	Métodos accedentes y mutadores y toString()
        Crea una clase principal donde probar las diferentes clases creadas.

         */

        Person person = new Person("John", "Doe", "123456789", "123 Main St");

        System.out.println("Person Details:");
        System.out.println(person.identify());
        System.out.println(person);

        Student student = new Student("Alice", "Smith", "987654321", "456 Oak St", "S12345");

        System.out.println("\nStudent Details:");
        System.out.println(student.identify());
        System.out.println(student);

        Teacher teacher = new Teacher("Mr.", "Johnson", "555555555", "789 Pine St", "Math Department");

        System.out.println("\nTeacher Details:");
        System.out.println(teacher.identify());
        System.out.println(teacher);
    }
}