package narif.thriftshop.thriftapi.contollers

import narif.thriftshop.thriftapi.entities.Item
import narif.thriftshop.thriftapi.service.ItemService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/items")
class ItemController ( val itemService: ItemService){

    @GetMapping
    fun getAllItems() = itemService.getItems()

    @PostMapping
    fun saveItem(@RequestBody item: Item): Item{
        itemService.save(item)
        return item
    }
}