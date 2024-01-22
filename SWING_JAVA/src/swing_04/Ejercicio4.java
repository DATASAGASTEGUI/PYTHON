package swing_04;

public class Ejercicio4 {

    public static void main(String[] args) {
        // DATOS
        String[] idAlumno = {"A1", "A2", "A3", "A4", "A5"};
        String[] nombre = {"Arturo", "Ismael", "Ramon", "María", "Carmen"};
        char[] sexo = {'H', 'H', 'H', 'M', 'M'};
        double[] estatura = {1.72, 1.73, 1.74, 1.75, 1.67};
        // MOSTRAR TODOS
        for (int i = 0; i < idAlumno.length; i++) {
            System.out.println(idAlumno[i] + ";" + nombre[i] + ";" + sexo[i] + ";" + estatura[i]);
        }

    }

}
