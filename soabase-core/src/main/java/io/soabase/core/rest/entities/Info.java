package io.soabase.core.rest.entities;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Info
{
    private List<String> scopes;
    private int mainPort;
    private String serviceName;
    private String instanceName;
    private String startTimeUtc;
    private String currentTimeUtc;

    public Info()
    {
        this(Lists.<String>newArrayList(), 0, "", "", "", "");
    }

    public Info(List<String> scopes, int mainPort, String serviceName, String instanceName, String startTimeUtc, String currentTimeUtc)
    {
        scopes = Preconditions.checkNotNull(scopes, "scopes cannot be null");
        this.scopes = ImmutableList.copyOf(scopes);
        this.mainPort = mainPort;
        this.serviceName = Preconditions.checkNotNull(serviceName, "serviceName cannot be null");
        this.instanceName = Preconditions.checkNotNull(instanceName, "instanceName cannot be null");
        this.startTimeUtc = Preconditions.checkNotNull(startTimeUtc, "startTimeUtc cannot be null");
        this.currentTimeUtc = Preconditions.checkNotNull(currentTimeUtc, "currentTimeUtc cannot be null");
    }

    public List<String> getScopes()
    {
        return scopes;
    }

    public void setScopes(List<String> scopes)
    {
        this.scopes = scopes;
    }

    public int getMainPort()
    {
        return mainPort;
    }

    public void setMainPort(int mainPort)
    {
        this.mainPort = mainPort;
    }

    public String getServiceName()
    {
        return serviceName;
    }

    public void setServiceName(String serviceName)
    {
        this.serviceName = serviceName;
    }

    public String getInstanceName()
    {
        return instanceName;
    }

    public void setInstanceName(String instanceName)
    {
        this.instanceName = instanceName;
    }

    public String getStartTimeUtc()
    {
        return startTimeUtc;
    }

    public void setStartTimeUtc(String startTimeUtc)
    {
        this.startTimeUtc = startTimeUtc;
    }

    public String getCurrentTimeUtc()
    {
        return currentTimeUtc;
    }

    public void setCurrentTimeUtc(String currentTimeUtc)
    {
        this.currentTimeUtc = currentTimeUtc;
    }

    @Override
    public boolean equals(Object o)
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        Info info = (Info)o;

        if ( mainPort != info.mainPort )
        {
            return false;
        }
        if ( !currentTimeUtc.equals(info.currentTimeUtc) )
        {
            return false;
        }
        if ( !instanceName.equals(info.instanceName) )
        {
            return false;
        }
        if ( !scopes.equals(info.scopes) )
        {
            return false;
        }
        if ( !serviceName.equals(info.serviceName) )
        {
            return false;
        }
        //noinspection RedundantIfStatement
        if ( !startTimeUtc.equals(info.startTimeUtc) )
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = scopes.hashCode();
        result = 31 * result + mainPort;
        result = 31 * result + serviceName.hashCode();
        result = 31 * result + instanceName.hashCode();
        result = 31 * result + startTimeUtc.hashCode();
        result = 31 * result + currentTimeUtc.hashCode();
        return result;
    }


}
