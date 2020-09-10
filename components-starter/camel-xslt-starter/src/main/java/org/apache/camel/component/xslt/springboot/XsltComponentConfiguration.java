/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.xslt.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Transforms XML payload using an XSLT template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.xslt")
public class XsltComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the xslt component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Cache for the resource content (the stylesheet file) when it is loaded.
     * If set to false Camel will reload the stylesheet file on each message
     * processing. This is good for development. A cached stylesheet can be
     * forced to reload at runtime via JMX using the clearCachedStylesheet
     * operation.
     */
    private Boolean contentCache = true;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    @Deprecated
    private Boolean basicPropertyBinding = false;
    /**
     * To use a custom XSLT transformer factory, specified as a FQN class name
     */
    private String transformerFactoryClass;
    /**
     * A configuration strategy to apply on freshly created instances of
     * TransformerFactory. The option is a
     * org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy
     * type.
     */
    private String transformerFactoryConfigurationStrategy;
    /**
     * To use a custom UriResolver. Should not be used together with the option
     * 'uriResolverFactory'. The option is a javax.xml.transform.URIResolver
     * type.
     */
    private String uriResolver;
    /**
     * To use a custom UriResolver which depends on a dynamic endpoint resource
     * URI. Should not be used together with the option 'uriResolver'. The
     * option is a org.apache.camel.component.xslt.XsltUriResolverFactory type.
     */
    private String uriResolverFactory;

    public Boolean getContentCache() {
        return contentCache;
    }

    public void setContentCache(Boolean contentCache) {
        this.contentCache = contentCache;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    @Deprecated
    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getTransformerFactoryClass() {
        return transformerFactoryClass;
    }

    public void setTransformerFactoryClass(String transformerFactoryClass) {
        this.transformerFactoryClass = transformerFactoryClass;
    }

    public String getTransformerFactoryConfigurationStrategy() {
        return transformerFactoryConfigurationStrategy;
    }

    public void setTransformerFactoryConfigurationStrategy(
            String transformerFactoryConfigurationStrategy) {
        this.transformerFactoryConfigurationStrategy = transformerFactoryConfigurationStrategy;
    }

    public String getUriResolver() {
        return uriResolver;
    }

    public void setUriResolver(String uriResolver) {
        this.uriResolver = uriResolver;
    }

    public String getUriResolverFactory() {
        return uriResolverFactory;
    }

    public void setUriResolverFactory(String uriResolverFactory) {
        this.uriResolverFactory = uriResolverFactory;
    }
}