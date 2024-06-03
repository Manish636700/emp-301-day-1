package Day_3.Composition;

public class Mobile {

    public String name;
    public String ram;
    public String rom;
    public Mobile(String name, String ram, String rom) {
        this.name = name;
        this.ram = ram;
        this.rom = rom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }
}
