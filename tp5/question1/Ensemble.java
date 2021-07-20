package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

	protected java.util.Vector<T> table = new java.util.Vector<T>();

	public int size() {
		 if(table == null)
            return 0;
        return table.size();
	}

	public Iterator<T> iterator() {
		   if(table == null)
            return null;
        return table.iterator();
	}

	public boolean add(T t) {
        if(table == null)
            return false;
        if(!this.contains(t)){ 
            table.add(t); 
            return true;
        }
        return false;
	}

	public Ensemble<T> union(Ensemble<? extends T> e) {
         if(e == null || this.table == null)
            return null;
        Ensemble res = new Ensemble();
        res.addAll(this.table);
        res.addAll(e.table);
        return res;
	}

	public Ensemble<T> inter(Ensemble<? extends T> e) {
        if(e == null || this.table == null)
        return null;
        Ensemble res = new Ensemble();
        res.addAll(this.table);
        res.retainAll(e.table);
        return res;
	}

	public Ensemble<T> diff(Ensemble<? extends T> e) {
	if(e == null || this.table == null)
        return null;
        Ensemble res = new Ensemble();
        res.addAll(this.table);
        res.removeAll(e.table);
        return res;
	}

	Ensemble<T> diffSym(Ensemble<? extends T> e) {
        Ensemble union = this.union(e);
        if (union == null){
            return null;
        }
        Ensemble res = this.union(e).diff(this.inter(e));
        return res;
	}
	
}
