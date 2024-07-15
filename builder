import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computer customComputer = new Computer.ComputerBuilder()
                .cpu(new Cpu(new Intel()))
                .storage(new Storage(new Dell(), 256))
                .build();
        
        customComputer.turnOn();
        customComputer.turnOff();
    }
}

class Computer {
    private List<Component> components;

    private Computer(ComputerBuilder builder) {
        this.components = builder.components;
    }

    public void turnOn() {
        System.out.println("Computer starts..");
        for (Component c : components) {
            c.start();
        }
    }

    public void turnOff() {
        System.out.println("Computer is stopping components---------");
        for (Component c : components) {
            c.stop();
        }
        System.out.println("Computer is turned Off.");
    }

    public static class ComputerBuilder {
        private List<Component> components = new ArrayList<>();

        public ComputerBuilder cpu(Component cpu) {
            components.add(cpu);
            return this;
        }

        public ComputerBuilder storage(Component storage) {
            components.add(storage);
            return this;
        }

        public ComputerBuilder addComponent(Component component) {
            components.add(component);
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

//====================== Brands ======================

interface Brand {
    public String getName();
}

class Dell implements Brand {
    public String getName() {
        return "Dell";
    }
}

class Intel implements Brand {
    public String getName() {
        return "Intel";
    }
}

//====================== Components ======================

abstract class Component {
    abstract public Brand getBrand();
    abstract public String getName();
    abstract public void start();
    public void stop() {
        System.out.println(getName() + " from " + getBrand().getName() + " is stopped.");
    }
}

class Cpu extends Component {
    private Brand brand;

    public Cpu(Brand _brand) {
        brand = _brand;
    }

    public String getName() {
        return "Cpu";
    }

    public Brand getBrand() {
        return brand;
    }

    public void start() {
        System.out.println(getName() + " from " + getBrand().getName() + " is running..");
    }
}

class Storage extends Component {
    private Brand brand;
    private int sizeInGb;

    public Storage(Brand _brand, int _sizeInGb) {
        brand = _brand;
        sizeInGb = _sizeInGb;
    }

    public String getName() {
        return "Disk Storage";
    }

    public Brand getBrand() {
        return brand;
    }

    public void start() {
        System.out.println(getName() + " from " + getBrand().getName() + " with size " + sizeInGb + "GB is running..");
    }
}
