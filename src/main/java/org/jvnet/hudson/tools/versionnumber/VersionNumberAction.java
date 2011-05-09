package org.jvnet.hudson.tools.versionnumber;

import hudson.model.Action;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VersionNumberAction implements Action {
    static final String ICON = "/plugin/versionnumber/vnicon_24x24.gif";
    
    private VersionNumberBuildInfo info;
    private Map<String,String> versions;

    @Deprecated
    private String versionNumber = null;

    public VersionNumberAction(VersionNumberBuildInfo info, Map<String, String> versions){
        this.info = info;
        this.versions = versions;
    }

    @Deprecated
    public VersionNumberAction(VersionNumberBuildInfo info, Map<String, String> versions,String versionNumber) {
        this(info, versions);


        this.versionNumber = versionNumber;
    }
    
    public VersionNumberBuildInfo getInfo() {
        return info;
    }
    
    public String getDisplayName() {
        if( versions != null && versions.size() == 1 ) {
            return "Version " + versions.values().iterator().next();
        }
        else if( versionNumber != null ) {
            return "Version: " + versionNumber;
        }
        else {
            return "Version Numbers";
        }
    }
    
    public String getIconFileName() {
        return ICON;
    }

    public Map<String,String> getVersions()
    {
        if( versions == null )
        {
            Map<String,String> tmp = new LinkedHashMap<String, String>();
            tmp.put("",versionNumber);
            return tmp;
        }
        return versions;
    }
    
    public String getUrlName() {
        return "versionNumber";
    }
    
    
}
