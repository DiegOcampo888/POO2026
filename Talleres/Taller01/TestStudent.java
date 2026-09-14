public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("2026001", "Diego Ocampo");

        System.out.println("Código: " + student.getStudentId() + ", nombre: " + student.getName() + ", promedio inicial: " + student.getAverage());

        boolean validGrade1 = student.setGrade(0, 4.5);
        System.out.println("Calificación 1 a 4.5: " + (validGrade1 ? "aceptada" : "rechazada") + ". Promedio: " + student.getAverage());

        boolean validGrade2 = student.setGrade(1, 3.8);
        System.out.println("Calificación 2 a 3.8: " + (validGrade2 ? "aceptada" : "rechazada") + ". Promedio: " + student.getAverage());

        boolean invalidGrade = student.setGrade(2, 6.0);
        System.out.println("Calificación 3 a 6.0: " + (invalidGrade ? "aceptada" : "rechazada") + ". Promedio: " + student.getAverage());

        boolean validGrade3 = student.setGrade(2, 4.0);
        System.out.println("Calificación 3 a 4.0: " + (validGrade3 ? "aceptada" : "rechazada") + ". Promedio: " + student.getAverage());

        boolean invalidName = student.setName("");
        System.out.println("Nombre a vacío: " + (invalidName ? "aceptado" : "rechazado") + ". Nombre: " + student.getName());

        boolean validName = student.setName("Diego Ocampo Ramírez");
        System.out.println("Nombre a 'Diego Ocampo Ramírez': " + (validName ? "aceptado" : "rechazado") + ". Nombre: " + student.getName());
    }
}