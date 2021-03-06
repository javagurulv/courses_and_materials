package lv.estore.app.console_ui.products;

import lv.estore.app.core.request.products.ProductNameRequest;
import lv.estore.app.core.responses.products.RemoveProductResponse;
import lv.estore.app.core.services.products.RemoveProductByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class RemoveByNameUIAction implements UIAction {

    @Autowired
    RemoveProductByNameService removeProductByNameService;

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 'Name' of the product you want to remove: ");
        String name = scanner.nextLine();

        ProductNameRequest request = new ProductNameRequest(name);
        RemoveProductResponse response = removeProductByNameService.execute(request);

        if (response.hasErrors()) {
            response.getErrors().forEach(coreError ->
                    System.out.println("Error: " + coreError.getField() + " " + coreError.getMessage()));
        } else {
            if (response.isProductRemoved()) {
                System.out.println("Product was removed");
            } else {
                System.out.println("Product was not removed");
            }
        }
        System.out.println("Press 'Enter' to continue.");
    }
}
