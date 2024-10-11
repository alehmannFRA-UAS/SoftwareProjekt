## Übung 4: Interfaces

Sie haben die Aufgabe, eine kleine Anwendung zu erstellen, die eine Büchersammlung in einer Bibliothek verwaltet.
Jedes Buch hat einen Titel, einen Autor und ein Erscheinungsjahr. Ihre Anwendung soll es ermöglichen, neue Bücher zur Sammlung hinzuzufügen und die Liste der Bücher sortiert nach ihrem Erscheinungsjahr anzuzeigen. Definieren Sie eine Book-Klasse, die die folgenden Eigenschaften enthält: 
- `String title`
- `String author`
- `int publicationYear`

Implementieren Sie das Interface `Comparable` in Ihrer Book-Klasse, um Bücher anhand ihres Erscheinungsjahres zu mit der `compareTo`-Methode zu vergleichen. 

Schreiben Sie eine Methode in Ihrer Hauptanwendungsklasse, die mehrere Bücher zu einer `ArrayList` hinzufügt.

Verwenden Sie die Methode `compareTo` aus der Klasse Book, um die Sortierung der Bücher in aufsteigender Reihenfolge nach ihrem Erscheinungsjahr zu realisieren. Die neu sortierten Bücher sollten wieder in der `ArrayList` abgelegt werden.
Zum Schluss soll die neue sortierte Liste der Bücher ausgegeben werden.

Schreiben Sie dann eine weitere Methode in Ihrer Hauptanwendungsklasse, die mehrere Bücher aus einer `ArrayList` unter Verwendung der Methode `Collections.sort()` nach dem Erscheinungsjahr sortiert. Zum Schluss soll die sortierte Liste der Bücher wieder mit Titel, Autor und Erscheinungsjahr ausgegeben werden.