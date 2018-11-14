package cars

class HomeController {

    def index() {
        respond([name: session.name ?: 'User', vehicleTotal: Vehicle.count])
    }

    def updateName(String name ){
        session.name = name
        flash.message = "Name has been updated"

        redirect action: 'index'
    }
}
