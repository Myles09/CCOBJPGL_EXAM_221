package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("ang budget ko ay " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println(" boracay hits " );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("ubusan nanaman ng money ");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("Gala nanaman");
            budget -= bohol.airFare;
        }else{
            System.out.println("Wala na akong na ipon shesh");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("Hello mga Cebuanos ");
            budget -= cebu.airFare;
        }else{
            System.out.println("Send moneyyyy");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Palawan hits");
            budget -= palawan.airFare;
        }else{
            System.out.println("Gala ulet ubos na pera ko!!");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("SIARGAO HITS");
            budget -= siargao.airFare;
        }else{
            System.out.println("Relax later ubos pera pagkatapos");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("Tara vigan sponty ");
            budget -= vigan.airFare;
        }else{
            System.out.println("wala na akong allowance :)");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}
