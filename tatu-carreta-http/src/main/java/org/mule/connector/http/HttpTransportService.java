package org.mule.connector.http;

import org.mule.connector.http.config.HttpListenerConfig;
import org.mule.connector.http.config.HttpRequestConfig;

import java.util.Map;

/**
 *
 */
public class HttpTransportService
{

    private HttpRequestConfig requestConfig;
    private HttpListenerConfig listenerConfig;

    public void request(String uri, Object payload, Map<String, String> headers)
    {
        // TODO
    }

}
