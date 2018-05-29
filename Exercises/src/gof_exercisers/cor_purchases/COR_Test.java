package gof_exercisers.cor_purchases;

public class COR_Test {
    public static void main(String[] args) {
        //create responsibilities
        Manager manager = new Manager();

        //set handling chain
        manager.setSuccessor(
                new Director().setSuccessor(
                        new VicePresident().setSuccessor(new President())));

        //handle request (from head of handling chain)
        manager.processRequest(new PurchaseRequest(100, "Bug product"));
        manager.processRequest(new PurchaseRequest(1000, "Bug Share"));
        manager.processRequest(new PurchaseRequest(10000, "Bug Department"));
        manager.processRequest(new PurchaseRequest(25000, "Bug Company"));
        manager.processRequest(new PurchaseRequest(1000000, "Bug World"));
    }
}
