package narif.thriftshop.thriftapi.service

import narif.thriftshop.thriftapi.entities.Item
import narif.thriftshop.thriftapi.repository.ItemRepository
import org.springframework.stereotype.Service

@Service
class ItemService (private val repo: ItemRepository){

    fun getItems(): List<Item> = repo.findAll()

    fun save(item: Item) {
        repo.save(item)
    }
}