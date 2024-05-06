import java.util.ArrayList;
/**
 * Write a description of class Catalogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catalogo
{
    public ArrayList <Book> catalogo;
    
    
    public Catalogo()
    {
        catalogo = new ArrayList<>();
    }
    
    public void agregarLibro(Book nombreLibro)
    {
        catalogo.add(nombreLibro);
    }
    public void eliminarLibro(Book nombreLibro)
    {
        catalogo.remove(nombreLibro);
    }
    public void imprimirLibro(){
        for(Book libro : catalogo){
            System.out.println(libro);              
        }
    }
    
}
