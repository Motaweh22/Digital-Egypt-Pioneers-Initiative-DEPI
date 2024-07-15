public class VegPizzaDecorator extends PizzaDecorator{
    public VegPizzaDecorator(pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String makepizza() {
        return pizza.makepizza()+ "with vegtables";
    }
    public String addVegtables(){
    return "adding vegtables";
    }
}
