package com.export2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.export2excel.service.ReportService;

import jakarta.servlet.http.HttpServletResponse;
@RestController
public class ReportRestController extends ReportService {
	@Autowired
	private ReportService reportService;
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception {
		//Question: file is not downloaded as courses.xlsx, how to fix?
		response.setContentType("application/octet-stream");
		
		String headerKey = "Content-Desposition";
		String headerValue = "attachment; filename=courses.xlsx";
		
		response.setHeader(headerKey, headerValue);
		
		reportService.generateExcel(response);
	}

}
