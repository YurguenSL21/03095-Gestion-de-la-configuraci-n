package com.gestionconfiguracion

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {
    CarService carService
    def init = { servletContext ->
        carService.save('Toyota', 'Corolla', 2020, 'Japan', 'Toyota Motor Corp').save()
        carService.save('Honda', 'Civic', 2018, 'Japon', 'Honda Motor Company').save()
        carService.save('Lexus', 'ES 350', 2020, 'Japon', 'Toyota Motor Corp').save()
        carService.save('Mercedes-Benz', 'AMG GT', 2020, 'Germany', 'Daimler AG').save()
        carService.save('Tesla', 'Model S', 2020, 'USA', 'Tesla Inc.').save()
        carService.save('BMW', 'X3 M', 2017, 'Germany', 'BMW Group').save()
        carService.save('Nissan', 'March', 2015, 'Mexico', 'Renault-Nissan-Mitsubishi Alliance').save()
    }
    def destroy = {
    }
}
