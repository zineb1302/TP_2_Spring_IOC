package com.example.dao;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;

@Component("dao")
@Profile("prod")// Déclare cette classe comme un bean Spring avec l'identifiant "dao"
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version de production");
        return 100.0;
    }
}