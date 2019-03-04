/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author Juan Páez
 */
public class Aplicacion {
   
    private String name;
    private short age;
    private String address;
    private long numberPhone;
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public short getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(short age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the numberPhone
     */
    public Long getNumberPhone() {
        return numberPhone;
    }

    /**
     * @param numberPhone the numberPhone to set
     */
    public void setNumberPhone(Long numberPhone) {
        this.numberPhone = numberPhone;
    }
}
