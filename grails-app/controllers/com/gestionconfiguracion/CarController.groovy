package com.gestionconfiguracion

import grails.validation.ValidationException

class CarController
{
    CarService carService
    boolean isEditor = false

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max)
    {
        isEditor = params.editorMode

        params.max = Math.min(max ?: 10, 100)
        respond carService.list(params), model:[carCount: carService.count(), isEditor: isEditor]
    }

    def show(Long id)
    {
        respond carService.get(id), model:[isEditor: isEditor]
    }

    def create()
    {
        respond new Car(params), model:[isEditor: isEditor]
    }

    def save(Car car)
    {
        if (car == null)
        {
            notFound()
            return
        }

        try
        {
            carService.save(car)
        }
        catch (ValidationException ignored)
        {
            respond car, view:'create', model:[isEditor: isEditor]
            return
        }

        flash.message = "Nuevo automotor creado exitosamente."

        redirect(action: "index", params: [editorMode: true])
    }

    def delete(Long id)
    {
        if (id == null)
        {
            notFound()
            return
        }

        try
        {
            carService.delete(id)

            flash.message = "Automotor eliminado exitosamente."
        }
        catch (Exception ignored) {
            flash.message = "Error: No fue posible eliminar el automotor."
        }

        redirect(action: "index", params: [editorMode: true])
    }

    protected void notFound()
    {
        flash.message = "Error: Automotor no encontrado."
    }
}
