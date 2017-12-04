

package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author Julita
 */
public class Favorito<E> implements FavoriteList<E>{
    ArrayList<E> favs = new ArrayList();
    
    public void access(E e)
    {
        boolean existe = false;
        for (int i = 0; i < favs.size(); i++){
            if (favs.get(i).compareTo(e){
                existe = true;
                return e;
            }
        }
        if (existe == false)
        {
            favs.add(e);
        }
    }
    
    public void remove(E e){
        for (int i = 0; i < favs.size(); i++){
            if (favs.get(i).compareTo(e)){
                favs.remove(i);
            }
        }
    }
    public Iterable<E> getFavorites(int k){
        
    }
}
