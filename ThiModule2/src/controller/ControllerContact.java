package controller;

import IO.ReadFile_WriteToFile;
import model.Contact;
import service.ContactService;
import view.ViewContact;

public class ControllerContact {
    ContactService contactService = new ContactService();
    ViewContact viewContact = new ViewContact();
    ReadFile_WriteToFile readFile_writeToFile = new ReadFile_WriteToFile();

    public void controllerContact(){

        while (true){
            int choice = viewContact.menuManagerContact();
            if (choice >= 1 && choice <= 8){
                switch (choice){
                    case 1:
                        contactService.showListContact();
                        break;
                    case 2:
                        int choi = viewContact.menuChonTheoNhom();
                        switch (choi){
                            case 1:
                                contactService.addList(viewContact.menuAddList());
                                break;
                            case 2:
                                contactService.addList(viewContact.menuAddNguoiDung());
                                break;
                            case 3:
                                return;
                        }

                        break;
                    case 3:
                        contactService.showListContact();
                        String name = viewContact.editByName();
                        Contact contact = viewContact.menuEditContact(name);
                        contactService.editContact(name , contact);
                        break;
                    case 4:
                        contactService.showListContact();
                        contactService.deleteByPhoneNumber(viewContact.menudeleteByPhoneNumber());
                        break;
                    case 5:
                        contactService.searchByName(viewContact.menusearchByName());
                        break;
                    case 6:
                        readFile_writeToFile.realdFile();

                        break;
                    case 7:
                        readFile_writeToFile.writeToFile();
                        break;
                    case 8:
                        break;
                }
            }else
                System.err.println(" lựa chọn ko có trong danh sách");
        }
    }

}
