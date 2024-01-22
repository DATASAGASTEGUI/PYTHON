package swing_05;

import java.io.Serializable;

public class Obrero implements Serializable {

    private String idObrero;
    private String nombre;
    private int cantidadHorasSemana;

    public Obrero() {
    }

    public Obrero(String idObrero, String nombre, int cantidadHorasSemana) {
        this.idObrero = idObrero;
        this.nombre = nombre;
        this.cantidadHorasSemana = cantidadHorasSemana;
    }

    public String getIdObrero() {
        return idObrero;
    }

    public void setIdObrero(String idObrero) {
        this.idObrero = idObrero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHorasSemana() {
        return cantidadHorasSemana;
    }

    public void setCantidadHorasSemana(int cantidadHorasSemana) {
        this.cantidadHorasSemana = cantidadHorasSemana;
    }

    @Override
    public String toString() {
        return "Obrero{" + "idObrero=" + idObrero + ", nombre=" + nombre + ", cantidadHorasSemana=" + cantidadHorasSemana + '}';
    }

    public int getHorasExtras() {
        return cantidadHorasSemana - 40;
    }

    public double getSueldo() {
        double sueldo = 0;
        double pagoHora = 200 / 40;
        double horasExtras = getHorasExtras();
        if (horasExtras == 0) {
            sueldo = 200;
        }
        if (horasExtras > 0 && horasExtras <= 8) {
            sueldo = 200 + horasExtras * pagoHora * 2;
        }
        if (horasExtras > 8) {
            sueldo = 200 + (8 * pagoHora * 2) + (horasExtras - 8) * pagoHora * 3;
        }
        return sueldo;
    }

    public static String cabecera() {
        //System.out.printf("%-6s  %14s  %12s  %6s\n", "NOMBRE", "CANTIDAD_HORAS", "HORAS_EXTRAS", "SUELDO");
        //System.out.printf("%-6s  %14s  %12s  %6s\n", "------", "--------------", "------------", "------");
        String cabecera = String.format("%8s  %-8s  %14s  %12s  %6s\n",  "IDOBRERO","NOMBRE", "CANTIDAD_HORAS", "HORAS_EXTRAS", "SUELDO");
        String subrrayado = String.format("%8s  %-8s  %14s  %12s  %6s\n","--------","------", "--------------", "------------", "------");
        return cabecera+subrrayado;
    }

    public String cuerpo() {
        //System.out.printf("%-6s  %14d  %12d  %6.2f\n", nombre, cantidadHorasSemana, getHorasExtras(), getSueldo());
        String cuerpo = String.format("%8s  %-8s  %14d  %12d  %6.2f\n", idObrero, nombre, cantidadHorasSemana, getHorasExtras(), getSueldo());
        return cuerpo;
    }

}
