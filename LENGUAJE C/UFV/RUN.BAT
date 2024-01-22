@ECHO OFF
CLS
SET PATH=.;C:\Program Files (x86)\Dev-Cpp\MinGW64\bin;%PATH%
CHCP 850
CHCP 65001
CLS
gcc.exe -std=c99 %1.c -o %1
%1.exe
ECHO.
REM PAUSE
REM CLS