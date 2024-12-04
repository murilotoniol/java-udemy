package entities;

public class OutsourcedEmployeeCap13 extends EmployeeCap13{
    private Double additionalCharge;

    public OutsourcedEmployeeCap13(){
        super();
    }

    public OutsourcedEmployeeCap13(Integer hours, String name, Double valuePerHour, Double additionalCharge) {
        super(hours, name, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}