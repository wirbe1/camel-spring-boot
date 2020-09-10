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
package org.apache.camel.component.xmlsecurity.springboot;

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.crypto.AlgorithmMethod;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Sign XML payloads using the XML signature specification.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.xmlsecurity-sign")
public class XmlSignerComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the xmlsecurity-sign component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * In order to protect the KeyInfo element from tampering you can add a
     * reference to the signed info element so that it is protected via the
     * signature value. The default value is true. Only relevant when a KeyInfo
     * is returned by KeyAccessor. and KeyInfo#getId() is not null.
     */
    private Boolean addKeyInfoReference = true;
    /**
     * You can set a base URI which is used in the URI dereferencing. Relative
     * URIs are then concatenated with the base URI.
     */
    private String baseUri;
    /**
     * Canonicalization method used to canonicalize the SignedInfo element
     * before the digest is calculated. You can use the helper methods
     * XmlSignatureHelper.getCanonicalizationMethod(String algorithm) or
     * getCanonicalizationMethod(String algorithm, List
     * inclusiveNamespacePrefixes) to create a canonicalization method. The
     * option is a javax.xml.crypto.AlgorithmMethod type.
     */
    private String canonicalizationMethod;
    /**
     * Determines if the XML signature specific headers be cleared after signing
     * and verification. Defaults to true.
     */
    private Boolean clearHeaders = true;
    /**
     * Sets the content object Id attribute value. By default a UUID is
     * generated. If you set the null value, then a new UUID will be generated.
     * Only used in the enveloping case.
     */
    private String contentObjectId;
    /**
     * Type of the content reference. The default value is null. This value can
     * be overwritten by the header
     * XmlSignatureConstants#HEADER_CONTENT_REFERENCE_TYPE.
     */
    private String contentReferenceType;
    /**
     * Reference URI for the content to be signed. Only used in the enveloped
     * case. If the reference URI contains an ID attribute value, then the
     * resource schema URI ( setSchemaResourceUri(String)) must also be set
     * because the schema validator will then find out which attributes are ID
     * attributes. Will be ignored in the enveloping or detached case.
     */
    private String contentReferenceUri;
    /**
     * Sets the crypto context properties. See {link
     * XMLCryptoContext#setProperty(String, Object)}. Possible properties are
     * defined in XMLSignContext an XMLValidateContext (see Supported
     * Properties). The following properties are set by default to the value
     * Boolean#TRUE for the XML validation. If you want to switch these features
     * off you must set the property value to Boolean#FALSE.
     * org.jcp.xml.dsig.validateManifests javax.xml.crypto.dsig.cacheReference
     */
    private Map<String, Object> cryptoContextProperties;
    /**
     * Digest algorithm URI. Optional parameter. This digest algorithm is used
     * for calculating the digest of the input message. If this digest algorithm
     * is not specified then the digest algorithm is calculated from the
     * signature algorithm. Example: http://www.w3.org/2001/04/xmlenc#sha256
     */
    private String digestAlgorithm;
    /**
     * Disallows that the incoming XML document contains DTD DOCTYPE
     * declaration. The default value is Boolean#TRUE.
     */
    private Boolean disallowDoctypeDecl = true;
    /**
     * For the signing process, a private key is necessary. You specify a key
     * accessor bean which provides this private key. The key accessor bean must
     * implement the KeyAccessor interface. The package
     * org.apache.camel.component.xmlsecurity.api contains the default
     * implementation class DefaultKeyAccessor which reads the private key from
     * a Java keystore. The option is a
     * org.apache.camel.component.xmlsecurity.api.KeyAccessor type.
     */
    private String keyAccessor;
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
     * Indicator whether the XML declaration in the outgoing message body should
     * be omitted. Default value is false. Can be overwritten by the header
     * XmlSignatureConstants#HEADER_OMIT_XML_DECLARATION.
     */
    private Boolean omitXmlDeclaration = false;
    /**
     * The character encoding of the resulting signed XML document. If null then
     * the encoding of the original XML document is used.
     */
    private String outputXmlEncoding;
    /**
     * Local name of the parent element to which the XML signature element will
     * be added. Only relevant for enveloped XML signature. Alternatively you
     * can also use setParentXpath(XPathFilterParameterSpec). Default value is
     * null. The value must be null for enveloping and detached XML signature.
     * This parameter or the parameter setParentXpath(XPathFilterParameterSpec)
     * for enveloped signature and the parameter setXpathsToIdAttributes(List)
     * for detached signature must not be set in the same configuration. If the
     * parameters parentXpath and parentLocalName are specified in the same
     * configuration then an exception is thrown.
     */
    private String parentLocalName;
    /**
     * Namespace of the parent element to which the XML signature element will
     * be added.
     */
    private String parentNamespace;
    /**
     * Sets the XPath to find the parent node in the enveloped case. Either you
     * specify the parent node via this method or the local name and namespace
     * of the parent with the methods setParentLocalName(String) and
     * setParentNamespace(String). Default value is null. The value must be null
     * for enveloping and detached XML signature. If the parameters parentXpath
     * and parentLocalName are specified in the same configuration then an
     * exception is thrown. The option is a
     * javax.xml.crypto.dsig.spec.XPathFilterParameterSpec type.
     */
    private String parentXpath;
    /**
     * Indicator whether the message body contains plain text. The default value
     * is false, indicating that the message body contains XML. The value can be
     * overwritten by the header
     * XmlSignatureConstants#HEADER_MESSAGE_IS_PLAIN_TEXT.
     */
    private Boolean plainText = false;
    /**
     * Encoding of the plain text. Only relevant if the message body is plain
     * text (see parameter plainText. Default value is UTF-8.
     */
    private String plainTextEncoding = "UTF-8";
    /**
     * Namespace prefix for the XML signature namespace
     * http://www.w3.org/2000/09/xmldsig#. Default value is ds. If null or an
     * empty value is set then no prefix is used for the XML signature
     * namespace. See best practice
     * http://www.w3.org/TR/xmldsig-bestpractices/#signing-xml-
     * without-namespaces
     */
    private String prefixForXmlSignatureNamespace = "ds";
    /**
     * For adding additional References and Objects to the XML signature which
     * contain additional properties, you can provide a bean which implements
     * the XmlSignatureProperties interface. The option is a
     * org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties type.
     */
    private String properties;
    /**
     * Classpath to the XML Schema. Must be specified in the detached XML
     * Signature case for determining the ID attributes, might be set in the
     * enveloped and enveloping case. If set, then the XML document is validated
     * with the specified XML schema. The schema resource URI can be overwritten
     * by the header XmlSignatureConstants#HEADER_SCHEMA_RESOURCE_URI.
     */
    private String schemaResourceUri;
    /**
     * Signature algorithm. Default value is
     * http://www.w3.org/2000/09/xmldsig#rsa-sha1.
     */
    private String signatureAlgorithm = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
    /**
     * Sets the signature Id. If this parameter is not set (null value) then a
     * unique ID is generated for the signature ID (default). If this parameter
     * is set to (empty string) then no Id attribute is created in the signature
     * element.
     */
    private String signatureId;
    /**
     * Transforms which are executed on the message body before the digest is
     * calculated. By default, C14n is added and in the case of enveloped
     * signature (see option parentLocalName) also
     * http://www.w3.org/2000/09/xmldsig#enveloped-signature is added at
     * position 0 of the list. Use methods in XmlSignatureHelper to create the
     * transform methods.
     */
    private List<AlgorithmMethod> transformMethods;
    /**
     * Define the elements which are signed in the detached case via XPATH
     * expressions to ID attributes (attributes of type ID). For each element
     * found via the XPATH expression a detached signature is created whose
     * reference URI contains the corresponding attribute value (preceded by
     * '#'). The signature becomes the last sibling of the signed element.
     * Elements with deeper hierarchy level are signed first. You can also set
     * the XPATH list dynamically via the header
     * XmlSignatureConstants#HEADER_XPATHS_TO_ID_ATTRIBUTES. The parameter
     * setParentLocalName(String) or setParentXpath(XPathFilterParameterSpec)
     * for enveloped signature and this parameter for detached signature must
     * not be set in the same configuration.
     */
    private List<XPathFilterParameterSpec> xpathsToIdAttributes;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    @Deprecated
    private Boolean basicPropertyBinding = false;
    /**
     * To use a shared XmlSignerConfiguration configuration to use as base for
     * configuring endpoints. The option is a
     * org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration
     * type.
     */
    private String signerConfiguration;
    /**
     * If you want to restrict the remote access via reference URIs, you can set
     * an own dereferencer. Optional parameter. If not set the provider default
     * dereferencer is used which can resolve URI fragments, HTTP, file and
     * XPpointer URIs. Attention: The implementation is provider dependent!. The
     * option is a javax.xml.crypto.URIDereferencer type.
     */
    private String uriDereferencer;

    public Boolean getAddKeyInfoReference() {
        return addKeyInfoReference;
    }

    public void setAddKeyInfoReference(Boolean addKeyInfoReference) {
        this.addKeyInfoReference = addKeyInfoReference;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public String getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    public void setCanonicalizationMethod(String canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public Boolean getClearHeaders() {
        return clearHeaders;
    }

    public void setClearHeaders(Boolean clearHeaders) {
        this.clearHeaders = clearHeaders;
    }

    public String getContentObjectId() {
        return contentObjectId;
    }

    public void setContentObjectId(String contentObjectId) {
        this.contentObjectId = contentObjectId;
    }

    public String getContentReferenceType() {
        return contentReferenceType;
    }

    public void setContentReferenceType(String contentReferenceType) {
        this.contentReferenceType = contentReferenceType;
    }

    public String getContentReferenceUri() {
        return contentReferenceUri;
    }

    public void setContentReferenceUri(String contentReferenceUri) {
        this.contentReferenceUri = contentReferenceUri;
    }

    public Map<String, Object> getCryptoContextProperties() {
        return cryptoContextProperties;
    }

    public void setCryptoContextProperties(
            Map<String, Object> cryptoContextProperties) {
        this.cryptoContextProperties = cryptoContextProperties;
    }

    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    public void setDigestAlgorithm(String digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
    }

    public Boolean getDisallowDoctypeDecl() {
        return disallowDoctypeDecl;
    }

    public void setDisallowDoctypeDecl(Boolean disallowDoctypeDecl) {
        this.disallowDoctypeDecl = disallowDoctypeDecl;
    }

    public String getKeyAccessor() {
        return keyAccessor;
    }

    public void setKeyAccessor(String keyAccessor) {
        this.keyAccessor = keyAccessor;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getOmitXmlDeclaration() {
        return omitXmlDeclaration;
    }

    public void setOmitXmlDeclaration(Boolean omitXmlDeclaration) {
        this.omitXmlDeclaration = omitXmlDeclaration;
    }

    public String getOutputXmlEncoding() {
        return outputXmlEncoding;
    }

    public void setOutputXmlEncoding(String outputXmlEncoding) {
        this.outputXmlEncoding = outputXmlEncoding;
    }

    public String getParentLocalName() {
        return parentLocalName;
    }

    public void setParentLocalName(String parentLocalName) {
        this.parentLocalName = parentLocalName;
    }

    public String getParentNamespace() {
        return parentNamespace;
    }

    public void setParentNamespace(String parentNamespace) {
        this.parentNamespace = parentNamespace;
    }

    public String getParentXpath() {
        return parentXpath;
    }

    public void setParentXpath(String parentXpath) {
        this.parentXpath = parentXpath;
    }

    public Boolean getPlainText() {
        return plainText;
    }

    public void setPlainText(Boolean plainText) {
        this.plainText = plainText;
    }

    public String getPlainTextEncoding() {
        return plainTextEncoding;
    }

    public void setPlainTextEncoding(String plainTextEncoding) {
        this.plainTextEncoding = plainTextEncoding;
    }

    public String getPrefixForXmlSignatureNamespace() {
        return prefixForXmlSignatureNamespace;
    }

    public void setPrefixForXmlSignatureNamespace(
            String prefixForXmlSignatureNamespace) {
        this.prefixForXmlSignatureNamespace = prefixForXmlSignatureNamespace;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getSchemaResourceUri() {
        return schemaResourceUri;
    }

    public void setSchemaResourceUri(String schemaResourceUri) {
        this.schemaResourceUri = schemaResourceUri;
    }

    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public List<AlgorithmMethod> getTransformMethods() {
        return transformMethods;
    }

    public void setTransformMethods(List<AlgorithmMethod> transformMethods) {
        this.transformMethods = transformMethods;
    }

    public List<XPathFilterParameterSpec> getXpathsToIdAttributes() {
        return xpathsToIdAttributes;
    }

    public void setXpathsToIdAttributes(
            List<XPathFilterParameterSpec> xpathsToIdAttributes) {
        this.xpathsToIdAttributes = xpathsToIdAttributes;
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

    public String getSignerConfiguration() {
        return signerConfiguration;
    }

    public void setSignerConfiguration(String signerConfiguration) {
        this.signerConfiguration = signerConfiguration;
    }

    public String getUriDereferencer() {
        return uriDereferencer;
    }

    public void setUriDereferencer(String uriDereferencer) {
        this.uriDereferencer = uriDereferencer;
    }
}