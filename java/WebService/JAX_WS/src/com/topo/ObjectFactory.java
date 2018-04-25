
package com.topo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.topo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TopoServiceResponse_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "topoServiceResponse");
    private final static QName _TopoService_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "topoService");
    private final static QName _MenuService_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "menuService");
    private final static QName _MenuServiceResponse_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "menuServiceResponse");
    private final static QName _TopoVersionUpdateService_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "TopoVersionUpdateService");
    private final static QName _TopoVersionUpdateServiceResponse_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "TopoVersionUpdateServiceResponse");
    private final static QName _ImagesVersionUpdateService_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "imagesVersionUpdateService");
    private final static QName _ImagesVersionUpdateServiceResponse_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "imagesVersionUpdateServiceResponse");
    private final static QName _TopoImages_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "topoImages");
    private final static QName _TopoImagesResponse_QNAME = new QName("http://services.irms.nrmds.iman.com/TimeService", "topoImagesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.topo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MenuService }
     * 
     */
    public MenuService createMenuService() {
        return new MenuService();
    }

    /**
     * Create an instance of {@link MenuServiceResponse }
     * 
     */
    public MenuServiceResponse createMenuServiceResponse() {
        return new MenuServiceResponse();
    }

    /**
     * Create an instance of {@link TopoService }
     * 
     */
    public TopoService createTopoService() {
        return new TopoService();
    }

    /**
     * Create an instance of {@link TopoServiceResponse }
     * 
     */
    public TopoServiceResponse createTopoServiceResponse() {
        return new TopoServiceResponse();
    }

    /**
     * Create an instance of {@link ImagesVersionUpdateServiceResponse }
     * 
     */
    public ImagesVersionUpdateServiceResponse createImagesVersionUpdateServiceResponse() {
        return new ImagesVersionUpdateServiceResponse();
    }

    /**
     * Create an instance of {@link TopoImages }
     * 
     */
    public TopoImages createTopoImages() {
        return new TopoImages();
    }

    /**
     * Create an instance of {@link TopoImagesResponse }
     * 
     */
    public TopoImagesResponse createTopoImagesResponse() {
        return new TopoImagesResponse();
    }

    /**
     * Create an instance of {@link ImagesVersionUpdateService }
     * 
     */
    public ImagesVersionUpdateService createImagesVersionUpdateService() {
        return new ImagesVersionUpdateService();
    }

    /**
     * Create an instance of {@link TopoVersionUpdateService }
     * 
     */
    public TopoVersionUpdateService createTopoVersionUpdateService() {
        return new TopoVersionUpdateService();
    }

    /**
     * Create an instance of {@link TopoVersionUpdateServiceResponse }
     * 
     */
    public TopoVersionUpdateServiceResponse createTopoVersionUpdateServiceResponse() {
        return new TopoVersionUpdateServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "topoServiceResponse")
    public JAXBElement<TopoServiceResponse> createTopoServiceResponse(TopoServiceResponse value) {
        return new JAXBElement<TopoServiceResponse>(_TopoServiceResponse_QNAME, TopoServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "topoService")
    public JAXBElement<TopoService> createTopoService(TopoService value) {
        return new JAXBElement<TopoService>(_TopoService_QNAME, TopoService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MenuService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "menuService")
    public JAXBElement<MenuService> createMenuService(MenuService value) {
        return new JAXBElement<MenuService>(_MenuService_QNAME, MenuService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MenuServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "menuServiceResponse")
    public JAXBElement<MenuServiceResponse> createMenuServiceResponse(MenuServiceResponse value) {
        return new JAXBElement<MenuServiceResponse>(_MenuServiceResponse_QNAME, MenuServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoVersionUpdateService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "TopoVersionUpdateService")
    public JAXBElement<TopoVersionUpdateService> createTopoVersionUpdateService(TopoVersionUpdateService value) {
        return new JAXBElement<TopoVersionUpdateService>(_TopoVersionUpdateService_QNAME, TopoVersionUpdateService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoVersionUpdateServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "TopoVersionUpdateServiceResponse")
    public JAXBElement<TopoVersionUpdateServiceResponse> createTopoVersionUpdateServiceResponse(TopoVersionUpdateServiceResponse value) {
        return new JAXBElement<TopoVersionUpdateServiceResponse>(_TopoVersionUpdateServiceResponse_QNAME, TopoVersionUpdateServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImagesVersionUpdateService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "imagesVersionUpdateService")
    public JAXBElement<ImagesVersionUpdateService> createImagesVersionUpdateService(ImagesVersionUpdateService value) {
        return new JAXBElement<ImagesVersionUpdateService>(_ImagesVersionUpdateService_QNAME, ImagesVersionUpdateService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImagesVersionUpdateServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "imagesVersionUpdateServiceResponse")
    public JAXBElement<ImagesVersionUpdateServiceResponse> createImagesVersionUpdateServiceResponse(ImagesVersionUpdateServiceResponse value) {
        return new JAXBElement<ImagesVersionUpdateServiceResponse>(_ImagesVersionUpdateServiceResponse_QNAME, ImagesVersionUpdateServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoImages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "topoImages")
    public JAXBElement<TopoImages> createTopoImages(TopoImages value) {
        return new JAXBElement<TopoImages>(_TopoImages_QNAME, TopoImages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoImagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.irms.nrmds.iman.com/TimeService", name = "topoImagesResponse")
    public JAXBElement<TopoImagesResponse> createTopoImagesResponse(TopoImagesResponse value) {
        return new JAXBElement<TopoImagesResponse>(_TopoImagesResponse_QNAME, TopoImagesResponse.class, null, value);
    }

}
