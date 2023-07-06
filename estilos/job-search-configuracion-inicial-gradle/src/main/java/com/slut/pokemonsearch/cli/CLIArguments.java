package com.slut.pokemonsearch.cli;

import com.beust.jcommander.Parameter;
/*
* Los names son los nombres de los comandos en consola
* La descripción es lo que sale cuando usas help y te explique los comandos creo
* */
public class CLIArguments {
    public CLIArguments() {
    }
    @Parameter(
            required = true,
            validateWith = CLIAKeywordValidator.class,
            descriptionKey = "KEYWORD",
            description = "KEYWORD"
    )
    private String keyword;
    @Parameter(
            names = {"--generation","-g"},
            description = "Cada busqueda puede incluir una generación"
    )
    private String generation;
    @Parameter(
            names = {"--page","-p"},
            description = "La api devuelve muchos resultados jejej usa un numero para la pagina"
    )
    private int page = 0;
    @Parameter(
            names = "--is-main-series",
            description = "Agrega si quieres que no sean de la main series"
    )
    private boolean isMainSeries = true;
    @Parameter(
            names = "--markdown",
            description = "Obtener los resultados en markdown"
    )
    private boolean isMarkDown = false;
    @Parameter(
            names = "--help",
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Mostrar esta ayuda"
    )

    /*
    *   "validateWith = CLIHelpValidator.class"
    *   Cuando JCommander recibe este parámetro, TIENE QUE
    *   revisar el validador en la clase CLIHelpValidator
    * */
    private boolean isHelp;

    public String getKeyword() {
        return keyword;
    }

    public String getGeneration() {
        return generation;
    }

    public int getPage() {
        return page;
    }

    public boolean isMainSeries() {
        return isMainSeries;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", generation='" + generation + '\'' +
                ", page=" + page +
                ", isMainSeries=" + isMainSeries +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                '}';
    }
    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
