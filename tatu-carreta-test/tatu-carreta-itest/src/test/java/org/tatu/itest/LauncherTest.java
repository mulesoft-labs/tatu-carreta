package org.tatu.itest;

import static org.ops4j.pax.exam.CoreOptions.mavenBundle;
import static org.ops4j.pax.exam.CoreOptions.options;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerMethod;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerMethod.class)
public class LauncherTest
{
    @Configuration
    public Option[] config() {
        return options(
                //TODO(pablo.kraan): I don' like that the bundle must be already built in order to use it here (ie: slow dev cycle)
                //TODO(pablo.kraan): how can I make the test fail when there is a missing bundle?
                mavenBundle("org.apache.felix","org.apache.felix.scr","1.8.2"),
                mavenBundle("org.apache.felix","org.apache.felix.scr.annotations","1.9.8"),
                mavenBundle("org.mule", "tatu-carreta", "1.0-SNAPSHOT"),
                mavenBundle("org.mule", "tatu-carreta-http", "1.0-SNAPSHOT"),
                mavenBundle("org.mule", "tatu-carreta-ws-consumer", "1.0-SNAPSHOT")
        );
    }

    @Test
    public void exportsServices() throws Exception
    {
        /*
        DISCLAIMER: THIS IS NOT A REAL TEST

        This is used just to try the concept of exposing/consuming services/components in OSGi.
        Whe executed, it will log different messages showing that the services and components are exposed/consumed.

        Execution log will contain:

            Creating DefaultHttpService
            Starting DefaultHttpService
            Setting ws-consumer's HttpService: org.tatu.http.DefaultHttpService@73937bc8
            Activating ws-consumer
            DefaultHttpService.doStuff()
            Deactivating ws-consumer
         */

    }
}
