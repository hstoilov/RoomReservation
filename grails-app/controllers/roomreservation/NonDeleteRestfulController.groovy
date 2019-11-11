package roomreservation

import grails.rest.RestfulController
import static org.springframework.http.HttpStatus.METHOD_NOT_ALLOWED

class NonDeleteRestfulController<T> extends RestfulController<T> {

    NonDeleteRestfulController(Class<T> resource) {
        super(resource)
    }

    NonDeleteRestfulController(Class<T> resource, boolean readOnly) {
        super(resource, readOnly)
    }

    @Override
    Object delete() {
        render status: METHOD_NOT_ALLOWED
    }

}
