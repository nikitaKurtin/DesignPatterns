package gof_exercisers.cor_purchases;

public abstract class Broker {
    private Broker successor;
    private String name;

    public Broker(String name) {
        this.name = name;
    }

    abstract protected double getLimit();

    Broker setSuccessor(Broker successor) {
        this.successor = successor;
        return this;
    }

    final void processRequest(PurchaseRequest request) {
        if (request.getAmount() < this.getLimit()) {
            System.out.println(name + " will approve $" + request.getAmount() + " for: " + request.getPurpose());
        } else if (successor != null) {
            System.out.println(name + " can't approve purchase, will pass to " + successor.name);
            successor.processRequest(request);
        } else {
            System.out.println("purchase can't be approved");
        }
    }
}
