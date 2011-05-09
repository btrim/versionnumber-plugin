
package org.jvnet.hudson.tools.versionnumber;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author btrim
 */
public class VersionNumber {


    private String environmentVariableName;

    private String versionNumberString;

    @DataBoundConstructor
    public VersionNumber( String envVariable,
                          String format ){
        this.versionNumberString = format;
        this.environmentVariableName = envVariable;

    }

    public String getEnvVariable() {
        return environmentVariableName;
    }
    public String getFormat() {
        return versionNumberString;
    }
    
    public void setEnvVariable(String environmentVariableName) {
        this.environmentVariableName = environmentVariableName;
    }

    public void setFormat(String versionNumberString) {
        this.versionNumberString = versionNumberString;
    }

    @Override
    public int hashCode()
    {
        return environmentVariableName.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VersionNumber that = (VersionNumber) o;

        if (!environmentVariableName.equals(that.environmentVariableName)) return false;

        return true;
    }
}
