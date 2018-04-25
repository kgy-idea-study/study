package com.topo;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpConectionTool {
    public static String get(String urlStr) throws IOException {
        //第一步：创建服务地址，不是WSDL地址
        URL url = new URL(urlStr);
        //第二步：打开一个通向服务地址的连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //第三步：设置参数
        //3.1发送方式设置：GET必须大写
        connection.setRequestMethod("GET");
        //3.2设置数据格式：content-type
        connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
        //3.3设置输入输出，因为默认新创建的connection没有读写权限，
        //Get请求不需要DoOutPut
        connection.setDoInput(true);
        connection.setDoOutput(false);

        //第五步：接收服务端响应，打印（xml格式数据）
        String str = responseConn(connection);
        return str;
    }

    public static String post(String urlStr) {
        //第一步：创建服务地址，不是WSDL地址
        URL url = null;
        OutputStream os = null;
        String str = "";
        try {
            url = new URL(urlStr);
            //第二步：打开一个通向服务地址的连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //第三步：设置参数
            //3.1发送方式设置：POST必须大写
            connection.setRequestMethod("POST");
            //3.2设置数据格式：content-type
            connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
            //3.3设置输入输出，因为默认新创建的connection没有读写权限，
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //第四步：组织SOAP数据，发送请求
            String method = "topoService";
            String tns = "http://services.irms.nrmds.iman.com/TimeService";
            String caller = "YXFB";
            String topoId = "I_CUST_INTERNET";
            String nodeName = "''";
            String nodeId = "100015696161615";
            String soapXML = getXML(method, tns, caller, topoId, nodeName, nodeId);
            System.out.println(soapXML);
            os = connection.getOutputStream();
            os.write(soapXML.getBytes());

            //第五步：接收服务端响应，打印（xml格式数据）
            str = responseConn(connection);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return str;
    }

    public static String responseConn(HttpURLConnection connection) throws IOException {
        int responseCode = connection.getResponseCode();
        if (200 == responseCode) {//表示服务端响应成功
            InputStream is = null;
            InputStreamReader isr = null;
            BufferedReader br = null;
            StringBuilder sb = null;
            try {
                is = connection.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);

                sb = new StringBuilder();
                String temp = null;
                while (null != (temp = br.readLine())) {
                    sb.append(temp);
                }
                System.out.println(sb.toString());
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            } finally {
                br.close();
                isr.close();
                is.close();
            }
        }
        return null;
    }

    public static String getXML(String method, String tns, String caller, String topoId, String nodeName, String nodeId) {
        String soapXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tim=\"http://services.irms.nrmds.iman.com/TimeService\">"
                + "<soapenv:Body>"
                + "<tim:topoService>"
                + "<serCaller>" + caller + "</serCaller>"
                + "<topoId>" + topoId + "</topoId>"
                + "<nodeName>" + nodeName + "</nodeName>"
                + "<nodeId>" + nodeId + "</nodeId>"
                + "</tim:topoService>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";
        return soapXML;
    }
}
