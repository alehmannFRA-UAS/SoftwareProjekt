## Übung 5: Innere Klasse

Schreiben Sie ein Java-Programm, das aus einer äußeren Klasse `Car` (mit den Attributen `brand` und `model`) und einer nichtstatischen inneren Klasse `Engine` besteht. Der Motor (`Engine`) verfügt über unterschiedliche Antriebsarten.
Die unterschiedlichen Antriebsarten sind wie folgt:
- RWD steht für "Rear-Wheel Drive", was auf Deutsch so viel wie "Heckantrieb" bedeutet
- FWD steht für "Front-Wheel Drive", was auf Deutsch so viel wie "Frontantrieb" bedeutet
- AWD steht für "All-Wheel Drive", was auf Deutsch gleichbedeutend mit "Allradantrieb" ist
- 4WD steht für "Four-Wheel Drive", wobei man im Deutschen eher von einem "Allradantrieb mit Untersetzung" sprechen würde

Erstellen Sie innerhalb der Klasse Car eine Methode `determineCarSize()`, die wenn der Motor (`Engine`) auf `AWD` oder weniger eingestellt ist die Ausgabe `Das Auto ist klein` anzeigt, andernfalls die Ausgabe `Das Auto ist groß`.