package roomreservation

import grails.rest.Resource

@Resource(uri = "/bookings", superClass = NonDeleteRestfulController)
class Booking {

    Person booker
    Room room
    Date date
    String slot

    final static AM = "08:00 - 11:00"
    final static PM1 = "12:00 - 15:00"
    final static PM2 = "15:00 - 18:00"

    String toString() {
        return "$booker: $room ($date, $slot)"
    }

    static constraints = {
        slot inList: [AM, PM1, PM2]
    }
}
