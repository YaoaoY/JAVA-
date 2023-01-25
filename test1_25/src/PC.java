/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-25
 * Time: 20:21
 */
public class PC extends Computer{
    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("brand:"+this.brand);
    }
}
