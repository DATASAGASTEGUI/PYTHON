sqlite3 salud ".mode csv" "SELECT * FROM consulta;" > salida.csv
sqlite3 salud ".mode json" "SELECT * FROM consulta;" > salida.json
pause