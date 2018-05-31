package gof_exercises.cor_purchases;

class Manager extends Broker {

    Manager() {
        super("Manager");
    }

    @Override
    protected double getLimit() {
        return 5_000;
    }
}

class Director extends Broker {

    Director() {
        super("Director");
    }

    @Override
    protected double getLimit() {
        return 10_000;
    }
}

class VicePresident extends Broker {

    VicePresident() {
        super("VicePresident");
    }

    @Override
    protected double getLimit() {
        return 20_000;
    }
}

class President extends Broker {

    President() {
        super("President");
    }

    @Override
    protected double getLimit() {
        return 50_000;
    }
}

