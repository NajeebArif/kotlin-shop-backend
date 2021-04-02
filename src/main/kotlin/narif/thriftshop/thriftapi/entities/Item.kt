package narif.thriftshop.thriftapi.entities

import javax.persistence.*

@Entity
@Table(name = "ITEMS")
data class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val itemName: String,
    @Column(name = "ITEM_IMAGE")
    val img: String?,
    val itemDescription: String?
)

