package practice2.studentManagement;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            while (true) {
                try {
                    System.out.println("***Hệ Thống Quản Lý Học Sinh***");
                    System.out.println("1. Thêm Học sinh");
                    System.out.println("2. Cập nhật thông tin Học sinh");
                    System.out.println("3. Xóa Học sinh");
                    System.out.println("4. Tìm kiếm Học sinh");
                    System.out.println("5. Hiển thị danh sách Học sinh");
                    System.out.println("0. Thoát");
                    System.out.print("Nhập vào lựa chọn của bạn: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 0 && choice <= 5) {
                        break;
                    } else {
                        System.out.println("Lựa chọn nhập vào phải từ 0 đến 5. Vui lòng nhập lại.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Không phải số . Vui lòng nhập lại.");
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên:");
                    System.out.print("ID: ");

                    int id;
                    while (true) {
                        try {
                             id = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Không phải số . Vui lòng nhập lại.");
                        }
                    }

                    System.out.print("Họ và tên: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Tuổi: ");
                    int age;
                    while (true) {
                        try {
                            age = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Không phải số . Vui lòng nhập lại.");
                        }
                    }
                    System.out.print("Quê quán: ");
                    String hometown = scanner.nextLine();

                    Student newStudent = new Student(id, fullName, age, hometown);
                    studentManager.addStudent(newStudent);
                    System.out.println("Thêm học sinh thành công.");
                    break;
                case 2:
                    System.out.print("Nhập vào Id của học sinh cần sửa: ");
                    int updateId;
                    while (true) {
                        try {
                            updateId = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Không phải số . Vui lòng nhập lại.");
                        }
                    }
                    System.out.println("Nhập thông tin sinh viên được sửa:");
                    System.out.print("Họ và tên: ");
                    String updatedFullName = scanner.nextLine();
                    System.out.print("Tuổi: ");
                    int updatedAge;
                    while (true) {
                        try {
                            updatedAge = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Không phải số . Vui lòng nhập lại.");
                        }
                    }
                    System.out.print("Quê quán: ");
                    String updatedHometown = scanner.nextLine();

                    studentManager.updateStudent(updateId, updatedFullName, updatedAge, updatedHometown);
                    System.out.println("Cập nhật thông tin học sinh thành công.");
                    break;
                case 3:
                    System.out.print("Nhập vào ID của học sinh cần xóa: ");
                    int deleteId;
                    while (true) {
                        try {
                            deleteId = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Không phải số . Vui lòng nhập lại.");
                        }
                    }
                    studentManager.deleteStudent(deleteId);
                    System.out.println("Đã xóa học sinh.");
                    break;
                case 4:
                    System.out.print("Nhập vào tên học sinh cần tìm: ");
                    String searchName = scanner.nextLine();
                    studentManager.searchStudent(searchName);
                    break;
                case 5:
                    studentManager.showAll();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
            System.out.println("------------------------");
        } while (choice != 0);

        scanner.close();
    }
}

