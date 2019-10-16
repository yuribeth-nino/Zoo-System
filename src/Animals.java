/*  
 * 
 * This class Animal. This class design and implement a class 
 * called Animal that will store data about a Animals.
 * provides some functionality for an Animal
 * that has a name.
 */

/**
 *
 * @author @author Ana Velazco,Yacehelis Rivodo, Yuribeth Contreras
 */
/**
 *
 * Declaring variables of the class Animal
 * Declaring for private variables
 */
public abstract class Animals {

    private String name;
    private String dateOB;
    private String dateArrival;
    private String gender;
    private boolean offSpring;
    private String medication;
    private String vaccine;
    private int exibitNumber;
    //privte keeeper keeperAssigned;

    /**
     * Constructor for objects of class Animal
     *
     * @param name the name of the animal
     * @param gender
     * @param exibitNumber
     * @param dateOB
     * @param dateArrival
     * @param medication
     * @param offSpring
     * @param vaccine
     */
    public Animals(String name, String gender, String dateOB, String dateArrival,
            boolean offSpring, String medication, String vaccine,
            int exibitNumber) {
        this.name = name;
        this.gender = gender;
        this.dateOB = dateOB;
        this.dateArrival = dateArrival;
        this.offSpring = offSpring;
        this.medication = medication;
        this.vaccine = vaccine;
        this.exibitNumber = exibitNumber;

    }
/**
     * getName() is an method for "name".
     *
     * @return 
     * @returns the name of the animal is returned
     */
    public String getName() {
        return name;
    }

    /**
     * setName() is an set method for "name".
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDateOB() {
        return dateOB;
    }

    /**
     *
     * @param dateOB
     */
    public void setDateOB(String dateOB) {
        this.dateOB = dateOB;
    }

    /**
     *
     * @return
     */
    public String getDateArrival() {
        return dateArrival;
    }

    /**
     *
     * @param dateArrival
     */
    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public boolean isOffSpring() {
        return offSpring;
    }

    /**
     *
     * @param offSpring
     */
    public void setOffSpring(boolean offSpring) {
        this.offSpring = offSpring;
    }

    /**
     *
     * @return
     */
    public String getMedication() {
        return medication;
    }

    /**
     *
     * @param medication
     */
    public void setMedication(String medication) {
        this.medication = medication;
    }

    /**
     *
     * @return
     */
    public String getVaccine() {
        return vaccine;
    }

    /**
     *
     * @param vaccine
     */
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    /**
     *
     * @return
     */
    public int getExibitNumber() {
        return exibitNumber;
    }

    /**
     *
     * @param exibitNumber
     */
    public void setExibitNumber(int exibitNumber) {
        this.exibitNumber = exibitNumber;
    }


    /**
     *
     * toString() provides a String representation of the Animal object.
     *
     * @return 
     * @returns a string representation of the Animal object Returns a string
     * representation of the animal. This includes its name, its current weight,
     * what it likes to eat, and any noises it can make.
     *
     */
    public String toString() {
        return "Animal: " + name;
    }
}