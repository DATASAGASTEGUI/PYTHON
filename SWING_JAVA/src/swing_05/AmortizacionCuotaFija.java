package swing_05;

public class AmortizacionCuotaFija {

    public static void main(String[] args) {
       //DATOS ENTRADA
       double prestamo = 75000;
       double interesAnual = 22;
       double tiempo = 5; //5 años
       double frecuencia = 12;//12 cuotas(mes)/año
       
       //CALCULO
       double periodo = tiempo * frecuencia; //5años*12meses/años = 60 meses
       //ipm = interes periodico mensual
       double ipm = interesAnual/frecuencia/100;//
       double ct = Math.pow((1 + ipm),-periodo);
       double cuota = (prestamo*ipm)/(1 - ct);
       System.out.println("Cuota Fija: " + cuota);
       System.out.println("Interes Periodico Mensual: "+ipm);
       
       double saldo = prestamo;
       double interes;
       double capital;
       
       for(int i=1; i<=60; i++) {
           interes = saldo * ipm;
           capital = cuota - interes;
           saldo = saldo - capital;
           System.out.println(r(cuota) + "  " + r(capital) + "  " + r(interes) + "  " + r(saldo));
           
       }
    }
    
    public static double r(double x) {
        return Math.round(x*100)/100.0;
    }
    
}

/*
APUNTES
-------
https://www.youtube.com/watch?v=DpNGDYYDt4M





*/
