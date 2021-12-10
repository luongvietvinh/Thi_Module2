package service;

import model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService {

    static List<Contact> listContact = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public List<Contact> show(){
        return listContact;
    }

    public void  showListContact(){
        int count =0;
        for (Contact st:listContact) {
            System.out.println(st);
            count++;
            System.out.println("---------------------------------------------------------");
            if (count%5 ==0){
                System.out.println("enter de tiep tuc , nhap q de quay lai");
                String quit = scanner.nextLine();
                if (quit.equalsIgnoreCase("q"))
                return;
            }
        }
    }

    public void addList(Contact contact){
        listContact.add(contact);

    }

    public void editContact(String name , Contact contact){
        listContact.set(findByName(name), contact);
        System.out.println("sửa thành công");
    }

    public void deleteByPhoneNumber(String name) {
        listContact.remove(findByName(name));
        System.out.println("xóa thành công");
    }

    public int findByName(String name) {
        for (int i = 0; i < listContact.size(); i++) {
            if (name.equals(listContact.get(i).getName())){
                return i;
            }
        }
        return -1;
    }

    public void searchByName(String name) {
        for (int i = 0; i < listContact.size(); i++) {
            if (name.equals(listContact.get(i).getName())){
                System.out.println( listContact.get(i));
            }
        }
    }

}
