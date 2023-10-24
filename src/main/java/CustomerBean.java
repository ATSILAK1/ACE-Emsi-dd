/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */


import com.lmadani.tpcustomerapplication.Service.CustomerManager;
import com.lmadani.tpcustomerapplication.model.Customer;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author USER
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable{
    private List<Customer> customerList ;
    
    @Inject
    private CustomerManager customerManager;
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
      
       }
    
    public List<Customer> getCustomers()
    {
          if (customerList == null )
            customerList = customerManager.getAllCustomers();
        
        return customerList ;
    }
    
}
