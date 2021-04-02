package narif.thriftshop.thriftapi.contollers

import narif.thriftshop.thriftapi.entities.Item
import narif.thriftshop.thriftapi.service.ItemService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/items")
class ItemController ( val itemService: ItemService){

    @GetMapping
    fun getAllItems() = itemService.getItems()

    @GetMapping("/{id}")
    fun getItem(@PathVariable id: Int) = itemService.getItem(id)

    @PostMapping
    fun saveItem(@RequestBody item: Item) = itemService.save(item)

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable id: Int) = itemService.delete(id)
}