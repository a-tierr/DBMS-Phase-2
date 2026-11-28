package com.team83.carwash;

import com.team83.carwash.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
        System.out.println("Connected to PostgreSQL successfully.");
        HibernateUtil.shutdown();
    }
}
