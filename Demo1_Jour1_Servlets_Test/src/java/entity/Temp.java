package entity;
// Generated Jun 30, 2018 2:08:06 PM by Hibernate Tools 4.3.1



/**
 * Temp generated by hbm2java
 */
public class Temp  implements java.io.Serializable {


     private int id;
     private Integer celsius;
     private Integer farenheit;

    public Temp() {
    }

	
    public Temp(int id) {
        this.id = id;
    }
    public Temp(int id, Integer celsius, Integer farenheit) {
       this.id = id;
       this.celsius = celsius;
       this.farenheit = farenheit;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getCelsius() {
        return this.celsius;
    }
    
    public void setCelsius(Integer celsius) {
        this.celsius = celsius;
    }
    public Integer getFarenheit() {
        return this.farenheit;
    }
    
    public void setFarenheit(Integer farenheit) {
        this.farenheit = farenheit;
    }




}


