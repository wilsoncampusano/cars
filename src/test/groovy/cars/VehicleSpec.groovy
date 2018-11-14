package cars

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class VehicleSpec extends Specification implements DomainUnitTest<Vehicle> {

    def setup() {
    }

    def cleanup() {
    }

    void "can create a vehicle"() {
        expect:" a not null domain "
            def vehicle = new Vehicle()
            vehicle != null
    }
}
