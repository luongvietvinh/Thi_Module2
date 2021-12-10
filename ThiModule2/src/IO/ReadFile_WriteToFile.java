package IO;

import model.Contact;
import service.ContactService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReadFile_WriteToFile {

    ContactService contactService = new ContactService();

// private String name;
//    private String phoneNumber;
//    private String address;
//    private String email;
//    private String faceBook;
    public   void  realdFile(){

        try {
            FileReader fileReader = new FileReader("contact.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null){
                String realdfile[] = line.split(" , ");

                String name = realdfile[0];
                String phoneNumber = realdfile[1];
                String address = realdfile[2];
                String email = realdfile[3];
                String faceBook = realdfile[4];


                Contact contact = new Contact(name,phoneNumber,address,email,faceBook);
                contactService.addList(contact);

            }
            System.out.println("đã  đọc file ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  void writeToFile() {
        List<Contact> list = contactService.show();
        try {
            FileWriter fileWriter = new FileWriter("contact.txt");
            for (Contact st : list) {
                fileWriter.write(st.toString() + " \n");
            }
            System.out.println("ghi file thành công");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
