package com.example.demo.Securitycontroller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.dialect.pagination.FirstLimitHandler;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.CustomerModel;

//import com.example.demo.model.CustomerModel;

import com.example.demo.service.CustomerService;



@Controller
public class CustomerController {
	@Autowired
	
	private CustomerService customerservice;
    
	@RequestMapping(value="/first",method=RequestMethod.GET)
	public String First() {
	return "FirstPage";	
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String read(Model model) {
		
		model.addAttribute("show", new CustomerModel());
		return "Display";
	}
//	@RequestMapping(value="/add",method=RequestMethod.POST)
//	public String readf(@ModelAttribute("show")CustomerModel customerModel,Model model) {
//		
//		model.addAttribute("show", customerModel);
//		return "Display";
//	}

	
	

	@RequestMapping(value="/adder", method= RequestMethod.GET)
	public String printSchedule(Model model)	{
		
//		List<CustomerModel> disp=customerservice.calc();
		
		model.addAttribute("results",customerservice.calc());
          return "Print";
			    }
//	
	@RequestMapping(value="/adder", method= RequestMethod.POST)
	public String printRepaymentSchedule(@Valid @ModelAttribute("show")CustomerModel customermodel,BindingResult result,Model model)	{
		
		if(result.hasErrors()) {
			
			            return  "Display";
			             }
		 customerservice.method(customermodel);
//		customerservice.calc(model);
		
		model.addAttribute("results",customerservice.calc());
          return "Print";
			    }
	
	@RequestMapping(value="/search", method =  RequestMethod.GET)
	public String searchno(Model model)
	{	
		model.addAttribute("put",new CustomerModel());

        return "Searchget";
	}
	@RequestMapping(value="/final", method =  RequestMethod.POST)
	public String printsearchNo(Model model, CustomerModel customermodel)
	{	
	customerservice.search(model, customermodel);
        return "Searchget";
	}
	
	@RequestMapping(value="/delete", method =  RequestMethod.GET)
	public String deleteno(Model model)
	{	
		model.addAttribute("deleted",new CustomerModel());

        return "Deleteget";
	}
	@RequestMapping(value="/deleting", method =  RequestMethod.POST)
	public String printdeleteno(@ModelAttribute("deleted")CustomerModel customermodel )
	{	
	customerservice.delete(customermodel);
        return "Deleteget";
	}
	@RequestMapping(value="/update", method =  RequestMethod.GET)
	public String updateno(Model model,CustomerModel customermodel)
	{	
		model.addAttribute("updated",customermodel);

        return "Updateget";
	}

	@RequestMapping(value="/updating", method =  RequestMethod.POST)
	public String printupdate(CustomerModel customermodel,Model model )
	{
		customerservice.update(customermodel,model);
		return "Display";
//		return "Updateshow";
		
//	customerservice.update(customermodel);
//        return "redirect:/add";
	}
	
	
	
	
	
	
		
}
