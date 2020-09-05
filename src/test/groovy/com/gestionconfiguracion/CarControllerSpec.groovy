package com.gestionconfiguracion

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CarControllerSpec extends Specification implements ControllerUnitTest<CarController>
{

    def 'Test the index action returns the correct model'()
    {
        given:
        List<Car> sampleCars = [new Car(brand: 'brandTest',
                                            model: 'modelTest',
                                            fabricationYear: 2001,
                                            fabricationCountry: 'countryTest',
                                            parentCompany: 'companyTest'),
                                new Car(brand: 'brandTest2',
                                        model: 'modelTest2',
                                        fabricationYear: 2002,
                                        fabricationCountry: 'countryTest2',
                                        parentCompany: 'companyTest2'),
                                new Car(brand: 'brandTest3',
                                        model: 'modelTest3',
                                        fabricationYear: 2003,
                                        fabricationCountry: 'countryTest3',
                                        parentCompany: 'companyTest3')]

        controller.carService = Stub(CarService)
        {
            list(_) >> sampleCars
            count() >> sampleCars.size()
        }

        when: 'The index action is executed'
        controller.index()

        then: 'The model is correct'
        model.carList
        model.carList.size() == sampleCars.size()
        model.carList.find { it.brand == 'brandTest' && it.fabricationYear == 2001 }
        model.carList.find { it.brand == 'brandTest2' && it.fabricationYear == 2002 }
        model.carList.find { it.brand == 'brandTest3' && it.fabricationYear == 2003 }
    }
}