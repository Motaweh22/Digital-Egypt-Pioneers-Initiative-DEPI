public class CheckenPizzaDecorator extends PizzaDecorator {
    public CheckenPizzaDecorator(pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String makepizza() {
        return pizza.makepizza()+"with Checken";
    }
    public String AddCheken()
    {
        return "Adding checken";
    }
}
