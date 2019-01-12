/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author ief
 */
class EvenConstraintValidator implements ConstraintValidator<Even,Integer>{

    @Override
    public void initialize(Even a) {
        ConstraintValidator.super.initialize(a);
    }

    @Override
    public boolean isValid(Integer t, ConstraintValidatorContext cvc) {
        return (t != null && t % 2 == 0);
    }
    
}
