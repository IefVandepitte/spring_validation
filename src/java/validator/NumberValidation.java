/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import domain.Numbers;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author ief
 */
public class NumberValidation implements Validator{

    
    @Override
    public boolean supports(Class<?> type) {
        return Numbers.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Numbers form = (Numbers) o;
        if (form.getNumber1() != null &&
            form.getNumber2() != null &&
                    form.getNumber1() >= form.getNumber2()){
            errors.rejectValue("number1", "", "number1 < number2");
        }
    }
    
}
