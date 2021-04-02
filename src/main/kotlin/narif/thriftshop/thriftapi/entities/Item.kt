package narif.thriftshop.thriftapi.entities

import javax.persistence.*

@Entity
@Table(name = "ITEMS")
data class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val itemName: String,
    @Column(name = "ITEM_IMAGE")
    var img: String,
    var itemDescription: String
)

