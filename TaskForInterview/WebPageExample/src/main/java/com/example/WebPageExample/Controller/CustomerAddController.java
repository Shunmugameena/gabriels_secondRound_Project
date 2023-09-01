/*
 This Project is to show all customer details and add new customer.
 
 Language  : Java
 FrameWork : Spring Boot
 Database  : MySql
 
*/
package com.example.WebPageExample.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


import java.util.Base64;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.WebPageExample.pojoClass.Customer;
import com.example.WebPageExample.pojoClass.CustomerRepository;
import com.google.gson.Gson;

@Controller
public class CustomerAddController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/CustomerDetails")
	public String showAndAddCustomerDetails() {
				return "front";
	}
	public static Path path = Path.of("C:\\Users\\USER\\Music\\img\\img1\\default.png");
   
	//Method to add new Customer in Database
	
	@PostMapping("/addCustomerDetails")
	public String addCustomerDetails(@RequestParam String username,
			@RequestParam String address,
			@RequestParam String email,@RequestParam String phoneNumber,
			@RequestParam("image") MultipartFile image)throws IOException{
		
				Customer customer = new Customer();
		        customer.setUsername(username);
		        customer.setUserAddress(address);
		        customer.setUserMail(email);
		        customer.setUserPhone(phoneNumber);
		        byte[] imageData = image.getBytes();
		        customer.setUserProfileImg(imageData);
		        customerRepository.save(customer);
		        return "redirect:/CustomerDetails";        
	}
	
	//Method to fetch all customer details from Database
	
	@GetMapping("/details")
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		List<Customer> customer=customerRepository.findAll();
		for(int i=0;i<customer.size();i++) {
			Customer cus=customer.get(i);
			String[] phone=cus.getUserPhone().split(",");
			if(phone.length>1) {
				cus.setPhone1(Long.parseLong(phone[0]));
				cus.setphone2(Long.parseLong(phone[1]));
			}else
			{
				cus.setPhone1(Long.parseLong(phone[0]));
			}
			if(cus.getUserProfileImg()!=null) {
			byte[] imagedata=cus.getUserProfileImg();
			cus.setImage(Base64.getEncoder().encodeToString(imagedata));
			}else {
				 byte[] defaultimages= Files.readAllBytes(path);
	            cus.setImage(Base64.getEncoder().encodeToString(defaultimages));
			}
		}
        Gson gson = new Gson();
        String jsonData = gson.toJson(customer);
        response.setContentType("application/json");
        response.getWriter().write(jsonData);
    }
}
