/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lmadani.tpcustomerapplication.jsf;

import com.lmadani.tpcustomerapplication.model.Discount;
import com.lmadani.tpcustomerapplication.service.DiscountManager;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author USER
 */
@Named("discountBean")
public class DiscountBean {
    
    @Inject
    private DiscountManager discountManager ;
    
    public List<Discount> getAllDiscounts()
    {
        return discountManager.getAllDiscounts();
    }
}
