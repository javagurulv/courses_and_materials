package lv.estore.app.core.validators.products;

import lv.estore.app.core.errors.CoreError;
import lv.estore.app.core.request.products.UpdateProductByIdRequest;
import lv.estore.app.core.validators.common_validation_rules.ValidationRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductUpdateValidator {

    @Autowired
    ValidationRules validationRules;

    public List<CoreError> validate(final UpdateProductByIdRequest request) {
        List<CoreError> errors = new ArrayList<>();
        validationRules.validateId("productId", request.getId()).ifPresent(errors::add);
        validationRules.validateTextField("productName", request.getName()).ifPresent(errors::add);
        validationRules.validateTextField("productDescription", request.getDescription()).ifPresent(errors::add);
        validationRules.validatePrice(request.getPrice()).ifPresent(errors::add);
        return errors;
    }
}
