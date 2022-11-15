package task33;

/**
 * The class <strong>Laptop</strong> serves for store the following data:
 * <b>name</b>, <b>min frequency CPU</b>, <b>max frequency CPU</b>, <b>number of cores</b>, <b>RAM</b>, <b>ROM</b>,
 * <b>screen diagonal</b>, <b>weight</b>, <b>battery capacity</b>
 *  * @author Arina Kholodnytska
 *  * @version 1.0
 */
public class Laptop extends Computer {
    private int screenDiagonalInPixels;
    private double weightInKg;
    private double batteryCapacity;

    /**
     * Class constructor. Creates a Laptop with the specified values
     *
     * @param name                       the name
     * @param minFrequencyCPUInGigahertz the min frequency CPU in GHz
     * @param maxFrequencyCPUInGigahertz the max frequency CPU in GHz
     * @param numberOfCores              the number of cores
     * @param RAMInGigabytes             the RAM in GB
     * @param ROMInGigabytes             the ROM in GB
     * @param screenDiagonalInPixels     the screen diagonal in pixels
     * @param weightInKg                 the weight in kg
     * @param batteryCapacity            the battery capacity in mAh
     */
    public Laptop(
        String name,
        double minFrequencyCPUInGigahertz,
        double maxFrequencyCPUInGigahertz,
        int numberOfCores,
        int RAMInGigabytes,
        int ROMInGigabytes,
        int screenDiagonalInPixels,
        double weightInKg,
        double batteryCapacity
    ) {
        super(name, minFrequencyCPUInGigahertz, maxFrequencyCPUInGigahertz, numberOfCores, RAMInGigabytes, ROMInGigabytes);
        this.screenDiagonalInPixels = screenDiagonalInPixels;
        this.weightInKg = weightInKg;
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Get {@link Laptop screenDiagonalInPixels}
     * @return the screen diagonal in pixels
     */
    public int getScreenDiagonalInPixels() {
        return screenDiagonalInPixels;
    }

    /**
     * Sets {@link Laptop screenDiagonalInPixels}
     * @param screenDiagonalInPixels the screen diagonal in pixels
     */
    public void setScreenDiagonalInPixels(int screenDiagonalInPixels) {
        this.screenDiagonalInPixels = screenDiagonalInPixels;
    }

    /**
     * Get {@link Laptop weightInKg}
     * @return the weight of laptop in kg
     */
    public double getWeightInKg() {
        return weightInKg;
    }

    /**
     * Set {@link Laptop weightInKg} of laptop
     * @param weightInKg the weight in kg
     */
    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    /**
     * Get {@link Laptop batteryCapacity}
     * @return the battery capacity in mAh
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Set {@link Laptop batteryCapacity}
     * @param batteryCapacity the battery capacity in mAh
     */
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Print laptop characteristics
     */
    @Override
    public void printDeviceCharacteristics() {
        System.out.println("Laptop");
        System.out.println(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        Laptop that = (Laptop) obj;

        return this.screenDiagonalInPixels == that.screenDiagonalInPixels
                && this.weightInKg == that.weightInKg
                && this.batteryCapacity == that.batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Diagonal: %d, Weight (Kg): %.2f, Battery capacity: %.2f",
                 this.screenDiagonalInPixels, this.weightInKg, this.batteryCapacity);
    }
}
