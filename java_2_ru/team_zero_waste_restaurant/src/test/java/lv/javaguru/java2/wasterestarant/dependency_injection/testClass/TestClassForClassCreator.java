package lv.javaguru.java2.wasterestarant.dependency_injection.testClass;

import lv.javaguru.java2.wasterestarant.dependency_injection.DIComponent;
import lv.javaguru.java2.wasterestarant.dependency_injection.DIDependency;
//AndrejsB
@DIComponent
public class TestClassForClassCreator {

    @DIDependency private TestClassForClassCreator2 testClassForClassCreator2;

    @Override
    public boolean equals(Object obj) {
        return obj instanceof TestClassForClassCreator;
    }

}
