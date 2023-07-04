/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.jaxrsclient.test;

import java.util.logging.Logger;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.as.quickstarts.rshelloworld.JAXActivator;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@RunAsClient
public class TestHelloWorldRestClientIT {

    private Logger log = Logger.getLogger(TestHelloWorldRestClientIT.class.getName());

    @ArquillianResource
    private URL deploymentUrl;

    @Deployment(testable = false)
    public static WebArchive createDeployment() {
        WebArchive war = ShrinkWrap.create(WebArchive.class, "helloworld-rs.war")
                .addPackage(JAXActivator.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        return war;
    }

    private String getRequestUrl() {
        return new StringBuilder(deploymentUrl.toString())
                .append("rest/helloWorld")
                .toString();
    }


    // This test shows basic operations
    @Test
    public void arrayListTest() {
        ArrayList<String> data = new ArrayList<>();
        data.add("AAAA");
        data.add("BBB");

        // access rest service
        List<String> changedList = ClientBuilder.newClient().target(getRequestUrl()).request().post(Entity.entity(data, MediaType.APPLICATION_JSON), ArrayList.class);
        Assert.assertEquals("array length should be incremented by one", data.size() + 1,  changedList.size());
    }
}
