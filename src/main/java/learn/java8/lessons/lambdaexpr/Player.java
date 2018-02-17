package learn.java8.lessons.lambdaexpr;

class Player {
    private String firstname;
    private String lastname;
    private int yearsOfExperience;
    private StrengthShotType strengthShotType;

    public Player(String firstname, String lastname, int yearsOfExperience) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public StrengthShotType getStrengthShotType() {
        return strengthShotType;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setStrengthShotType(StrengthShotType strengthShotType) {
        this.strengthShotType = strengthShotType;
    }
}

