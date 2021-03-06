package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * User: mertcaliskan
 * Date: 8/20/12
 */
@Named
@ViewScoped
public class CarouselController implements Serializable {

    public Collection<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }
}
