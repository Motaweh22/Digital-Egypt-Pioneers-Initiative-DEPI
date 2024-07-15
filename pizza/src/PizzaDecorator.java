public abstract class  PizzaDecorator implements pizza {
    protected pizza pizza ;
    public PizzaDecorator(pizza pizza)
    {
        this.pizza=pizza;
    }
    @Override
    public String makepizza() {
        return pizza.makepizza();
    }
}
