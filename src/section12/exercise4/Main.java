package section12.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

class ProductManager {
    private ArrayList<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(int id, String newName, double newPrice) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                break;
            }
        }
    }

    public void removeProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public Product findProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public void sortProductsByPriceAscending() {
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductsByPriceDescending() {
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice).reversed());
    }
}

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        // Thêm sản phẩm mẫu
        productManager.addProduct(new Product(1, "iPhone X", 999.99));
        productManager.addProduct(new Product(2, "Samsung Galaxy S10", 799.99));
        productManager.addProduct(new Product(3, "Google Pixel 4", 899.99));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
        while (true) {
            try {
                System.out.println("----- Quản lý sản phẩm -----");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Sửa thông tin sản phẩm theo id");
                System.out.println("3. Xoá sản phẩm theo id");
                System.out.println("4. Hiển thị danh sách sản phẩm");
                System.out.println("5. Tìm kiếm sản phẩm theo tên");
                System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
                System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
                System.out.println("0. Thoát");
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 0 && choice <= 7) {
                    break;
                } else {
                    System.out.println("Số nhập vào phải từ 0 đến 7. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Không phải số . Vui lòng nhập lại.");
            }
        }
        switch (choice) {
            case 1:
                System.out.print("Nhập id sản phẩm: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giá sản phẩm: ");
                double price = Double.parseDouble(scanner.nextLine());

                Product newProduct = new Product(id, name, price);
                productManager.addProduct(newProduct);
                System.out.println("Sản phẩm đã được thêm thành công!");
                break;

            case 2:
                System.out.print("Nhập id sản phẩm cần sửa: ");
                int updateId = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tên mới cho sản phẩm: ");
                String newName = scanner.nextLine();
                System.out.print("Nhập giá mới cho sản phẩm: ");
                double newPrice = Double.parseDouble(scanner.nextLine());

                productManager.updateProduct(updateId, newName, newPrice);
                System.out.println("Sản phẩm đã được cập nhật thành công!");
                break;

            case 3:
                System.out.print("Nhập id sản phẩm cần xoá: ");
                int removeId = Integer.parseInt(scanner.nextLine());

                productManager.removeProduct(removeId);
                System.out.println("Sản phẩm đã được xoá thành công!");
                break;

            case 4:
                System.out.println("Danh sách sản phẩm:");
                productManager.displayProducts();
                break;

            case 5:
                System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
                String searchName = scanner.nextLine();

                Product foundProduct = productManager.findProductByName(searchName);
                if (foundProduct != null) {
                    System.out.println("Sản phẩm được tìm thấy:");
                    System.out.println(foundProduct);
                } else {
                    System.out.println("Không tìm thấy sản phẩm.");
                }
                break;

            case 6:
                productManager.sortProductsByPriceAscending();
                System.out.println("Danh sách sản phẩm đã được sắp xếp tăng dần theo giá:");
                productManager.displayProducts();
                break;

            case 7:
                productManager.sortProductsByPriceDescending();
                System.out.println("Danh sách sản phẩm đã được sắp xếp giảm dần theo giá:");
                productManager.displayProducts();
                break;

            case 0:
                System.out.println("Kết thúc chương trình.");
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
                break;
        }

//        System.out.println();
        } while (choice != 0);
//        scanner.close();

    }
}

