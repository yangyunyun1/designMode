package staticProxy;

/**
 * ´úÀí½ÇÉ«
 * 
 */
public class RealSubject extends Subject
{
    @Override
    public void request(){
        System.out.println("From Real Subject!");
    }
}