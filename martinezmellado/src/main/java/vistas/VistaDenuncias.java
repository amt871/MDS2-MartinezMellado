package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-denuncias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-denuncias")
@JsModule("./src/vista-denuncias.ts")
public class VistaDenuncias extends LitTemplate {

    @Id("scroller")
	private Scroller scroller;

	/**
     * Creates a new VistaDenuncias.
     */
    public VistaDenuncias() {
        // You can initialise any data required for the connected UI components here.
    }

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

}
