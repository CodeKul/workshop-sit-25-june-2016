/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.sit.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

/**
 *
 * @author aniruddha
 */
@Component
public class Car {
 
    @Autowired // by type 
    private Engine engine; 
    
    @Qualifier("engineMy")
    private Engine engineMy;

    public Car() {
    }

    public Car(Engine engine){
        this.engine = engine;
    }
    
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
