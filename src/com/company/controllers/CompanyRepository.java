package com.company.controllers;

import com.company.repositories.interfaces.ICompanyRep;

public class CompanyRepository {
    private final ICompanyRep repo;

    public CompanyRepository(ICompanyRep repo) {
        this.repo = repo;
    }

    public String getTotalCost(){
        int total = repo.getTotalCost();
        return total != -1 ? "Total value of IT company " + total + "$" : "Failed to calculate";
    }
}
