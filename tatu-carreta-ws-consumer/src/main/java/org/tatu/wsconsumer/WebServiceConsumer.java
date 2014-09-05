package org.tatu.wsconsumer;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.ReferencePolicy;
import org.tatu.http.DefaultHttpService;
import org.tatu.http.HttpService;

/**
 *
 */
@Component(name = "wsConsumer",
           immediate = true
)
public class WebServiceConsumer
{
    @Reference(
            name = "http.service",
            cardinality = ReferenceCardinality.MANDATORY_UNARY,
            policy = ReferencePolicy.STATIC,
            bind = "setHttpService",
            unbind = "unsetHttpService"
    )
    private HttpService httpService;

    @Activate
    public void start()
    {
        System.out.println("Activating ws-consumer");
        httpService.doStuff();
    }

    protected void setHttpService(HttpService service)
    {
        System.out.println("Setting ws-consumer's HttpService: " + service);
        httpService = service;
    }

    protected void unsetHttpService(HttpService service)
    {
        System.out.println("Deactivating ws-consumer");
    }

}
