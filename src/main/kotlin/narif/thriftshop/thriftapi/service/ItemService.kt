package narif.thriftshop.thriftapi.service

import narif.thriftshop.thriftapi.entities.Item
import narif.thriftshop.thriftapi.repository.ItemRepository
import org.springframework.stereotype.Service

@Service
class ItemService (val repo: ItemRepository){

    fun getItems(): List<Item> = repo.findAll()

    fun getHardcodedItems():List<Item> {
        return listOf(
            Item(1,"React Quickly","images/reactQuickly.png", "The best book to quickly get started with React"),
            Item(2, "Wally","images/wallyClock.png","A unique wall clock which speaks."),
            Item(3, "Dhanno", "images/dhannp.png", "A Maruti 800 car."),
            Item(4,"Najeeb's Playstation 4","images/najeebsps4.png","Najeeb's old Playstation 4.")
        )
    }
}