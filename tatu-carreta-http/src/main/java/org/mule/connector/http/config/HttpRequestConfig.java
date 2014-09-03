package org.mule.connector.http.config;

import org.mule.ext.api.ConnectorConfig;

/**
 *
 */
public class HttpRequestConfig implements ConnectorConfig
{
    private String name;

    @Override
    public String getName()
    {
        return name;
    }
}
