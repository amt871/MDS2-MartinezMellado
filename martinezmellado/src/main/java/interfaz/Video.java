package interfaz;

import com.vaadin.flow.component.*;

@Tag("video")

public class Video extends HtmlContainer implements ClickNotifier<com.vaadin.flow.component.html.Image> {



    private static final PropertyDescriptor<String, String> srcDescriptor = PropertyDescriptors

            .attributeWithDefault("src", "");



    public Video() {

        super();

        getElement().setProperty("controls", true);

        getElement().setProperty("autoplay", false);

    }



    public Video(String src, String altura, String anchura) {

        setSrc(src);

        getElement().setProperty("controls", true);

        getElement().setProperty("autoplay", false);
        
        this.setHeight(altura);
        this.setWidth(anchura);

    }
    
    public Video(String src, String altura) {

        setSrc(src);

        getElement().setProperty("controls", true);

        getElement().setProperty("autoplay", false);
        
        this.setHeight(altura);

    }
    
    public Video(String src) {

        setSrc(src);

        getElement().setProperty("controls", true);

        getElement().setProperty("autoplay", false);
   

    }



    public String getSrc() {

        return get(srcDescriptor);

    }



    public void setSrc(String src) {

        set(srcDescriptor, src);
    	
    }

}