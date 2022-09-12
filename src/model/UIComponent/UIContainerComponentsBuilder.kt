package konstantin.bezzemelnyi.model.UIComponent

class UIContainerComponentsBuilder {
    private var components: ArrayList<UIComponent> = ArrayList()

    fun textField(textField_placeholder: String) {
        this.components.add(
            UIComponent(
                textField_placeholder = textField_placeholder,
                type = UIComponentType.TEXT_FIELD
            )
        )
    }

    fun label(textLabel_text: String) {
        this.components.add(
            UIComponent(
                textLabel_text = textLabel_text,
                type = UIComponentType.TEXT_LABEL
            )
        )
    }

    fun build(): ArrayList<UIComponent> {
        return this.components
    }
}
