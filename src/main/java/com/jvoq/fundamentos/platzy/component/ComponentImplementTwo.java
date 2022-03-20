package com.jvoq.fundamentos.platzy.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplementTwo implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("hola mundo desde componente 2");
    }
}
