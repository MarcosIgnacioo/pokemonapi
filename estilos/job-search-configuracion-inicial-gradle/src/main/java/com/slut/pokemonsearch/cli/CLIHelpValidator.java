package com.slut.pokemonsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class CLIHelpValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean actualValue = Boolean.parseBoolean(value);
        if (actualValue){
            throw new ParameterException("Ayuda solicitada");
        }
    }
    /*
    *   Sirve para validar que cuando el usuario pide ayuda se considere la ayuda y no se lance asi nomas
    */

}
