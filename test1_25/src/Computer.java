/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-25
 * Time: 20:05
 */
public class Computer {
    private String cpu;
    private int memory;
    private int disk;


    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public void getDetails(){
        System.out.println("cpu:" + this.cpu + " " + "memory:" + this.memory + " " + "disk:" + this.disk);
    }
}
