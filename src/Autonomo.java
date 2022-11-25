public class Autonomo implements Client {

    private String nif;
    private String nameClient;
    private String surname;
    private String mailingAdress;
    private String population;
    private String province;
    private String email;
    private String phone;

    public void setNif(String nif) {
        this.nif = nif;
    }


    public void setNameClient(String name) {
        this.nameClient = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMailingAdress(String mailingAdress) {
        this.mailingAdress = mailingAdress;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String getClientCode() {
        return this.nif;
    }

    @Override
    public String getNameClient() {
        return this.nameClient;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getMailingAdress() {
        return this.mailingAdress;
    }

    @Override
    public String getPopulation() {
        return this.population;
    }

    @Override
    public String getProvince() {
        return this.province;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }

}


