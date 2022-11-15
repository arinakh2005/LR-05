package task33;
import java.util.Objects;

/**
 * The class <strong>Computer</strong> serves for store the following data:
 * <b>name</b>, <b>min frequency CPU</b>, <b>max frequency CPU</b>, <b>number of cores</b>, <b>RAM</b>, <b>ROM</b>
 * @author Arina Kholodnytska
 * @version 1.0
 */
public class Computer implements IComputer {
    private String name;
    private double minFrequencyCPUInGigahertz;
    private double maxFrequencyCPUInGigahertz;
    private int numberOfCores;
    private int RAMInGigabytes;
    private int ROMInGigabytes;

    /**
     * Class constructor. Creates a Computer with the specified values
     * @param name                       the name
     * @param minFrequencyCPUInGigahertz the min frequency CPU in GHz
     * @param maxFrequencyCPUInGigahertz the max frequency CPU in GHz
     * @param numberOfCores              the number of cores
     * @param RAMInGigabytes             the RAM in GB
     * @param ROMInGigabytes             the ROM in GB
     */
    public Computer(String name, double minFrequencyCPUInGigahertz, double maxFrequencyCPUInGigahertz, int numberOfCores, int RAMInGigabytes, int ROMInGigabytes) {
        this.name = name;
        this.minFrequencyCPUInGigahertz = minFrequencyCPUInGigahertz;
        this.maxFrequencyCPUInGigahertz = maxFrequencyCPUInGigahertz;
        this.numberOfCores = numberOfCores;
        this.RAMInGigabytes = RAMInGigabytes;
        this.ROMInGigabytes = ROMInGigabytes;
    }

    /**
     * Gets {@link Computer name}
     * @return the name of model
     */
    public String getName() {
        return name;
    }

    /**
     * Sets {@link Computer name} of model
     * @param name the name of model
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the {@link Computer minFrequencyCPUInGigahertz}
     * @return the min frequency CPU in GHz
     */
    public double getMinFrequencyCPUInGigahertz() {
        return minFrequencyCPUInGigahertz;
    }

    /**
     * Set the {@link Computer minFrequencyCPUInGigahertz}
     * @param minFrequencyCPUInGigahertz the min frequency CPU in GHz
     */
    public void setMinFrequencyCPUInGigahertz(double minFrequencyCPUInGigahertz) {
        this.minFrequencyCPUInGigahertz = minFrequencyCPUInGigahertz;
    }

    /**
     * Get the {@link Computer maxFrequencyCPUInGigahertz}
     * @return the max frequency CPU in GHz
     */
    public double getMaxFrequencyCPUInGigahertz() {
        return maxFrequencyCPUInGigahertz;
    }

    /**
     * Set the {@link Computer maxFrequencyCPUInGigahertz}
     * @param maxFrequencyCPUInGigahertz the max frequency CPU in GHz
     */
    public void setMaxFrequencyCPUInGigahertz(double maxFrequencyCPUInGigahertz) {
        this.maxFrequencyCPUInGigahertz = maxFrequencyCPUInGigahertz;
    }

    /**
     * Get the {@link Computer numberOfCores}
     * @return the number of cores
     */
    public int getNumberOfCores() {
        return numberOfCores;
    }

    /**
     * Set the {@link Computer numberOfCores}
     * @param numberOfCores the number of cores
     */
    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    /**
     * Get the {@link Computer RAMInGigabytes}
     * @return the RAM in GB
     */
    public int getRAMInGigabytes() {
        return RAMInGigabytes;
    }

    /**
     * Set the {@link Computer RAMInGigabytes}
     * @param RAMInGigabytes the RAM in GB
     */
    public void setRAMInGigabytes(int RAMInGigabytes) {
        this.RAMInGigabytes = RAMInGigabytes;
    }

    /**
     * Get the {@link Computer ROMInGigabytes}
     * @return the ROM in GB
     */
    public int getROMInGigabytes() {
        return ROMInGigabytes;
    }

    /**
     * Set the {@link Computer ROMInGigabytes}
     * @param ROMInGigabytes the ROM in GB
     */
    public void setROMInGigabytes(int ROMInGigabytes) {
        this.ROMInGigabytes = ROMInGigabytes;
    }

    /**
     * Print computer characteristics
     */
    @Override
    public void printDeviceCharacteristics() {
        System.out.println("Computer");
        System.out.println(this);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Computer that = (Computer) obj;

        return this.name.equals(that.name)
            && this.minFrequencyCPUInGigahertz == that.minFrequencyCPUInGigahertz
            && this.maxFrequencyCPUInGigahertz == that.maxFrequencyCPUInGigahertz
            && this.numberOfCores == that.numberOfCores
            && this.RAMInGigabytes == that.RAMInGigabytes
            && this.ROMInGigabytes == that.ROMInGigabytes;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, CPU (GHz): %.2f - %.2f, cores: %d, RAM (GB): %d, ROM (GB): %d",
                this.name, this.minFrequencyCPUInGigahertz, this.maxFrequencyCPUInGigahertz, this.RAMInGigabytes, this.ROMInGigabytes);
    }
}
