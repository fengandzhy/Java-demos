package org.zhouhy.java.poi.excel.generate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class GenerateExcelFile {
	
	private static final String FILE_NAME = "\\sales.xls";
	
	public void sample1() throws Exception {
		
		//����һ��������workbook
		Workbook workbook = new HSSFWorkbook();		
		
		//����һ��������sheet
		Sheet sheet = workbook.createSheet("aaaa");
		
		//����һ���ж���row���±���ʼֵΪ0���������ǵ�4��
		Row row = sheet.createRow(3);
		
		//����һ����Ԫ�����cell���±���ʼֵΪ0���������ǵ�����
		Cell cell = row.createCell(3);
		
		//���õ�Ԫ�������
		cell.setCellValue("My home town");
		
		
		CellStyle cellStyle = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Microsoft YaHei UI");
		font.setFontHeightInPoints((short)40);
		cellStyle.setFont(font);
		cell.setCellStyle(cellStyle);
		
		OutputStream os = new FileOutputStream("D:\\excel����.xls");
		workbook.write(os);
		os.close();
		workbook.close();
	}
	
	@SuppressWarnings("resource")
	public void sample2() throws Exception {
		String filePath = System.getProperty("user.dir");
		String path = filePath+FILE_NAME;
		File excelFile = new File(path);
		HSSFWorkbook workbook;
		if(excelFile.exists()) {
			workbook = new HSSFWorkbook(new FileInputStream(excelFile));
		}else {
			workbook = new HSSFWorkbook();
		}
		
		Sheet sheet = workbook.createSheet("bbbbdddd");
		
		Row row = sheet.createRow(3);
		
		Cell cell = row.createCell(3);
		
		cell.setCellValue("My home town");
		
		
		CellStyle cellStyle = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Microsoft YaHei UI");
		font.setFontHeightInPoints((short)40);
		cellStyle.setFont(font);
		cell.setCellStyle(cellStyle);
		
		OutputStream os = new FileOutputStream(filePath+FILE_NAME);
		workbook.write(os);
		os.close();
		workbook.close();		
	}
	
	public void sample3() throws Exception {
		String filePath = System.getProperty("user.dir");
		System.out.println(filePath);
	}
}
