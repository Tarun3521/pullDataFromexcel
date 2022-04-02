package com.example.demo.entity;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeData {

    @ExcelRow
    private int rowIndex;

    @ExcelCellName("Region")
    private String 	region;

    @ExcelCellName("Country")
    private String 	country;

    @ExcelCellName("Item Type")
    private String 	itemType;

    @ExcelCellName("Sales Channel")
    private String 	salesChannel;

    @ExcelCellName("Order Priority")
    private String 	orderPriority;

    @ExcelCellName("Order Date")
    private String 	orderDate;

    @ExcelCellName("Order ID")
    private String 	orderID;

    @ExcelCellName("Ship Date")
    private String 	shipDate;

    @ExcelCellName("Units Sold")
    private String 	unitsSold;

    @ExcelCellName("Unit Price")
    private String 	unitPrice;

    @ExcelCellName("Unit Cost")
    private String 	unitCost;

    @ExcelCellName("Total Revenue")
    private String 	totalRevenue;

    @ExcelCellName("Total Cost")
    private String 	totalCost;

    @ExcelCellName("Total Profit")
    private String 	totalProfit;

}
