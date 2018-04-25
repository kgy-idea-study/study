package com.helloweenvsfei.util.ip;

/**
 * @author kouguangyuan
 * @Description
 * @Date Created in 2017/12/27 16:55
 * @Modified By
 */

/**
 * <pre>
 * 一条IP范围记录，不仅包括国家和区域，也包括起始IP和结束IP
 * </pre>
 *
 * @author 马若劼
 */
public class IPEntry {
    public String beginIp;
    public String endIp;
    public String country;
    public String area;

    /**
     * 构造函数
     */
    public IPEntry() {
        beginIp = endIp = country = area = "";
    }

    public String toString() {
        return this.area + "  " + this.country + "  IP范围:" + this.beginIp + "-" + this.endIp;
    }
}
