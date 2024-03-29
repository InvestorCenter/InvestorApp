public class Profile {
    private int income;
    private int risk;
    private boolean contributeMonthly;
    private int timePeriod;
    private int monthlyAmount;

    // Getter and setter for income
    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    // Getter and setter for risk
    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    // Getter and setter for contributeMonthly
    public boolean isContributeMonthly() {
        return contributeMonthly;
    }

    public void setContributeMonthly(boolean contributeMonthly) {
        this.contributeMonthly = contributeMonthly;
    }

    // Getter and setter for timePeriod
    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getMonthlyAmount(){
        return this.monthlyAmount;
    }

    public void setMonthlyAmount(int monthlyAmount){
        this.monthlyAmount = monthlyAmount;
    }
}
