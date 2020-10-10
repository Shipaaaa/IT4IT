package IT4IT.backend.controller
import org.springframework.web.bind.annotation.*
import IT4IT.backend.model.Greeting
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/api")
class BackendController(){

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value="name",defaultValue = "World") name : String) =
            Greeting(counter.incrementAndGet(),"Hello, $name")
}
