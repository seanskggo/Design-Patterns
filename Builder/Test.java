package Builder;

public class Test {

    public static void main(String[] args) {

        ComputerModel computerModel = new ComputerModel();
        LaptopBuilder laptopBuilder = new LaptopBuilder(computerModel);
        Director director = new Director(laptopBuilder);
        
        director.makeHighQualityModel();
        Model highQualityLaptop = director.getModel();
        System.out.println(highQualityLaptop.getRam());
        System.out.println(highQualityLaptop.getScreen());
        System.out.println(highQualityLaptop.getKeyboard());

        director.makeLowQualityModel();
        Model lowQualityLaptop = director.getModel();
        System.out.println(lowQualityLaptop.getRam());
        System.out.println(lowQualityLaptop.getScreen());
        System.out.println(lowQualityLaptop.getKeyboard());

        PCBuilder pcBuilder = new PCBuilder(computerModel);
        director = new Director(pcBuilder);
        
        director.makeHighQualityModel();
        Model highQualityPC = director.getModel();
        System.out.println(highQualityPC.getRam());
        System.out.println(highQualityPC.getScreen());
        System.out.println(highQualityPC.getKeyboard());

        director.makeLowQualityModel();
        Model lowQualityPC = director.getModel();
        System.out.println(lowQualityPC.getRam());
        System.out.println(lowQualityPC.getScreen());
        System.out.println(lowQualityPC.getKeyboard());

    }

}
