package org.tatu.http;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Component(name = "httpServiceName",
           immediate = true
)
@Service(value = org.tatu.http.HttpService.class)
public class DefaultHttpService implements HttpService
{

    public DefaultHttpService()
    {
        System.out.println("Creating DefaultHttpService");
    }

    @Override
    public void doStuff()
    {
        System.out.println("DefaultHttpService.doStuff()");
    }

    @Activate
    protected void start() {
        System.out.println("Starting DefaultHttpService");
    }

}
