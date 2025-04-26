package za.co.sediko.fiffy;

import java.util.Random;

public class Property {
    private String propertyAdress;
    private double propertyValue;
    private double rentAmountCharged;
    private String gateCode;
    private String otpCode;

    // default constructor
    public Property() {
    }

    // constructor with parameters
    public Property(String propertyAdress, double propertyValue, double rentAmountCharged, String gateCode) {
        this.propertyAdress = propertyAdress;
        this.propertyValue = propertyValue;
        this.rentAmountCharged = rentAmountCharged;
        this.gateCode = gateCode;
    }

    // getters and setters
    public String getPropertyAdress() {
        return propertyAdress;
    }

    public void setPropertyAdress(String propertyAdress) {
        this.propertyAdress = propertyAdress;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public double getRentAmountCharged() {
        return rentAmountCharged;
    }

    public void setRentAmountCharged(double rentAmountCharged) {
        this.rentAmountCharged = rentAmountCharged;
    }

    public String getGateCode() {
        return gateCode;
    }

    public void setGateCode(String gateCode) {
        this.gateCode = gateCode;
    }

    public String getOtpCode() {
        return otpCode;
    }

    public void setOtpCode(String otpCode) {
        this.otpCode = otpCode;
    }

    //answer for Question (a)
    public Property [] createPropertyArray() {
        Property [] properties = new Property[5];
        properties[0] = new Property("86 Smit Avenue, AdmamayView", 80000.00, 1200.50, "20");
        properties[1] = new Property("4020 Extension 7, Joubertins", 30000.00, 900.50, "13");
        properties[2] = new Property("E111 Ormonde View Estate, Aeroton", 50000.00, 3200.50, "36");
        properties[3] = new Property("10761 Protea Glen, Extension 12", 90000.00, 1200.50, "67");
        properties[4] = new Property("200 Chake Avenue, Flamwood", 20000.00, 800.50, "67");

         return properties;
    }

    //answer for Question (b)
    public String populateGateCode(double rentAmountCharged){
        int count = 0;
        // Convert the number to a String
        String numStr = String.valueOf(rentAmountCharged);

        // Get the length of the String
        int length = numStr.length();

        // Check if the length is at least 2
        if (length >= 2) {
            // Get the second last character
            String lastCharacter = numStr.substring(length - 1);
            System.out.println("### lastCharacter ### :: " + lastCharacter);

            // Get the last character
            String secondLastCharacter = numStr.substring(length - 2, length - 1);
            System.out.println("### secondLastCharacter ### :: " + secondLastCharacter);

            // convert the above characters to integer for proper calculations
            int last = Integer.valueOf(lastCharacter).intValue();
            int secondLast = Integer.valueOf(secondLastCharacter).intValue();

            // raise second last digit of the rentAmountCharged to the power of the last one
            double result = Math.pow(secondLast, last);
            System.out.println("### result ### :: " + result);
            // Recursively call the method to get the code
            gateCode =  result + populateGateCode(rentAmountCharged );
        } else {
            // Return a default value if the length is less than 2
            gateCode = "0";
        }
        return gateCode;
    }

    //answer for Question (c)
    //------------------------
    public String generateOtpCode(){
        Random rand = new Random();
        // Generate a random number between 0 and 99
        int randomNumber = rand.nextInt(100);
        String otp = randomNumber + "#";

       return otp;
    }

    public String [] createOtpCodeArray(){
        String [] otpCodes = new String[5];
        otpCodes[0] = generateOtpCode();
        otpCodes[1] = generateOtpCode();
        otpCodes[2] = generateOtpCode();
        otpCodes[3] = generateOtpCode();
        otpCodes[4] = generateOtpCode();

        return otpCodes;
    }
    // ------------------------------------

    //answer for Question (d)
    //sequential search
    public int sequenstialOtpCodeSearch(String otpCode,  String[] otpCodeArray){
        for (int i = 0; i < otpCodeArray.length; i++) {
            if (otpCodeArray[i] == otpCode) {
                System.out.println("otpCode found at index: " + i);
                return i;
            }
        }
        return -1;
    }

    //answer for Question (f)
    public double reviewPropertyAmountCharged(double rentAmountCharged){
        if(rentAmountCharged < 10000.00){
            rentAmountCharged = rentAmountCharged * 0.1;
        }

        if(rentAmountCharged > 20000.00){
            rentAmountCharged = rentAmountCharged * 0.99;
        }
        return rentAmountCharged;
    }

    //answer for Question (h)
    public Property getMiddleProperty(Property [] propertyArray){

        // Get the middle element of the array
        int middleIndex = propertyArray.length / 2;
        Property middleProperty = propertyArray[middleIndex];

        // Print the details of the middle property
        System.out.println("Middle Property Details:");
        System.out.println("Property address: " + middleProperty.getPropertyAdress());
        System.out.println("Property value: $" + middleProperty.getPropertyValue());
        System.out.println("Rent amount charged: " + middleProperty.getRentAmountCharged());
        System.out.println("Gate code: " + middleProperty.getGateCode());

        return middleProperty;
    }

    //answer for Question (i)
    public  Property[] sortPropertiesDescending(Property[] propertyArray) {
        // Sort the properties in descending order based on propertyValue
        for (int i = 0; i < propertyArray.length - 1; i++) {
            for (int j = 0; j < propertyArray.length - i - 1; j++) {
                if (propertyArray[j].getPropertyValue() < propertyArray[j + 1].getPropertyValue()) {
                    // Swap the properties if the current one has a lower price than the next one
                    Property temp = propertyArray[j];
                    propertyArray[j] = propertyArray[j + 1];
                    propertyArray[j + 1] = temp;
                }
            }
        }
        return propertyArray;
    }

    //answer for Question (a)
    public Property [] updatePropertyArray(Property[] propertyArray, String propertyAdress) {

        for (int i = 0; i < propertyArray.length; i++) {
            if (propertyArray[i].propertyAdress.equalsIgnoreCase(propertyAdress)) {
                System.out.println("property found at index: " + i);
                propertyArray.
            }
        }

        return properties;
    }
    public static void main(String[] args) {

        Property property = new Property();
        Property[] propertyArray = property.createPropertyArray();
        System.out.println("### array size ### :: " +propertyArray.length);

        String populatedGateCode = property.populateGateCode(1234.56);
        System.out.println("### gate code ### :: " + populatedGateCode);

        String generateOtpCode = property.generateOtpCode();
        System.out.println("### otp code ### :: " + generateOtpCode);

        String[] otpCodeArray = property.createOtpCodeArray();
        for (int i = 0; i < otpCodeArray.length; i++) {
            System.out.println("### index ### :: "+ i +" otp code "+ otpCodeArray[i]);
        }

        //answer for Question (e)
        int otpIndex = property.sequenstialOtpCodeSearch(generateOtpCode, otpCodeArray);
        for (int i = 0; i < propertyArray.length; i++) {
            if (i == otpIndex) {
                System.out.println("Found property in index: " + i);
                System.out.println("otpCode found at index: " + propertyArray[i].getPropertyAdress());
                System.out.println("otpCode found at index: " + propertyArray[i].getPropertyValue());
                System.out.println("otpCode found at index: " + propertyArray[i].getRentAmountCharged());
                System.out.println("otpCode found at index: " + propertyArray[i].getGateCode());
                break;
            } else {
                System.out.println("No property in index: " + i);
            }
        }

        //answer for Question (g)
        double totalPropertyAmountCharged = 0.0;
        //run through each property and do rentAmountCharged reviews
        for (int i = 0; i < propertyArray.length; i++) {
            //apply review for each property
            double reviewPropertyAmountCharged = property.reviewPropertyAmountCharged(propertyArray[i].rentAmountCharged);
            System.out.println("Review amount : " + reviewPropertyAmountCharged + "for property in address: " + propertyArray[i].getPropertyAdress());

            //get total after all reviews
            totalPropertyAmountCharged += reviewPropertyAmountCharged;
        }
        System.out.println("Shaun Total Review amount : " + totalPropertyAmountCharged);
    }
}
