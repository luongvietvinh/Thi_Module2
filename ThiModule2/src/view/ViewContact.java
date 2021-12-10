package view;

import model.Contact;
import model.Khachhang;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ViewContact {

    Scanner scanner = new Scanner(System.in);

    public int menuChonTheoNhom(){
        System.out.println("menu lua chon");
        System.out.println("1. tao Contact binh thuong");
        System.out.println("2. tao Contact theo nhom");
        System.out.println("3. quay lai menu");
        return checkId();
    }

    public int menuManagerContact(){
        System.out.println("                                       ★* Christmas*★ ✈✈ ☁ ☁ MENU  ☘ QUẢN  ☘ LÝ  Contact ☘ ✈✈ ☁ ☁ *.★* Christmas*★                           ");
        System.out.println("                                       ⌛                                                                               ⌛                        ");
        System.out.println("                                       ⌛                         1. hiển thị listContact                               ⌛                             ");
        System.out.println("                                       ⌛                         2. thêm Contact                                       ⌛                            ");
        System.out.println("                                       ⌛                         3. sửa Contact                                        ⌛                            ");
        System.out.println("                                       ⌛                         4. xóa Contact                                         ⌛                    ");
        System.out.println("                                       ⌛                         5. tim kiem theo ten                                        ⌛                    ");
        System.out.println("                                       ⌛                         6. đọc file                                       ⌛                    ");
        System.out.println("                                       ⌛                         7. ghi file                                        ⌛                    ");
        System.out.println("                                       ⌛                         8. thoát                                              ⌛                    ");
        System.out.println("                                       ⌛                                                                               ⌛                    ");
        System.out.println("                                      ✄ ✂✁ ✃ ✄ ✂✁ ✃ ✄ ✂✁ ⚡ ✄ ✂✁ ✃ ✄ ✂✁ ⚡ ⚡ ✁ ✃ ✄ ✂✁ ✃ ✄ ✁ ✃ ✄ ✂✁✂✁             ");
        return checkId();
    }
    //private int groop;
    //    private String name;
    //    private String gender;
    //    private String phoneNumber;
    //    private String address;
    //    private int birthDay;
    //    private String email;
    //    private String faceBook;
    public Khachhang menuAddNguoiDung(){
        System.out.println("nhap grop");
        int grop = checkId();
        System.out.println("nhập ten");
        String name = checkName();
        System.out.println("nhap gender");
        String gender = checkName();
        System.out.println("so dien thoai");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhap dia chi");
        String address = checkName();
        System.out.println("nhap ngay sinh");
        int birchDay = checkId();
        System.out.println("nhap email");
        String mail = checkName();
        System.out.println("nhap face");
        String facebook = checkName();
        return new Khachhang(grop,name,gender,phoneNumber,address,birchDay,mail,facebook);

    }

    public Contact menuAddList(){

        System.out.println("nhập ten");
        String name = checkName();
        System.out.println("so dien thoai");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhap dia chi");
        String address = checkName();
        System.out.println("nhap email");
        String mail = checkName();
        System.out.println("nhap face");
        String facebook = checkName();
        return new Contact(name,phoneNumber,address,mail,facebook);

    }

    public String editByName() {
        System.out.println("nhập ten cần sửa");
        String name = checkName();
        return name;
    }
    public String menudeleteByPhoneNumber() {
        System.out.println("nhập so dien thoai cần xóa");
        String name = scanner.nextLine();
        return name;
    }
    public String menusearchByName() {
        System.out.println("nhập name cần tim");
        String name = checkName();
        return name;
    }




    public Contact menuEditContact(String name){

        System.out.println(" nhap lai so dien thoai");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhap lai dia chi");
        String address = checkName();
        System.out.println("nhap lai email");
        String mail = checkName();
        System.out.println("nhap lai face");
        String facebook = checkName();
        return new Contact(name,phoneNumber,address,mail,facebook);

    }








    private int checkId() {
        Scanner scanner = new Scanner(System.in);
        boolean checkId;
        int id = 0;
        do {
            checkId = true;
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                checkId = false;
                System.err.println("                          ︻╦╤─ ҉ – – - -           phải là số!!!");
            }
        } while (!checkId);
        return id;
    }

    private int checkLuaChon() {
        Scanner scanner = new Scanner(System.in);
        boolean checklogin;
        int id = 0;
        do {
            checklogin = true;
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                checklogin = false;
                System.err.println("                                 ︻╦╤─ ҉ – – - -      tuổi lải là số !!! " + " \n" + "                                 ︻╦╤─ ҉ – – - -                 mời  chọn lại:");
            }
        } while (!checklogin);
        return id;
    }

    public String checkName() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (true) {

            name = scanner.nextLine();
            Pattern p = Pattern.compile("^\\pL+[\\pL\\pZ\\pP ]{0,}$");
            if (p.matcher(name).find()) {
//                System.out.println("email la : " + name + "\n" + "----------------------");
                break;
            } else {
                System.err.println("                          ︻╦╤─ ҉ – – - -            ko đc nhập số");
            }
        }
        return name;
    }

}
