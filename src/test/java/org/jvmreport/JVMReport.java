package org.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String json) {
		//1.Mention the Target Folder
		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");
		
		//2.Add Details to the Report: 
		Configuration con = new Configuration(f, "Facebook Application");
		con.addClassifications("Platform Name: ", "Windows");
		con.addClassifications("Platform Version: ", "10");
		con.addClassifications("Sprint no: ", "8");
		
		//3.Create a List to Store JSON FilePaths
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		//4.To generate a report
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
	}
}
