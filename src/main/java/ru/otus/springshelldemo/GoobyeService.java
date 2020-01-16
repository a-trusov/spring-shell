package ru.otus.springshelldemo;

import org.springframework.stereotype.Service;

@Service
public class GoobyeService {

    public String goodbyeTo(String name) {
        return "Goodby, " + name;
    }
}
