package cn.liupeng.tools.Return;

import cn.liupeng.tools.DateTime.GetDateTime;

/**
 * @author liupeng
 * 一个万能返回类
 */
public class Information {

    public Information() {
        this.runDataTime = new GetDateTime().getDateTime();
    }

    public Information(String runLocation, String runFunctionName, String runfunction, String returnInformation, boolean hasReturnObject, String objectType, Object object) {
        this.runLocation = runLocation;
        this.runFunctionName = runFunctionName;
        this.runDataTime = new GetDateTime().getDateTime();
        this.runfunction = runfunction;
        this.returnInformation = returnInformation;
        this.hasReturnObject = hasReturnObject;
        this.objectType = objectType;
        this.object = object;
    }

    // 运行位置
    private String runLocation;

    // 方法名称
    private String runFunctionName;

    // 运行时间
    private String runDataTime;

    // 运行是在做什么
    private String runfunction;

    // 返回信息
    private String returnInformation;

    // 是否有返回对象
    private boolean hasReturnObject;

    // 对象类型
    private String objectType;

    // 对象
    private Object object;

    public String getRunLocation() {
        return runLocation;
    }

    public void setRunLocation(String runLocation) {
        this.runLocation = runLocation;
    }

    public String getRunFunctionName() {
        return runFunctionName;
    }

    public void setRunFunctionName(String runFunctionName) {
        this.runFunctionName = runFunctionName;
    }

    public String getRunDataTime() {
        return runDataTime;
    }

    public void setRunDataTime(String runDataTime) {
        this.runDataTime = runDataTime;
    }

    public String getRunfunction() {
        return runfunction;
    }

    public void setRunfunction(String runfunction) {
        this.runfunction = runfunction;
    }

    public String getReturnInformation() {
        return returnInformation;
    }

    public void setReturnInformation(String returnInformation) {
        this.returnInformation = returnInformation;
    }

    public boolean isHasReturnObject() {
        return hasReturnObject;
    }

    public void setHasReturnObject(boolean hasReturnObject) {
        this.hasReturnObject = hasReturnObject;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Information{" +
                "runLocation='" + runLocation + '\'' +
                ", runFunctionName='" + runFunctionName + '\'' +
                ", runDataTime='" + runDataTime + '\'' +
                ", runfunction='" + runfunction + '\'' +
                ", returnInformation='" + returnInformation + '\'' +
                ", hasReturnObject=" + hasReturnObject +
                ", objectType='" + objectType + '\'' +
                ", object=" + object +
                '}';
    }
}
