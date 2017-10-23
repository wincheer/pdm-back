package com.idata.pdm.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idata.pdm.entity.Employee;
import com.idata.pdm.service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeAction {
	@Autowired
	private EmployeeService helloService;

	//	@RequestMapping("/hello")
	//	public ResponseEntity<Role> hello()
	//	{
	//		Role role = helloService.selectRoleByPk(1);
	//		return new ResponseEntity<Role>(role, HttpStatus.OK);
	//	}
	//	
	//	@RequestMapping("/hi")
	//	public Role hi()
	//	{
	//		Role role = helloService.selectRoleByPk(1);
	//		return role;
	//	}

	/* 
		@RequestMapping("/pets/{petId}")  
		public void findPet(@PathVariable String petId)
		http://localhost:8080/Springmvc/user/page.do?pageSize=3&pageNow=2 
		public String page(@RequestParam int pageSize,@RequestParam  int pageNow)
		下面的方式是请求参数为json/xml格式 
	*/
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Employee login(@RequestBody Employee employee) {
		Employee loginUser = helloService.login(employee);
		return loginUser;
	}

}