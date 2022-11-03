package SpringrestApi;


import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import beans.EmpBean;

@RestController
public class EmpController {
	
	List <EmpBean> emps ;
	@GetMapping("/empall")
	public List <EmpBean> getEmpBean() {
		emps = new ArrayList<EmpBean>();
		EmpBean e1 = new EmpBean();
		e1.setEid(100);
		e1.setEname("soniya");
		e1.setEsal(10000);
		EmpBean e2 = new EmpBean();
		e2.setEid(200);
		e2.setEname("vinitha");
		e2.setEsal(20000);
		emps.add(e2);
		emps.add(e1);
		return emps;
	}
	@GetMapping("emp1/{id}")
	public EmpBean getEmpBean(@PathVariable("id") int id ) {

		 for(EmpBean e:emps)
		 {
			 if(e.getEid()==id) {
				 return e;
			 }			
		 }
		 return new EmpBean();	
}
}