package com.example.dao;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;

@Component("dao")
@Profile("dev")  // Ce bean sera actif uniquement avec le profil "dev"
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version de développement");
        return 150.0;
    }
}