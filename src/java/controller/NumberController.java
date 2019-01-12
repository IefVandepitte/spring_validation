package controller;

import domain.Numbers;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import validator.NumberValidation;

@Controller
@RequestMapping("/numbers")
public class NumberController {
    @Autowired
    private NumberValidation numberValidation;

    @RequestMapping(method = RequestMethod.GET)
    public String showNumbers(Model model) {
        Numbers theNumber = new Numbers();
        model.addAttribute("numbers", theNumber);
        return "numberForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processNumbers(
            @Valid Numbers numbers,
            BindingResult bindingResult,
            Model model) {
        numberValidation.validate(numbers, bindingResult);
        if (bindingResult.hasErrors()) {
            return "numberForm";
        }
        return "numberSuccess";
    }    
}
