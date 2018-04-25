import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class HelloWorldWebService implements HelloWorldRemote{

    @Override
    public String getMessage(String name) {
        return getHelloBean().getMessage(name);
    }

    private HelloWorldBean getHelloBean(){
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        return (HelloWorldBean) wac.getBean("helloWorldBean");
    }
}
