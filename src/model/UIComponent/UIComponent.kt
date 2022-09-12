package konstantin.bezzemelnyi.model.UIComponent

class UIComponent(
    // TEXT FIELD
    val textField_placeholder: String? = null,
    // TEXT LABEL
    val textLabel_text: String? = null,
    // IMAGE
    val image_url: String? = null,
    // BUTTON
    val button_text: String? = null,

    val type: UIComponentType
)


enum class Color {
    RED,
    BLUE,
    GREEN
}
