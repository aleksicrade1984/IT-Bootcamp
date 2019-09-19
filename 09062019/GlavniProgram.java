package domaci_09062019;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GlavniProgram {

	public static void main(String[] args) {
		try {
			File src = new File("Data (DOM).xls");
			FileInputStream fis = new FileInputStream(src);
			HSSFWorkbook wbe = new HSSFWorkbook(fis);
			HSSFSheet sheet = wbe.getSheetAt(0);
			int row = sheet.getLastRowNum();
			double sum = 0;
			for (int i = 0; i <= row; i++) {
				HSSFRow r = sheet.getRow(i);
				if (r != null) {
					double suma = r.getCell(0).getNumericCellValue();
					sum += suma;
				} else {
					System.out.println("Greska");
				}
			}
			System.out.println("Suma svih brojeva je: " + sum);
			wbe.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
