package lession5;

public class financialRecord {
    int incomes;
    int outcomes;

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    public financialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }
}
