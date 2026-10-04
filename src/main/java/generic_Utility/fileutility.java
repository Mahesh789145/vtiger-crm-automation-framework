package generic_Utility;

import java.io.FileInputStream;

import java.io.FileReader;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class fileutility {

	public String getdatafomjsonfile(String key) throws IOException, ParseException {

		FileReader fr = new FileReader("src/test/resources/commondata.json");

		JSONParser parser = new JSONParser();

		Object obj = parser.parse(fr);

		JSONObject jobj = (JSONObject) obj;

		String Value = jobj.get(key).toString();

		return Value;

	}

	public String getdatafromexcelfile(String sheetname, int rowindex, int cellindex) throws Exception, IOException {

		FileInputStream fis = new FileInputStream("src/test/resources/GetExcelData1.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheetAt(0);

		Row row = sh.getRow(rowindex);

		Cell cell = row.getCell(cellindex);
		String value = cell.getStringCellValue();
		return value;

	}
}
