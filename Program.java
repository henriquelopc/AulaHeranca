public class Program {
    public static void main (String[] args){
        
        Account acc =  new Account(1001, "Alex", 0.0);
        BusinessAccount bacc =  new BusinessAccount(1002, "Maria", 0.0, 500.0);

       //UPCASTING  e pegar um objeto do business account e atribuir para uma variavel do tipo account

       Account acc1 = bacc;
       Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
       Account acc3 =  new SavingsAccount(1004, "Ana", 0.0, 0.01);

       //DOWNCASTING e converter um objeto da superclasse para subclasse, processo inverso

       BusinessAccount acc4 = (BusinessAccount) acc2;
       acc4.loan(100.0);

       // BusinessAccount acc5 = (BusinessAccount) acc3; ERROR

       if(acc3 instanceof BusinessAccount) { //se oq tiver na variavel na acc3 for um objeto de instancia do bussniness account ai sim vc pode fazer o casting sim vai poder fazer
        BusinessAccount acc5 = (BusinessAccount)acc3;
        acc5.loan(200.0);
        System.out.println("Loan!");
       }
       
       if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
       }
    }
}
