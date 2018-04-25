import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import javax.xml.rpc.ServiceException;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class AxisClient {
    public static void main(String[] args) {
        //String endPoint = "http://127.0.0.1:8081/axis/services/SCService?wsdl";
        String endPoint = "http://localhost:8080/services/myWebService?wsdl";
        String operation = "getMessage";//
        Service service = new Service();
        String result = "";
        try {
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new java.net.URL(endPoint));
            call.setOperationName(operation);
            //ִ
            result = (String) call.invoke(new Object[]{"1qqq"});
            System.out.println(result);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

}
