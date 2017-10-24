package com.idata.pdm.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idata.pdm.entity.Employee;
import com.idata.pdm.service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeAction {
	@Autowired
	private EmployeeService employeeService;

	/*
	 * @RequestMapping("/pets/{petId}") public void findPet(@PathVariable String
	 * petId)
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Employee login(@RequestBody Employee employee) {
		Employee loginUser = employeeService.login(employee);
		return loginUser;
	}

	@RequestMapping(value = "/userPageList", method = RequestMethod.POST)
	public Map<String, Object> selectEmployeePageList(@RequestBody Map<String, Object> queryParam) {

		int total = employeeService.totalEmployees(queryParam);
		List<Employee> rows = employeeService.selectEmployeePageList(queryParam);

		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", total);
		result.put("rows", rows);

		return result;
	}

	@RequestMapping(value = "/delUser", method = RequestMethod.GET)
	public int deleteEmployee(@RequestParam int employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}

}