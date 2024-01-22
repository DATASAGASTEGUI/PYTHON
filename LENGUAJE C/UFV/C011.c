#include <stdio.h>

int main() {
    int segundos, horas, minutos, segundos_restantes;

    // Solicitar al usuario que ingrese la cantidad de segundos
    printf("Ingrese la cantidad de segundos: ");
    scanf("%d", &segundos);

    // Calcular horas, minutos y segundos
    horas = segundos / 3600;
    segundos_restantes = segundos % 3600;
    minutos = segundos_restantes / 60;
    segundos_restantes = segundos_restantes % 60;

    // Imprimir el resultado en el formato requerido
    printf("Equivalente: %02d:%02d:%02d\n", horas, minutos, segundos_restantes);

    return 0;
}