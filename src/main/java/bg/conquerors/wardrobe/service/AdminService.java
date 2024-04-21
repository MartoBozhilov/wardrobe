package bg.conquerors.wardrobe.service;

import bg.conquerors.wardrobe.model.dto.AddDiscountDTO;
import bg.conquerors.wardrobe.model.dto.AddOrderDTO;
import bg.conquerors.wardrobe.model.dto.AddProductDTO;
import bg.conquerors.wardrobe.model.entity.Order;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface AdminService {

    void addProduct(AddProductDTO addProductDTO);
    void editProduct(String productNumber,AddProductDTO addProductDTO);
    void deleteProduct(String productNumber);
    AddProductDTO getProductByProductNumber(String id);


    void addDiscount(AddDiscountDTO addDiscountDTO);
    void editDiscount(Long id, AddDiscountDTO addDiscountDTO);
    void deleteDiscount(Long id);
    AddDiscountDTO getDiscountById(Long id);

    //void addOrder(AddOrderDTO addOrderDTO);
    void editOrder(Long id, AddOrderDTO addOrderDTO);
    void deleteOrder(Long id);
    void deleteOrderProduct(Long id);
    void addOrderProduct(Long orderId,Long productId,Integer quantity);
    AddOrderDTO getOrderById(Long id);
    void changeStatus(Long id);
}
