//Dahyun Eom
//dahyun.eom@stonybrook.edu

// You will have to complete this file by replacing FILL_IT_IN with
// appropriate Java code (most likely multiple lines) and by adding
// additional code where needed.

import java.io.*;
public class ProcessApplications {

    public static String readALine (BufferedReader input) {
        String line = "";
        try {
            line = input.readLine();
        }
        catch (IOException e) {
            System.out.println("Oops");
        }
        return line;
    }

    // Rather than catching IOException's in main, main can pass it on
    // by 'throw'ing it, which is what I chose to do here.
    //
    public static void main (String[] args) throws IOException {

        
        String inputFile = "./a1.txt"; 
        
        // Pattern to be used to "open an input file"
        BufferedReader input = new BufferedReader(new FileReader(inputFile));

        // I am assuming that there is at least one line in the input file.
        int numApplications = Integer.parseInt(readALine(input));
        Application[] applications = new Application[numApplications]; //read into array

	    String idstring = readALine(input);
	    int id;
	    if (idstring != null) {
	        id = Integer.parseInt(idstring);
	    }
        String name;
        String addr;
        //FILL_IT_IN
        String city;
        String state;
        String zipcode;
        String phoneNumber;
        String intendedMajor;
        String gpastring;
        double gpa;
        String scholarship;
        ///////////////////////////////////

        int i = 0;
        while (idstring != null) {   // Reached the end of the input file?
            id = Integer.parseInt(idstring);
	    //FILL_IT_IN
            name = readALine(input);
            addr = readALine(input);
            city = readALine(input);
            state = readALine(input);
            zipcode = readALine(input);
            phoneNumber = readALine(input);
            intendedMajor = readALine(input);
            gpastring = readALine(input);
            gpa = Double.parseDouble(gpastring);
            scholarship = readALine(input);
            applications[i] = new Application(id, name, addr, city, state, zipcode, phoneNumber, intendedMajor, gpa, scholarship);
        /////////////////////////////////////////         
            i = i + 1;
            idstring = readALine(input);  // Read the next entry if exists
        }

        input.close();  // Close it when done reading from it.
        
        // Now that we have all the application objects in an array, we can
        // use those objects to do whatever we want to do.

        // Find scholarship recipients. An applicant is considered a scholarship
        // recipient if:
        //   (1) his or her high school GPA is higher than 3.75,
        //   (2) his or her intented major is one of the following: Philosophy,
        //       History, or Psychology, 
        //   (3) s/he is from Montana, Wyoming, or Idaho, and
        //   (4) s/he is applying for scholarship.
        // Find and print all the scholarship recipients.
        //FILL_IT_IN
        String [] recipients_arr = new String[numApplications];
        for(int j=0, k=0; j<numApplications; j++){
            if (applications[j].getGpa()>3.75){
                if(applications[j].getIntendedMajor().equals("Philosophy")|| applications[j].getIntendedMajor().equals("History")|| applications[j].getIntendedMajor().equals("Psychology")){
                    if(applications[j].getState().equals("Montana") || applications[j].getState().equals("Wyoming") || applications[j].getState().equals("Idaho")){
                        if(applications[j].getScholarship().equals("Yes")){
                            recipients_arr[k++] = applications[j].getName();
                        }
                    }
                }
            }    
        }
        int p = 0;
        while (recipients_arr[p] != null){
            System.out.println(recipients_arr[p++]);
        }
        int t=0;
        if(recipients_arr[t] == null){
            System.out.println("no scholarship recipients.");
        }
        //////////////////////////////////
        
        // Print the average GPA of all the applicants from California:
        //FILL_IT_IN
        double [] californianGpa_arr = new double[numApplications];
        int numbersOfCalifornian = 0;
        for(int m=0, n=0; m<numApplications; m++){
            if(applications[m].getState().equals("California")){
                californianGpa_arr[n++] = applications[m].getGpa();
                numbersOfCalifornian += 1;
            }
        }

        double sumOfGpa = 0;
        if (numbersOfCalifornian == 0){
            System.out.println("0.0");
        }
        
        else{
            for(int q=0; q<californianGpa_arr.length; q++){
                sumOfGpa += californianGpa_arr[q];
            }

            double averageGpa = sumOfGpa / numbersOfCalifornian;
            System.out.println(averageGpa);
        }

        ////////////////////////////////////
        // Find the applicant whose GPA is the highest among the applicants
        // from the state of Washington and print the name and the GPA of
        // that applicant.
        //FILL_IT_IN
        int numbersOfWashingtonPeople = 0;
        for(int l=0; l<numApplications; l++){
            if (applications[l].getState().equals("Washington")){
                numbersOfWashingtonPeople += 1;
            }
        }
        Application[] washingtonPeople = new Application[numbersOfWashingtonPeople];
        for(int h=0, v=0; h<numApplications; h++){
            if (applications[h].getState().equals("Washington")){
                washingtonPeople[v] = applications[h];
                v++;
            }
        }

        if(washingtonPeople.length != 0 ){
            double highestGpa = washingtonPeople[0].getGpa();
            String applicantName = washingtonPeople[0].getName();
            for(int x=1; x<washingtonPeople.length; x++){
                if(washingtonPeople[x].getGpa() > highestGpa){
                    highestGpa = washingtonPeople[x].getGpa();
                }
                applicantName = washingtonPeople[x].getName();
            }
            System.out.println(applicantName + ": " + highestGpa);
        }
        else{
            System.out.println("There are no aplicants whose from the state of Washington.");
        }
        /////////////////////////////////////////////
        // Find and print the number of applications from each state
        // in this format (alphabetical order):
        //
        //   State, No of Applications
        //   Arizona, 5
        //   California, 20
        //   Oregon, 6
        //   Washington, 7
        //
        // You may assume that the only valid state names are the 50
        // states in the USA.  That is, you will only see at most
        // those names in your input file.  In your output, do NOT
        // include the state names from which there is no application.
        //FILL_IT_IN
        String[] states_arr = new String[numApplications];
        for(int z=0; z<numApplications; z++){
            states_arr[z] = applications[z].getState();
        }
        
        State.stateDistribution(states_arr);

    }
}
