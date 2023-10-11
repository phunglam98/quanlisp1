package Manager;

import Model.Product;

import java.util.ArrayList;

public class ProductManager implements IManager<Product>{
    private ArrayList<Product> listProduct = new ArrayList<>();

    public int findIndex(int id){
        int index;
        for (int i = 0; i < this.listProduct.size(); i++) {
            if(this.listProduct.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void add(Product product){
        this.listProduct.add(product);
    }

    @Override
    public void delete(int id) {
        for (Product product:
                listProduct ) {
            if(product.getId() == id){
                listProduct.remove(product);
                System.out.println("Xóa thành công!!!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID :" + id);
    }
    @Override
    public void edit(int id, Product product){
        int index = findIndex(id);
        if(index != -1){
            this.listProduct.set(index,product);
            System.out.println("Thông tin đã được cập nhật !!!");
        }
        else {
            System.out.println("Không tìm thấy sản phẩm có ID:" + id);
        }
    }

    @Override
    public ArrayList<Product> showAll() {
        return listProduct;
    }

}
