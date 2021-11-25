package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void genrateJVMReport(String jsonLoc) {
		System.out.println(System.getProperty("user.dir"));

		File jvmReport = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");

		List<String> li = new ArrayList<String>();
		li.add(jsonLoc);

		Configuration con = new Configuration(jvmReport, "AdactinLogInPage");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("OS", "10 above");
		con.addClassifications("Version", "95 and above");
		con.addClassifications("Generated By", "Venkat");

		// Genarate the Report
		ReportBuilder builder = new ReportBuilder(li, con);
		builder.generateReports();

	}
}
