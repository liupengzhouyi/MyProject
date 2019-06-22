package cn.liupeng.tools.IPAdress;

import javax.servlet.http.HttpServletRequest;

public class IPAdress {

    private HttpServletRequest httpServletRequest;

    private String ipAdress;

    public HttpServletRequest getHttpServletRequest() {
        return httpServletRequest;
    }

    public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getIp() throws Exception {
        String ip = this.getHttpServletRequest().getHeader("X-Forwarded-For");
        if (ip != null) {
            if (!ip.isEmpty() && !"unKnown".equalsIgnoreCase(ip)) {
                int index = ip.indexOf(",");
                if (index != -1) {
                    return ip.substring(0, index);
                } else {
                    return ip;
                }
            }
        }
        ip = this.getHttpServletRequest().getHeader("X-Real-IP");
        if (ip != null) {
            if (!ip.isEmpty() && !"unKnown".equalsIgnoreCase(ip)) {
                return ip;
            }
        }
        return this.getHttpServletRequest().getRemoteAddr();
    }

    public IPAdress(HttpServletRequest httpServletRequest) throws Exception {
        this.setHttpServletRequest(httpServletRequest);
        this.setIpAdress(this.getIp());
    }
}
