package test.domain;

import com.alibaba.excel.annotation.ExcelProperty;

import java.math.BigDecimal;

public class BoatMarket {

    @ExcelProperty(value = "船名")
    String boatName;

    @ExcelProperty(value = "开票所属期")
    String invoiceTime;
    @ExcelProperty(value = "全年航次")
    String annualVoyages;
    @ExcelProperty(value = "运行周期")
    String operatingCycle;
    @ExcelProperty(value = "顺/逆水")
    String riverType;
    @ExcelProperty(value = "起港")
    String startPort;
    @ExcelProperty(value = "到港")
    String endPort;
    @ExcelProperty(value = "单航次里程")
    BigDecimal mileage;
    @ExcelProperty(value = "单航次油耗")
    BigDecimal fuelConsumption;
    @ExcelProperty(value = "品种")
    String orderType;
    @ExcelProperty(value = "实发量")
    BigDecimal quantity;
    @ExcelProperty(value = "运价")
    BigDecimal price;
    @ExcelProperty(value = "含税收入")
    BigDecimal income;
    @ExcelProperty(value = "客户名称")
    String customerName;
    @ExcelProperty(value = "装卸油库")
    String loadingPlace;
    @ExcelProperty(value = "起运地")
    String startPlace;
    @ExcelProperty(value = "到达地")
    String endPlace;

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public String getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getAnnualVoyages() {
        return annualVoyages;
    }

    public void setAnnualVoyages(String annualVoyages) {
        this.annualVoyages = annualVoyages;
    }

    public String getOperatingCycle() {
        return operatingCycle;
    }

    public void setOperatingCycle(String operatingCycle) {
        this.operatingCycle = operatingCycle;
    }

    public String getRiverType() {
        return riverType;
    }

    public void setRiverType(String riverType) {
        this.riverType = riverType;
    }

    public String getStartPort() {
        return startPort;
    }

    public void setStartPort(String startPort) {
        this.startPort = startPort;
    }

    public String getEndPort() {
        return endPort;
    }

    public void setEndPort(String endPort) {
        this.endPort = endPort;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(BigDecimal fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getLoadingPlace() {
        return loadingPlace;
    }

    public void setLoadingPlace(String loadingPlace) {
        this.loadingPlace = loadingPlace;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }
}
