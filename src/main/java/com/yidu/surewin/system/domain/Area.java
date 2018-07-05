package com.yidu.surewin.system.domain;

import java.io.Serializable;
import java.util.Objects;

public class Area implements Serializable {
    private static final long serialVersionUID = 6664063633501322212L;
    private String areaid;

    private String province;

    private String city;

    private String county;

    private String postcode;

    private String simplecode;

    private String citycode;

    private String outportid;

    private String outport;

    private String inportid;

    private String inport;

    private String servicearea;

    private String unservicearea;

    private String specialarea;

    private String outernet;

    private String suburbs;

    private String arealevel;

    private String zone;

    private String citylevel;

    private String ports;

    private String useable;

    private String description;

    private String remark1;

    private String remark2;

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getSimplecode() {
        return simplecode;
    }

    public void setSimplecode(String simplecode) {
        this.simplecode = simplecode == null ? null : simplecode.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getOutportid() {
        return outportid;
    }

    public void setOutportid(String outportid) {
        this.outportid = outportid == null ? null : outportid.trim();
    }

    public String getOutport() {
        return outport;
    }

    public void setOutport(String outport) {
        this.outport = outport == null ? null : outport.trim();
    }

    public String getInportid() {
        return inportid;
    }

    public void setInportid(String inportid) {
        this.inportid = inportid == null ? null : inportid.trim();
    }

    public String getInport() {
        return inport;
    }

    public void setInport(String inport) {
        this.inport = inport == null ? null : inport.trim();
    }

    public String getServicearea() {
        return servicearea;
    }

    public void setServicearea(String servicearea) {
        this.servicearea = servicearea == null ? null : servicearea.trim();
    }

    public String getUnservicearea() {
        return unservicearea;
    }

    public void setUnservicearea(String unservicearea) {
        this.unservicearea = unservicearea == null ? null : unservicearea.trim();
    }

    public String getSpecialarea() {
        return specialarea;
    }

    public void setSpecialarea(String specialarea) {
        this.specialarea = specialarea == null ? null : specialarea.trim();
    }

    public String getOuternet() {
        return outernet;
    }

    public void setOuternet(String outernet) {
        this.outernet = outernet == null ? null : outernet.trim();
    }

    public String getSuburbs() {
        return suburbs;
    }

    public void setSuburbs(String suburbs) {
        this.suburbs = suburbs == null ? null : suburbs.trim();
    }

    public String getArealevel() {
        return arealevel;
    }

    public void setArealevel(String arealevel) {
        this.arealevel = arealevel == null ? null : arealevel.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public String getCitylevel() {
        return citylevel;
    }

    public void setCitylevel(String citylevel) {
        this.citylevel = citylevel == null ? null : citylevel.trim();
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports == null ? null : ports.trim();
    }

    public String getUseable() {
        return useable;
    }

    public void setUseable(String useable) {
        this.useable = useable == null ? null : useable.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaid='" + areaid + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postcode='" + postcode + '\'' +
                ", simplecode='" + simplecode + '\'' +
                ", citycode='" + citycode + '\'' +
                ", outportid='" + outportid + '\'' +
                ", outport='" + outport + '\'' +
                ", inportid='" + inportid + '\'' +
                ", inport='" + inport + '\'' +
                ", servicearea='" + servicearea + '\'' +
                ", unservicearea='" + unservicearea + '\'' +
                ", specialarea='" + specialarea + '\'' +
                ", outernet='" + outernet + '\'' +
                ", suburbs='" + suburbs + '\'' +
                ", arealevel='" + arealevel + '\'' +
                ", zone='" + zone + '\'' +
                ", citylevel='" + citylevel + '\'' +
                ", ports='" + ports + '\'' +
                ", useable='" + useable + '\'' +
                ", description='" + description + '\'' +
                ", remark1='" + remark1 + '\'' +
                ", remark2='" + remark2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Objects.equals(areaid, area.areaid) &&
                Objects.equals(province, area.province) &&
                Objects.equals(city, area.city) &&
                Objects.equals(county, area.county) &&
                Objects.equals(postcode, area.postcode) &&
                Objects.equals(simplecode, area.simplecode) &&
                Objects.equals(citycode, area.citycode) &&
                Objects.equals(outportid, area.outportid) &&
                Objects.equals(outport, area.outport) &&
                Objects.equals(inportid, area.inportid) &&
                Objects.equals(inport, area.inport) &&
                Objects.equals(servicearea, area.servicearea) &&
                Objects.equals(unservicearea, area.unservicearea) &&
                Objects.equals(specialarea, area.specialarea) &&
                Objects.equals(outernet, area.outernet) &&
                Objects.equals(suburbs, area.suburbs) &&
                Objects.equals(arealevel, area.arealevel) &&
                Objects.equals(zone, area.zone) &&
                Objects.equals(citylevel, area.citylevel) &&
                Objects.equals(ports, area.ports) &&
                Objects.equals(useable, area.useable) &&
                Objects.equals(description, area.description) &&
                Objects.equals(remark1, area.remark1) &&
                Objects.equals(remark2, area.remark2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(areaid, province, city, county, postcode, simplecode, citycode, outportid, outport, inportid, inport, servicearea, unservicearea, specialarea, outernet, suburbs, arealevel, zone, citylevel, ports, useable, description, remark1, remark2);
    }
}