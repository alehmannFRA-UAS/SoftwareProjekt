## Übung 9: Threads

Erstellen Sie eine Klasse namens `CurrentDate`, die das Interface `Runnable` implementiert.
Die Klasse `CurrentDate` zeigt das aktuelle Datum und die Uhrzeit 10 Mal pro Sekunde, mit einem Intervall von 100 Millisekunden - verwenden Sie die Methode `sleep()` für dieses Intervall.
Erstellen Sie eine Klasse namens `Main`, die die `main()`-Methode enthält, in der 3 Instanzen von `CurrentDate`-Threads ausgeführt werden.
Stoppen Sie die Threads unter Verwendung von `interrupt()` jeweils nach 1 Sekunde.