package models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author usuario
 */
public class Clientevalidation implements Validator{

    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type) {
        return Cliente.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        Cliente cliente = (Cliente)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "id", 
                "requiered.id",
                "El campo id es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "nombre", 
                "requiered.nombre",
                "El campo nombre es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "direccion", 
                "requiered.direccion",
                "El campo direccion es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "correo", 
                "requiered.correo",
                "El campo correo es obligatorio...");
        
         ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "telefono", 
                "requiered.telefono",
                "El campo telefono es obligatorio...");
         ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "salario", 
                "requiered.salario",
                "El campo salario es obligatorio...");
    }
}