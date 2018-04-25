package com.helloweenvsfei.util;

import com.helloweenvsfei.util.ip.IPSeeker;

/**
 * @author kouguangyuan
 * @Description
 * @Date Created in 2017/12/27 16:42
 * @Modified By
 */
public class IpUtil {
    public static String getIpAddress(String ip) {
        try {
            return IPSeeker.getInstance().getAddress(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "未知区域";
    }
}
