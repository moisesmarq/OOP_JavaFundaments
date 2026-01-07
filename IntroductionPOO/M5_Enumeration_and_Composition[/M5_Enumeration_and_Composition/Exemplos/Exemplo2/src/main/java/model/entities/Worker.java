package main.java.model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import main.java.model.enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
   
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts(){
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }
    
    public double income(int year, int month){
        double total = this.baseSalary; 
        Calendar cal = Calendar.getInstance(); //Com essa classe é possivel trabalhar com datas.

        for (HourContract contract : contracts) {
            cal.setTime(contract.getDate());

            int contract_year = cal.get(Calendar.YEAR);
            int contract_month = 1 + cal.get(Calendar.MONTH);
            if (contract_month == month && contract_year == year){
                total += contract.totalValue();
            }
        }
        return total;
    }
}
