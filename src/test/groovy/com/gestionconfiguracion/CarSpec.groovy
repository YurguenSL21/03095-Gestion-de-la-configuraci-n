package com.gestionconfiguracion

import grails.testing.gorm.DomainUnitTest
import spock.lang.Shared
import spock.lang.Specification

class CarSpec extends Specification implements DomainUnitTest<Car>
{
    @Shared int id

    def setup()
    {
    }

    def cleanup()
    {
    }

    void "test basic persistence mocking"()
    {
        setup:
        new Car(brand: 'brandTest',
                model: 'modelTest',
                fabricationYear: 2001,
                fabricationCountry: 'countryTest|',
                parentCompany: 'companyTest|').save()
        new Car(brand: 'brandTest2',
                model: 'modelTest2',
                fabricationYear: 2002,
                fabricationCountry: 'countryTest2',
                parentCompany: 'companyTest2').save()

        expect:
        Car.count() == 2
    }

    void "test domain instance"() {
        setup:
        id = System.identityHashCode(domain)

        expect:
        domain != null
        domain.hashCode() == id

        when:
        domain.brand = 'brandTest'

        then:
        domain.brand == 'brandTest'
    }

    void "test we get a new domain"() {
        expect:
        domain != null
        domain.brand == null
        System.identityHashCode(domain) != id
    }
}
