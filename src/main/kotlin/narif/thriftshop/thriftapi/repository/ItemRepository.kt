package narif.thriftshop.thriftapi.repository

import narif.thriftshop.thriftapi.entities.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository : JpaRepository<Item, Int> {
}