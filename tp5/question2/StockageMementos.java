package question2;

import java.util.*;

/**
 * @author Maria Bou Aoun
 * @version 2.0
 */
public class StockageMementos
{
    private Stack<Memento> mementos;
    
    public StockageMementos(){
        mementos = new Stack<>();
    }
    
    public Stack<Memento> getMementos(){
        return mementos;
    }
    
    public Memento getMemento(){
        return mementos.pop();
    }
    
    public Memento addMemento(Memento memento){
        return mementos.push(memento);
    }
}
