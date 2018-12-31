  package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.domain.CustomerModel;
import com.example.demo.repositories.CustomerRepository;

//import com.example.demo.model.CustomerModel;
//import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerService implements CustomerServiceInterface {
	@Autowired 
	CustomerRepository customerrepository;



	@Override
	public void method(CustomerModel customermodel) {
	
		CustomerModel	cmodel=new CustomerModel();
		
		cmodel.setCreatedBy(customermodel.getCreatedBy());
		cmodel.setCustomerAddress(customermodel.getCustomerAddress());
		cmodel.setCustomerPincode(customermodel.getCustomerPincode());
		cmodel.setCustomerEmail(customermodel.getCustomerEmail());
		cmodel.setCustomerName(customermodel.getCustomerName());
		cmodel.setCustomerNumber(customermodel.getCustomerNumber());
		cmodel.setModifiedDate(customermodel.getModifiedDate());
		cmodel.setRegistrationDate(customermodel.getRegistrationDate());
		cmodel.setCustomerCode(customermodel.getCustomerCode());
	
	

 customerrepository.save(cmodel);
	}



	@Override
	public List<CustomerModel> calc() {
	
		
		return customerrepository.findAll();
	}



//	@Override
//	public void searcher(int customerCode, Model model) {
//		model.addAttribute("put",customerrepository.findById(customerCode));
//		
//	}



	@Override
	public void search(Model model, CustomerModel customermodel) {
		model.addAttribute("put",customerrepository.findBycustomerCode(customermodel.getCustomerCode()));
		
	}



	@Override
	public void delete( CustomerModel customermodel) {
		customerrepository.delete(customermodel);
		
		}



	@Override
	public void update(CustomerModel customermodel,Model model) {
		model.addAttribute("show",customerrepository.findBycustomerCode(customermodel.getCustomerCode()));
		
		
	}



	
	


	

//	@Override
//	public List<CustomerModel> calc(Model model) {
//		model.addAttribute("results",customerrepository.findAll());
//		return customerrepository.findAll();
//	}

	
	
		 
	}

