package restApi;

import java.util.Calendar;

import persistence.entities.Gender;

public class Wrapper {

    private int id;

    private String name;

    private Gender gender;

    private Calendar bornDate;
    
    private int dividendo;
    private int divisor;
    

    public Wrapper() {
    }

    public Wrapper(int id, String name, Gender gender, Calendar bornDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.bornDate = bornDate;
    }
    
    
    public Wrapper(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    
    

    public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Calendar getBornDate() {
        return bornDate;
    }

    public void setBornDate(Calendar bornDate) {
        this.bornDate = bornDate;
    }

    @Override
    public String toString() {
    	return "Wrapper [division="+dividendo/divisor + "]"; 
        //return "Wrapper [id=" + id + ", name=" + name + ", gender=" + gender + ", bornDate=" + bornDate.getTimeInMillis() + "]";
    }

}
