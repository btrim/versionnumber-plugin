package org.jvnet.hudson.tools.versionnumber;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author btrim
 */
public class VersionNumber {


    String environmentVariableName;

    String versionNumberString;

    @DataBoundConstructor
    public VersionNumber( String environmentVariableName,
                          String versionNumberString ){
        this.versionNumberString = versionNumberString;
        this.environmentVariableName = environmentVariableName;

    }

    public String getEnvironmentVariableName() {
        return environmentVariableName;
    }
    public String getVersionNumberString() {
        return versionNumberString;
    }
    
    public void setEnvironmentVariableName(String environmentVariableName) {
        this.environmentVariableName = environmentVariableName;
    }

    public void setVersionNumberString(String versionNumberString) {
        this.versionNumberString = versionNumberString;
    }
}
