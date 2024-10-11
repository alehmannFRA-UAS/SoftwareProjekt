## Übung 7: Exceptions

1. Schreiben Sie ein Java-Programm, das zwei Zahlen dividiert und das Ergebnis in der Konsole ausgibt.
Dabei soll bei einer Division durch 0 mit einem try-catch-Block der entstehende Fehler behandelt werden.
Stellen Sie sicher, dass das Programm eine entsprechende Fehlermeldung ausgibt, wenn die Division durch 0 auftritt.
Zusätzlich implementieren Sie bitte einen finally-Block, der immer ausgeführt wird.

2. Erstellen Sie eine benutzerdefinierte Exception-Klasse namens `InvalidAgeException`, um Szenarien zu behandeln,
in denen ein vom Benutzer eingegebenes Alter ungültig ist. 
Ein Alter wird als ungültig angesehen, wenn es kleiner als 0 oder größer als 120 ist oder kleiner als 18, da noch keine Volljährigkeit erreicht wurde. 
Ihre Aufgabe ist es, die Klasse `InvalidAgeException` zu implementieren und sie in einem Programm zu verwenden,
in dem der Benutzer aufgefordert wird, ein Alter einzugeben. 
Wenn das eingegebene Alter ungültig ist, werfen Sie die Klasse `InvalidAgeException` mit einer entsprechenden Fehlermeldung.