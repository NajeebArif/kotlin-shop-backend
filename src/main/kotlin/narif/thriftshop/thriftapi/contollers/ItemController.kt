package narif.thriftshop.thriftapi.contollers

import narif.thriftshop.thriftapi.service.ItemService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/items")
class ItemController ( val itemService: ItemService){

    @GetMapping
    fun getAllItems() = itemService.getItems()
}