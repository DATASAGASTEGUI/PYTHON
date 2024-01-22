#include <windows.h>
#include <stdio.h>

int main() {
    HANDLE hConsole;
    hConsole = GetStdHandle(STD_OUTPUT_HANDLE);

    // Cambiar el color a rojo
    SetConsoleTextAttribute(hConsole, FOREGROUND_RED | FOREGROUND_INTENSITY);
    printf("Texto en rojo\n");

    // Restaurar el color original
    SetConsoleTextAttribute(hConsole, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN);
    printf("Texto en color original\n");

    return 0;
}
