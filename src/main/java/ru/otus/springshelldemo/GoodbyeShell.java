package ru.otus.springshelldemo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class GoodbyeShell {

    private final GoobyeService service;

    public GoodbyeShell(GoobyeService service) {
        this.service = service;
    }

    @ShellMethod(key="goodby-to", value="Say goodbye to username")
    public String goodbyeTo(@ShellOption({"username", "u"}) String username) {
        return service.goodbyeTo(username);
    }
}
