package com.slut.pokemonsearch.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {
    public static Map<String, Object> toMap(CLIArguments cliArguments){
        Map<String, Object> params = new HashMap<>();
        params.put("description", cliArguments.getKeyword());
        params.put("generation", cliArguments.getGeneration());
        params.put("main_series", cliArguments.isMainSeries());
        params.put("page", cliArguments.getPage());

        if (cliArguments.isMarkDown()){
            params.put("markdown", true);
        }
        return params;
    }
}
