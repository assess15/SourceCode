package com.laychv.module_open_projects.dagger2.demo9;

import dagger.Component;

@Component(modules = MouseModule.class)
interface ComputerComponent {
    void inject(Computer computer);
}
