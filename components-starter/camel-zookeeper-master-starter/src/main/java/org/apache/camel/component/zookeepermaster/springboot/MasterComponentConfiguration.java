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
package org.apache.camel.component.zookeepermaster.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Have only a single consumer in a cluster consuming from a given endpoint;
 * with automatic failover if the JVM dies.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.zookeeper-master")
public class MasterComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the zookeeper-master component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Timeout in millis to use when connecting to the zookeeper ensemble
     */
    private Integer maximumConnectionTimeout = 10000;
    /**
     * The root path to use in zookeeper where information is stored which nodes
     * are master/slave etc. Will by default use:
     * /camel/zookeepermaster/clusters/master
     */
    private String zkRoot = "/camel/zookeepermaster/clusters/master";
    /**
     * The url for the zookeeper ensemble
     */
    private String zooKeeperUrl = "localhost:2181";
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    @Deprecated
    private Boolean basicPropertyBinding = false;
    /**
     * To use a custom ContainerIdFactory for creating container ids. The option
     * is a org.apache.camel.component.zookeepermaster.ContainerIdFactory type.
     */
    private String containerIdFactory;
    /**
     * To use a custom configured CuratorFramework as connection to zookeeper
     * ensemble. The option is a org.apache.curator.framework.CuratorFramework
     * type.
     */
    private String curator;
    /**
     * The password to use when connecting to the zookeeper ensemble
     */
    private String zooKeeperPassword;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Integer getMaximumConnectionTimeout() {
        return maximumConnectionTimeout;
    }

    public void setMaximumConnectionTimeout(Integer maximumConnectionTimeout) {
        this.maximumConnectionTimeout = maximumConnectionTimeout;
    }

    public String getZkRoot() {
        return zkRoot;
    }

    public void setZkRoot(String zkRoot) {
        this.zkRoot = zkRoot;
    }

    public String getZooKeeperUrl() {
        return zooKeeperUrl;
    }

    public void setZooKeeperUrl(String zooKeeperUrl) {
        this.zooKeeperUrl = zooKeeperUrl;
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

    public String getContainerIdFactory() {
        return containerIdFactory;
    }

    public void setContainerIdFactory(String containerIdFactory) {
        this.containerIdFactory = containerIdFactory;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public String getZooKeeperPassword() {
        return zooKeeperPassword;
    }

    public void setZooKeeperPassword(String zooKeeperPassword) {
        this.zooKeeperPassword = zooKeeperPassword;
    }
}