package staticProxy;

/**
 * �����ɫ
 * 
 */
public class RealSubject extends Subject
{
    @Override
    public void request(){
        System.out.println("From Real Subject!");
    }
}