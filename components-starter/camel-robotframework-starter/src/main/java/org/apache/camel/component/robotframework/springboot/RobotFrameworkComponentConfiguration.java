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
package org.apache.camel.component.robotframework.springboot;

import java.io.File;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Pass camel exchanges to acceptence test written in Robot DSL.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.robotframework")
public class RobotFrameworkComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the robotframework component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets whether the context map should allow access to all details. By
     * default only the message body and headers can be accessed. This option
     * can be enabled for full access to the current Exchange and CamelContext.
     * Doing so impose a potential security risk as this opens access to the
     * full power of CamelContext API.
     */
    private Boolean allowContextMapAll = false;
    /**
     * Whether to allow to use resource template from header or not (default
     * false). Enabling this allows to specify dynamic templates via message
     * header. However this can be seen as a potential security vulnerability if
     * the header is coming from a malicious user, so use this with care.
     */
    private Boolean allowTemplateFromHeader = false;
    /**
     * A text file to read more arguments from.
     */
    private File argumentFile;
    /**
     * Creates combined statistics based on tags. Use the format tags:title List
     */
    private String combinedTagStats;
    /**
     * Tests that have the given tags are considered critical. List
     */
    private String criticalTags;
    /**
     * A debug file that is written during execution.
     */
    private File debugFile;
    /**
     * Sets the documentation of the top-level tests suites.
     */
    private String document;
    /**
     * Sets dryrun mode on use. In the dry run mode tests are run without
     * executing keywords originating from test libraries. Useful for validating
     * test data syntax.
     */
    private Boolean dryrun = false;
    /**
     * Selects the tests cases by tags. List
     */
    private String excludes;
    /**
     * Sets robot to stop execution immediately if a critical test fails.
     */
    private Boolean exitOnFailure = false;
    /**
     * Selects the tests cases by tags. List
     */
    private String includes;
    /**
     * Sets a single listener for monitoring tests execution
     */
    private String listener;
    /**
     * Sets multiple listeners for monitoring tests execution. Use the format
     * ListenerWithArgs:arg1:arg2 or simply ListenerWithoutArgs List
     */
    private String listeners;
    /**
     * Sets the path to the generated log file.
     */
    private File log;
    /**
     * Sets the threshold level for logging.
     */
    private String logLevel;
    /**
     * Sets a title for the generated tests log.
     */
    private String logTitle;
    /**
     * Sets free metadata for the top level tests suites. comma seperated list
     * of string resulting as List
     */
    private String metadata;
    /**
     * Using ANSI colors in console. Normally colors work in unixes but not in
     * Windows. Default is 'on'. 'on' - use colors in unixes but not in Windows
     * 'off' - never use colors 'force' - always use colors (also in Windows)
     */
    private String monitorColors;
    /**
     * Width of the monitor output. Default is 78.
     */
    private String monitorWidth = "78";
    /**
     * Sets the name of the top-level tests suites.
     */
    private String name;
    /**
     * Tests that have the given tags are not critical. List
     */
    private String nonCriticalTags;
    /**
     * If true, sets the return code to zero regardless of failures in test
     * cases. Error codes are returned normally.
     */
    private Boolean noStatusReturnCode = false;
    /**
     * Sets the path to the generated output file.
     */
    private File output;
    /**
     * Configures where generated reports are to be placed.
     */
    private File outputDirectory;
    /**
     * Sets the test execution order to be randomized. Valid values are all,
     * suite, and test
     */
    private String randomize;
    /**
     * Sets the path to the generated report file.
     */
    private File report;
    /**
     * Sets background colors for the generated report and summary.
     */
    private String reportBackground;
    /**
     * Sets a title for the generated tests report.
     */
    private String reportTitle;
    /**
     * Executes tests also if the top level test suite is empty. Useful e.g.
     * with --include/--exclude when it is not an error that no test matches the
     * condition.
     */
    private Boolean runEmptySuite = false;
    /**
     * Re-run failed tests, based on output.xml file.
     */
    private File runFailed;
    /**
     * Sets the execution mode for this tests run. Note that this setting has
     * been deprecated in Robot Framework 2.8. Use separate dryryn,
     * skipTeardownOnExit, exitOnFailure, and randomize settings instead.
     */
    private String runMode;
    /**
     * Sets whether the teardowns are skipped if the test execution is
     * prematurely stopped.
     */
    private Boolean skipTeardownOnExit = false;
    /**
     * Splits output and log files.
     */
    private String splitOutputs;
    /**
     * Selects the tests suites by name. List
     */
    private String suites;
    /**
     * Defines how many levels to show in the Statistics by Suite table in
     * outputs.
     */
    private String suiteStatLevel;
    /**
     * Sets a title for the generated summary report.
     */
    private String summaryTitle;
    /**
     * Adds documentation to the specified tags. List
     */
    private String tagDocs;
    /**
     * Sets the tags(s) to all executed tests cases. List
     */
    private String tags;
    /**
     * Excludes these tags from the Statistics by Tag and Test Details by Tag
     * tables in outputs. List
     */
    private String tagStatExcludes;
    /**
     * Includes only these tags in the Statistics by Tag and Test Details by Tag
     * tables in outputs. List
     */
    private String tagStatIncludes;
    /**
     * Adds external links to the Statistics by Tag table in outputs. Use the
     * format pattern:link:title List
     */
    private String tagStatLinks;
    /**
     * Selects the tests cases by name. List
     */
    private String tests;
    /**
     * Adds a timestamp to all output files.
     */
    private Boolean timestampOutputs = false;
    /**
     * Sets variables using variables files. Use the format path:args List
     */
    private String variableFiles;
    /**
     * Sets individual variables. Use the format name:value List
     */
    private String variables;
    /**
     * Show a warning when an invalid file is skipped.
     */
    private Boolean warnOnSkippedFiles = false;
    /**
     * Sets the path to the generated XUnit compatible result file, relative to
     * outputDirectory. The file is in xml format. By default, the file name is
     * derived from the testCasesDirectory parameter, replacing blanks in the
     * directory name by underscores.
     */
    private File xunitFile;
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
     * The configuration. The option is a
     * org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration type.
     */
    private String configuration;

    public Boolean getAllowContextMapAll() {
        return allowContextMapAll;
    }

    public void setAllowContextMapAll(Boolean allowContextMapAll) {
        this.allowContextMapAll = allowContextMapAll;
    }

    public Boolean getAllowTemplateFromHeader() {
        return allowTemplateFromHeader;
    }

    public void setAllowTemplateFromHeader(Boolean allowTemplateFromHeader) {
        this.allowTemplateFromHeader = allowTemplateFromHeader;
    }

    public File getArgumentFile() {
        return argumentFile;
    }

    public void setArgumentFile(File argumentFile) {
        this.argumentFile = argumentFile;
    }

    public String getCombinedTagStats() {
        return combinedTagStats;
    }

    public void setCombinedTagStats(String combinedTagStats) {
        this.combinedTagStats = combinedTagStats;
    }

    public String getCriticalTags() {
        return criticalTags;
    }

    public void setCriticalTags(String criticalTags) {
        this.criticalTags = criticalTags;
    }

    public File getDebugFile() {
        return debugFile;
    }

    public void setDebugFile(File debugFile) {
        this.debugFile = debugFile;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Boolean getDryrun() {
        return dryrun;
    }

    public void setDryrun(Boolean dryrun) {
        this.dryrun = dryrun;
    }

    public String getExcludes() {
        return excludes;
    }

    public void setExcludes(String excludes) {
        this.excludes = excludes;
    }

    public Boolean getExitOnFailure() {
        return exitOnFailure;
    }

    public void setExitOnFailure(Boolean exitOnFailure) {
        this.exitOnFailure = exitOnFailure;
    }

    public String getIncludes() {
        return includes;
    }

    public void setIncludes(String includes) {
        this.includes = includes;
    }

    public String getListener() {
        return listener;
    }

    public void setListener(String listener) {
        this.listener = listener;
    }

    public String getListeners() {
        return listeners;
    }

    public void setListeners(String listeners) {
        this.listeners = listeners;
    }

    public File getLog() {
        return log;
    }

    public void setLog(File log) {
        this.log = log;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getMonitorColors() {
        return monitorColors;
    }

    public void setMonitorColors(String monitorColors) {
        this.monitorColors = monitorColors;
    }

    public String getMonitorWidth() {
        return monitorWidth;
    }

    public void setMonitorWidth(String monitorWidth) {
        this.monitorWidth = monitorWidth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNonCriticalTags() {
        return nonCriticalTags;
    }

    public void setNonCriticalTags(String nonCriticalTags) {
        this.nonCriticalTags = nonCriticalTags;
    }

    public Boolean getNoStatusReturnCode() {
        return noStatusReturnCode;
    }

    public void setNoStatusReturnCode(Boolean noStatusReturnCode) {
        this.noStatusReturnCode = noStatusReturnCode;
    }

    public File getOutput() {
        return output;
    }

    public void setOutput(File output) {
        this.output = output;
    }

    public File getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public String getRandomize() {
        return randomize;
    }

    public void setRandomize(String randomize) {
        this.randomize = randomize;
    }

    public File getReport() {
        return report;
    }

    public void setReport(File report) {
        this.report = report;
    }

    public String getReportBackground() {
        return reportBackground;
    }

    public void setReportBackground(String reportBackground) {
        this.reportBackground = reportBackground;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public Boolean getRunEmptySuite() {
        return runEmptySuite;
    }

    public void setRunEmptySuite(Boolean runEmptySuite) {
        this.runEmptySuite = runEmptySuite;
    }

    public File getRunFailed() {
        return runFailed;
    }

    public void setRunFailed(File runFailed) {
        this.runFailed = runFailed;
    }

    public String getRunMode() {
        return runMode;
    }

    public void setRunMode(String runMode) {
        this.runMode = runMode;
    }

    public Boolean getSkipTeardownOnExit() {
        return skipTeardownOnExit;
    }

    public void setSkipTeardownOnExit(Boolean skipTeardownOnExit) {
        this.skipTeardownOnExit = skipTeardownOnExit;
    }

    public String getSplitOutputs() {
        return splitOutputs;
    }

    public void setSplitOutputs(String splitOutputs) {
        this.splitOutputs = splitOutputs;
    }

    public String getSuites() {
        return suites;
    }

    public void setSuites(String suites) {
        this.suites = suites;
    }

    public String getSuiteStatLevel() {
        return suiteStatLevel;
    }

    public void setSuiteStatLevel(String suiteStatLevel) {
        this.suiteStatLevel = suiteStatLevel;
    }

    public String getSummaryTitle() {
        return summaryTitle;
    }

    public void setSummaryTitle(String summaryTitle) {
        this.summaryTitle = summaryTitle;
    }

    public String getTagDocs() {
        return tagDocs;
    }

    public void setTagDocs(String tagDocs) {
        this.tagDocs = tagDocs;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTagStatExcludes() {
        return tagStatExcludes;
    }

    public void setTagStatExcludes(String tagStatExcludes) {
        this.tagStatExcludes = tagStatExcludes;
    }

    public String getTagStatIncludes() {
        return tagStatIncludes;
    }

    public void setTagStatIncludes(String tagStatIncludes) {
        this.tagStatIncludes = tagStatIncludes;
    }

    public String getTagStatLinks() {
        return tagStatLinks;
    }

    public void setTagStatLinks(String tagStatLinks) {
        this.tagStatLinks = tagStatLinks;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    public Boolean getTimestampOutputs() {
        return timestampOutputs;
    }

    public void setTimestampOutputs(Boolean timestampOutputs) {
        this.timestampOutputs = timestampOutputs;
    }

    public String getVariableFiles() {
        return variableFiles;
    }

    public void setVariableFiles(String variableFiles) {
        this.variableFiles = variableFiles;
    }

    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }

    public Boolean getWarnOnSkippedFiles() {
        return warnOnSkippedFiles;
    }

    public void setWarnOnSkippedFiles(Boolean warnOnSkippedFiles) {
        this.warnOnSkippedFiles = warnOnSkippedFiles;
    }

    public File getXunitFile() {
        return xunitFile;
    }

    public void setXunitFile(File xunitFile) {
        this.xunitFile = xunitFile;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
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

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}