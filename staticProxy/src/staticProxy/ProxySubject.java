package staticProxy;

/**
 * �����ɫ
 * 
 */
public class ProxySubject extends Subject{

    //�����ɫ�����ڲ����ж���ʵ���������
    private RealSubject realSubject;

    @Override
    public void request()
    {
        //����ʵ��ɫ����֮ǰ�����ӵĲ���
        preRequest();
        if(null == realSubject)
        {
            realSubject = new RealSubject();
        }
        
        //��ʵ��ɫ����ɵ�����
        realSubject.request();
        //����ʵ��ɫ����֮�������ӵĲ���
        postRequest();
    }
    
    private void preRequest(){
        System.out.println("Pre Request.");
    }
    
    private void postRequest(){
        System.out.println("Post Request");
    }

}
