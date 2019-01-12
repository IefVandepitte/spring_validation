/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author ief
 */
@Documented
@Constraint(validatedBy = EvenConstraintValidator.class)
@Target({FIELD})
@Retention(RUNTIME)
public @interface Even {
    
    String message() default "must have even number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
