public class main{

    //a string variable Drug_Name in Main class
    String Drug_Name;

    // a class by name of Drug to handle all the methods of adding, removing and selecting drugs
    public class Drugs{
        //String variable Drug_Name in Drugs Class
        private String Drug_Name;

        //Constructor for drugs class
        public Drugs(String drug_name){
            this.Drug_Name = drug_name;
        }

        //Getter method for Drug_Name
        public String getDrug_Name(){
            return Drug_Name;
        }

        //Setter method for Drug_Name
        public void setDrug_Name(String drug_Name){
            this.Drug_Name = drug_Name;
        }

    }
    public static void main(String[] args){


        //example usage of the Drugs class
        main mainInstance = new main();
        main.Drugs drugsInstance = mainInstance.new Drugs("Paracetamol");

        //accessing and printing Drug_Name using the getter method
        System.out.println("Drug Name: " + drugsInstance.getDrug_Name());

        //Modifying Drug_Name using setter method
        drugsInstance.setDrug_Name("Aspirin");
        System.out.println("Updated Drug Name: " + drugsInstance.getDrug_Name());

    }

}
