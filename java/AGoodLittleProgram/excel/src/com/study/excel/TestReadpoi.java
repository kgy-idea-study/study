package com.study.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author kouguangyuan
 * @date 2018/8/17 14:43
 */
//java解析Excel（xls、xlsx两种格式）   https://www.cnblogs.com/hhhshct/p/7255915.html
public class TestReadpoi {
    public static void main(String[] args) {
        Workbook wb = null;
        Sheet sheet = null;
        Row row = null;
        //List<Map<String, String>> list = null;
        List<List> list = null;
        String cellData = null;
        String filePath = "e:\\test.xlsx";
        //String columns[] = {"name", "age", "score"};
        wb = readExcel(filePath);
        if (wb != null) {
            //用来存放表中数据
            list = new ArrayList<List>();
            //获取第一个sheet
            sheet = wb.getSheetAt(1);
            //获取最大行数
            int rownum = sheet.getPhysicalNumberOfRows();
            //获取第一行
            row = sheet.getRow(0);
            //获取最大列数
            int colnum = row.getPhysicalNumberOfCells();
            //int colnum = 3;
            for (int i = 6; i < rownum; i++) {
                Map<String, String> map = new LinkedHashMap<String, String>();
                List<String> listRow = new ArrayList<String>();
                row = sheet.getRow(i);
                if (row != null) {
                    for (int j = 1; j < colnum; j++) {
                        cellData = (String) getCellFormatValue(row.getCell(j));
                        /*map.put(columns[j], cellData);*/
                        listRow.add(cellData);
                    }
                } else {
                    break;
                }
                //list.add(map);
                for (List li : list) {
                    System.out.println(li);
                }
                list.add(listRow);
            }
        }
        //遍历解析出来的list
        /*for (Map<String, String> map : list) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.print(entry.getKey() + ":" + entry.getValue() + ",");
            }
            System.out.println();
        }*/
        System.out.println(list);
    }

    //读取excel
    public static Workbook readExcel(String filePath) {
        Workbook wb = null;
        if (filePath == null) {
            return null;
        }
        String extString = filePath.substring(filePath.lastIndexOf("."));
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            if (".xls".equals(extString)) {
                return wb = new HSSFWorkbook(is);
            } else if (".xlsx".equals(extString)) {
                return wb = new XSSFWorkbook(is);
            } else {
                return wb = null;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }

    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        if (cell != null) {
            //判断cell类型
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC: {
                    //判断是否为日期类型
                    if (DateUtil.isCellDateFormatted(cell)) {
                        //用于转化为日期格式
                        Date d = cell.getDateCellValue();
                        DateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        cellValue = formater.format(d);
                    } else {
                        DecimalFormat dfs = new DecimalFormat("0");

                        cellValue = dfs.format(cell.getNumericCellValue());

                        //cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_FORMULA: {
                    //判断cell是否为日期格式
                    if (DateUtil.isCellDateFormatted(cell)) {
                        //转换为日期格式YYYY-mm-dd
                        cellValue = cell.getDateCellValue();
                    } else {
                        //数字
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING: {
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                }
                default:
                    cellValue = "";
            }
        } else {
            cellValue = "";
        }
        return cellValue;
    }

}
