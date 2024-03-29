package com.salamander.commons

import com.salamander.geo.GeoPosition

class DatosGenerales {

    String nombre
    String descripcion
    String direccion
    String facebook
    String twitter
    String sitio
    String telefonoPrincipal
    String telefonoSecundario
    String fax
    String email
    byte[] imagen
    GeoPosition geoposition
    
    static constraints = {
        nombre blank:false
        descripcion blank:false
        direccion blank:true
        facebook blank:true
        twitter blank:true
        sitio blank:true, url:true
        telefonoPrincipal blank:true
        telefonoSecundario blank:true
        fax blank:true
        email blank:true, email:true
        imagen nullable:true
        geoposition nullable:true
    }
    
    String toString() {
        "${nombre}"
    }
}
