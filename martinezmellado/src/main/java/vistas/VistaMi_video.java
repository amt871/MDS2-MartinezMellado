package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;

import interfaz.Mi_video_item;

import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-mi_video template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mi_video")
@JsModule("./src/vista-mi_video.ts")
public class VistaMi_video extends LitTemplate {

    @Id("item1")
	private VistaMi_video_item item1;
	@Id("item2")
	private VistaMi_video_item item2;
	@Id("item3")
	private VistaMi_video_item item3;
	@Id("item4")
	private VistaMi_video_item item4;

	/**
     * Creates a new VistaMi_video.
     */
    public VistaMi_video() {
        // You can initialise any data required for the connected UI components here.
    }

	public VistaMi_video_item getItem1() {
		return item1;
	}

	public void setItem1(VistaMi_video_item item1) {
		this.item1 = item1;
	}

	public VistaMi_video_item getItem2() {
		return item2;
	}

	public void setItem2(VistaMi_video_item item2) {
		this.item2 = item2;
	}

	public VistaMi_video_item getItem3() {
		return item3;
	}

	public void setItem3(VistaMi_video_item item3) {
		this.item3 = item3;
	}

	public VistaMi_video_item getItem4() {
		return item4;
	}

	public void setItem4(VistaMi_video_item item4) {
		this.item4 = item4;
	}    

}
