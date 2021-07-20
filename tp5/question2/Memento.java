package question2;

import java.util.*;

/**
 * @author Maria Bou Aoun
 * @version 2.0
 */
public class Memento
{
    private List mementoListe;

    public Memento(List mementoListe){
        this.mementoListe = mementoListe;
    }

    public List getMementoListe(){
        return mementoListe;
    }

} 
