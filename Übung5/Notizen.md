# Übung 5 Collections
## HashSet

- sind eine Menge von Objekten
    - Elemente in einem HasSet dürfen nur einmal vorkommen

    - beim Einfügen eines neuen Elements, wird mit der equals() Methode geprüft, ob das Element schon drinnen ist. 

    - es wird erst der Hashwert verglichen, wenn dieser gleich ist, wird dann nochmal mit der equals Methode verglichen. 

        - add liefert true, wenn das Objekt noch noch nicht vorhanden ist.