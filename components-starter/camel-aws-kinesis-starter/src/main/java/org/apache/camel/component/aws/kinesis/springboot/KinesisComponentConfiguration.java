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
package org.apache.camel.component.aws.kinesis.springboot;

import javax.annotation.Generated;
import com.amazonaws.Protocol;
import com.amazonaws.services.kinesis.model.ShardIteratorType;
import org.apache.camel.component.aws.kinesis.KinesisComponent;
import org.apache.camel.component.aws.kinesis.KinesisShardClosedStrategyEnum;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Consume and produce records from AWS Kinesis Streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-kinesis")
public class KinesisComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-kinesis component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * Amazon Kinesis client to use for all requests for this endpoint. The
     * option is a com.amazonaws.services.kinesis.AmazonKinesis type.
     */
    private String amazonKinesisClient;
    /**
     * Setting the autoDiscoverClient mechanism, if true, the component will
     * look for a client instance in the registry automatically otherwise it
     * will skip that checking
     */
    private Boolean autoDiscoverClient = true;
    /**
     * The component configuration. The option is a
     * org.apache.camel.component.aws.kinesis.KinesisConfiguration type.
     */
    private String configuration;
    /**
     * To define a proxy host when instantiating the Kinesis client
     */
    private String proxyHost;
    /**
     * To define a proxy port when instantiating the Kinesis client
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the Kinesis client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * The region in which Kinesis client needs to work. When using this
     * parameter, the configuration will expect the capitalized name of the
     * region (for example AP_EAST_1)You'll need to use the name
     * Regions.EU_WEST_1.name()
     */
    private String region;
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
     * Defines where in the Kinesis stream to start getting records
     */
    private ShardIteratorType iteratorType = ShardIteratorType.TRIM_HORIZON;
    /**
     * Maximum number of records that will be fetched in each poll
     */
    private Integer maxResultsPerRequest = 1;
    /**
     * The sequence number to start polling from. Required if iteratorType is
     * set to AFTER_SEQUENCE_NUMBER or AT_SEQUENCE_NUMBER
     */
    private String sequenceNumber;
    /**
     * Define what will be the behavior in case of shard closed. Possible value
     * are ignore, silent and fail. In case of ignore a message will be logged
     * and the consumer will restart from the beginning,in case of silent there
     * will be no logging and the consumer will start from the beginning,in case
     * of fail a ReachedClosedStateException will be raised
     */
    private KinesisShardClosedStrategyEnum shardClosed = KinesisShardClosedStrategyEnum.ignore;
    /**
     * Defines which shardId in the Kinesis stream to get records from
     */
    private String shardId;
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
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;

    public String getAmazonKinesisClient() {
        return amazonKinesisClient;
    }

    public void setAmazonKinesisClient(String amazonKinesisClient) {
        this.amazonKinesisClient = amazonKinesisClient;
    }

    public Boolean getAutoDiscoverClient() {
        return autoDiscoverClient;
    }

    public void setAutoDiscoverClient(Boolean autoDiscoverClient) {
        this.autoDiscoverClient = autoDiscoverClient;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public ShardIteratorType getIteratorType() {
        return iteratorType;
    }

    public void setIteratorType(ShardIteratorType iteratorType) {
        this.iteratorType = iteratorType;
    }

    public Integer getMaxResultsPerRequest() {
        return maxResultsPerRequest;
    }

    public void setMaxResultsPerRequest(Integer maxResultsPerRequest) {
        this.maxResultsPerRequest = maxResultsPerRequest;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public KinesisShardClosedStrategyEnum getShardClosed() {
        return shardClosed;
    }

    public void setShardClosed(KinesisShardClosedStrategyEnum shardClosed) {
        this.shardClosed = shardClosed;
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
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

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}