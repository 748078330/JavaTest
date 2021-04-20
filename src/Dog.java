public class Dog {
    private String dogName;

    public String getDogName() {
        return dogName;
    }

    public String getDogGender() {
        return dogGender;
    }

    public int getDogAge() {
        return dogAge;
    }

    public int getDogValue() {
        return dogValue;
    }

    private String dogGender;
    private int dogAge;
    private int dogValue;

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogGender(String dogGender) {
        if("1".equals(dogGender)){
            dogGender="公";
            this.dogGender = dogGender;
        }
        else if ("2".equals(dogGender)){
            dogGender="母";
            this.dogGender=dogGender;
        }
    }

    public void setDogAge(int dogAge) {
        if (1<dogAge&&dogAge<20){
            this.dogAge = dogAge;
        }
        else {
            this.dogAge=1;
        }

    }

    public void setDogValue(int dogValue) {
        if (1<dogValue&&dogValue<100){
            this.dogValue = dogValue;
        }
        else {
            this.dogValue=dogValue;
        }
    }
}
